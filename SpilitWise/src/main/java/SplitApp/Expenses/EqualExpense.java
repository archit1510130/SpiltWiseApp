package SplitApp.Expenses;

import java.util.List;

import SplitApp.Models.User;

import SplitApp.Models.Split.Split;

public class EqualExpense extends Expense {
    public EqualExpense(double amount, User paidBy, List<Split> splits) {
        super(amount, paidBy, splits);
    }

    @Override
    public boolean validate() {
        // TODO Auto-generated method stub
        return true;
    }

   
}