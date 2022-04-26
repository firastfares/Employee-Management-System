package phase3;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//This tutorial operates by displaying a collection of shape buttons that the user will be able to click. Clicking on an image will reveal more information about that particular shape to the user.
//Primarily intended to be a more self-directed, exploratory tutorial.

public class geoTutorialK extends JFrame implements ActionListener {

	/**
	 * Creates new form geoTutorialK
	 */

	ImageIcon octagon1 = new ImageIcon(getClass().getResource("Images/regularOctagon3.png"));
	ImageIcon circle1 = new ImageIcon (getClass().getResource("Images/regularCircle3.png"));
	ImageIcon trapezoid1 = new ImageIcon (getClass().getResource("Images/regularTrapezoid3.png"));
	ImageIcon square1 = new ImageIcon (getClass().getResource("Images/regularSquare4.png"));
	ImageIcon rectangle1 = new ImageIcon (getClass().getResource("Images/regularRectangle3.png"));
	ImageIcon pentagon1 = new ImageIcon (getClass().getResource("Images/regularPentagon3.png"));
	ImageIcon hexagon1 = new ImageIcon (getClass().getResource("Images/regularHexagon2.png"));
	ImageIcon triangle1 = new ImageIcon (getClass().getResource("Images/regulatTriangle3.png"));
	
	private ImageIcon correctImageIcon;
	private ImageIcon incorrectIcon;
	 
	JButton rectangle = new JButton();
	JButton circle = new JButton();
	JButton square = new JButton();
	JButton hexagon = new JButton();
	JButton octagon = new JButton();
	JButton triangle = new JButton();
	JButton trapezoid = new JButton();
	
	 JButton returntoResults = new JButton("RETURN TO SHAPE PAGE");

	
	JLabel imageHolder = new JLabel();

	JTextPane textArea4 = new JTextPane() {
		public void setBorder(Border border) {
		}
	};
	
	JTextPane textArea3 = new JTextPane() {
		public void setBorder(Border border) {
		}
	};
	
	JTextPane textArea2 = new JTextPane() {
		public void setBorder(Border border) {
		}
	};
	JLabel instructions = new JLabel();
	  
	 
	

