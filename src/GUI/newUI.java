package GUI;

import Features.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

//*** Creates the user interface for storing a new password ***
public class newUI{
	private JButton btn_eError;
	private JButton btn_pError;
	private JTextField an_field;
	private JTextField e_field;
	private JPasswordField p_field;
	private JPasswordField cp_field;
	private JEditorPane editorPane;
	public static JPanel naPanel;
	private JComboBox comboBox;
	private JCheckBox chckbxLowerCase;
	private JCheckBox chckbxUpperCase;
	private JCheckBox chckbxNumbers;
	private JCheckBox chckbxSpecialCharacters;
	private JTextField l_field;
	private Password gp;
	private JTextField Genp_field;
	private String fn;
	private String an, e, p, c, d;
	
	public newUI(String filename){
		fn = filename;
		naPanel = new JPanel();
		naPanel.setVisible(true);
	    naPanel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "New Account", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
	    naPanel.setBounds(225, 46, 589, 484);
	    naPanel.setBackground(new Color(255, 246, 230));
		naPanel.setLayout(null);
		
		JLabel lblAccountName = new JLabel("Account Name: ");
		lblAccountName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAccountName.setBounds(37, 53, 103, 14);
		naPanel.add(lblAccountName);
		
		an_field = new JTextField();
		an_field.setBounds(150, 50, 170, 20);
		naPanel.add(an_field);
		an_field.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(94, 119, 46, 14);
		naPanel.add(lblEmail);
		
		e_field = new JTextField();
		e_field.setBounds(150, 116, 170, 20);
		naPanel.add(e_field);
		e_field.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setBounds(70, 187, 70, 14);
		naPanel.add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password:");
		lblConfirmPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblConfirmPassword.setBounds(10, 246, 130, 14);
		naPanel.add(lblConfirmPassword);
		
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescription.setBounds(63, 307, 77, 14);
		naPanel.add(lblDescription);
		
		p_field = new JPasswordField();
		p_field.setBounds(150, 184, 170, 20);
		naPanel.add(p_field);
		
		cp_field = new JPasswordField();
		cp_field.setBounds(150, 243, 170, 20);
		naPanel.add(cp_field);
		
		URL error = DefaultScreenUI.class.getResource("/otherIcon/error.png");
		ImageIcon all = new ImageIcon(error);
		btn_eError = new JButton(all);
		btn_eError.setBounds(330, 113, 25, 23);
		btn_eError.setBackground(new Color(255, 246, 230));
		btn_eError.setVisible(false);
		btn_eError.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  JOptionPane.showMessageDialog(naPanel,
	  						"Email must contain an '@' and '.'",
	  						"Error!",
	  						JOptionPane.INFORMATION_MESSAGE,
	  						new ImageIcon("otherIcon\\error.png"));
			  } 
			} );
		naPanel.add(btn_eError);
		
		btn_pError = new JButton(all);
		btn_pError.setBounds(295, 209, 25, 23);
		btn_pError.setBackground(new Color(255, 246, 230));
		btn_pError.setVisible(false);
		btn_pError.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  JOptionPane.showMessageDialog(naPanel,
	  						"Password do not match!",
	  						"Error!",
	  						JOptionPane.INFORMATION_MESSAGE,
	  						new ImageIcon("otherIcon\\error.png"));
			  } 
			} );
		naPanel.add(btn_pError);
		
		JLabel lblCategory = new JLabel("Category:\r\n");
		lblCategory.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCategory.setBounds(351, 53, 57, 14);
		naPanel.add(lblCategory);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mail", "Social", "Shopping", "Banking", "Users", "Work/Edu", "Other"}));
		comboBox.setBounds(418, 50, 124, 20);
		naPanel.add(comboBox);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBackground(Color.WHITE);
		panel.setBounds(330, 144, 249, 286);
		naPanel.add(panel);
		panel.setLayout(null);
		
		chckbxLowerCase = new JCheckBox("lower case");
		chckbxLowerCase.setBackground(Color.WHITE);
		chckbxLowerCase.setBounds(6, 17, 97, 23);
		panel.add(chckbxLowerCase);
		
		chckbxUpperCase = new JCheckBox("upper case");
		chckbxUpperCase.setBackground(Color.WHITE);
		chckbxUpperCase.setBounds(6, 43, 97, 23);
		panel.add(chckbxUpperCase);
		
		chckbxNumbers = new JCheckBox("numbers");
		chckbxNumbers.setBackground(Color.WHITE);
		chckbxNumbers.setBounds(6, 69, 97, 23);
		panel.add(chckbxNumbers);
		
		chckbxSpecialCharacters = new JCheckBox("special characters");
		chckbxSpecialCharacters.setBackground(Color.WHITE);
		chckbxSpecialCharacters.setBounds(6, 95, 174, 23);
		panel.add(chckbxSpecialCharacters);
		
		JLabel lblLength = new JLabel("Length:");
		lblLength.setHorizontalAlignment(SwingConstants.CENTER);
		lblLength.setBounds(6, 139, 50, 14);
		panel.add(lblLength);
		
		l_field = new JTextField();
		l_field.setColumns(10);
		l_field.setText("8");
		l_field.setBounds(54, 136, 49, 20);
		panel.add(l_field);
		
		JLabel lblPassword_1 = new JLabel("Password: ");
		lblPassword_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword_1.setBounds(6, 247, 71, 14);
		panel.add(lblPassword_1);
		
		
		Genp_field = new JTextField();
		Genp_field.setBounds(83, 244, 156, 20);
		Genp_field.setEditable(false);
		panel.add(Genp_field);
		Genp_field.setColumns(10);
		
	 editorPane = new JEditorPane();
		editorPane.setBounds(150, 307, 170, 116);
		naPanel.add(editorPane);
		
		JButton btnGenerate = new JButton("Generate");
		btnGenerate.setFont(new Font("DialogInput", Font.BOLD, 13));
		btnGenerate.setBounds(6, 184, 233, 33);
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				gp = new Password();
				boolean l, u, n, s;
				int len;
				l = getChckbxLowerCase();
				u = getChckbxUpperCase();
				n = getChckbxNumbers();
				s = getChckbxSpecialCharacters();
				
				if( l== false && u== false && n == false && s== false)
					Genp_field.setText("");
				else{
				len = getPassLength();
				Genp_field.setText(gp.generateNewPassword(l, u, n, s, len));
				}
			}
		});
		panel.add(btnGenerate);
		
		JLabel lblPasswordGenerator = new JLabel("Password Generator");
		lblPasswordGenerator.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasswordGenerator.setBounds(351, 119, 191, 14);
		naPanel.add(lblPasswordGenerator);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("DialogInput", Font.BOLD, 13));
		btnCancel.setBackground(new Color(154, 202, 141));
		btnCancel.setBounds(185, 434, 102, 39);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			naPanel.removeAll();
			DefaultScreenUI.panel.setVisible(true);
			}
		});
		naPanel.add(btnCancel);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Check valid fields
				String ef = e_field.getText();
				char arr[] = ef.toCharArray();
				boolean atSign = false;
				boolean dot = false;
				boolean temp = false;
				if(ef.length()>=1)
				{
					for(int i = 0; i < arr.length; i++)
					{
						if(arr[i] == '@')
							atSign= true;
					}
					for(int i = 0; i < arr.length; i++)
					{
						if(arr[i]== '.')
							dot= true;
					}
					if( atSign ==true && dot == true)
						temp= true;
					else{
						temp = false;
					}
				}
				if(temp && p_field.getText().equals(cp_field.getText()))
				{	

					setters();
					DataDriver dd = new DataDriver();
					dd.SaveData(fn, an, e, p, d, c);
					
					//Close window and go back to home or make a congrats?
					naPanel.setVisible(false);
					DefaultScreenUI.panel.setVisible(true);
				}
				if(!(p_field.getText().equals(cp_field.getText()))) {
					btn_pError.setVisible(true);
					if(!(temp))
					{
						btn_eError.setVisible(true);
					}
					else{
						btn_eError.setVisible(false);
					}
				}
				else{
					btn_pError.setVisible(false);
				}
				if(!(temp))
				{
					btn_eError.setVisible(true);
					if(!(p_field.getText().equals(cp_field.getText()))){
						btn_pError.setVisible(true);
					}
					else{
						btn_pError.setVisible(false);
					}
				}
				else{
					btn_eError.setVisible(false);
				}
			}
		});
		btnSubmit.setFont(new Font("DialogInput", Font.BOLD, 13));
		btnSubmit.setBackground(new Color(154, 202, 141));
		btnSubmit.setBounds(404, 434, 102, 39);
		naPanel.add(btnSubmit);
		
	}
	
	public void setters(){
		an = an_field.getText();
		e = e_field.getText();
		p = p_field.getText(); 
		d = editorPane.getText();
		c = comboBox.getSelectedItem().toString();
	}
	
	public boolean getChckbxLowerCase(){
		if(chckbxLowerCase.isSelected()){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean getChckbxUpperCase(){
		if(chckbxUpperCase.isSelected()){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean getChckbxNumbers(){
		if(chckbxNumbers.isSelected()){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean getChckbxSpecialCharacters(){
		if(chckbxSpecialCharacters.isSelected()){
			return true;
		}
		else{
			return false;
		}
	}
	
	public int getPassLength(){
		String s = l_field.getText();
		int length = Integer.parseInt(s);
		return length;
	}
	
	public JPanel getPanel(){
		naPanel.setVisible(true);
		return naPanel;
	}
	
	public void Visible(boolean b) {
		naPanel.setVisible(b);
		
	}
	
	public void setStatus(String s){
		comboBox.setSelectedItem(s);
	}
}
