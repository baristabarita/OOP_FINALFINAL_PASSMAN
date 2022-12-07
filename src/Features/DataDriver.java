package Features;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.PatternSyntaxException;

public class DataDriver {
	private int lineCount;
	
	public DataDriver()
	{
	}
	
	
	public void SaveData(String filename, String acctName, String em, String pass, String desc, String cat)
	{
	    String accountName = acctName;
	    String email = em;
	    String password = pass;
	    String description = desc;
	    String category = cat;

    	String myArr[] = new String[5];
    	
    	myArr[0] = accountName;
    	myArr[1] = email;
    	myArr[2] = password;
    	myArr[3] = description;
    	myArr[4] = category;
    	
		try{
			FileWriter fw = new FileWriter(filename, true);
			BufferedWriter bw = new BufferedWriter(fw);
			for(int j = 0; j < myArr.length; j++){
				bw.append(myArr[j] + ",");
				if(j == myArr.length - 1){
					
					bw.append(Math.random() * 1000000 + ",");
					
				}
				
	    }
	    bw.newLine();
	    
	    bw.close();
	    fw.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}	
	}
		public void editData(String filename, String acctname, String em, String pass, String desc, String cat, String k) throws IOException{
			BufferedReader s = new BufferedReader(new FileReader(filename));
		    ArrayList<String> lines = new ArrayList<String>();
			String line;
			line = s.readLine();
			while(line != null) {
				try {
				    String[] splitArray = line.split(",");
					if(splitArray[5].equals(k)){
				    	lines.add(acctname + "," + em + "," + pass + "," + desc + "," + cat + "," + k + ",");
				    }
				    else{
				    	lines.add(splitArray[0] + "," + splitArray[1] + "," + splitArray[2] + "," + splitArray[3] + "," + splitArray[4] + "," + splitArray[5] + ",");
				    }
				} catch (PatternSyntaxException ex) {
				    System.out.print(ex);
				}
				line = s.readLine();
			}
			s.close();
			FileWriter fw = new FileWriter(filename);
			BufferedWriter bw = new BufferedWriter(fw);
			for(String l: lines)
			{
				bw.append(l);
				bw.newLine();
			}
			bw.close();
			fw.close();
		}
}
