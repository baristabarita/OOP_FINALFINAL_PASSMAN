package LogSign;

//make user account
//inherits all attributes of newAccount
public class userAccount extends newAccount {

    public userAccount (String n, String e, String p, String cp, String de) {
        super(n, e, p, cp, de, "User");
    }
}