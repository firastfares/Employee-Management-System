package phase3;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class grade3OATUnitTestHard extends JFrame implements ActionListener {
	
	   private ImageIcon correctImageIcon;
	   
	   private ImageIcon incorrectIcon;
	   
	   int clicked = 0; //counting button clicks for dialog box pop ups
	
	 


	char[] answers = 		{
								'B',  //These values represent what the correct answer is for each question. Question 1's correct answer is A, question 2's is B, etc. You can change these around for different tests to have a different order
								'A',
								'C',
								'D',
								'A',
								
								
							};
	
	char guess;
	char answer;
	int index;
	int correct_guesses = 0;
	int total_questions = 5;
	int result;
	int seconds = 1800;
	
	JTextField textField1 = new JTextField() {
		 @Override public void setBorder(Border border) {
		} 
		};
		
		JTextField textField2_21 = new JTextField() {
			 @Override public void setBorder(Border border) {
				} 
				};
				
				
		JButton returnBut = new JButton("");		
		JRadioButton buttonA = new JRadioButton();
		JRadioButton buttonB = new JRadioButton();
		JRadioButton buttonC = new JRadioButton();
		JRadioButton buttonD = new JRadioButton();
		JLabel answer_labelA = new JLabel();
		JLabel answer_labelB = new JLabel();
		JLabel answer_labelC = new JLabel();
		JLabel answer_labelD = new JLabel();
		JLabel lblNewLabel_1 = new JLabel();
		JLabel time_label = new JLabel();
		JLabel seconds_left = new JLabel();
		
		JTextField number_right = new JTextField() {
			 @Override public void setBorder(Border border) {
				} 
				};
		JTextField percentage = new JTextField() {
			 @Override public void setBorder(Border border) {
				} 
				};
				Timer timer = new Timer(1000, new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						seconds--;
						seconds_left.setText(String.valueOf(seconds));
						if(seconds<=0) {
							displayAnswer();
						}
						}
					});
				
		
		
			
	
    public grade3OATUnitTestHard() {
    	
        initComponents();
        
    	buttonA.setBounds(138, 99, 21, 21);
    	panel.add(buttonA);
    	buttonA.setVisible(true);
    	buttonA.setBackground(new Color(255,255,255));
    	buttonA.setFocusable(false);
    	buttonA.addActionListener(this);
    	buttonB.setBounds(138, 152, 21, 21);
    	panel.add(buttonB);
    	buttonB.setBackground(new Color(255,255,255));
    	buttonB.setFocusable(false);
    	buttonB.addActionListener(this);
    	buttonC.setBounds(138, 205, 21, 21);
    	panel.add(buttonC);
		buttonC.setBackground(new Color(255,255,255));
		buttonC.setFocusable(false);
		buttonC.addActionListener(this);
		buttonD.setBounds(138, 258, 21, 21);
		panel.add(buttonD);
		buttonD.setBackground(new Color(255,255,255));
		buttonD.setFocusable(false);
		textField1.setBounds(43, 11, 612, 41);
		panel.add(textField1);
		textField1.setBackground(new Color(255,255,255));
		textField1.setForeground(new Color(0, 0, 0));
		textField1.setHorizontalAlignment(JTextField.CENTER);
		textField1.setEditable(false);
		textField1.setVisible(true);
		textField1.setColumns(10);
		try{
	           Font font = Font.createFont(Font.TRUETYPE_FONT, grade3OATUnitTestHard.class.getResourceAsStream("Bungee-Regular.ttf"));
	           textField1.setFont(font.deriveFont(Font.BOLD, 25f));
		}
	       catch(Exception e){}
		textField2_21.setBounds(172, 51, 353, 36);
		panel.add(textField2_21);
		textField2_21.setColumns(10);
		buttonD.addActionListener(this);
		answer_labelB.setBounds(158, 135, 156, 50);
		panel.add(answer_labelB);
		answer_labelB.setBackground(new Color(50,50,50));
		answer_labelB.setForeground(new Color(0,0,0));
		answer_labelB.setFont(new Font("Dialog",Font.PLAIN,30));
		answer_labelA.setBounds(158, 81, 150, 50);
		panel.add(answer_labelA);
		answer_labelA.setBackground(new Color(50,50,50));
		answer_labelA.setForeground(new Color(0,0,0));
		answer_labelA.setFont(new Font("Dialog",Font.PLAIN,30));
		answer_labelC.setBounds(158, 189, 156, 50);
		panel.add(answer_labelC);
		answer_labelC.setBackground(new Color(50,50,50));
		answer_labelC.setForeground(new Color(0,0,0));
		answer_labelC.setFont(new Font("Dialog",Font.PLAIN,30));
		answer_labelD.setBounds(158, 240, 150, 50);
		panel.add(answer_labelD);
		answer_labelD.setBackground(new Color(50,50,50));
		answer_labelD.setForeground(new Color(0,0,0));
		answer_labelD.setFont(new Font("Dialog",Font.PLAIN,30));
		number_right.setBounds(279, 63, 116, 50);
		panel.add(number_right);
		number_right.setBackground(new Color(255,255,255));
		number_right.setForeground(new Color(0,0,0));
		try{
	           Font font = Font.createFont(Font.TRUETYPE_FONT, grade3OATUnitTestHard.class.getResourceAsStream("Bungee-Regular.ttf"));
	           number_right.setFont(font.deriveFont(Font.BOLD, 25f));
	       }
	       catch(Exception e){}
		
		number_right.setHorizontalAlignment(JTextField.CENTER);
		number_right.setEditable(false);
		percentage.setBounds(279, 110, 116, 50);
		panel.add(percentage);
		percentage.setPreferredSize(new Dimension(50, 50));
		percentage.setBackground(new Color(255,255,255));
		percentage.setForeground(new Color(0,0,0));
		try{
	           Font font = Font.createFont(Font.TRUETYPE_FONT, grade3OATUnitTestHard.class.getResourceAsStream("Bungee-Regular.ttf"));
	           percentage.setFont(font.deriveFont(Font.BOLD, 25f));
	       }
	       catch(Exception e){}
		percentage.setHorizontalAlignment(JTextField.CENTER);
		percentage.setEditable(false);
		lblNewLabel_1.setBounds(415, 152, 120, 120);
		panel.add(lblNewLabel_1);
		
		
    }

		private void initComponents() {
			
			
			homebut = new JButton();
			profilebut = new JButton();
			progressbut = new JButton();
			classbut = new JButton();
			unitbut = new JButton();
			rewardsbut = new JButton();
			helpbut = new JButton();
			header = new JLabel();
			header.setIcon(new ImageIcon(grade3OATUnitTestHard.class.getResource("/Images/opacitymaybe.png")));
			numcrunch = new JLabel();
			sidebar = new JLabel();
			sidebar.setIcon(new ImageIcon(grade3OATUnitTestHard.class.getResource("/Images/opacitymaybe2.png")));
			back = new JLabel();

			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			setBackground(new Color(255, 255, 255));
			setPreferredSize(new Dimension(1024, 763));
			setSize(new Dimension(1024, 763));
			getContentPane().setLayout(null);

			label = new JLabel();
			label.setText("Crunchers");
			try {
				Font font = Font.createFont(Font.TRUETYPE_FONT,
						grade3OATUnitTestHard.class.getResourceAsStream("MPLUSRounded1c-Black.ttf"));
				label.setFont(font.deriveFont(Font.BOLD, 35f));
			} catch (Exception e) {
			}

			headerTitle = new JLabel("");
			headerTitle.setBounds(389, 156, 713, 100);
			getContentPane().add(headerTitle);
			headerTitle.setText("Grade 3 O/A Unit Test - Advanced");
			headerTitle.setFont(new Font("Roboto", Font.BOLD, 30));
			headerTitle.setForeground(new Color(255, 255, 255));

			panel = new JPanel();
			panel.setBounds(270, 340, 728, 373);
			panel.setBackground(Color.white);
			getContentPane().add(panel);
			panel.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.black));
			panel.setLayout(null);

			JTextPane warningMessage = new JTextPane();
			warningMessage.setBackground(new Color(0,0,0,0));
			warningMessage.setEditable(false);
			warningMessage.setContentType("text/html");
			warningMessage.setText("Make sure you have completed the unit test and reviewed your results before navigating away from this page! <p> Navigating away before the unit test is complete means your answers may not be saved! "
					+ "<p> Clicking any button on the sidebar again will quit this test.");
			
			warningMessage.setFont(new Font("Calibri", Font.BOLD, 18));
			
		
			homebut.setText("Home");

			homebut.setFont(new Font("Calibri", Font.PLAIN, 30));
			homebut.setForeground(new Color(255, 255, 255));
			homebut.setBackground(new Color(48, 126, 143));
			homebut.setOpaque(false);
			homebut.setIcon(new ImageIcon(getClass().getResource("Images/home.png")));
			homebut.setRolloverEnabled(true);
			homebut.setContentAreaFilled(false);
			homebut.setBorderPainted(false);
			getContentPane().add(homebut);
			homebut.setBounds(0, 133, 160, 52);
			homebut.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent evt) {
					homebut.setForeground(new Color(255, 127, 80));

				}
			});
			homebut.addMouseListener(new MouseAdapter() {
				public void mouseExited(MouseEvent evt) {
					homebut.setForeground(new Color(255, 255, 255));
				}
			});

			homebut.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent evt) {
				
					
					clicked++; //incrementing click variable
					if (clicked == 1) //if the user clicks the button once, the dialog box gets displayed
					{
						JOptionPane.showMessageDialog(null,warningMessage,"Wait!",JOptionPane.ERROR_MESSAGE);
					}
					else if (clicked > 1) //if the user clicks it more than once, the relevant page gets opened
					{
						try {
							for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
								if ("Nimbus".equals(info.getName())) {
									javax.swing.UIManager.setLookAndFeel(info.getClassName());
									break;
								}
							}
						} catch (ClassNotFoundException ex) {
							java.util.logging.Logger.getLogger(homepagev2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
						} catch (InstantiationException ex) {
							java.util.logging.Logger.getLogger(homepagev2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
						} catch (IllegalAccessException ex) {
							java.util.logging.Logger.getLogger(homepagev2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
						} catch (javax.swing.UnsupportedLookAndFeelException ex) {
							java.util.logging.Logger.getLogger(homepagev2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
						}
						homepagev2 homepagev2 = new homepagev2();
						homepagev2.setVisible(true);
						setVisible(false);//close this page


					}
				
			    	

				}
			});
			textField2_21.setBackground(new Color(255,255,255));
			textField2_21.setForeground(new Color(0,0,0));
			textField2_21.setVisible(true);
			textField2_21.setHorizontalAlignment(JTextField.CENTER);
			
			try{
		           Font font = Font.createFont(Font.TRUETYPE_FONT, grade3OATUnitTestHard.class.getResourceAsStream("Bungee-Regular.ttf"));
		           textField2_21.setFont(font.deriveFont(Font.BOLD, 25f));
			}
		       catch(Exception e){}
		       
			
			nextQuestion();
			returnBut.setVisible(false);
			returnBut.setBounds(0, 180, 690, 41);

			profilebut.setText("My Profile");

			profilebut.setForeground(new Color(255, 255, 255));
			profilebut.setBackground(new Color(48, 126, 143));
			profilebut.setOpaque(false);
			profilebut.setIcon(new ImageIcon(getClass().getResource("Images/hcprofile.png")));
			profilebut.setFont(new Font("Calibri", Font.PLAIN, 30));
			profilebut.setContentAreaFilled(false);
			profilebut.setBorderPainted(false);
			
			profilebut.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent evt) {
					profilebut.setForeground(new Color(255, 127, 80));
				}
			});

			profilebut.addMouseListener(new MouseAdapter() {
				public void mouseExited(MouseEvent evt) {
					profilebut.setForeground(new Color(255, 255, 255));
				}
			});
			
			clicked = 0;
			profilebut.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent evt) {
					
					clicked++; //incrementing click variable
					if (clicked == 1) //if the user clicks the button once, the dialog box gets displayed
					{
						JOptionPane.showMessageDialog(null,warningMessage,"Wait!",JOptionPane.ERROR_MESSAGE);
					}
					else if (clicked > 1) //if the user clicks it more than once, the relevant page gets opened
					{
						try {
							for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
								if ("Nimbus".equals(info.getName())) {
									javax.swing.UIManager.setLookAndFeel(info.getClassName());
									break;
								}
							}
						} catch (ClassNotFoundException ex) {
							java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
						} catch (InstantiationException ex) {
							java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
						} catch (IllegalAccessException ex) {
							java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
						} catch (javax.swing.UnsupportedLookAndFeelException ex) {
							java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
						}

						Profile Profile = new Profile();
						Profile.setVisible(true);
						setVisible(false);//close this page
						
					}
				
			    	

				}
			});

			getContentPane().add(profilebut);
			profilebut.setBounds(0, 204, 212, 52);

			progressbut.setText("My Progress");
			progressbut.setForeground(new Color(255, 255, 255));
			progressbut.setBackground(new Color(48, 126, 143));
			progressbut.setOpaque(false);
			progressbut.setIcon(new ImageIcon(getClass().getResource("Images/progress.png")));
			progressbut.setFont(new Font("Calibri", Font.PLAIN, 30));
			progressbut.setContentAreaFilled(false);
			progressbut.setBorderPainted(false);
			getContentPane().add(progressbut);
			progressbut.setBounds(0, 275, 235, 51);
			
			progressbut.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent evt) {
					progressbut.setForeground(new Color(255, 127, 80));
				}
			});

			progressbut.addMouseListener(new MouseAdapter() {
				public void mouseExited(MouseEvent evt) {
					progressbut.setForeground(new Color(255, 255, 255));
				}
			});
			
			clicked = 0;
			progressbut.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent evt) {
					
					clicked++; //incrementing click variable
					if (clicked == 1) //if the user clicks the button once, the dialog box gets displayed
					{
						JOptionPane.showMessageDialog(null,warningMessage,"Wait!",JOptionPane.ERROR_MESSAGE);
					}
					else if (clicked > 1) //if the user clicks it more than once, the relevant page gets opened
					{
						try {
							for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
								if ("Nimbus".equals(info.getName())) {
									javax.swing.UIManager.setLookAndFeel(info.getClassName());
									break;
								}
							}
						} catch (ClassNotFoundException ex) {
							java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
						} catch (InstantiationException ex) {
							java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
						} catch (IllegalAccessException ex) {
							java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
						} catch (javax.swing.UnsupportedLookAndFeelException ex) {
							java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
						}
						Profile Profile = new Profile();
						Profile.setVisible(true);
						setVisible(false);//close this page
						
					}
				
			    	

				}
			});


			classbut.setText("Recordings");
			classbut.setForeground(new Color(255, 255, 255));
			classbut.setBackground(new Color(48, 126, 143));
			classbut.setOpaque(false);
			classbut.setIcon(new ImageIcon(getClass().getResource("Images/class.png")));
			classbut.setFont(new Font("Calibri", Font.PLAIN, 30));
			classbut.setContentAreaFilled(false);
			classbut.setBorderPainted(false);
			getContentPane().add(classbut);
			classbut.setBounds(8, 346, 204, 51);
			
			classbut.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent evt) {
					classbut.setForeground(new Color(255, 127, 80));
				}
			});

			classbut.addMouseListener(new MouseAdapter() {
				public void mouseExited(MouseEvent evt) {
					classbut.setForeground(new Color(255, 255, 255));
				}
			});
			
			clicked = 0;
			classbut.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent evt) {
					
					clicked++; //incrementing click variable
					if (clicked == 1) //if the user clicks the button once, the dialog box gets displayed
					{
						JOptionPane.showMessageDialog(null,warningMessage,"Wait!",JOptionPane.ERROR_MESSAGE);
					}
					else if (clicked > 1) //if the user clicks it more than once, the relevant page gets opened
					{
						try {
							for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
								if ("Nimbus".equals(info.getName())) {
									javax.swing.UIManager.setLookAndFeel(info.getClassName());
									break;
								}
							}
						} catch (ClassNotFoundException ex) {
							java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
						} catch (InstantiationException ex) {
							java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
						} catch (IllegalAccessException ex) {
							java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
						} catch (javax.swing.UnsupportedLookAndFeelException ex) {
							java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
						}
						Profile Profile = new Profile();
						Profile.setVisible(true);
						setVisible(false);//close this page
						
					}
				
			    	

				}
			});

			unitbut.setText("Units");
			unitbut.setForeground(new Color(255, 255, 255));
			unitbut.setBackground(new Color(48, 126, 143));
			unitbut.setOpaque(false);
			unitbut.setIcon(new ImageIcon(getClass().getResource("Images/units.png")));
			unitbut.setFont(new Font("Calibri", Font.PLAIN, 30));
			unitbut.setContentAreaFilled(false);
			unitbut.setBorderPainted(false);
			getContentPane().add(unitbut);
			unitbut.setBounds(0, 414, 174, 51);
			
			unitbut.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent evt) {
					unitbut.setForeground(new Color(255, 127, 80));
				}
			});

			unitbut.addMouseListener(new MouseAdapter() {
				public void mouseExited(MouseEvent evt) {
					unitbut.setForeground(new Color(255, 255, 255));
				}
			});
			
			clicked = 0;
			
			unitbut.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent evt) {
				
					
					
					clicked++; //incrementing click variable
					if (clicked == 1) //if the user clicks the button once, the dialog box gets displayed
					{
						JOptionPane.showMessageDialog(null,warningMessage,"Wait!",JOptionPane.ERROR_MESSAGE);
					}
					else if (clicked > 1) //if the user clicks it more than once, the relevant page gets opened
					{
						try {
							for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
								if ("Nimbus".equals(info.getName())) {
									javax.swing.UIManager.setLookAndFeel(info.getClassName());
									break;
								}
							}
						} catch (ClassNotFoundException ex) {
							java.util.logging.Logger.getLogger(unitselectunittestgthree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
						} catch (InstantiationException ex) {
							java.util.logging.Logger.getLogger(unitselectunittestgthree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
						} catch (IllegalAccessException ex) {
							java.util.logging.Logger.getLogger(unitselectunittestgthree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
						} catch (javax.swing.UnsupportedLookAndFeelException ex) {
							java.util.logging.Logger.getLogger(unitselectunittestgthree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
						}
						unitselectunittestgthree unitselectunittestgthree  = new unitselectunittestgthree();
						unitselectunittestgthree.setVisible(true);
						setVisible(false);//close this page
						
					}
				
			    	

				}
			});

			rewardsbut.setText("Rewards");
			rewardsbut.setForeground(new Color(255, 255, 255));
			rewardsbut.setBackground(new Color(48, 126, 143));
			rewardsbut.setOpaque(false);
			rewardsbut.setIcon(new ImageIcon(getClass().getResource("Images/reward.png")));
			rewardsbut.setFont(new Font("Calibri", Font.PLAIN, 30));
			rewardsbut.setContentAreaFilled(false);
			rewardsbut.setBorderPainted(false);
			getContentPane().add(rewardsbut);
			rewardsbut.setBounds(0, 488, 180, 52);
			
			rewardsbut.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent evt) {
					rewardsbut.setForeground(new Color(255, 127, 80));
				}
			});

			rewardsbut.addMouseListener(new MouseAdapter() {
				public void mouseExited(MouseEvent evt) {
					rewardsbut.setForeground(new Color(255, 255, 255));
				}
			});
			
			clicked = 0;
			
			rewardsbut.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent evt) {

					
					clicked++; //incrementing click variable
					if (clicked == 1) //if the user clicks the button once, the dialog box gets displayed
					{
						JOptionPane.showMessageDialog(null,warningMessage,"Wait!",JOptionPane.ERROR_MESSAGE);
					}
					else if (clicked > 1) //if the user clicks it more than once, the relevant page gets opened
					{
						try {
							for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
								if ("Nimbus".equals(info.getName())) {
									javax.swing.UIManager.setLookAndFeel(info.getClassName());
									break;
								}
							}
						} catch (ClassNotFoundException ex) {
							java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
						} catch (InstantiationException ex) {
							java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
						} catch (IllegalAccessException ex) {
							java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
						} catch (javax.swing.UnsupportedLookAndFeelException ex) {
							java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
						}
						Profile Profile = new Profile();
						Profile.setVisible(true);
						setVisible(false);//close this page
						
					}
				
			    	

				}
			});

			helpbut.setText("Need Help? ");
			helpbut.setForeground(new Color(255, 255, 255));
			helpbut.setBackground(new Color(48, 126, 143));
			helpbut.setOpaque(false);
			helpbut.setIcon(new ImageIcon(getClass().getResource("Images/question.png")));
			helpbut.setFont(new Font("Calibri", Font.PLAIN, 30));
			helpbut.setContentAreaFilled(false);
			helpbut.setBorderPainted(false);
			getContentPane().add(helpbut);
			helpbut.setBounds(0, 559, 235, 52);
			
			helpbut.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent evt) {
					helpbut.setForeground(new Color(255, 127, 80));
				}
			});

			helpbut.addMouseListener(new MouseAdapter() {
				public void mouseExited(MouseEvent evt) {
					helpbut.setForeground(new Color(255, 255, 255));
				}
			});
			
			clicked = 0; //resetting click variable
			helpbut.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent evt) {
					
					
					clicked++; //incrementing click variable
					if (clicked == 1) //if the user clicks the button once, the dialog box gets displayed
					{
						JOptionPane.showMessageDialog(null,warningMessage,"Wait!",JOptionPane.ERROR_MESSAGE);
					}
					else if (clicked > 1) //if the user clicks it more than once, the relevant page gets opened
					{
						try {
							for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
								if ("Nimbus".equals(info.getName())) {
									javax.swing.UIManager.setLookAndFeel(info.getClassName());
									break;
								}
							}
						} catch (ClassNotFoundException ex) {
							java.util.logging.Logger.getLogger(Morehelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
						} catch (InstantiationException ex) {
							java.util.logging.Logger.getLogger(Morehelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
						} catch (IllegalAccessException ex) {
							java.util.logging.Logger.getLogger(Morehelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
						} catch (javax.swing.UnsupportedLookAndFeelException ex) {
							java.util.logging.Logger.getLogger(Morehelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
						}
						Morehelp Morehelp = new Morehelp();
						Morehelp.setVisible(true);
						setVisible(false);//close this page
						
					}
				
			    	

				}
			});

			header.setHorizontalAlignment(SwingConstants.CENTER);
			header.setBackground(new Color(65, 158, 178));
			header.setText("Unit 1: Test 1 ");
			header.setFont(new Font("Roboto", Font.BOLD, 30));
			header.setForeground(new Color(255, 255, 255));
			header.setBorder(null);
			getContentPane().add(header);
			header.setBounds(260, 136, 763, 140);

			numcrunch.setText("Number");

			try {
				Font font = Font.createFont(Font.TRUETYPE_FONT,
						grade3OATUnitTestHard.class.getResourceAsStream("MPLUSRounded1c-black.ttf"));
				numcrunch.setFont(font.deriveFont(Font.BOLD, 35f));
			} catch (Exception e) {
			}

			numcrunch.setForeground(new Color(255, 255, 255));
			getContentPane().add(numcrunch);
			numcrunch.setBounds(20, 0, 225, 60);

			label_1 = new JLabel();
			label_1.setText("Crunchers");
			try {
				Font font = Font.createFont(Font.TRUETYPE_FONT,
						grade3OATUnitTestHard.class.getResourceAsStream("MPLUSRounded1c-black.ttf"));
				label_1.setFont(font.deriveFont(Font.BOLD, 35f));
			} catch (Exception e) {
			}
			label_1.setForeground(Color.WHITE);

			label_1.setBounds(25, 51, 225, 60);
			getContentPane().add(label_1);

			sidebar.setBackground(new Color(48, 126, 143));
			getContentPane().add(sidebar);
			sidebar.setBounds(0, 0, 260, 723);
			getContentPane().add(back);
			back.setBounds(0, 0, 1024, 763);
			back.setIcon(new ImageIcon(getClass().getResource("Images/background.jpg")));

			pack();
		}
		public int randomFill(int min, int max) {
		    Random random = new Random();
		    return random.nextInt(max - min) + min;
		}
		

	  public void nextQuestion() {
		  
		  //Array of integers to correspond to the 5 answer labels
		  
		  int[] ints = new int[4];
		
		     //Randomization loops. Takes three elements, i, j, and k (probably only needed 2 but w/e), and assigns them a random number between 1 and 10 using the randomFill() method.
		  
		  for (int i = 0; i < ints.length; i++) {
		          ints[i] = randomFill(1, 15); 
		          for (int j = 0; j < i; j++) {
			          ints[j] = randomFill(1, 15); 
			          for (int k = 0; k < j; k++) {
				          ints[k] = randomFill(1, 15); 
				          
				          
				          
	
				 
							     
							  
			       //String array that fills in a textfield to display the question. Randomized elements from ints array are subbed in for regular numbers.
				      	String[] questions = 	{
								"Calculate: " + ints[i] + " x "  + ints[j], //creates a random multiplication question
								"Solve: " + (ints[j]+1) + " + " + ints[k], //creates random addition question. 
								"" + (ints[i] * 2) + "/" + 2 + " is: ", //Division. Keeping it as i*2/2 for now to avoid dealing with decimal stuff. When doing division tables in the future we may want to use a similar pattern (i*3/3, i*4/4, etc.) for the same reason despite that making the answers really predictable.
								"Add: " + (ints[j]+1) + " + " + ints[k], //creates a random addition question
								"Calculate: " + (ints[k]*2) + " x " + (ints[i]*2) //creates a random larger multiplication question
								
							
							};
				      	
			
				      	
				      
				      //2D string array that fills in the answer labels next to the buttons
		          
		          
		          String[][] options = 	{
		  				{""+(ints[j]*ints[i]+3),""+""+(ints[j]*ints[i]),""+(ints[k]*ints[k]+10),""+(ints[j]*ints[k]+2)}, //Multiplication. The first 2nd option (B) generates the correct answer. The remaining options are set to the original question (ints[j]*ints[k]) + 1, 2, or 3 to prevent the correct answer from randomly generating multiple times on different labels.
		  				{""+((ints[j]+1)+ints[k]),""+ (ints[j]*2), ""+(ints[k]*2 + ints[j]*2), ""+(ints[k] + (ints[j]))}, //Addition. The first option (A) generates the correct answer. 
		  				{""+(ints[i]+4*2/2),""+(ints[i]+6*2/2), ""+ ((ints[i] * 2)/2), ""+(ints[j]*2/2)}, //Division. 3rd option (C) generates the correct answer.
		  				{""+(ints[k] + ints[i]+3),""+(ints[k]*6 + ints[i]),""+(ints[k] - ints[i]),""+(ints[j]+1 + ints[k])}, //Addition. The fourth option (D) generates the correct answer. Similar strategy to above is used to prevent correct answer from generating multiple times.
		  				{(""+(ints[k]*2)*ints[i]*2), ""+ (ints[j]*4), ""+(ints[k]*6 + ints[j]*2), ""+(ints[k] * ints[j])} //Subtraction. The first option (A) generates the correct answer. Similar strategy to above is used to prevent correct answer from generating multiple times.
		  			};
		          
		         
		          
		      
		          //This if statement is supposed to reverse the placements of the i and 2 on a division problem if the randomly generated number is smaller than 2 (so 1 lol). 
		      	if ((ints[i]*2) < 2 && index == 2)
	  			{
	  				questions[2] = "Solve:  " + 2 + "/" + (ints[i]*2);
	  				options[2][2] = (""+(2/ints[i]));
	  				

	  			}
		      	
		      	
		      
		
		      		
		      		
		      	//Fulfills a similar purpose to the above statement. Reverses the placements of k and j if k < j during a subtraction problem to avoid negative numbers.
		   
		      	
		      	
		      	
		      	//This is all I've worked on so far. Still haven't been able to figure out how to randomize the position of the answer labels so the correct answers aren't always in the same place each time the test is run.
		  
			
	    	buttonA.setIcon(null);
	    	buttonB.setIcon(null);
	    	buttonC.setIcon(null);
	    	buttonD.setIcon(null);
	    		
	    		if(index>=total_questions) {
	    			results();
	    			
	    			
	    			buttonA.setVisible(false);
	    			buttonB.setVisible(false);
	    			buttonC.setVisible(false);
	    			buttonD.setVisible(false);
	    		}
	    
	    		
	    		
	    		
	    		if (index != 2 && index < 5) {
	    			

	    			lblNewLabel_1.setVisible(false);
	    			textField1.setText("Question "+(index+1)+"/" + (total_questions));
	    			textField2_21.setText(questions[index]);
	    			answer_labelA.setText(options[index][0]); //Tried various methods of setting the value of the 2nd dimension to a random number between 0 and 3 to see if it would shuffle the placements of the answer options around and nothing has worked so far.
	    			answer_labelB.setText(options[index][1]);
	    			answer_labelC.setText(options[index][2]);
	    			answer_labelD.setText(options[index][3]);
	    			buttonA.setSelected(false);
	    			buttonB.setSelected(false);
	    			buttonC.setSelected(false);
	    			buttonD.setSelected(false);
	    			timer.start();
	    			
	    		
	    		}
	    		
	    		else if (index == 2)
	    			{
	    				
	    				lblNewLabel_1.setVisible(true);
	    				textField1.setText("Question "+(index+1)+"/" + (total_questions));
	    				textField2_21.setText(questions[index]);
	    				answer_labelA.setText(options[index][0]);
	    				answer_labelB.setText(options[index][1]);
	    				answer_labelC.setText(options[index][2]);
	    				answer_labelD.setText(options[index][3]);
	    				buttonA.setSelected(false);
	    				buttonB.setSelected(false);
	    				buttonC.setSelected(false);
	    				buttonD.setSelected(false);
	    				timer.start();
	    			}
	    			
	    		}
		          }
		  }
	  }
	  
		@Override
		public void actionPerformed(ActionEvent e) {
				
				buttonA.setEnabled(false);
				buttonB.setEnabled(false);
				buttonC.setEnabled(false);
				buttonD.setEnabled(false);
				
				if(e.getSource()==buttonA) {
					answer= 'A';
					if(answer == answers[index]) {
						correct_guesses++;
					}
				}
				if(e.getSource()==buttonB) {
					answer= 'B';
					if(answer == answers[index]) {
						correct_guesses++;
					}
				}
				if(e.getSource()==buttonC) {
					answer= 'C';
					if(answer == answers[index]) {
						correct_guesses++;
					}
				}
				if(e.getSource()==buttonD) {
					answer= 'D';
					if(answer == answers[index]) {
						correct_guesses++;
					}
				}
				displayAnswer();
		}
		public void displayAnswer() {
			correctImageIcon = new ImageIcon(getClass().getResource("Images/plswork.png"));
			incorrectIcon = new ImageIcon (getClass().getResource("Images/plswork2.png"));
			
			
		
			timer.stop();
			
			buttonA.setEnabled(false);
			buttonB.setEnabled(false);
			buttonC.setEnabled(false);
			buttonD.setEnabled(false);
			
			if(answers[index] == 'A') {
				answer_labelA.setForeground(new Color(0,128,0));
		  buttonA.setIcon(correctImageIcon);
		buttonA.setEnabled(true);
			}
			else
			{
				if(answers[index] != 'A')
					answer_labelA.setForeground(new Color(255,0,0));
				 buttonA.setIcon(incorrectIcon);
				 buttonA.setEnabled(true);
			
			}

			if(answers[index] == 'B') {
				answer_labelB.setForeground(new Color(0,128,0));
			buttonB.setIcon(correctImageIcon);
			buttonB.setEnabled(true);
			
			}
			
			else {
				if(answers[index] != 'B') {
					answer_labelB.setForeground(new Color(255,0,0));
				buttonB.setIcon(incorrectIcon);
				 buttonB.setEnabled(true);
				}
			}
			
			
		
			
			if(answers[index] == 'C') {
				answer_labelC.setForeground(new Color(0,128,0));
			buttonC.setIcon(correctImageIcon);
			buttonC.setEnabled(true);
			}
			
			else {
				if(answers[index] != 'C') {
					answer_labelC.setForeground(new Color(255,0,0));
				 buttonC.setIcon(incorrectIcon);
				 buttonC.setEnabled(true);
				}
				
			}
			
			if(answers[index] == 'D') {
				answer_labelD.setForeground(new Color(0,128,0));
			buttonD.setIcon(correctImageIcon);
			buttonD.setEnabled(true);
			}
			
			
			else
			{
				
			
			if(answers[index] != 'D') {
				answer_labelD.setForeground(new Color(255,0,0));
			buttonD.setIcon(incorrectIcon);
			 buttonD.setEnabled(true);
			}
			}
			
			Timer pause = new Timer(2000, new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					answer_labelA.setForeground(new Color(0,0,0));
					
					answer_labelB.setForeground(new Color(0,0,0));
					
					answer_labelC.setForeground(new Color(0,0,0));
					
					answer_labelD.setForeground(new Color(0,0,0));
					
					
					answer = ' ';
					
					buttonA.setEnabled(true);
					buttonB.setEnabled(true);
					buttonC.setEnabled(true);
					buttonD.setEnabled(true);
					index++;
					nextQuestion();
				}
			});
			pause.setRepeats(false);
			pause.start();
		}
		public void results(){
			
			buttonA.setEnabled(false);
			buttonB.setEnabled(false);
			buttonC.setEnabled(false);
			buttonD.setEnabled(false);
			
			result = (int)((correct_guesses/(double)total_questions)*100);
			
			textField1.setText("RESULTS:");
			textField1.setBounds(33, 11, 612, 41);
			textField2_21.setVisible(false);
			textField2_21.setText("");
			answer_labelA.setText("");
			answer_labelA.setVisible(false);
			answer_labelB.setText("");
			answer_labelB.setVisible(false);
			answer_labelC.setText("");
			answer_labelC.setVisible(false);
			answer_labelD.setText("");
			answer_labelD.setVisible(false);
			
			number_right.setText("("+correct_guesses+"/"+total_questions+")");
			percentage.setText(result+"%");

			//adding the result value to the database
			PreparedStatement ps;
			int rs;
			Myconnection conn = new Myconnection();//connect
			String query="INSERT INTO numbercruncher.practice_test_grade(student_uname,3g2testhard) \n" +
					"VALUES (?,?)\n" +
					" on DUPLICATE key update 3g2testhard =?";
			try {

				ps = conn.getconnection().prepareStatement(query);//call the query
				ps.setString(1, login.getdata[0]);//insert user data
				ps.setString(2, String.valueOf(result));//insert result
				ps.setString(3, String.valueOf(result));//insert index data

				rs = ps.executeUpdate();//execute

			} catch (SQLException ex) {
				Logger.getLogger(phase3.login.class.getName()).log(Level.SEVERE, null, ex); }


			panel.add(number_right);
			panel.add(percentage);
			
		if (correct_guesses == 5 || correct_guesses == 4)
		{
			percentage.setForeground(new Color(0,128,0));
		}
		
		else if (correct_guesses == 3)
		{
			percentage.setForeground(new Color(204,204,0));
		}
		
		else
		{
			percentage.setForeground(new Color(255, 0 ,0));
		}
			
			
			returnBut.setVisible(true);
			returnBut.setText("Click here to return to the test selector page!");
			
			returnBut.addMouseListener(new MouseAdapter() {
	            public void mouseEntered(MouseEvent evt) {
	                returnBut.setForeground(new Color(48, 126, 143)); 
	                
	            }
	        });
	        returnBut.addMouseListener(new MouseAdapter() {
	            public void mouseExited(MouseEvent evt) {
	                returnBut.setForeground(new Color(0, 0, 0));
	                
	               
	            }
	        });
			
		}



	    public static void main(String args[]) {

	        try {
	            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(grade3OATUnitTestHard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(grade3OATUnitTestHard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(grade3OATUnitTestHard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(grade3OATUnitTestHard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }


	        /* Create and display the form */
	        EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new grade3OATUnitTestHard().setVisible(true);
	            }
	        });
	    }
	    

		// Variables declaration - do not modify//GEN-BEGIN:variables
		private JLabel back;
		private JButton classbut;
		private JLabel header;
		private JButton helpbut;
		private JButton homebut;
		private JLabel numcrunch;
		private JButton profilebut;
		private JButton progressbut;
		private JButton rewardsbut;
		private JLabel sidebar;
		private JButton unitbut;
		private JLabel label;
		private JPanel panel;
		private JLabel label_1;
		private JLabel headerTitle;
		
		
	}

