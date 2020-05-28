package SplitApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import SplitApp.Controller.ExpenseManager;
import SplitApp.Models.User;

import SplitApp.Models.Split.Split;

// This is the Driver Class that inetracts with the user
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        ExpenseManager expenseManager = new ExpenseManager();

        expenseManager.addUserToDb(new User("u1","Archit","archit.agrawal.003@gmail.com","9152517103"));
        expenseManager.addUserToDb(new User("u2","Akshat","archit.agrawal.003@gmail.com","9152517103"));
        expenseManager.addUserToDb(new User("u3","kannu","archit.agrawal.003@gmail.com","9152517103"));
        expenseManager.addUserToDb(new User("u4","vasu","archit.agrawal.003@gmail.com","9152517103"));
        expenseManager.addUserToDb(new User("u5","Cheeni","archit.agrawal.003@gmail.com","9152517103"));


        while(true)
        {
            String command = scanner.nextLine();
            String[] commands = command.split(" ");
            String commandType = commands[0];
            switch(commandType)
            {   
                case "SHOW":
                if (commands.length == 1) {
                    expenseManager.showBalances();
                } else {
                    //expenseManager.showBalance(commands[1]);
                 }
                break;

                case "EXPENSE":// expense u1 1000 u2 u3 equal
                String paidBy = commands[1];
                Double amount = Double.parseDouble(commands[2]);
                int noOfUsers = Integer.parseInt(commands[3]);
                String expenseType = commands[4 + noOfUsers];
                List<Split>splits=new ArrayList<>();
                switch(expenseType){
                    case "EQUAL":
                    for (int i = 0; i < noOfUsers; i++) {
                        splits.add(new Split(expenseManager.getUser(commands[4 + i]),amount/(noOfUsers+1)));
                    }
    
                    expenseManager.handelExpense(paidBy, amount, splits, expenseType);
                    break;
                    case "EXACT":
                    for (int i = 0; i < noOfUsers; i++) {
                        splits.add(new Split(expenseManager.getUser(commands[4 + i]),Double.parseDouble(commands[5+i+noOfUsers])) );
                    }
                    expenseManager.handelExpense(paidBy, amount, splits, expenseType);
                    break;
                   
                    

                }


                
        }



       }

        
    }
}
