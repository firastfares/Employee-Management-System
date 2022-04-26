package src;


import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;


public class testV1 implements ActionListener{
	
	 
	   private ImageIcon correctImageIcon;
	   private ImageIcon triangle; 
	   
	   
	 
	
	
	
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
	
	JFrame frame = new JFrame();
	JTextField textfield = new JTextField() {
	 @Override public void setBorder(Border border) {
	} 
	};
	JTextArea textarea = new JTextArea();
	JTextField textField2 = new JTextField() {
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
	


	
	
	public testV1() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1920,1080 + 22);
		frame.getContentPane().setBackground(new Color(255,255,255));
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setLocationByPlatform(true);
		frame.setVisible(true);
		
		 try{
	           Font font = Font.createFont(Font.TRUETYPE_FONT, testV1.class.getResourceAsStream("Bungee-Regular.ttf"));
	           textfield.setFont(font.deriveFont(Font.BOLD, 25f));
	       }
	       catch(Exception e){}
		
		textfield.setBounds(10,264,1920,50);
		textfield.setBackground(new Color(255,255,255));
		textfield.setForeground(new Color(0, 0, 0));
		textfield.setHorizontalAlignment(JTextField.CENTER);
		textfield.setEditable(false);
		textfield.setVisible(true);
		
		textField2.setBounds(801,325,349,36);
				
		textField2.setBackground(new Color(255,255,255));
		textField2.setForeground(new Color(0,0,0));
		textField2.setVisible(true);
		textField2.setHorizontalAlignment(JTextField.CENTER);
		
		try{
	           Font font = Font.createFont(Font.TRUETYPE_FONT, testV1.class.getResourceAsStream("Bungee-Regular.ttf"));
	           textField2.setFont(font.deriveFont(Font.BOLD, 25f));
		}
	       catch(Exception e){}
	       
		
		textField2.setEditable(false);
		buttonA.setVisible(true);
		buttonA.setBounds(606,462,21,21);
		buttonA.setFocusable(false);
		buttonA.addActionListener(this);
		
		buttonB.setBounds(606,542,21,21);
		buttonB.setFocusable(false);
		buttonB.addActionListener(this);
		
		
		buttonC.setBounds(606,629,21,21);
		buttonC.setFocusable(false);
		buttonC.addActionListener(this);
		
		
		buttonD.setBounds(606,715,21,21);
		buttonD.setFocusable(false);
		buttonD.addActionListener(this);
		
		
		answer_labelA.setBounds(633,462,150,50);
		answer_labelA.setBackground(new Color(50,50,50));
		answer_labelA.setForeground(new Color(0,0,0));
		answer_labelA.setFont(new Font("Dialog",Font.PLAIN,30));
		
		answer_labelB.setBounds(633,542,156,50);
		answer_labelB.setBackground(new Color(50,50,50));
		answer_labelB.setForeground(new Color(0,0,0));
		answer_labelB.setFont(new Font("Dialog",Font.PLAIN,30));
		
		answer_labelC.setBounds(633,631,156,50);
		answer_labelC.setBackground(new Color(50,50,50));
		answer_labelC.setForeground(new Color(0,0,0));
		answer_labelC.setFont(new Font("Dialog",Font.PLAIN,30));
		
		answer_labelD.setBounds(633,715,150,50);
		answer_labelD.setBackground(new Color(50,50,50));
		answer_labelD.setForeground(new Color(0,0,0));
		answer_labelD.setFont(new Font("Dialog",Font.PLAIN,30));
		
		lblNewLabel_1.setBounds(1150, 332, 21, 21);
		
		
	
		
	
		
		number_right.setBounds(913,370,116,50);
		number_right.setBackground(new Color(255,255,255));
		number_right.setForeground(new Color(0,0,0));
		try{
	           Font font = Font.createFont(Font.TRUETYPE_FONT, testV1.class.getResourceAsStream("Bungee-Regular.ttf"));
	           number_right.setFont(font.deriveFont(Font.BOLD, 25f));
	       }
	       catch(Exception e){}
		
		number_right.setHorizontalAlignment(JTextField.CENTER);
		number_right.setEditable(false);
		
		percentage.setBounds(913,421,116,50);
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

		
		frame.getContentPane().add(time_label);
		frame.getContentPane().add(seconds_left);
		frame.getContentPane().add(answer_labelA);
		frame.getContentPane().add(answer_labelB);
		frame.getContentPane().add(answer_labelC);
		frame.getContentPane().add(answer_labelD);
		frame.getContentPane().add(buttonA);
		frame.getContentPane().add(buttonB);
		frame.getContentPane().add(buttonC);
		frame.getContentPane().add(buttonD);
		frame.getContentPane().add(textField2);
		frame.getContentPane().add(textfield);
		frame.getContentPane().add(number_right);
		frame.getContentPane().add(percentage);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(133, 25, 1672, 198);
		layeredPane.setOpaque(true);
		
		frame.getContentPane().add(layeredPane);
		
		JLabel lblNewLabel = new JLabel("Grade 4 Unit Test");
		lblNewLabel.setBounds(669, 51, 790, 70);
		try{
	           Font font = Font.createFont(Font.TRUETYPE_FONT, testV1.class.getResourceAsStream("Bungee-Regular.ttf"));
	           lblNewLabel.setFont(font.deriveFont(Font.BOLD, 35f));
	       }
	       catch(Exception e){}
		layeredPane.add(lblNewLabel);
		
		
		
		
	
		
		frame.setVisible(true);
		
		nextQuestion();
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
			textfield.setText("Question "+(index+1)+"/" + (total_questions));
			textField2.setText(questions[index]);
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
		
			if (index == 2)
			{
				triangle = new ImageIcon(getClass().getResource("Images/triangle.png"));
				
				lblNewLabel_1.setIcon(triangle);
				lblNewLabel_1.setVisible(true);
				textfield.setText("Question "+(index+1)+"/" + (total_questions));
				textField2.setText(questions[index]);
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
		correctImageIcon = new ImageIcon(getClass().getResource("Images/Plswork.png"));
		
		
	
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
			buttonA.setIcon(null);
		}
  
		if(answers[index] == 'B') {
			answer_labelB.setForeground(new Color(0,128,0));
		buttonB.setIcon(correctImageIcon);
		buttonB.setEnabled(true);
		}
		
		
		
		if(answers[index] == 'C') {
			answer_labelC.setForeground(new Color(0,128,0));
		buttonC.setIcon(correctImageIcon);
		buttonC.setEnabled(true);
		}
		
		if(answers[index] == 'D') {
			answer_labelD.setForeground(new Color(0,128,0));
		buttonD.setIcon(correctImageIcon);
		buttonD.setEnabled(true);
		}
		
		if(answers[index] != 'A')
			answer_labelA.setForeground(new Color(255,0,0));
		
		if(answers[index] != 'B')
			answer_labelB.setForeground(new Color(255,0,0));
		
		if(answers[index] != 'C')
			answer_labelC.setForeground(new Color(255,0,0));
		
		if(answers[index] != 'D')
			answer_labelD.setForeground(new Color(255,0,0));
		
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
		
		textfield.setText("RESULTS:");
		textField2.setText("");
		answer_labelA.setText("");
		answer_labelB.setText("");
		answer_labelC.setText("");
		answer_labelD.setText("");
		
		number_right.setText("("+correct_guesses+"/"+total_questions+")");
		percentage.setText(result+"%");
		
		frame.getContentPane().add(number_right);
		frame.getContentPane().add(percentage);
		
	}
}
