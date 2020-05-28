package SplitApp.Expenses;

import java.util.List;

import SplitApp.Models.User;
import SplitApp.Models.Split.Split;

public class ExactExpense extends Expense {
    public ExactExpense(double amount, User paidBy, List<Split> splits) {
        super(amount, paidBy, splits);
    }

    @Override
    public boolean validate() {
       
        return true;
    }
}