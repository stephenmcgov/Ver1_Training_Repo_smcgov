//import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;

import javax.swing.*;

public class Driver extends BankAccount
{

	private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

   
	
	 public Driver()
	   {
	      prepareGUI();
	   }
	
	public static void main(String[] args) 	
	
	{	
		Driver swingControlDemo = new Driver();      
	      swingControlDemo.Bank();
	}	    
    	
	

	private void prepareGUI()
	   {
	      mainFrame = new JFrame("Java Bank");
	      mainFrame.setSize(400,200);
	      mainFrame.setLayout(new GridLayout(3, 1));
	      mainFrame.addWindowListener(new WindowAdapter()
	      {
	         public void windowClosing(WindowEvent windowEvent)
	         {
	            System.exit(0);
	         }        
	      });    
	      headerLabel = new JLabel("", JLabel.CENTER);        
	      statusLabel = new JLabel("",JLabel.CENTER);    
	     
	      statusLabel.setSize(400,200);

	      controlPanel = new JPanel();
	      controlPanel.setLayout(new FlowLayout());

	      mainFrame.add(headerLabel);
	      mainFrame.add(controlPanel);
	      mainFrame.add(statusLabel);
	      mainFrame.setVisible(true);  
	   }


	private void Bank()
	{   
		DepositAccount da1 = new DepositAccount(0.00);	
		CurrentAccount ca1 = new CurrentAccount(0.00);
		SavingsAccount sa1 = new SavingsAccount(0.00);
		
		headerLabel.setText("Access an Account?"); 

	      JButton javaButton = new JButton("Yes");        
	      JButton okButton = new JButton("No");

	     okButton.addActionListener(new ActionListener()
	      {

	          public void actionPerformed(ActionEvent e)
	              {
	                 int output = JOptionPane.showConfirmDialog(mainFrame
	                    , "Are you sure you would like to exit this app?","Java Bank",JOptionPane.YES_NO_OPTION);

	                 if(output == JOptionPane.YES_OPTION)
	                 {	                
	                	 System.exit(0);
	                 }	                   
	              } 
	      });
	   
	                    
	javaButton.addActionListener(new ActionListener()
    {
		public void actionPerformed(ActionEvent e)
        {
    	  String[] options = new String[] {"Deposit", "Current", "Savings"};
    	  int response = JOptionPane.showOptionDialog(null, "Select an Account to Manage.", "Java Bank",
          JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
          null, options, options[0]);    	  
    	  
    	  if(response == JOptionPane.YES_OPTION)   		  
    	  {
        	  String[] options1 = new String[] {"Deposit", "Withdraw", "Check Balance"};
        	  int response1 = JOptionPane.showOptionDialog(null, "What would you like to do with this Account?", "Java Bank",
        	  JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
        	  null, options1, options1[0]);
        	  
        	  if(response1 == JOptionPane.YES_OPTION)
        	  {       		  
	              String strDeposit = JOptionPane.showInputDialog("Please enter the amount to deposit:");
	              double iAmount = Double.parseDouble(strDeposit);           
	              da1.Deposit(iAmount);
	              JOptionPane.showMessageDialog(null, "Thank you. Your new balance is $" + da1.getdBalance());
              }
             
              if(response1 == JOptionPane.NO_OPTION)
              {            	 
	              String strWithdraw = JOptionPane.showInputDialog("Please enter the amount to withdraw:");
	              double iAmount = Double.parseDouble(strWithdraw);              
	              
	              	if (da1.getdBalance()<iAmount)
	            	  {
	              		JOptionPane.showMessageDialog(null, "Insufficent funds");             
	            	  }
	              
	              	else
	              	{
	              		da1.Withdraw(iAmount);
	              		JOptionPane.showMessageDialog(null, "Thank you. Your new balance is �" + da1.getdBalance());                          
	              	}
              }
        	  
              if(response1 == JOptionPane.CANCEL_OPTION)
              {
            	  JOptionPane.showMessageDialog(null, "Your balance is $" + da1.getdBalance());            	  
              }	             
           }
          
    	  if(response == JOptionPane.NO_OPTION)
          {
        	  String[] options1 = new String[] {"Deposit", "Withdraw", "Check Balance"};
        	  int response2 = JOptionPane.showOptionDialog(null, "What would you like to do with this Account?", "Java Bank",
        	  JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
              null, options1, options1[0]);
        	  
        	  if(response2 == JOptionPane.YES_OPTION)
        	  {       		  
	        	  String strDeposit = JOptionPane.showInputDialog("Please enter the amount to deposit:");
	              double iAmount = Double.parseDouble(strDeposit);
	              ca1.Deposit(iAmount);
	              JOptionPane.showMessageDialog(null, "Thank you. Your new balance is $" + ca1.getdBalance());              
              }
             
              if (response2 == JOptionPane.NO_OPTION)
              {            	  
	              String strWithdraw = JOptionPane.showInputDialog("Please enter the amount to withdraw:");
	              double iAmount = Double.parseDouble(strWithdraw);              
	              
	              	if (ca1.getdBalance()<iAmount)
	            	{
	              		JOptionPane.showMessageDialog(null, "Insufficent funds");
	            	}
	                
	              
	              	else
	              	{
	              		ca1.Withdraw(iAmount);
	              		JOptionPane.showMessageDialog(null, "Thank you. Your new balance is $" + ca1.getdBalance());                
	              	}
              }
	        	  
	          if(response2 == JOptionPane.CANCEL_OPTION)
	          {
	               JOptionPane.showMessageDialog(null, "Your balance is $" + ca1.getdBalance());                 
	          }
          }
          
    	  if(response == JOptionPane.CANCEL_OPTION)
          {
        	  String[] options1 = new String[] {"Deposit", "Withdraw", "Check Balance"};
        	  int response3 = JOptionPane.showOptionDialog(null, "What would you like to do with this Account?", "Java Bank",
    	      JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
              null, options1, options1[0]);
        	  
        	  if(response3 == JOptionPane.YES_OPTION)
        	  {        		  
	        	  String strDeposit = JOptionPane.showInputDialog("Please enter the amount to deposit:");
	              double iAmount = Double.parseDouble(strDeposit);
	              sa1.Deposit(iAmount);
	              JOptionPane.showMessageDialog(null, "Thank you. Your new balance is $" + sa1.getdBalance());
              }
             
              if (response3 == JOptionPane.NO_OPTION)
              {            	  
	              String strWithdraw = JOptionPane.showInputDialog("Please enter the amount to withdraw:");
	              double iAmount = Double.parseDouble(strWithdraw);             
	              
	              	if (sa1.getdBalance()<iAmount)
	            	{
	              		JOptionPane.showMessageDialog(null, "Insufficent funds");
	            	}
	              
	              	else
	              	{
	              		sa1.Withdraw(iAmount);
	              		JOptionPane.showMessageDialog(null, "Thank you. Your new balance is $" + sa1.getdBalance());
	              	}
              }  
        	  
              if(response3 == JOptionPane.CANCEL_OPTION)
              {
                  JOptionPane.showMessageDialog(null, "Your balance is $" + sa1.getdBalance());
              }         	  
           }
		}
    });
	     
	controlPanel.add(javaButton);
    controlPanel.add(okButton);       
    mainFrame.setVisible(true);  

    controlPanel.add(javaButton);
    controlPanel.add(okButton);       
    mainFrame.setVisible(true);     
	
    }              		
}
