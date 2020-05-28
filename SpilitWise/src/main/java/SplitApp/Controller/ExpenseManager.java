package SplitApp.Controller;

import java.util.List;

import SplitApp.DataBase.UserData;
import SplitApp.Models.User;
import SplitApp.Models.Split.Split;
import SplitApp.Service.ExpenseManageService;

public class ExpenseManager {

    UserData userData;
    ExpenseManageService expenseManageService;


    public ExpenseManager()
    {
        userData=new UserData();
        expenseManageService=new ExpenseManageService();

    }

    public void addUserToDb(User u)
    {
        userData.addUser(u);

    }

    public void handelExpense(User paidby,double amount,List<Split>splitUser,String ExpenseType)
    {

        expenseManageService.handelExpense(paidby,amount,splitUser,ExpenseType);

    }

	public User getUser(String key) {
        userData.getUser(key);
		return null;
	}










    
}