import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                buildGUI();
            }
        });
    }
    public static void buildGUI() {
    	//setup

    	JFrame frame = new JFrame("calculator");
		frame.setSize(600,600);
			    
		frame.addWindowListener(new WindowAdapter()
		{
		    public void windowClosing(WindowEvent windowEvent)
		    {
			    System.exit(0);
			}        
		});
		
		/*JPanel inputPane = new JPanel(new GridBagLayout());
		GridBagConstraints a = new GridBagConstraints();
		
		JTextField numberInput = new JTextField(10);
		a.gridx = 0;
		a.gridy = 0;
		a.fill = GridBagConstraints.HORIZONTAL;
		a.gridheight = 3;
		a.gridwidth = 4;
		inputPane.add(numberInput, a);*/
		
		/*ActionListener clearListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberInput.setText("");
			}
		};
		clear.addActionListener(clearListener);*/
		
		//main pane
		JPanel pane = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		//fields
		
		//use key listener/echo for password
		JPasswordField pwf;
		pwf = new JPasswordField(10);
		pwf.setEchoChar('#');
		c.gridx = 0;
		c.gridy = 0;
		c.fill = GridBagConstraints.HORIZONTAL;
		pane.add(pwf,c);
		
		JTextArea err;
		err = new JTextArea();
		err.setText("Incorrect Password!");
		c.gridx = 1;
		c.gridy = 0;
		err.setVisible(false);
		pane.add(err,c);
		
		JButton login = new JButton("Login");
		c.gridx = 0;
		c.gridy = 1;
		c.fill = GridBagConstraints.HORIZONTAL;
		//c.gridwidth = 2;
		pane.add(login,c);
		
		String[] products = {" ","Bread", "Milk", "Biscuits", "Teabags", "Coffee"};
		JComboBox<String> productList = new JComboBox<String>(products);
		c.gridx = 0;
		c.gridy = 2;
		pane.add(productList,c);
		productList.setEnabled(false);
		
		JTextField descBox = new JTextField();
		c.gridx = 1;
		c.gridy = 2;
		pane.add(descBox,c);
		descBox.setEnabled(false);
		descBox.setDisabledTextColor(Color.BLACK);
		descBox.setVisible(false);
		
		JRadioButton rb1 = new JRadioButton("Like");
		JRadioButton rb2 = new JRadioButton("Neutral");
		JRadioButton rb3 = new JRadioButton("Dislike");
		ButtonGroup radioGroup = new ButtonGroup();
		
		radioGroup.add(rb1);
		c.gridx = 0;
		c.gridy = 3;
		pane.add(rb1,c);
		
		radioGroup.add(rb2);
		c.gridx = 1;
		c.gridy = 3;
		pane.add(rb2,c);
		
		radioGroup.add(rb3);
		c.gridx = 2;
		c.gridy = 3;
		pane.add(rb3,c);
		
		rb1.setVisible(false);
		rb2.setVisible(false);
		rb3.setVisible(false);
		
		JCheckBox fav = new JCheckBox("Save to Favourites", false);
		c.gridx = 2;
		c.gridy = 4;
		pane.add(fav,c);
		fav.setVisible(false);
		
		//Listeners
		
		ActionListener loginListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(new String(pwf.getPassword()).equals("123")) {
					productList.setEnabled(true);
				}
			}
		};
		login.addActionListener(loginListener);
		
		ActionListener descListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(new String(pwf.getPassword()).equals("123")) {
					err.setVisible(false);
					productList.setEnabled(true);
				}
				else
					err.setVisible(true);
			}
		};
		descBox.addActionListener(descListener);
		
		ActionListener productListListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch (productList.getSelectedItem().toString()) {
				case " " :
					descBox.setText(" ");
					setDescFalse();
					break;
					
				case "Bread" :
					descBox.setText("$1.00");
					setDescTrue();
					break;
					
				case "Milk" :
					descBox.setText("$1.25");
					setDescTrue();
					break;
					
				case "Biscuits" :
					descBox.setText("$1.50");
					setDescTrue();
					break;
					
				case "Teabags" :
					descBox.setText("$2.50");
					setDescTrue();
					break;
					
				case "Coffee" :
					descBox.setText("$3.00");
					setDescTrue();
					break;
				}
			}
			
			public void setDescFalse() {
				descBox.setVisible(false);
				rb1.setVisible(false);
				rb2.setVisible(false);
				rb3.setVisible(false);
				fav.setVisible(false);
			}
			
			public void setDescTrue() {
				descBox.setVisible(true);
				rb1.setVisible(true);
				rb2.setVisible(true);
				rb3.setVisible(true);
				fav.setVisible(true);
			}
		};
		productList.addActionListener(productListListener);

	    //c.gridheight = 3;
		//c.gridwidth = 4;
		
		//frame.add(inputPane);
		frame.add(pane);
		frame.setVisible(true);
    }
	
	public static String doMath(String input) {
		String result = "";
		double res = 0;
		result = Double.toString(res);
		return result;
	}
}
