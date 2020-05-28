package SplitApp.DataBase;

import java.util.HashMap;
import java.util.Map;

import SplitApp.Models.User;
import lombok.*;


@Data
@Getter
@Setter
@AllArgsConstructor
public class BalanceSheetDb {

    Map<String,Map<String,Double>>balanceSheet;
    Double totalamount;
    public BalanceSheetDb()
    {
        balanceSheet= new HashMap<String, Map<String, Double>>();

    }

    public void addUser(User user)
    {
        balanceSheet.put(user.getId(), new HashMap<String, Double>());

    }

    public void  addTransaction(String paidBy,String paidTo,Double  amount)
    {
        Map<String, Double> balances = balanceSheet.get(paidBy);
            if (!balances.containsKey(paidTo)) {
                balances.put(paidTo, 0.0);
            }
            balances.put(paidTo, balances.get(paidTo) + amount);

            balances = balanceSheet.get(paidTo);
            if (!balances.containsKey(paidBy)) {
                balances.put(paidBy, 0.0);
            }
            balances.put(paidBy, balances.get(paidBy) - amount);
       
    }




    
}