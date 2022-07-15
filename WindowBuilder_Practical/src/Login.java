import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.beans.PropertyChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.metal.MetalToggleButtonUI;
import javax.swing.event.ChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.Label;
import java.awt.Panel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JToggleButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public Login(Database db) throws IOException {
		initialize(db);
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize(Database db) throws IOException {
		//setup frame
		ImageIcon icon;
		Image scaledImage;
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 500, 500);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(new GridLayout(0, 3, 0, 0));
		
		//--frame contents
		JLabel lblNewLabel_3 = new JLabel("Enter Name");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		getFrame().getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Click Me");
		getFrame().getContentPane().add(btnNewButton);
		btnNewButton.setVisible(false);
		
		JLabel lblNewLabel_4 = new JLabel("Enter Catchphrase");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		getFrame().getContentPane().add(lblNewLabel_4);
		
		textField = new JTextField();
		getFrame().getContentPane().add(textField);
		textField.setColumns(10);
		
		Label label_8 = new Label("Has been clicked");
		label_8.setAlignment(Label.CENTER);
		getFrame().getContentPane().add(label_8);
		label_8.setVisible(false);
		
		textField_1 = new JTextField();
		getFrame().getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Name Format Error!");
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		getFrame().getContentPane().add(lblNewLabel_5);
		lblNewLabel_5.setVisible(true);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		getFrame().getContentPane().add(chckbxNewCheckBox);
		chckbxNewCheckBox.setEnabled(false);
		chckbxNewCheckBox.setVisible(false);
		
		JLabel label_7_1_1 = new JLabel("");
		getFrame().getContentPane().add(label_7_1_1);
		
		JSpinner spinner_1 = new JSpinner();
		getFrame().getContentPane().add(spinner_1);
		spinner_1.setValue(10);
		spinner_1.setEnabled(false);
		spinner_1.setVisible(false);
		
		JLabel lblNewLabel_1 = new JLabel("Times clicked:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		getFrame().getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setVisible(false);
		
		JSpinner spinner = new JSpinner();
		getFrame().getContentPane().add(spinner);
		spinner.setEnabled(false);
		spinner.setVisible(false);
		
		JLabel label_7_1_4_1 = new JLabel("");
		getFrame().getContentPane().add(label_7_1_4_1);
		
		JLabel lblNewLabel_2 = new JLabel("0");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		getFrame().getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.setVisible(false);
		
		JLabel label_7_1_4_3 = new JLabel("");
		getFrame().getContentPane().add(label_7_1_4_3);
		
		JLabel label_7_1_4_3_1 = new JLabel("");
		getFrame().getContentPane().add(label_7_1_4_3_1);
		
		JLabel lblNewLabel = new JLabel("Is being clicked?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getFrame().getContentPane().add(lblNewLabel);
		lblNewLabel.setVisible(false);
		
		JLabel label_7_1_4_3_1_1 = new JLabel("");
		getFrame().getContentPane().add(label_7_1_4_3_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("YES");
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		getFrame().getContentPane().add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setEnabled(false);
		rdbtnNewRadioButton.setVisible(false);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("MAYBE");
		rdbtnNewRadioButton_2.setHorizontalAlignment(SwingConstants.CENTER);
		getFrame().getContentPane().add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setEnabled(false);
		rdbtnNewRadioButton_2.setVisible(false);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("NO");
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		getFrame().getContentPane().add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setEnabled(false);
		rdbtnNewRadioButton_1.setSelected(true);
		rdbtnNewRadioButton_1.setVisible(false);
		
		JLabel label_7_1_4 = new JLabel("");
		getFrame().getContentPane().add(label_7_1_4);
		
		JLabel lblPrizeIn = new JLabel("Click Rank: Novice");
		lblPrizeIn.setHorizontalAlignment(SwingConstants.CENTER);
		getFrame().getContentPane().add(lblPrizeIn);
		lblPrizeIn.setVisible(false);
		
		JLabel label_7_1_4_2_1 = new JLabel("");
		getFrame().getContentPane().add(label_7_1_4_2_1);
		
		JLabel label_7_1_4_2_1_1 = new JLabel("");
		getFrame().getContentPane().add(label_7_1_4_2_1_1);
		
		JProgressBar progressBar = new JProgressBar();
		getFrame().getContentPane().add(progressBar);
		progressBar.setVisible(false);
		
		JLabel label_7_1_4_2 = new JLabel("");
		getFrame().getContentPane().add(label_7_1_4_2);
		
		JLabel label_7_1_3_1 = new JLabel("");
		label_7_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		getFrame().getContentPane().add(label_7_1_3_1);
		icon = new ImageIcon("src/images/TravelLightPerk.png");
		scaledImage = icon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
		label_7_1_3_1.setIcon(new ImageIcon(scaledImage));
		label_7_1_3_1.setVisible(false);
		
		JLabel label_7_1_3 = new JLabel("");
		label_7_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		getFrame().getContentPane().add(label_7_1_3);
		icon = new ImageIcon("src/images/Beta_Software.png");
		scaledImage = icon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
		label_7_1_3.setIcon(new ImageIcon(scaledImage));
		label_7_1_3.setVisible(false);
		
		JLabel label_7_1_2 = new JLabel("");
		label_7_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		getFrame().getContentPane().add(label_7_1_2);
		
		icon = new ImageIcon("src/images/Here_And_Now.png");
		scaledImage = icon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
		label_7_1_2.setIcon(new ImageIcon(scaledImage));
		label_7_1_2.setVisible(false);
		
		JLabel label_5_1 = new JLabel("");
		getFrame().getContentPane().add(label_5_1);
		
		JButton btnNewButton_1 = new JButton("Submit");
		getFrame().getContentPane().add(btnNewButton_1);
		btnNewButton_1.setVisible(false);
		
		JLabel label_5_2 = new JLabel("");
		getFrame().getContentPane().add(label_5_2);
		
		JButton btnNewButton_2 = new JButton("RESET");
		getFrame().getContentPane().add(btnNewButton_2);
		btnNewButton_2.setVisible(false);
		
		Label label = new Label("MUTED");
		label.setAlignment(Label.CENTER);
		getFrame().getContentPane().add(label);
		label.setVisible(false);
		
		JButton btnNewButton_3 = new JButton("QUIT");
		getFrame().getContentPane().add(btnNewButton_3);
		btnNewButton_3.setVisible(false);
		
		JLabel label_7_1_1_1_1 = new JLabel("");
		getFrame().getContentPane().add(label_7_1_1_1_1);
		
		JSlider slider = new JSlider();
		slider.setValue(0);
		slider.setMaximum(1);
		slider.setSnapToTicks(true);
		getFrame().getContentPane().add(slider);
		slider.setVisible(false);
		
		//--action listeners
		
		//
		//if(textField.getText()=="") lblNewLabel_5.setVisible(true);
		//else lblNewLabel_5.setVisible(false);
		
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				//isEmpty ignores 1st char, =="" ignores after 1st press
				if(textField.getText().isEmpty()) {
					lblNewLabel_5.setVisible(true);
					btnNewButton_1.setVisible(false);
				}
				else {
					lblNewLabel_5.setVisible(false);
					btnNewButton_1.setVisible(true);
				}
			}
		});
		
		//submit login
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//enter name/catchphrase -> unlock/show
				lblNewLabel_3.setText(textField.getText());
				lblNewLabel_4.setText(textField_1.getText());
				if (!textField.getText().isEmpty()) {
					boolean exists = db.checkPlayer(textField.getText(), textField_1.getText());

					//needs var in db, assumes has clicked!
					chckbxNewCheckBox.setSelected(true);

					if(exists) {
						spinner.setValue(Integer.parseInt(db.retrievePlayerClicks(textField.getText())));
						
						
						if((int)spinner.getValue() >= 1) {
							//clickRankAchieved = abc
							
							lblPrizeIn.setText("Click Rank: JourneyMan");
							label_7_1_3_1.setVisible(true);
									
							if((int)spinner.getValue() == 4) progressBar.setValue(40);
							if((int)spinner.getValue() == 3) progressBar.setValue(30);
							if((int)spinner.getValue() == 2) progressBar.setValue(20);
							if((int)spinner.getValue() == 1) progressBar.setValue(10);
						}
						if((int)spinner.getValue() >= 5) {
							//clickRankAchieved = abc
							lblPrizeIn.setText("Click Rank: Apprentice");
							label_7_1_3.setVisible(true);
									
							if((int)spinner.getValue() == 9) progressBar.setValue(90);
							if((int)spinner.getValue() == 8) progressBar.setValue(80);
							if((int)spinner.getValue() == 7) progressBar.setValue(70);
							if((int)spinner.getValue() == 6) progressBar.setValue(60);
							if((int)spinner.getValue() == 5) progressBar.setValue(50);
						}
						if((int)spinner.getValue() >= 10) {
							//clickRankAchieved = abc
							lblPrizeIn.setText("Click Rank: Master");
							progressBar.setValue(100);
							label_7_1_2.setVisible(true);
						}
					}
					else {
						//set all vals / visibilities to default/login
						lblNewLabel_3.setText(textField.getText());
						lblNewLabel_4.setText(textField_1.getText());
						lblNewLabel_5.setVisible(false);
						btnNewButton_1.setVisible(false);
						chckbxNewCheckBox.setEnabled(false);
						lblNewLabel_2.setText("0");
						lblPrizeIn.setText("Click Rank: Novice");
						progressBar.setValue(0);
						label_7_1_2.setVisible(false);
						label_7_1_3.setVisible(false);
						label_7_1_3_1.setVisible(false);
						chckbxNewCheckBox.setSelected(false);
						spinner.setValue(0);
					}
				}
				lblNewLabel_2.setText(db.retrievePlayerClicks(textField.getText()));
				lblNewLabel_4.setText(db.retrievePlayerCatchphrase(textField.getText()));
				
				//show hidden elements
				btnNewButton.setVisible(true);
				label_8.setVisible(true);
				chckbxNewCheckBox.setVisible(true);
				rdbtnNewRadioButton.setVisible(true);
				rdbtnNewRadioButton_1.setVisible(true);
				rdbtnNewRadioButton_2.setVisible(true);
				lblNewLabel.setVisible(true);
				lblNewLabel_1.setVisible(true);
				lblNewLabel_2.setVisible(true);
				progressBar.setVisible(true);
				btnNewButton_2.setVisible(true);
				btnNewButton_3.setVisible(true);
				label.setVisible(true);
				lblPrizeIn.setVisible(true);
				slider.setVisible(true);
				
				//hide login elements
				//lblNewLabel_3.setVisible(false);
				//lblNewLabel_4.setVisible(false);
				textField.setVisible(false);
				textField_1.setVisible(false);
				btnNewButton_1.setVisible(false);
				
				//set name/catchphrase
				//setText()
				
				//else -> show error text
			}
		});
		
		//This section deprecated
		
		AudioClip sound1, sound2, sound3, sound4, soundGrad;
		File wavFile = new File("c:\\Windows\\media\\Speech Misrecognition.wav");
		sound1 = Applet.newAudioClip(wavFile.toURL());
		wavFile = new File("c:\\Windows\\media\\Speech Off.wav");
		sound2 = Applet.newAudioClip(wavFile.toURL());
		wavFile = new File("c:\\Windows\\media\\Speech On.wav");
		sound3 = Applet.newAudioClip(wavFile.toURL());
		wavFile = new File("c:\\Windows\\media\\Speech Sleep.wav");
		sound4 = Applet.newAudioClip(wavFile.toURL());
		wavFile = new File("c:\\Windows\\media\\tada.wav");
		soundGrad = Applet.newAudioClip(wavFile.toURL());
				
		//clicker button clicked
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxNewCheckBox.setSelected(true);
						
				//thread?
				if(label.getText()=="UNMUTED") {
					//max rank
					if ((int)spinner_1.getValue() == 1) soundGrad.play();
							
					else {
						int min = 1;
						int max = 5;
						int random_int = (int)Math.floor(Math.random()*(max-min+1));
						if (random_int==1)sound1.play();
						else if (random_int==2)sound2.play();
						else if (random_int==3)sound3.play();
						else if (random_int==4)sound4.play();
						System.out.println("playing");
						sound1.play();
					}
				}
						
				//init and recurring
				db.updatePlayer(textField.getText(), (int)spinner.getValue()+1);
				System.out.println(textField.getText());
				System.out.println((int)spinner.getValue()+1);
				
				lblNewLabel_2.setText(db.retrievePlayerClicks(textField.getText()));
				
				System.out.println(db.retrievePlayerClicks(textField.getText()));
				
				spinner.setValue(((int)spinner.getValue()+1));
				//spinner_1.setValue((10-(int)spinner.getValue()));
				lblNewLabel_2.setText(spinner.getValue().toString());
				lblPrizeIn.setText("Click Rank: Journeyman");
						
				if((int)spinner.getValue() >= 10) {
					//clickRankAchieved = abc from db
					lblPrizeIn.setText("Click Rank: Master");
					progressBar.setValue(100);
					label_7_1_2.setVisible(true);
				}
				
				else if((int)spinner.getValue() >= 5) {
					//clickRankAchieved = abc
					lblPrizeIn.setText("Click Rank: Apprentice");
					label_7_1_3.setVisible(true);
							
					if((int)spinner.getValue() == 9) progressBar.setValue(90);
					if((int)spinner.getValue() == 8) progressBar.setValue(80);
					if((int)spinner.getValue() == 7) progressBar.setValue(70);
					if((int)spinner.getValue() == 6) progressBar.setValue(60);
					if((int)spinner.getValue() == 5) progressBar.setValue(50);
				}
				else if((int)spinner.getValue() >= 1) {
					//clickRankAchieved = abc
					
					lblPrizeIn.setText("Click Rank: JourneyMan");
					label_7_1_3_1.setVisible(true);
							
					if((int)spinner.getValue() == 4) progressBar.setValue(40);
					if((int)spinner.getValue() == 3) progressBar.setValue(30);
					if((int)spinner.getValue() == 2) progressBar.setValue(20);
					if((int)spinner.getValue() == 1) progressBar.setValue(10);
				}
			}
		});
				
		//click intention detection
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				rdbtnNewRadioButton.setSelected(true);
				rdbtnNewRadioButton_1.setSelected(false);
				rdbtnNewRadioButton_2.setSelected(false);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				rdbtnNewRadioButton.setSelected(false);
				rdbtnNewRadioButton_1.setSelected(false);
				rdbtnNewRadioButton_2.setSelected(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				rdbtnNewRadioButton.setSelected(false);
				rdbtnNewRadioButton_1.setSelected(false);
				rdbtnNewRadioButton_2.setSelected(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				rdbtnNewRadioButton.setSelected(false);
				rdbtnNewRadioButton_1.setSelected(true);
				rdbtnNewRadioButton_2.setSelected(false);
			}
		});
		
		//reset button
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//set all vals / visibilities to default/login
				lblNewLabel_3.setText("Enter Name");
				lblNewLabel_4.setText("Enter Catchphrase");
				textField.setText("");
				textField_1.setText("");
				lblNewLabel_5.setVisible(true);
				btnNewButton_1.setVisible(false);
				chckbxNewCheckBox.setEnabled(false);
				lblNewLabel_2.setText("0");
				lblPrizeIn.setText("Click Rank: Novice");
				progressBar.setValue(0);
				label_7_1_2.setVisible(false);
				label_7_1_3.setVisible(false);
				label_7_1_3_1.setVisible(false);
				chckbxNewCheckBox.setSelected(false);
				spinner.setValue(0);
				
				//hide clicker elements
				btnNewButton.setVisible(false);
				label_8.setVisible(false);
				chckbxNewCheckBox.setVisible(false);
				rdbtnNewRadioButton.setVisible(false);
				rdbtnNewRadioButton_1.setVisible(false);
				rdbtnNewRadioButton_2.setVisible(false);
				lblNewLabel.setVisible(false);
				lblNewLabel_1.setVisible(false);
				lblNewLabel_2.setVisible(false);
				progressBar.setVisible(false);
				btnNewButton_2.setVisible(false);
				btnNewButton_3.setVisible(false);
				label.setVisible(false);
				lblPrizeIn.setVisible(false);
				slider.setVisible(false);
				
				//show login elements
				lblNewLabel_3.setVisible(true);
				lblNewLabel_4.setVisible(true);
				textField.setVisible(true);
				textField_1.setVisible(true);
			}
		});
				
		//quit button
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//update DB in thread
				//await response
				System.exit(0);
			}
		});
		
		//set sound on/off
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(slider.getValue()==1) {
					label.setText("UNMUTED"); 
				}
				else {
					label.setText("MUTED"); 
				}
			}
		});
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}

