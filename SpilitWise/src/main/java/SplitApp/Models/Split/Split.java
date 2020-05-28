package SplitApp.Models.Split;
import javax.annotation.processing.Generated;

import SplitApp.Models.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class Split {

    private User User;
    double amount;
}