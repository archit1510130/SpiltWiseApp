package SplitApp;

import java.util.Scanner;

import SplitApp.Controller.ExpenseManager;
import SplitApp.Models.User;

// This is the Driver Class that inetracts with the user
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        ExpenseManager expenseManager = new ExpenseManager();

        expenseManager.addUserToDb(new User("1","Archit","archit.agrawal.003@gmail.com","9152517103"));
        expenseManager.addUserToDb(new User("2","Akshat","archit.agrawal.003@gmail.com","9152517103"));


        // while(true)
        // {
        //     String command = scanner.nextLine();
        //     String[] commands = command.split(" ");
        //     String commandType = commands[0];
        //     switch(commandType)
        //     {   
        //         case "SHOW":
        //         if (commands.length == 1) {
        //             //expenseManager.showBalances();
        //         } else {
        //             //expenseManager.showBalance(commands[1]);
        //          }
        //         break;

        //         case "EXPENSE":
        //         String paidBy=commands[1];
        //         Double amount = Double.parseDouble(commands[2]);
        //         int noOfUsers = Integer.parseInt(commands[3]);
        //         String expenseType = commands[4 + noOfUsers];

                
        // }



       // }

        
    }
}
