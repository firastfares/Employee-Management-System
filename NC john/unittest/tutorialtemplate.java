/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thest
 */

import java.awt.event.*;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class tutorialtemplate extends JFrame implements ActionListener {

    /**
     * Creates new form tutorialtemplate
     */
	
	 
	   private ImageIcon correctImageIcon;
	   private ImageIcon triangle; 
	   private ImageIcon incorrectIcon;
	 
	
	
	
	String[] questions = 	{
								"What is 5x4?",
								"Solve: 6/2",
								"Identify this shape: ",
								"Add: 100 + 100",
								"Subtract: 74 - 32"
								
							
							};
	String[][] options = 	{
								{"20","13","24","60"},
								{"4","3","6","23"},
								{"Circle","Square","Triangle","Hexagon"},
								{"300","10","200","600"},
								{"42", "18", "65", "106"}
							};
	char[] answers = 		{
								'A',
								'B',
								'C',
								'C',
								'A'
								
							};
	char guess;
	char answer;
	int index;
	int correct_guesses = 0;
	int total_questions = questions.length;
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
				
		
		

	
    public tutorialtemplate() {
        initComponents();
    	panel.setLayout(null);
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
	           Font font = Font.createFont(Font.TRUETYPE_FONT, testV1.class.getResourceAsStream("Bungee-Regular.ttf"));
	           textField1.setFont(font.deriveFont(Font.BOLD, 25f));
		}
	       catch(Exception e){}
		textField2_21.setBounds(172, 51, 353, 36);
		panel.add(textField2_21);
		textField2_21.setColumns(10);
		buttonD.addActionListener(this);
		answer_labelB.setBounds(158, 164, 156, 50);
		panel.add(answer_labelB);
		answer_labelB.setBackground(new Color(50,50,50));
		answer_labelB.setForeground(new Color(0,0,0));
		answer_labelB.setFont(new Font("Dialog",Font.PLAIN,30));
		answer_labelA.setBounds(158, 114, 150, 50);
		panel.add(answer_labelA);
		answer_labelA.setBackground(new Color(50,50,50));
		answer_labelA.setForeground(new Color(0,0,0));
		answer_labelA.setFont(new Font("Dialog",Font.PLAIN,30));
		answer_labelC.setBounds(158, 214, 156, 50);
		panel.add(answer_labelC);
		answer_labelC.setBackground(new Color(50,50,50));
		answer_labelC.setForeground(new Color(0,0,0));
		answer_labelC.setFont(new Font("Dialog",Font.PLAIN,30));
		answer_labelD.setBounds(158, 264, 150, 50);
		panel.add(answer_labelD);
		answer_labelD.setBackground(new Color(50,50,50));
		answer_labelD.setForeground(new Color(0,0,0));
		answer_labelD.setFont(new Font("Dialog",Font.PLAIN,30));
		number_right.setBounds(293, 84, 116, 50);
		panel.add(number_right);
		number_right.setBackground(new Color(255,255,255));
		number_right.setForeground(new Color(0,0,0));
		try{
	           Font font = Font.createFont(Font.TRUETYPE_FONT, testV1.class.getResourceAsStream("Bungee-Regular.ttf"));
	           number_right.setFont(font.deriveFont(Font.BOLD, 25f));
	       }
	       catch(Exception e){}
		
		number_right.setHorizontalAlignment(JTextField.CENTER);
		number_right.setEditable(false);
		percentage.setBounds(293, 139, 116, 50);
		panel.add(percentage);
		percentage.setPreferredSize(new Dimension(50, 50));
		percentage.setBackground(new Color(255,255,255));
		percentage.setForeground(new Color(0,0,0));
		try{
	           Font font = Font.createFont(Font.TRUETYPE_FONT, testV1.class.getResourceAsStream("Bungee-Regular.ttf"));
	           percentage.setFont(font.deriveFont(Font.BOLD, 25f));
	       }
	       catch(Exception e){}
		percentage.setHorizontalAlignment(JTextField.CENTER);
		percentage.setEditable(false);
		lblNewLabel_1.setBounds(415, 152, 91, 74);
		lblNewLabel_1.setSize(120,120);
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
        numcrunch = new JLabel();
        sidebar = new JLabel();
        nextbut = new JButton();
        back = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(255, 255, 255));
        setPreferredSize(new Dimension(1024, 763));
        setSize(new Dimension(1024, 763));
        getContentPane().setLayout(null);
        
        label = new JLabel();
        label.setText("Crunchers");
        try{
	           Font font = Font.createFont(Font.TRUETYPE_FONT, testV1.class.getResourceAsStream("MPLUSRounded1c-Black.ttf"));
	           label.setFont(font.deriveFont(Font.BOLD, 35f));
	       }
	       catch(Exception e){}
        
        panel = new JPanel();
        panel.setBounds(280, 340, 690, 373);
        panel.setBackground(Color.white);
        getContentPane().add(panel);
        panel.setBorder(BorderFactory.createMatteBorder(
                3, 3, 3, 3, Color.black));
        
       
        
        
        
    

		textField2_21.setBackground(new Color(255,255,255));
		textField2_21.setForeground(new Color(0,0,0));
		textField2_21.setVisible(true);
		textField2_21.setHorizontalAlignment(JTextField.CENTER);
		
		try{
	           Font font = Font.createFont(Font.TRUETYPE_FONT, testV1.class.getResourceAsStream("Bungee-Regular.ttf"));
	           textField2_21.setFont(font.deriveFont(Font.BOLD, 25f));
		}
	       catch(Exception e){}
	       
		
		nextQuestion();
   
  
    	
   

        homebut.setText("Home");
       
        homebut.setFont(new Font("Calibri", Font.PLAIN, 30));
        homebut.setForeground(new Color(255, 255, 255));
        homebut.setBackground(new Color(48, 126, 143));
        homebut.setOpaque(false);
		homebut.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/home.png")));
        homebut.setRolloverEnabled(true);
        homebut.setContentAreaFilled(false);
        homebut.setBorderPainted(false);
        getContentPane().add(homebut);
        homebut.setBounds(10, 133, 142, 60);

        profilebut.setText("My Profile");
       
        profilebut.setForeground(new Color(255, 255, 255));
        profilebut.setBackground(new Color(48, 126, 143));
        profilebut.setOpaque(false);
		profilebut.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/hcprofile.png")));
        profilebut.setFont(new Font("Calibri", Font.PLAIN, 30));
        profilebut.setContentAreaFilled(false);
        profilebut.setBorderPainted(false);
        profilebut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                profilebutActionPerformed(evt);
            }
        });
        getContentPane().add(profilebut);
        profilebut.setBounds(10, 204, 200, 60);

        progressbut.setText("My Progress");
        progressbut.setForeground(new Color(255, 255, 255));
        progressbut.setBackground(new Color(48, 126, 143));
        progressbut.setOpaque(false);
		progressbut.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/progress.png")));
        progressbut.setFont(new Font("Calibri", Font.PLAIN, 30));
        progressbut.setContentAreaFilled(false);
        progressbut.setBorderPainted(false);
        getContentPane().add(progressbut);
        progressbut.setBounds(10, 275, 225, 60);

        classbut.setText("My Class");
        classbut.setForeground(new Color(255, 255, 255));
        classbut.setBackground(new Color(48, 126, 143));
        classbut.setOpaque(false);
		classbut.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/class.png")));
        classbut.setFont(new Font("Calibri", Font.PLAIN, 30));
        classbut.setContentAreaFilled(false);
        classbut.setBorderPainted(false);
        getContentPane().add(classbut);
        classbut.setBounds(0, 346, 190, 60);

        unitbut.setText("Units");
        unitbut.setForeground(new Color(255, 255, 255));
        unitbut.setBackground(new Color(48, 126, 143));
        unitbut.setOpaque(false);
		unitbut.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/units.png")));
        unitbut.setFont(new Font("Calibri", Font.PLAIN, 30));
        unitbut.setContentAreaFilled(false);
        unitbut.setBorderPainted(false);
        getContentPane().add(unitbut);
        unitbut.setBounds(0, 417, 190, 60);

        rewardsbut.setText("Rewards");
        rewardsbut.setForeground(new Color(255, 255, 255));
        rewardsbut.setBackground(new Color(48, 126, 143));
        rewardsbut.setOpaque(false);
		rewardsbut.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/reward.png")));
        rewardsbut.setFont(new Font("Calibri", Font.PLAIN, 30));
        rewardsbut.setContentAreaFilled(false);
        rewardsbut.setBorderPainted(false);
        getContentPane().add(rewardsbut);
        rewardsbut.setBounds(0, 491, 190, 60);

        helpbut.setText("Need Help? ");
        helpbut.setForeground(new Color(255, 255, 255));
        helpbut.setBackground(new Color(48, 126, 143));
        helpbut.setOpaque(false);
		helpbut.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/question.png")));
        helpbut.setFont(new Font("Calibri", Font.PLAIN, 30));
        helpbut.setContentAreaFilled(false);
        helpbut.setBorderPainted(false);
        getContentPane().add(helpbut);
        helpbut.setBounds(0, 556, 235, 60);

        header.setHorizontalAlignment(SwingConstants.CENTER);
        header.setBackground(new Color(65, 158, 178));
        header.setOpaque(true);
        header.setText("Unit 1: Test 1 ");
        header.setFont(new Font("Roboto", Font.BOLD, 30));
        header.setForeground(new Color(255, 255, 255));
        header.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        getContentPane().add(header);
        header.setBounds(260, 110, 763, 210);

        numcrunch.setText("Number");
        
        
        try{
	           Font font = Font.createFont(Font.TRUETYPE_FONT, testV1.class.getResourceAsStream("MPLUSRounded1c-black.ttf"));
	           numcrunch.setFont(font.deriveFont(Font.BOLD, 35f));
	       }
	       catch(Exception e){}
       
        numcrunch.setForeground(new Color(255, 255, 255));
        getContentPane().add(numcrunch);
        numcrunch.setBounds(20, 0, 225, 60);
        
        label_1 = new JLabel();
        label_1.setText("Crunchers");
        try{
	           Font font = Font.createFont(Font.TRUETYPE_FONT, testV1.class.getResourceAsStream("MPLUSRounded1c-black.ttf"));
	           label_1.setFont(font.deriveFont(Font.BOLD, 35f));
	       }
	       catch(Exception e){}
        label_1.setForeground(Color.WHITE);
        
        label_1.setBounds(25, 51, 225, 60);
        getContentPane().add(label_1);

        sidebar.setBackground(new Color(48, 126, 143));
        sidebar.setOpaque(true);
        sidebar.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        getContentPane().add(sidebar);
        sidebar.setBounds(0, 0, 260, 723);

        nextbut.setText("arrow");
        nextbut.setBackground(new Color(255, 255, 255));
        nextbut.setOpaque(true);
        getContentPane().add(nextbut);
        nextbut.setBounds(890, 670, 61, 23);
        getContentPane().add(back);
        back.setBounds(0, 0, 1024, 763);
        back.setIcon(new ImageIcon(getClass().getResource("Images/background.jpg")));
       

        pack();
    }
    
    
  public void nextQuestion() {
		
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
    		
    		else if (index == 2)
    			{
    				triangle = new ImageIcon(getClass().getResource("Images/bigtriangle.png"));
    				
    				lblNewLabel_1.setIcon(triangle);
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
		textField2_21.setText("");
		answer_labelA.setText("");
		answer_labelB.setText("");
		answer_labelC.setText("");
		answer_labelD.setText("");
		
		number_right.setText("("+correct_guesses+"/"+total_questions+")");
		percentage.setText(result+"%");
		
		panel.add(number_right);
		panel.add(percentage);
		
	}

    	

    private void profilebutActionPerformed(ActionEvent evt) {//GEN-FIRST:event_profilebutActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(tutorialtemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tutorialtemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tutorialtemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tutorialtemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tutorialtemplate().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel back;
    private JButton classbut;
    private JLabel header;
    private JButton helpbut;
    private JButton homebut;
    private JButton nextbut;
    private JLabel numcrunch;
    private JButton profilebut;
    private JButton progressbut;
    private JButton rewardsbut;
    private JLabel sidebar;
    private JButton unitbut;
    private JLabel label;
    private JTextField textField;
    private JTextField textField2_2;
    private JPanel panel;
    private JLabel label_1;






	
}
