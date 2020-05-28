package SplitApp.Expenses;

import java.util.List;

import SplitApp.Models.User;

public class EqualExpense implements Expense {

    public String expenseId;
    public User paidBy;
    List<User>split;
    double amount;


    @Override
    public void doTransaction() {

        double eachAmount=amount/split.size();
        

    }

    @Override
    public Boolean isValid() {
    
        // TODO Auto-generated method stub
        return false;
    }
    
    
}