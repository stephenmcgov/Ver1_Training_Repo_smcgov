import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Graphics;

public class Main {

	public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                buildGUI();
            }
        });
    }
	
	public void paint(Graphics g){
	    
	    g.drawOval(50, 40, 150, 150);  
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
		
		//main pane
		JPanel pane = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		//fields
		
		//use key listener/echo for password
		JSlider s1,s2,s3;
		s1 = new JSlider(0,255,0);
		c.gridx = 0;
		c.gridy = 0;
		c.fill = GridBagConstraints.HORIZONTAL;
		pane.add(s1,c);
		s2 = new JSlider(0,255,0);
		c.gridx = 0;
		c.gridy = 1;
		c.fill = GridBagConstraints.HORIZONTAL;
		pane.add(s2,c);
		s3 = new JSlider(0,255,0);
		c.gridx = 0;
		c.gridy = 2;
		c.fill = GridBagConstraints.HORIZONTAL;
		pane.add(s3,c);
		
		//Listeners
		
		ChangeListener sListener = new ChangeListener() {
			String input;

			@Override
			public void stateChanged(ChangeEvent e) {
				if (s1.getValueIsAdjusting()||s2.getValueIsAdjusting()||s3.getValueIsAdjusting())
				{
					input = ("R:" + (int)s1.getValue() + " G: " + (int)s2.getValue() + " B: " + (int)s3.getValue());
					pane.setBackground(new Color((int)s1.getValue(),(int)s2.getValue(),(int)s3.getValue()));
				}

			    System.out.println(input);
			}
		};
		s1.addChangeListener(sListener);
		s2.addChangeListener(sListener);
		s3.addChangeListener(sListener);
		
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
