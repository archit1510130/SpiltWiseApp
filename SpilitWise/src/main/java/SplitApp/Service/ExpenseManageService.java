package SplitApp.Service;

import java.util.List;

import SplitApp.Expenses.EqualExpense;
import SplitApp.Expenses.ExactExpense;
import SplitApp.Expenses.Expense;
import SplitApp.Models.User;
import SplitApp.Models.Split.Split;

public class ExpenseManageService {

	public Expense handelExpense(User paidBy, double amount, List<Split> splitUser, String expenseType) {

        switch(expenseType){
            case "EQUAL":
            return new EqualExpense(amount, paidBy, splitUser);
            case "EXACT":
            return new ExactExpense(amount, paidBy, splitUser);

            default:
                return null;
        }






        


	}

    
}