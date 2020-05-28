package SplitApp.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class User {

    private String id;    
    private  String name;
    private String emailId;
    private  String mobileNumber;

    
}