package LogSign;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public abstract class newAccount
{
	private String accountName, email, password, confirmPassword, description, accType;
	private boolean accountNameTest, emailTest, passwordTest, confirmPasswordTest, accTest, atSign, dot, b;

	
	public newAccount(String n, String e, String p, String cp, String de, String t)
	{
	
		SignUp su = new SignUp();
		
		accountName = n;
		email = e;
		password = p;
		confirmPassword = cp;
		description= de;
		accType = t;
		
		if(description.length() < 1)
			description = " ";
		
		//Default booleans
		accountNameTest= false;
		emailTest= false;
		passwordTest= false;
		confirmPasswordTest= false;
		accTest = false;
		atSign= false;
		dot= false;
		
		//Logic
		if(accountName.length()>=1)
			accountNameTest = true;
		emailTest= su.emailTesting(email);
		if(password.length() >=1)
			passwordTest = true;
		if(password == confirmPassword)
			confirmPasswordTest = true;
	}
	
	// Creating account
	public void AccountCreate(String c,String n, String e, String p, String de, String t){
			String array[] = new String[6];
			array[0] = c;
			array[1] = n;
			array[2] = e;
			array[3] = p;
			array[4] = de;
			array[5] = t;
			for(int i = 0; i < array.length; i++)
			{
				System.out.println(array[i]);
			}
	}

	//Getters
	public String getAccountName(){
		return accountName;
	}

	public String getEmail(){
		return email;
	}

	public String getPassword(){
		return password;
	}

	public String getDescription(){
		return description;
	}

	public String getAccountType(){
		return accType;
	}

	//Testers
	public boolean AccountNameTest() {
		return accountNameTest;
	}

	public boolean EmailTest() {
		return emailTest;
	}

	public boolean PasswordTest() {
		return passwordTest;
	}

	public boolean ConfirmPasswordTest() {
		return confirmPasswordTest;
	}

	
}
