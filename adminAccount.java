package LogSign;

//make admin account
//inherits all attributes of newAccount
public class adminAccount extends newAccount {

    public adminAccount (String n, String e, String p, String cp, String de) {
        super(n, e, p, cp, de, "Admin");
    }
}
