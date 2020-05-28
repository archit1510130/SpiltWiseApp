package SplitApp.Expenses;

import java.util.List;

import SplitApp.Models.User;
import SplitApp.Models.Split.Split;

public class PercentExpense extends Expense {

    public PercentExpense(double amount, User paidBy, List<Split> splits) {
        super(amount, paidBy, splits);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean validate() {
        // TODO Auto-generated method stub
        return true;
    }
    
    
}