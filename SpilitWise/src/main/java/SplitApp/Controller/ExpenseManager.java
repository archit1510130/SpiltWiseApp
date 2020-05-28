package SplitApp.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import SplitApp.DataBase.BalanceSheetDb;
import SplitApp.DataBase.UserData;
import SplitApp.Expenses.Expense;
import SplitApp.Models.User;
import SplitApp.Models.Split.Split;
import SplitApp.Service.ExpenseManageService;

public class ExpenseManager {

    UserData userData;
    ExpenseManageService expenseManageService;
    List<Expense>expenses;
   BalanceSheetDb balanceSheetDb; 


    public ExpenseManager()
    {
        userData=new UserData();
        expenseManageService=new ExpenseManageService();
        expenses=new ArrayList<>();
        balanceSheetDb=new BalanceSheetDb();

    }

    public void addUserToDb(User u)
    {
        userData.addUser(u);
        balanceSheetDb.addUser(u);

    }

    public void handelExpense(String paidBy,double amount,List<Split>splitUser,String ExpenseType)
    {
        Expense expense=expenseManageService.handelExpense(getUser(paidBy),amount,splitUser,ExpenseType);
        expenses.add(expense);
       for(Split split:expense.getSplits())
       {
            String paidTo = split.getUser().getId();
            Double amountOwe=split.getAmount();
            balanceSheetDb.addTransaction(paidBy, paidTo, amountOwe);
       }

    }


    public void showBalances() {
        boolean isEmpty = true;
        for (Map.Entry<String, Map<String, Double>> allBalances : balanceSheetDb.getBalanceSheet().entrySet()) {
            for (Map.Entry<String, Double> userBalance : allBalances.getValue().entrySet()) {
                if (userBalance.getValue() > 0) {
                    isEmpty = false;
                    printBalance(allBalances.getKey(), userBalance.getKey(), userBalance.getValue());
                }
            }
        }

        if (isEmpty) {
            System.out.println("No balances");
        }
    }
    private void printBalance(String user1, String user2, double amount) {
        String user1Name = getUser(user1).getName();
        String user2Name = getUser(user2).getName();
        if (amount < 0) {
            System.out.println(user1Name + " owes " + user2Name + ": " + Math.abs(amount));
        } else if (amount > 0) {
            System.out.println(user2Name + " owes " + user1Name + ": " + Math.abs(amount));
        }
    }

    public void showBalance(String userId) {
        boolean isEmpty = true;
        for (Map.Entry<String, Double> userBalance : balanceSheetDb.getBalanceSheet().get(userId).entrySet()) {
            if (userBalance.getValue() != 0) {
                isEmpty = false;
                printBalance(userId, userBalance.getKey(), userBalance.getValue());
            }
        }

        if (isEmpty) {
            System.out.println("No balances");
        }
    }


	public User getUser(String key) {
        return userData.getUser(key);
		
	}










    
}