	public geoTutorialK() {
		initComponents();
		shapeExplorer();
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
		header.setIcon(new ImageIcon(geoTutorialK.class.getResource("Images/opacitymaybe.png")));
		numcrunch = new JLabel();
		sidebar = new JLabel();
		sidebar.setIcon(new ImageIcon(geoTutorialK.class.getResource("Images/opacitymaybe2.png")));
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
					geoTutorialK.class.getResourceAsStream("MPLUSRounded1c-Black.ttf"));
			label.setFont(font.deriveFont(Font.BOLD, 35f));
		} catch (Exception e) {
		}

		headerTitle = new JLabel("New label");
		headerTitle.setBounds(285, 156, 713, 100);
		getContentPane().add(headerTitle);
		headerTitle.setText("Kindergarten Geo Tutorial: Identifying Shapes");
		headerTitle.setFont(new Font("Roboto", Font.BOLD, 30));
		headerTitle.setForeground(new Color(255, 255, 255));

		panel = new JPanel();
		panel.setBounds(270, 340, 728, 373);
		panel.setBackground(Color.white);
		getContentPane().add(panel);
		panel.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.black));
		panel.setLayout(null);
		String tabs = ("&emsp&emsp&emsp&emsp&emsp&emsp&emsp&emsp&emsp&emsp&emsp&emsp&emsp&emsp&emsp&emsp&emsp");

		JLabel correctAnswer = new JLabel();
		correctAnswer.setVisible(false);
		correctAnswer.setBounds(195, 338, 21, 21);
		panel.add(correctAnswer);

		JLabel incorrectAnswer = new JLabel();
		incorrectAnswer.setVisible(false);
		incorrectAnswer.setBounds(195, 338, 21, 21);
		panel.add(incorrectAnswer);
		
		
		rectangle.setRolloverIcon(new ImageIcon(geoTutorialK.class.getResource("Images/rechover.png")));
		rectangle.setIcon(new ImageIcon(geoTutorialK.class.getResource("Images/cartoonRectangleHover.png")));
		rectangle.setFocusable(false);
		rectangle.setContentAreaFilled(false);
		rectangle.setBorderPainted(false);
		rectangle.setBounds(328, 11, 224, 147);
		panel.add(rectangle);
		
		
		hexagon.setRolloverIcon(new ImageIcon(geoTutorialK.class.getResource("Images/hexHover.png")));
		hexagon.setIcon(new ImageIcon(geoTutorialK.class.getResource("Images/hex2.png")));
		hexagon.setFocusable(false);
		hexagon.setContentAreaFilled(false);
		hexagon.setBorderPainted(false);
		hexagon.setBounds(271, 141, 155, 147);
		panel.add(hexagon);
		
		
		circle.setRolloverIcon(new ImageIcon(geoTutorialK.class.getResource("Images/cartoonCircleHover.png")));
		circle.setIcon(new ImageIcon(geoTutorialK.class.getResource("Images/circleCartoon.png")));
		circle.setFocusable(false);
		circle.setContentAreaFilled(false);
		circle.setBorderPainted(false);
		circle.setBounds(400, 126, 193, 172);
		panel.add(circle);
		
		
		trapezoid.setRolloverIcon(new ImageIcon(geoTutorialK.class.getResource("Images/tCRealHover.png")));
		trapezoid.setIcon(new ImageIcon(geoTutorialK.class.getResource("Images/trapezoidCartoon.png")));
		trapezoid.setFocusable(false);
		trapezoid.setContentAreaFilled(false);
		trapezoid.setBorderPainted(false);
		trapezoid.setBounds(160, 11, 204, 131);
		panel.add(trapezoid);
		
		
		square.setRolloverIcon(new ImageIcon(geoTutorialK.class.getResource("Images/redSquareHover.png")));
		square.setIcon(new ImageIcon(geoTutorialK.class.getResource("Images/cartoonRedSquare.png")));
		square.setFocusable(false);
		square.setContentAreaFilled(false);
		square.setBorderPainted(false);
		square.setBounds(38, 11, 161, 131);
		panel.add(square);
		
		
		octagon.setRolloverIcon(new ImageIcon(geoTutorialK.class.getResource("Images/octHover.png")));
		octagon.setIcon(new ImageIcon(geoTutorialK.class.getResource("Images/octCartoon.png")));
		octagon.setFocusable(false);
		octagon.setContentAreaFilled(false);
		octagon.setBorderPainted(false);
		octagon.setBounds(494, 11, 224, 147);
		panel.add(octagon);
		
		
		triangle.setRolloverIcon(new ImageIcon(geoTutorialK.class.getResource("Images/triHover2.png")));
		triangle.setIcon(new ImageIcon(geoTutorialK.class.getResource("Images/triHover.png")));
		triangle.setFocusable(false);
		triangle.setContentAreaFilled(false);
		triangle.setBorderPainted(false);
		triangle.setBounds(83, 129, 224, 147);
		panel.add(triangle);
		
		instructions.setBounds(10, 302, 572, 41);
        panel.add(instructions);
        instructions.setOpaque(false);
        instructions.setForeground(Color.BLACK);
        
        instructions.setText("CLICK ON A SHAPE TO LEARN MORE ABOUT IT!");
        try{
	           Font font = Font.createFont(Font.TRUETYPE_FONT, grade4OATPracticeTest.class.getResourceAsStream("Bungee-Regular.ttf"));
	           instructions.setFont(font.deriveFont(Font.BOLD, 20f));
	           
	       }
		catch(Exception e){}
		
		
		
	
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
		homebut.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				homebut.setForeground(new Color(255, 127, 80));

			}
		});
		homebut.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseExited(java.awt.event.MouseEvent evt) {
				homebut.setForeground(new Color(255, 255, 255));
			}
		});

		homebut.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
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
		});

		profilebut.setText("My Profile");

		profilebut.setForeground(new Color(255, 255, 255));
		profilebut.setBackground(new Color(48, 126, 143));
		profilebut.setOpaque(false);
		profilebut.setIcon(new ImageIcon(getClass().getResource("Images/hcprofile.png")));
		profilebut.setFont(new Font("Calibri", Font.PLAIN, 30));
		profilebut.setContentAreaFilled(false);
		profilebut.setBorderPainted(false);
		
		profilebut.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				profilebut.setForeground(new Color(255, 127, 80));
			}
		});

		profilebut.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseExited(java.awt.event.MouseEvent evt) {
				profilebut.setForeground(new Color(255, 255, 255));
			}
		});
		profilebut.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent evt) {
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
		
		progressbut.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				progressbut.setForeground(new Color(255, 127, 80));
			}
		});

		progressbut.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseExited(java.awt.event.MouseEvent evt) {
				progressbut.setForeground(new Color(255, 255, 255));
			}
		});
		progressbut.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent evt) {
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
		
		classbut.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				classbut.setForeground(new Color(255, 127, 80));
			}
		});

		classbut.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseExited(java.awt.event.MouseEvent evt) {
				classbut.setForeground(new Color(255, 255, 255));
			}
		});
		classbut.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent evt) {
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
		unitbut.setBounds(18, 417, 160, 51);
		
		unitbut.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				unitbut.setForeground(new Color(255, 127, 80));
			}
		});

		unitbut.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseExited(java.awt.event.MouseEvent evt) {
				unitbut.setForeground(new Color(255, 255, 255));
			}
		});
		unitbut.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent evt) {
				try {
					for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
						if ("Nimbus".equals(info.getName())) {
							javax.swing.UIManager.setLookAndFeel(info.getClassName());
							break;
						}
					}
				} catch (ClassNotFoundException ex) {
					java.util.logging.Logger.getLogger(unitselectpracticetestk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
				} catch (InstantiationException ex) {
					java.util.logging.Logger.getLogger(unitselectpracticetestk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
				} catch (IllegalAccessException ex) {
					java.util.logging.Logger.getLogger(unitselectpracticetestk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
				} catch (javax.swing.UnsupportedLookAndFeelException ex) {
					java.util.logging.Logger.getLogger(unitselectpracticetestk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
				}

				unitselectpracticetestk unitselectpracticetestk  = new unitselectpracticetestk();
				unitselectpracticetestk.setVisible(true);
				setVisible(false);//close this page
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
		
		rewardsbut.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				rewardsbut.setForeground(new Color(255, 127, 80));
			}
		});

		rewardsbut.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseExited(java.awt.event.MouseEvent evt) {
				rewardsbut.setForeground(new Color(255, 255, 255));
			}
		});
		rewardsbut.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent evt) {
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
		
		helpbut.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				helpbut.setForeground(new Color(255, 127, 80));
			}
		});

		helpbut.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseExited(java.awt.event.MouseEvent evt) {
				helpbut.setForeground(new Color(255, 255, 255));
			}
		});
		helpbut.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent evt) {
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
					geoTutorialK.class.getResourceAsStream("MPLUSRounded1c-black.ttf"));
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
					geoTutorialK.class.getResourceAsStream("MPLUSRounded1c-black.ttf"));
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
	
	public void shapeExplorer()
	{
		
	
		 returntoResults.setVisible(false);
         returntoResults.setOpaque(false);
         returntoResults.setForeground(Color.BLACK);
         returntoResults.setContentAreaFilled(false);
         returntoResults.setBorderPainted(false);
         returntoResults.setBounds(79, 310, 542, 41);;
         
     	try {
			Font font = Font.createFont(Font.TRUETYPE_FONT,
					geoTutorialK.class.getResourceAsStream("Bungee-Regular.ttf"));
			returntoResults.setFont(font.deriveFont(Font.BOLD, 35f));
		} catch (Exception e) {
		}
         
         
         panel.add(returntoResults);
         
         
 		returntoResults.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				returntoResults.setForeground(new Color(48, 126, 143));

			}
		});
		returntoResults.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseExited(java.awt.event.MouseEvent evt) {
				returntoResults.setForeground(new Color(0, 0, 0));
			}
		});
		
		
		
		textArea4.setContentType("text/html");
		textArea4.setBounds(7, 11, 708, 69);
		panel.add(textArea4);
		textArea4.setFont(new Font("Roboto", Font.PLAIN, 20));
		textArea4.setForeground(new Color(48, 126, 143));
		textArea4.setText(
				"<b>SQUARES</b> are polygons with 4 sides and four corners!");
		textArea4.setEditable(false);
		textArea4.setVisible(false);
		
		textArea3.setContentType("text/html");
		textArea3.setBounds(7, 77, 708, 59);
		panel.add(textArea3);
		textArea3.setFont(new Font("Roboto", Font.PLAIN, 20));
		textArea3.setForeground(new Color(48, 126, 143));
		textArea3.setText(
				"Unlike other shapes with 4 sides, <b>SQUARES</b> have sides that are all the same length!");
		textArea3.setEditable(false);
		textArea3.setVisible(false);
		panel.add(textArea3);
		
		
		textArea2.setContentType("text/html");
		textArea2.setBounds(7, 143, 708, 31);
		panel.add(textArea2);
		textArea2.setFont(new Font("Roboto", Font.PLAIN, 20));
		textArea2.setForeground(new Color(48, 126, 143));
		textArea2.setEditable(false);
		textArea2.setVisible(false);
		panel.add(textArea2);
		
		  imageHolder.setVisible(false);
          
          
          
          panel.add(imageHolder);
    
          
          
		//Controlling what happens when a particular shape gets clicked
		square.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent e) {
				try{
		      	
						circle.setVisible(false);
						triangle.setVisible(false);
						rectangle.setVisible(false);
						octagon.setVisible(false);
						trapezoid.setVisible(false);
						hexagon.setVisible(false);
						hexagon.setVisible(false);
						instructions.setVisible(false);
						square.setVisible(false);
						imageHolder.setBounds(250, 170, 170, 152);
						 imageHolder.setIcon(square1);
						 imageHolder.setVisible(true);
						
						textArea4.setVisible(true);
						textArea3.setVisible(true);
						textArea2.setVisible(true);
						
						textArea2.setText(
								"One example of <b>SQUARES</b> in real life are boxes on a checkerboard! ");
						
						returntoResults.setVisible(true);
						
										
				}catch(NumberFormatException ex){ 
		      	    
		      	}
				
			
				}
			});
		
		
		
		returntoResults.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent e) {
				try{
		      	
						circle.setVisible(true);
						triangle.setVisible(true);
						rectangle.setVisible(true);
						octagon.setVisible(true);
						trapezoid.setVisible(true);
						hexagon.setVisible(true);
						hexagon.setVisible(true);
						instructions.setVisible(true);
						square.setVisible(true);
						imageHolder.setBounds(250, 170, 170, 152);
						 imageHolder.setIcon(square1);
						 imageHolder.setVisible(false);
						
						textArea4.setVisible(false);
						textArea3.setVisible(false);
						textArea2.setVisible(false);
						
						returntoResults.setVisible(false);
						
						
						
				
				}catch(NumberFormatException ex){ 
		      	    
		      	}
				
			
				}
			});
		
		
		trapezoid.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent e) {
				try{
		      	
						circle.setVisible(false);
						triangle.setVisible(false);
						rectangle.setVisible(false);
						octagon.setVisible(false);
						trapezoid.setVisible(false);
						hexagon.setVisible(false);
						hexagon.setVisible(false);
						instructions.setVisible(false);
						square.setVisible(false);
						imageHolder.setBounds(250, 170, 170, 152);
						 imageHolder.setIcon(trapezoid1);
						 imageHolder.setVisible(true);
						 
							textArea4.setText(
									"<b>TRAPEZOIDS</b> are polygons with 4 sides and 4 corners!");
							
							textArea3.setText(
									"Only one pair of sides is parallel, and the sides that aren't parallel <b>aren't</b> the same length.");
							
							textArea2.setText(
									"If you were to cut off the top of a pyramid, you'd have a <b>TRAPEZOID</b>!");
						
						textArea4.setVisible(true);
						textArea3.setVisible(true);
						textArea2.setVisible(true);
						
						returntoResults.setVisible(true);
						
						
						
				
				}catch(NumberFormatException ex){ 
		      	    
		      	}
				
			
				}
			});
		
		rectangle.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent e) {
				try{
		      	
						circle.setVisible(false);
						triangle.setVisible(false);
						rectangle.setVisible(false);
						octagon.setVisible(false);
						trapezoid.setVisible(false);
						hexagon.setVisible(false);
						hexagon.setVisible(false);
						instructions.setVisible(false);
						square.setVisible(false);
						imageHolder.setBounds(250, 170, 170, 152);
						 imageHolder.setIcon(rectangle1);
						 imageHolder.setVisible(true);
						 
							textArea4.setText(
									"<b>RECTANGLES</b> are polygons with 4 sides and 4 corners!");
							
							textArea3.setText(
									"<b>Unlike</b> squares, <b>RECTANGLES</b> have two pairs of sides that have the same length!");
							
							textArea2.setText(
									"One example of a <b>RECTANGLE</b> is a ping-pong table!");
						
						textArea4.setVisible(true);
						textArea3.setVisible(true);
						textArea2.setVisible(true);
						
						
						
						returntoResults.setVisible(true);
				
						
				
				}catch(NumberFormatException ex){ 
		      	    
		      	}
				
			
				}
			});
		
		octagon.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent e) {
				try{
		      	
						circle.setVisible(false);
						triangle.setVisible(false);
						rectangle.setVisible(false);
						octagon.setVisible(false);
						trapezoid.setVisible(false);
						hexagon.setVisible(false);
						hexagon.setVisible(false);
						instructions.setVisible(false);
						square.setVisible(false);
						imageHolder.setBounds(250, 170, 170, 152);
						 imageHolder.setIcon(octagon1);
						 imageHolder.setVisible(true);
						 
							textArea4.setText(
									"<b>OCTAGONS</b> are polygons with 8 sides and 8 corners!");
							
							textArea3.setText(
									"You can remember how many sides they have by knowing that <b>OCT</b> means eight!");
							
							textArea2.setText(
									"Stop signs are <b>OCATGONS</b>, along with most umbrellas!");
						
						textArea4.setVisible(true);
						textArea3.setVisible(true);
						textArea2.setVisible(true);
						
						
						returntoResults.setVisible(true);
						
						
						
				
						
				
				}catch(NumberFormatException ex){ 
		      	    
		      	}
				
			
				}
			});
		
		triangle.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent e) {
				try{
		      	
						circle.setVisible(false);
						triangle.setVisible(false);
						rectangle.setVisible(false);
						octagon.setVisible(false);
						trapezoid.setVisible(false);
						hexagon.setVisible(false);
						hexagon.setVisible(false);
						instructions.setVisible(false);
						square.setVisible(false);
						imageHolder.setBounds(250, 140, 170, 152);
						 imageHolder.setIcon(triangle1);
						 imageHolder.setVisible(true);
						 
							textArea4.setText(
									"<b>TRIANGLES</b> are polygons with 3 sides and 3 corners!");
							
							textArea3.setText(
									"Yield signs are <b>TRIANGES</b>, and a piece of bread can easily be cut into two <b>TRIANGLES!</b>");
							
							
							
						
						
						textArea4.setVisible(true);
						textArea3.setVisible(true);
						textArea2.setVisible(false);
					
						
						returntoResults.setVisible(true);
						
						
						
				
						
				
				}catch(NumberFormatException ex){ 
		      	    
		      	}
				
			
				}
			});
		
		
		hexagon.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent e) {
				try{
		      	
						circle.setVisible(false);
						triangle.setVisible(false);
						rectangle.setVisible(false);
						octagon.setVisible(false);
						trapezoid.setVisible(false);
						hexagon.setVisible(false);
						hexagon.setVisible(false);
						instructions.setVisible(false);
						square.setVisible(false);
						imageHolder.setBounds(250, 140, 170, 152);
						 imageHolder.setIcon(hexagon1);
						 imageHolder.setVisible(true);
						 
							textArea4.setText(
									"<b>HEXAGONS</b> are polygons with 6 sides and 6 corners!");
							
							textArea3.setText(
									"Beehive honeycomb is <b>HEXAGON</b>-shaped, as are the skutes of a turtle shell!");
							
				
							
						
						
						textArea4.setVisible(true);
						textArea3.setVisible(true);
						textArea2.setVisible(false);
					
						
						returntoResults.setVisible(true);
						
						
						
				
						
				
				}catch(NumberFormatException ex){ 
		      	    
		      	}
				
			
				}
			});
		
		circle.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent e) {
				try{
		      	
						circle.setVisible(false);
						triangle.setVisible(false);
						rectangle.setVisible(false);
						octagon.setVisible(false);
						trapezoid.setVisible(false);
						hexagon.setVisible(false);
						hexagon.setVisible(false);
						instructions.setVisible(false);
						square.setVisible(false);
						imageHolder.setBounds(250, 140, 170, 152);
						 imageHolder.setIcon(circle1);
						 imageHolder.setVisible(true);
						 
							textArea4.setText(
									"<b>CIRCLES</b> are shapes made up of a curved line. It's round, and all points on the line are equally as far from the center relative to each other!");
							
							textArea3.setText(
									"Stoplights are <b>CIRCLES</b>, and so are most dinner plates!");
							
				
							
						
						
						textArea4.setVisible(true);
						textArea3.setVisible(true);
						textArea2.setVisible(false);
					
						
						returntoResults.setVisible(true);
						
						
						
				
						
				
				}catch(NumberFormatException ex){ 
		      	    
		      	}
				
			
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
			java.util.logging.Logger.getLogger(geoTutorialK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(geoTutorialK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(geoTutorialK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(geoTutorialK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		/* Create and display the form */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new geoTutorialK().setVisible(true);
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







	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
