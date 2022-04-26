/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phase3;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;


/**
 *
 * @author firasfares
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
        initComponents();
    }


    private void initComponents() {
    	
    	
        signup = new javax.swing.JButton();//signup btn
        signup.setRolloverIcon(new ImageIcon(SignUp.class.getResource("Images/creataccountB.png")));
        signup.setIcon(new ImageIcon(SignUp.class.getResource("Images/createaccountA.png")));
        signup.setOpaque(false);
        signup.setFocusable(false);
        signup.setContentAreaFilled(false);
        signup.setBorderPainted(false);
        
        setBackground(new java.awt.Color(255, 255, 255));
		
      
        PassField = new javax.swing.JPasswordField();//pass field
        PassField.setBorder(new RoundedBorder(10));
        PassField.setBackground(new Color(226, 225, 225));
		PassField.setFont(new Font("Dialog",Font.BOLD,20));
        
        confpassField = new javax.swing.JPasswordField();//confpass field
        confpassField.setBorder(new RoundedBorder(10));
        confpassField.setBackground(new Color(226, 225, 225));
		confpassField.setFont(new Font("Dialog",Font.BOLD,20));
       
        fnameField = new javax.swing.JTextField();//fnamefield
        fnameField.setBorder(new RoundedBorder(10));
        fnameField.setBackground(new Color(226, 225, 225));
		fnameField.setFont(new Font("Dialog",Font.BOLD,20));
		
        emailField = new javax.swing.JTextField();//email field
        emailField.setBackground(new Color(226, 225, 225));
		emailField.setFont(new Font("Dialog",Font.BOLD,20));
        emailField.setBorder(new RoundedBorder(10));

        unameField = new javax.swing.JTextField();//uname field
        unameField.setBorder(new RoundedBorder(10));
        unameField.setBackground(new Color(226, 225, 225));
		unameField.setFont(new Font("Dialog",Font.BOLD,20));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//exit on close jframe
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(null);

     
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {//signup btn mouse action performed
                try {
                    signupActionPerformed(evt);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });
        getContentPane().add(signup);
        signup.setBounds(566, 354, 419, 118);//set boundss
        getContentPane().add(PassField);
        PassField.setBounds(277, 387, 279, 61);
        getContentPane().add(confpassField);
        confpassField.setBounds(277, 498, 279, 61);
        getContentPane().add(fnameField);
        fnameField.setBounds(277, 178, 279, 61);
        getContentPane().add(emailField);
        emailField.setBounds(277, 606, 279, 61);
        getContentPane().add(unameField);
        unameField.setBounds(277, 282, 279, 61);
        
        lblNewLabel = new JLabel();//fname lable
        lblNewLabel.setIcon(new ImageIcon(SignUp.class.getResource("Images/fullName.png")));
        lblNewLabel.setBounds(32, 158, 230, 94);
        getContentPane().add(lblNewLabel);
        
        lblNewLabel_1 = new JLabel();//usrn lable
        lblNewLabel_1.setIcon(new ImageIcon(SignUp.class.getResource("Images/usernameSignup.png")));
        lblNewLabel_1.setBounds(32, 258, 250, 98);
        getContentPane().add(lblNewLabel_1);
        
        lblNewLabel_2 = new JLabel();//passw lable
        lblNewLabel_2.setIcon(new ImageIcon(SignUp.class.getResource("Images/passwordSignup.png")));
        lblNewLabel_2.setBounds(32, 366, 230, 106);
        getContentPane().add(lblNewLabel_2);
        
        lblNewLabel_3 = new JLabel();//conf lable
        lblNewLabel_3.setIcon(new ImageIcon(SignUp.class.getResource("Images/confirm.png")));
        lblNewLabel_3.setBounds(32, 473, 230, 117);
        getContentPane().add(lblNewLabel_3);
        
        lblNewLabel_4 = new JLabel();//email lable
        lblNewLabel_4.setIcon(new ImageIcon(SignUp.class.getResource("Images/email.png")));
        lblNewLabel_4.setBounds(28, 586, 239, 106);
        getContentPane().add(lblNewLabel_4);
        
        lblNewLabel_5 = new JLabel();
        lblNewLabel_5.setBounds(77, 236, 46, 14);
        getContentPane().add(lblNewLabel_5);

        lblNewLabel_6 = new JLabel();//test logo lable
        lblNewLabel_6.setIcon(new ImageIcon(SignUp.class.getResource("Images/testlogo4.png")));
        lblNewLabel_6.setBounds(181, 0, 707, 157);
        getContentPane().add(lblNewLabel_6);

        Background = new javax.swing.JLabel();//bg lbl
        Background.setDisabledIcon(new ImageIcon(SignUp.class.getResource("Images/pic4.png")));
        Background.setIcon(new ImageIcon(SignUp.class.getResource("Images/background2.jpg")));
        Background.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
                       
        Background.setEnabled(false);
        Background.setFocusable(false);
        Background.setPreferredSize(new Dimension(1920, 1080));
        Background.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                BackgroundComponentAdded(evt);
            }
        });
        Background.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                BackgroundFocusLost(evt);
            }
        });
        getContentPane().add(Background);
        Background.setBounds(0, 0, 1008, 729);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static class RoundedBorder implements Border {

		private int radius;

		RoundedBorder(int radius) {
			this.radius = radius;
		}

		public Insets getBorderInsets(Component c) {
			return new Insets(this.radius + 1, this.radius + 1, this.radius + 2, this.radius);
		}

		public boolean isBorderOpaque() {
			return true;
		}

		public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
			g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
		}
	}

    private void signupActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_signupActionPerformed


            String fname = fnameField.getText();
            String uname = unameField.getText();
            String pass = String.valueOf(PassField.getText());
            String email = String.valueOf(emailField.getText());
            String confpass = String.valueOf(confpassField.getText());
            //password strenght
        //total score of password
        int iPasswordScore = 0;

         if( pass.length() >= 10 )
            iPasswordScore += 2;
        else
            iPasswordScore += 1;

        //if it contains one digit, add 2 to total score
        if( pass.matches("(?=.*[0-9]).*") )
            iPasswordScore += 2;

        //if it contains one lower case letter, add 2 to total score
        if( pass.matches("(?=.*[a-z]).*") )
            iPasswordScore += 2;

        //if it contains one upper case letter, add 2 to total score
        if( pass.matches("(?=.*[A-Z]).*") )
            iPasswordScore += 2;

        //if it contains one special character, add 2 to total score
        if( pass.matches("(?=.*[~!@#$%^&*()_-]).*") )
            iPasswordScore += 2;

            //email validation
            String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+.[a-zA-Z0-9+_.-]$";
            Pattern pattern = Pattern.compile(regex);

            //check if they miss to enter data
        if( pass.length() < 8 )
            JOptionPane.showMessageDialog(null,"Add a password or it's less then 8 characters");

        else if(fname.equals("")){//if they miss to enter fname
                JOptionPane.showMessageDialog(null,"Add a first name");
            }else if(uname.equals("")){//if they miss to enter uname
                JOptionPane.showMessageDialog(null,"Add a user name");
            }else if(iPasswordScore>8){//if they miss to enter pass
                JOptionPane.showMessageDialog(null,"Add a password");
            }else if(!(pattern.matcher(email).matches())){//if email dosen't match
                JOptionPane.showMessageDialog(null,"emailisn't valid");
            }else if(email.equals("")) {//if they miss to enter email
                JOptionPane.showMessageDialog(null, "Add a email");
            }else if(confpass.equals("")){//if they miss to enter confpass
                JOptionPane.showMessageDialog(null,"Add a conf password");
            }else if(!confpass.equals(pass)){//if they miss matching pass and confpass
                JOptionPane.showMessageDialog(null,"conf password and password didn't match");
            }else {

                try {
                    PreparedStatement ps;
                    ps = Myconnection.getconnection().prepareStatement("SELECT * FROM numbercruncher.student where student_user=?");//select user using username
                    ps.setString(1, uname);
                    //Check user name if exist
                    ResultSet r1 = ps.executeQuery();
                    if (r1.next()) {
                        JOptionPane.showMessageDialog(null, "User Already exist please enter new one");
                    } else { ps = Myconnection.getconnection().prepareStatement("SELECT * FROM numbercruncher.student where student_email=?");//select user using username
                        ps.setString(1, email);
                        //Check email if exist

                        if (r1.next()) {
                            JOptionPane.showMessageDialog(null, "email Already exist please enter new one");
                        }else {
                            pass = Base64.getEncoder().encodeToString(pass.getBytes());
                            confpass = Base64.getEncoder().encodeToString(confpass.getBytes());
                            email = Base64.getEncoder().encodeToString(email.getBytes());
                            //if no push to the database
                            String query = "Insert into numbercruncher.student (student_user ,student_pass,student_confpass,student_fname,student_email) values (?,?,?,?,?)";
                            //update table with the username, pass, conf, fname and email

                            ps = Myconnection.getconnection().prepareStatement(query);

                            ps.setString(1, uname);
                            ps.setString(2, pass);
                            ps.setString(3, confpass);
                            ps.setString(4, fname);
                            ps.setString(5, email);

                            if (ps.executeUpdate() > 0) {//user update
                                JOptionPane.showMessageDialog(null, "New User Add");
                                try {
                                    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                                        if ("Nimbus".equals(info.getName())) {
                                            javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                            break;
                                        }
                                    }
                                } catch (ClassNotFoundException ex) {
                                    java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                                } catch (InstantiationException ex) {
                                    java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                                } catch (IllegalAccessException ex) {
                                    java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                                    java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                                }
                                login login = new login();
                                setVisible(false);
                                login.setVisible(true);
                            } else {
                                JOptionPane.showMessageDialog(null, "error");
                            }
                        }

                    }
                } catch (SQLIntegrityConstraintViolationException e) {
                     // Duplicate entry
                    JOptionPane.showMessageDialog(null, "This email already exist reset your password or use another one");
                 } catch (SQLException ex) {
                    Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                }




            }
    }//GEN-LAST:event_signupActionPerformed

    private void BackgroundComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_BackgroundComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_BackgroundComponentAdded

    private void BackgroundFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BackgroundFocusLost

    }//GEN-LAST:event_BackgroundFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPasswordField PassField;
    private javax.swing.JPasswordField confpassField;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField fnameField;
    private javax.swing.JButton signup;
    private javax.swing.JTextField unameField;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_4;
    private JLabel lblNewLabel_5;
    private JLabel lblNewLabel_6;
    // End of variables declaration//GEN-END:variables
}
