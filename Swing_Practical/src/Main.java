import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("reg_form");
	    frame.setSize(400,400);
	    
	    frame.addWindowListener(new WindowAdapter()
	    {
	    	public void windowClosing(WindowEvent windowEvent)
	    	{
	            System.exit(0);
	        }        
	    });    
	      
		JPanel pane = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		JLabel firstName = new JLabel("First Name:");
		c.gridx = 0;
		c.gridy = 0;
		pane.add(firstName,c);
		
		JTextField firstNameInput = new JTextField(10);
		c.gridx = 1;
		c.gridy = 0;
		pane.add(firstNameInput);
		
		JLabel lastName = new JLabel("Last Name:");
		c.gridx = 0;
		c.gridy = 1;
		pane.add(lastName,c);
		
		JTextField lastNameInput = new JTextField(10);
		c.gridx = 1;
		c.gridy = 1;
		pane.add(lastNameInput,c);
		
		JLabel Address = new JLabel("Address:");
		c.gridx = 0;
		c.gridy = 2;
		pane.add(Address,c);
		
		JTextField AddressInput = new JTextField(10);
		c.gridx = 1;
		c.gridy = 2;
		pane.add(AddressInput,c);
		
		JLabel city = new JLabel("City:");
		c.gridx = 0;
		c.gridy = 3;
		pane.add(city,c);
		
		JTextField cityInput = new JTextField(10);
		c.gridx = 1;
		c.gridy = 3;
		pane.add(cityInput,c);
		
		JLabel county = new JLabel("County:");
		c.gridx = 0;
		c.gridy = 4;
		pane.add(county,c);
		
		JTextField countyInput = new JTextField(10);
		c.gridx = 1;
		c.gridy = 4;
		pane.add(countyInput,c);
		
		JLabel country = new JLabel("Country:");
		c.gridx = 0;
		c.gridy = 5;
		pane.add(country,c);
		
		JTextField countryInput = new JTextField(10);
		c.gridx = 1;
		c.gridy = 5;
		pane.add(countryInput,c);
		
		JLabel postCode = new JLabel("Postcode:");
		c.gridx = 0;
		c.gridy = 6;
		pane.add(postCode,c);
		
		JTextField postCodeInput = new JTextField(10);
		c.gridx = 1;
		c.gridy = 6;
		pane.add(postCodeInput,c);
		
		JLabel telephoneNumber = new JLabel("Last Name:");
		c.gridx = 0;
		c.gridy = 7;
		pane.add(telephoneNumber,c);
		
		JTextField telephoneNumberInput = new JTextField(10);
		c.gridx = 1;
		c.gridy = 7;
		pane.add(telephoneNumberInput,c);
		
		JButton submit = new JButton("Submit");
		c.gridx = 0;
		c.gridy = 8;
		//c.fill = GridBagConstraints.HORIZONTAL;
		//c.gridwidth = 2;
		pane.add(submit,c);
		
		JButton cancel = new JButton("Cancel");
		c.gridx = 1;
		c.gridy = 8;
		//c.fill = GridBagConstraints.HORIZONTAL;
		//c.gridwidth = 2;
		pane.add(cancel,c);
		
		ActionListener submitListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = firstNameInput.getText();
				System.out.println("First Name is " + name);
			}
		};
		submit.addActionListener(submitListener);
		
		ActionListener cancelListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNameInput.setText("");
				lastNameInput.setText("");
				AddressInput.setText("");
				cityInput.setText("");
				countyInput.setText("");
				countryInput.setText("");
				postCodeInput.setText("");
				telephoneNumberInput.setText("");
				
				System.out.println("cleared");
			}
		};
		cancel.addActionListener(cancelListener);
		
		frame.add(pane);
	    frame.setVisible(true); 
	}

}
