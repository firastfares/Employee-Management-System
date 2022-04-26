package phase3;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thest
 */

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//This tutorial is controlled by the user. It begins by presenting a limited amount of information, and more can be revealed by clicking the arrow.
															//The tutorial culminates in a practice problem which the user will complete. The arrow will turn gold to indicate that tutorial has finished
public class guestgrade4Base10Tutorial extends JFrame {

	/**
	 * Creates new form tutorial
	 */

	private ImageIcon correctImageIcon;
	private ImageIcon incorrectIcon;









	public guestgrade4Base10Tutorial() {
		initComponents();
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dim = toolkit.getScreenSize();
		getContentPane().setSize(dim.width, dim.height);

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
		header.setIcon(new ImageIcon(guestgrade4Base10Tutorial.class.getResource("Images/opacitymaybe.png")));
		numcrunch = new JLabel();
		sidebar = new JLabel();
		sidebar.setIcon(new ImageIcon(guestgrade4Base10Tutorial.class.getResource("Images/opacitymaybe2.png")));
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
					guestgrade4Base10Tutorial.class.getResourceAsStream("MPLUSRounded1c-Black.ttf"));
			label.setFont(font.deriveFont(Font.BOLD, 35f));
		} catch (Exception e) {
		}

		headerTitle = new JLabel("New label");
		headerTitle.setBounds(295, 156, 713, 100);
		getContentPane().add(headerTitle);
		headerTitle.setText("Grade 4 Base 10 Tutorial: Multiplication by 100 or 1000");
		headerTitle.setFont(new Font("Roboto", Font.BOLD, 26));
		headerTitle.setForeground(new Color(255, 255, 255));

		panel = new JPanel();
		panel.setBounds(270, 340, 728, 373);
		panel.setBackground(Color.white);
		getContentPane().add(panel);
		panel.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.black));
		panel.setLayout(null);

		JTextPane textArea = new JTextPane() {
			@Override
			public void setBorder(Border border) {
			}
		};
		textArea.setContentType("text/html");
		String tabs = ("&emsp&emsp&emsp&emsp&emsp&emsp&emsp&emsp&emsp&emsp&emsp&emsp&emsp&emsp&emsp&emsp&emsp");

		textArea4 = new JTextArea() {
			public void setBorder(Border border) {
			}
		};
		textArea4.setText("Now you try! Click the arrow to try a practice problem!");
		textArea4.setEditable(false);
		textArea4.setFont(new Font("Roboto", Font.PLAIN, 15));
		textArea4.setForeground(new Color(48, 126, 143));
		textArea4.setVisible(false);
		textArea4.setBounds(7, 305, 546, 22);
		panel.add(textArea4);

		textArea.setBounds(7, 11, 708, 59);
		panel.add(textArea);
		textArea.setFont(new Font("Roboto", Font.PLAIN, 15));
		textArea.setForeground(new Color(48, 126, 143));
		textArea.setText(
				"Multiplying a single-digit number by 100 is equivalent to multiplying that number by 10 twice:"
						+ " <br>" + tabs + "<b>8 x 100 = 8 x 10 x 10</b>");
		textArea.setEditable(false);

		textArea2 = new JTextPane() {
			public void setBorder(Border border) {
			}
		};
		textArea2.setContentType("text/html");
		textArea2.setFont(new Font("Roboto", Font.PLAIN, 15));
		textArea2.setForeground(new Color(48, 126, 143));
		textArea2.setText(
				"Given that 8 x 10 is the same as moving the original value (8) to the left, and putting one 0 (because there is one 10) in the empty space on the right, multipying by 100 is the same as moving "
						+ "the original value (8) to the left and putting <b>two</b> 0s (because there are two 10s) in the empty space on "
						+ "the right: <br><br> 8 x 1<b>0</b> = 80 (<b>one</b> 10, so add <b>one</b> 0) <br> 8 x 100 = 8 x 10 x 10 = 8<b>00</b> (<b>two</b> 10s, so add <b>two</b> 0s)");
		textArea2.setEditable(false);
		textArea2.setVisible(false);
		textArea2.setBounds(7, 68, 698, 118);
		panel.add(textArea2);

		textArea3 = new JTextPane() {
			public void setBorder(Border border) {
			}
		};
		textArea3.setContentType("text/html");
		textArea3.setFont(new Font("Roboto", Font.PLAIN, 15));
		textArea3.setForeground(new Color(48, 126, 143));
		textArea3.setText(
				"<br>This can also be applied to multiplying by <b>1000</b>; as it is the same as multiplying by three 10s, you would add three 0s to the right of the original number: <br><br> 8 x 1000 = 8 x 10 x 10 x 10 = 8000 (<b>three</b> 10s, so add <b>three</b> 0s)");
		textArea3.setEditable(false);
		textArea3.setVisible(false);
		textArea3.setBounds(7, 186, 637, 109);
		panel.add(textArea3);

		textArea5 = new JTextPane() {
			public void setBorder(Border border) {
			}
		};
		textArea5.setContentType("text/html");
		textArea5.setText("<b>2 x 1000 =</b>");
		textArea5.setEditable(false);
		textArea5.setFont(new Font("Roboto", Font.PLAIN, 15));
		textArea5.setForeground(new Color(48, 126, 143));
		textArea5.setVisible(false);
		textArea5.setBounds(27, 338, 75, 22);
		panel.add(textArea5);

		textAnswer = new JTextField();
		textAnswer.setFont(new Font("Dialog", Font.BOLD, 15));
		textAnswer.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		textAnswer.setBounds(105, 337, 86, 23);
		textAnswer.setBackground(new Color(226, 225, 225));
		textAnswer.setVisible(false);
		panel.add(textAnswer);
		textAnswer.setColumns(10);

		JLabel correctAnswer = new JLabel();
		correctAnswer.setVisible(false);
		correctAnswer.setBounds(195, 338, 21, 21);
		panel.add(correctAnswer);

		JLabel incorrectAnswer = new JLabel();
		incorrectAnswer.setVisible(false);
		incorrectAnswer.setBounds(195, 338, 21, 21);
		panel.add(incorrectAnswer);

		JButton buttonA = new JButton();
		buttonA.setPressedIcon(new ImageIcon(guestgrade4Base10Tutorial.class.getResource("Images/arrowHover.png")));
		buttonA.setOpaque(false);
		buttonA.setRolloverIcon(new ImageIcon(guestgrade4Base10Tutorial.class.getResource("Images/arrowHover.png")));
		buttonA.setIcon(new ImageIcon(guestgrade4Base10Tutorial.class.getResource("Images/arrow.png")));
		buttonA.setFocusable(false);
		buttonA.setContentAreaFilled(false);
		buttonA.setBorderPainted(false);
		buttonA.setBorder(null);
		buttonA.setBounds(592, 282, 136, 87);
		panel.add(buttonA);

		JButton buttonB = new JButton();
		buttonB.setPressedIcon(new ImageIcon(guestgrade4Base10Tutorial.class.getResource("Images/arrowHover.png")));
		buttonB.setOpaque(false);
		buttonB.setFocusable(false);
		buttonB.setRolloverIcon(new ImageIcon(guestgrade4Base10Tutorial.class.getResource("Images/arrowHover.png")));
		buttonB.setBorder(null);
		buttonB.setBorderPainted(false);
		buttonB.setContentAreaFilled(false);
		buttonB.setIcon(new ImageIcon(guestgrade4Base10Tutorial.class.getResource("Images/arrow.png")));
		buttonB.setVisible(false);
		buttonB.setBounds(592, 282, 136, 87);
		panel.add(buttonB);

		JButton buttonC = new JButton();
		buttonC.setPressedIcon(new ImageIcon(guestgrade4Base10Tutorial.class.getResource("Images/arrowHover.png")));
		buttonC.setOpaque(false);
		buttonC.setRolloverIcon(new ImageIcon(guestgrade4Base10Tutorial.class.getResource("Images/arrowHover.png")));
		buttonC.setIcon(new ImageIcon(guestgrade4Base10Tutorial.class.getResource("Images/arrow.png")));
		buttonC.setFocusable(false);
		buttonC.setContentAreaFilled(false);
		buttonC.setBorderPainted(false);
		buttonC.setBorder(null);
		buttonC.setBounds(592, 282, 136, 87);
		buttonC.setVisible(false);
		panel.add(buttonC);

		JButton buttonD = new JButton();
		buttonD.setOpaque(false);
		buttonD.setPressedIcon(new ImageIcon(guestgrade4Base10Tutorial.class.getResource("Images/arrowHover.png")));
		buttonD.setRolloverIcon(new ImageIcon(guestgrade4Base10Tutorial.class.getResource("Images/arrowHover.png")));
		buttonD.setIcon(new ImageIcon(guestgrade4Base10Tutorial.class.getResource("Images/arrow.png")));
		buttonD.setFocusable(false);
		buttonD.setContentAreaFilled(false);
		buttonD.setBorderPainted(false);
		buttonD.setBorder(null);
		buttonD.setBounds(592, 282, 136, 87);
		buttonD.setVisible(false);
		panel.add(buttonD);

		JButton buttonE = new JButton();
		buttonE.setPressedIcon(new ImageIcon(guestgrade4Base10Tutorial.class.getResource("Images/arrowHover.png")));
		buttonE.setRolloverIcon(new ImageIcon(guestgrade4Base10Tutorial.class.getResource("Images/arrowHover.png")));
		buttonE.setOpaque(false);
		buttonE.setIcon(new ImageIcon(guestgrade4Base10Tutorial.class.getResource("Images/arrow.png")));
		buttonE.setFocusable(false);
		buttonE.setContentAreaFilled(false);
		buttonE.setBorderPainted(false);
		buttonE.setBorder(null);
		buttonE.setBounds(592, 282, 136, 87);
		buttonE.setVisible(false);
		panel.add(buttonE);

		JButton buttonF = new JButton();
		buttonF.setOpaque(false);
		buttonF.setIcon(new ImageIcon(guestgrade4Base10Tutorial.class.getResource("Images/arrowMoveOn.png")));
		buttonF.setFocusable(false);
		buttonF.setContentAreaFilled(false);
		buttonF.setBorderPainted(false);
		buttonF.setBorder(null);
		buttonF.setBounds(592, 282, 136, 87);
		buttonF.setVisible(false);
		panel.add(buttonF);

		textAnswerCorrect = new JTextPane() {
			public void setBorder(Border border) {
			}
		};
		textAnswerCorrect.setContentType("text/html");
		textAnswerCorrect.setFont(new Font("Roboto", Font.PLAIN, 15));
		textAnswerCorrect.setForeground(new Color(48, 126, 143));
		textAnswerCorrect.setBounds(215, 338, 355, 22);
		panel.add(textAnswerCorrect);
		textAnswerCorrect.setText("<b>Correct! Tutorial complete. Try a practice test!</b>");
		textAnswerCorrect.setEditable(false);

		textAnswerIncorrect = new JTextPane() {
			public void setBorder(Border border) {
			}
		};
		textAnswerIncorrect.setContentType("text/html");
		textAnswerIncorrect.setBounds(215, 338, 239, 22);
		panel.add(textAnswerIncorrect);
		textAnswerIncorrect.setFont(new Font("Roboto", Font.PLAIN, 15));
		textAnswerIncorrect.setForeground(new Color(48, 126, 143));
		textAnswerIncorrect.setText("<b>Incorrect! Please try again.</b>");
		textAnswerIncorrect.setEditable(false);
		textAnswerIncorrect.setVisible(false);
		textAnswerCorrect.setVisible(false);
		

		buttonA.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent evt) {

				textArea2.setVisible(true);
				buttonA.setVisible(false);
				buttonB.setVisible(true);
			}
		});

		buttonB.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent evt) {
				textArea3.setVisible(true);
				buttonB.setVisible(false);
				buttonC.setVisible(true);
			}
		});

		buttonC.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent evt) {
				textArea4.setVisible(true);
				buttonC.setVisible(false);
				buttonD.setVisible(true);
			}
		});

		buttonD.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent evt) {
				textArea5.setVisible(true);
				textAnswer.setVisible(true);
				buttonD.setVisible(false);
				buttonE.setVisible(true);
			}
		});

		buttonE.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent evt) {
				correctImageIcon = new ImageIcon(getClass().getResource("Images/plswork.png"));
				incorrectIcon = new ImageIcon(getClass().getResource("Images/plswork2.png"));
				String userAnswer;
				userAnswer = textAnswer.getText();

				if (userAnswer.equals("2000")) {
					textAnswerCorrect.setVisible(true);
					textAnswer.setEnabled(false);
					correctAnswer.setIcon(correctImageIcon);
					correctAnswer.setVisible(true);
					incorrectAnswer.setVisible(false);
					buttonF.setVisible(true);
					buttonE.setVisible(false);
					
				} else {
					textAnswerIncorrect.setVisible(true);
					incorrectAnswer.setIcon(incorrectIcon);
					incorrectAnswer.setVisible(true);
					buttonE.setVisible(true);
					

				}
			}

		});
		
	
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
			public void mouseClicked(MouseEvent evt) {

			}
		});
		homebut.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent evt) {
				try {
					for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
						if ("Nimbus".equals(info.getName())) {
							javax.swing.UIManager.setLookAndFeel(info.getClassName());
							break;
						}
					}
				} catch (ClassNotFoundException ex) {
					java.util.logging.Logger.getLogger(guestpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
				} catch (InstantiationException ex) {
					java.util.logging.Logger.getLogger(guestpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
				} catch (IllegalAccessException ex) {
					java.util.logging.Logger.getLogger(guestpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
				} catch (javax.swing.UnsupportedLookAndFeelException ex) {
					java.util.logging.Logger.getLogger(guestpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
				}
					guestpage guestpage = new guestpage();
					guestpage.setVisible(true);
					setVisible(false);//close this page





			}
		});

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
		profilebut.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent evt) {
				JOptionPane.showMessageDialog(null, "You are on Guest Mode");
					//Profile Profile = new Profile();
					//Profile.setVisible(true);
					//setVisible(false);//close this page

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
		progressbut.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent evt) {
				JOptionPane.showMessageDialog(null, "You are on Guest Mode");
					//Profile Profile = new Profile();
					//Profile.setVisible(true);
					//setVisible(false);//close this page
			}
		});

		classbut.setText("My Class");
		classbut.setForeground(new Color(255, 255, 255));
		classbut.setBackground(new Color(48, 126, 143));
		classbut.setOpaque(false);
		classbut.setIcon(new ImageIcon(getClass().getResource("Images/class.png")));
		classbut.setFont(new Font("Calibri", Font.PLAIN, 30));
		classbut.setContentAreaFilled(false);
		classbut.setBorderPainted(false);
		getContentPane().add(classbut);
		classbut.setBounds(8, 346, 182, 51);
		
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
		classbut.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent evt) {
				JOptionPane.showMessageDialog(null, "You are on Guest Mode");

					//Profile Profile = new Profile();
					//Profile.setVisible(true);
					//setVisible(false);//close this page
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
		unitbut.setBounds(8, 417, 182, 51);
		
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
		unitbut.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent evt) {
				JOptionPane.showMessageDialog(null, "You are on Guest Mode");
					//unitselectunittestgfour unitselectunittestgfour  = new unitselectunittestgfour();
					//unitselectunittestgfour.setVisible(true);
					//setVisible(false);//close this page
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
		rewardsbut.setBounds(0, 488, 190, 52);
		
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
		rewardsbut.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent evt) {
				JOptionPane.showMessageDialog(null, "You are on Guest Mode");
					//Profile Profile = new Profile();
					//Profile.setVisible(true);
					//setVisible(false);//close this page
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
		helpbut.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent evt) {
				JOptionPane.showMessageDialog(null, "You are on Guest Mode");
				//Morehelp Morehelp = new Morehelp();
					//Morehelp.setVisible(true);
					//setVisible(false);//close this page
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
					guestgrade4Base10Tutorial.class.getResourceAsStream("MPLUSRounded1c-black.ttf"));
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
					guestgrade4Base10Tutorial.class.getResourceAsStream("MPLUSRounded1c-black.ttf"));
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

	public static void main(String args[]) {

		try {
			for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(guestgrade4Base10Tutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(guestgrade4Base10Tutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(guestgrade4Base10Tutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(guestgrade4Base10Tutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		/* Create and display the form */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new guestgrade4Base10Tutorial().setVisible(true);
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
	private JTextPane textArea2;
	private JTextPane textArea3;
	private JTextArea textArea4;
	private JTextPane textArea5;
	private JTextField textAnswer;
	private JTextPane textAnswerCorrect;
	private JTextPane textAnswerIncorrect;
	private JLabel headerTitle;
}
