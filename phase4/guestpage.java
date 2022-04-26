
package phase3;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.event.MouseEvent;

/**
 * @author John Legg
 */
public class guestpage extends javax.swing.JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static String [] getdata = new String[1];
    private javax.swing.JLabel back;//variable creation
    private javax.swing.JPanel base;//variable creation
    private javax.swing.JButton homebut;//variable creation
    private javax.swing.JLabel logo;//variable creation
    private javax.swing.JButton morehelpbut;//variable creation
    private javax.swing.JButton myprogressbut;//variable creation
    private javax.swing.JButton practicetestbut;//variable creation
    private javax.swing.JButton profilebutton;//variable creation
    private javax.swing.JButton recordings;//variable creation
    private javax.swing.JButton tutorialsbut;//variable creation
    private javax.swing.JButton unittestbut;//variable creation
    /**
     * Creates new form homepagev2
     */
    public guestpage() {
        initComponents();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guestpage().setVisible(true);
            }
        });

    }

    private void initComponents() {

        base = new javax.swing.JPanel();//panel creation
        morehelpbut = new javax.swing.JButton();//button creation
        tutorialsbut = new javax.swing.JButton();//button creation
        recordings = new javax.swing.JButton();//button creation
        myprogressbut = new javax.swing.JButton();//button creation
        practicetestbut = new javax.swing.JButton();//button creation
        unittestbut = new javax.swing.JButton();//button creation
        homebut = new javax.swing.JButton();//button creation
        profilebutton = new javax.swing.JButton();//button creation
        logo = new javax.swing.JLabel();//label creation
        back = new javax.swing.JLabel();//label creation

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 763));//frame size
        setResizable(false);
        getContentPane().setLayout(new java.awt.FlowLayout());

        base.setPreferredSize(new java.awt.Dimension(1024, 763));//panel size
        base.setLayout(null);

        morehelpbut.setBackground(new java.awt.Color(139, 139, 139));//bg color
        morehelpbut.setOpaque(true);//view bg color
        morehelpbut.setFont(new java.awt.Font("Impact", 0, 18)); // font style and size
        morehelpbut.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/help.png")));//button icon
        morehelpbut.setText("More Help");//text
        morehelpbut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border settings
        morehelpbut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text setting
        morehelpbut.setPreferredSize(new java.awt.Dimension(171, 139));//size setting
        morehelpbut.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text setting
        base.add(morehelpbut);//add to the panel
        morehelpbut.setBounds(667, 450, 171, 139);//placement and size
        morehelpbut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                morehelpbutMouseClicked(evt);
            }
        });

        tutorialsbut.setBackground(new java.awt.Color(139, 139, 139));//placement and size
        tutorialsbut.setOpaque(true);
        tutorialsbut.setFont(new java.awt.Font("Impact", 0, 18)); // font size and style
        tutorialsbut.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/tutorial.png")));//button icon
        tutorialsbut.setText("Tutorials");//text
        tutorialsbut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border settings
        tutorialsbut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text setting
        tutorialsbut.setPreferredSize(new java.awt.Dimension(171, 139));//size setting
        tutorialsbut.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text setting
        tutorialsbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutorialsbutActionPerformed(evt);
            }
        });
        tutorialsbut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                tutorialsbutMouseClicked(evt);
            }
        });
        base.add(tutorialsbut);//add to the panel
        tutorialsbut.setBounds(184, 269, 171, 139);//placement and size

        recordings.setBackground(new java.awt.Color(139, 139, 139));//bg color
        recordings.setOpaque(true);//view bg color
        recordings.setFont(new java.awt.Font("Impact", 0,18 )); // font size and style
        recordings.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/recordings.png")));//button icon
        recordings.setText("Recordings");//text
        recordings.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border setting
        recordings.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text setting
        recordings.setPreferredSize(new java.awt.Dimension(171, 139));//size setting
        recordings.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text setting
        recordings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
               recordingsbutMouseClicked(evt);
            }
        });
        recordings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testbattlebutActionPerformed(evt);
            }
        });
        base.add(recordings);//add to panel
        recordings.setBounds(184, 447, 171, 139);//placement and size

        myprogressbut.setBackground(new java.awt.Color(139, 139, 139));//bg color
        myprogressbut.setOpaque(true);//view bg color
        myprogressbut.setFont(new java.awt.Font("Impact", 0, 18)); // font size and style
        myprogressbut.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/stars.png")));//button icon
        myprogressbut.setText("My Progress");//text
        myprogressbut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border settings
        myprogressbut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text setting
        myprogressbut.setPreferredSize(new java.awt.Dimension(171, 139));//size setting
        myprogressbut.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text setting
        myprogressbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myprogressbutActionPerformed(evt);
            }
        });
        myprogressbut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                myprogressbutMouseClicked(evt);
            }
        });
        base.add(myprogressbut);//adding to the panel
        myprogressbut.setBounds(422, 447, 171, 139);//placement and size

        practicetestbut.setBackground(new java.awt.Color(139, 139, 139));//bg color
        practicetestbut.setOpaque(true);//view bg color
        practicetestbut.setFont(new java.awt.Font("Impact", 0, 18));//font size and style
        practicetestbut.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/practicetest.png")));//button icon
        practicetestbut.setText("Practice Tests");//text
        practicetestbut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border settings
        practicetestbut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text setting
        practicetestbut.setPreferredSize(new java.awt.Dimension(171, 139));//size setting
        practicetestbut.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text setting
        practicetestbut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                practicetestbutMouseClicked(evt);
            }
        });
        practicetestbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                practicetestbutActionPerformed(evt);
            }
        });
        base.add(practicetestbut);//add to the panel
        practicetestbut.setBounds(422, 269, 171, 139);//placement and size

        unittestbut.setFont(new java.awt.Font("Impact", 0, 18)); // font size and style
        unittestbut.setBackground(new java.awt.Color(139, 139, 139));//bg color
        unittestbut.setOpaque(true);//view bg color
        unittestbut.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/unittest.png")));//button icon
        unittestbut.setText("Unit Test");//text
        unittestbut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border settings
        unittestbut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text settings
        unittestbut.setPreferredSize(new java.awt.Dimension(171, 139));//size settings
        unittestbut.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text settings
        unittestbut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                unittestbutMouseClicked();
            }
        });

        base.add(unittestbut);//add to the panel
        unittestbut.setBounds(667, 269, 171, 139);//placement and size
        homebut.setFont(new java.awt.Font("Impact", 0, 36));//font size and style
        homebut.setText("Home Page ");//text
        homebut.setBackground(new java.awt.Color(139, 139, 139));//bg color
        homebut.setOpaque(true);//view bg color
        homebut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border setting
        homebut.setPreferredSize(new java.awt.Dimension(368, 60));//size setting
        homebut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebutActionPerformed(evt);
            }
        });
        homebut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                homebuttbutMouseClicked();
            }
        });
        base.add(homebut);//add to the panel
        homebut.setBounds(334, 68, 368, 60);//placement and size
        profilebutton.setFont(new java.awt.Font("Impact", 0, 24));//font size and style
        profilebutton.setText("Hi, Guest");//text
        profilebutton.setBackground(new java.awt.Color(139, 139, 139));//bg color
        profilebutton.setOpaque(true);//view bg color
        profilebutton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border settings
        profilebutton.setPreferredSize(new java.awt.Dimension(168, 47));//size setting
        profilebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                profilebuttonbutMouseClicked();
            }
        });
        base.add(profilebutton);//add to the panel
        profilebutton.setBounds(776, 68, 200, 60);//placement and size
        base.add(logo);// add to the panel

        logo.setBounds(20, 20, 130, 130);//placement and size
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/Numbercruncherslogo.png")));//logo icon
        base.add(back);// add to the panel
        back.setBounds(0, 0, 1024, 763);//placement and size
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/background.jpg")));//background label

        getContentPane().add(base);//add to the frame

        pack();
    }

    private void morehelpbutMouseClicked(MouseEvent evt) {
        JOptionPane.showMessageDialog(this, "You are on Guest Mode");
        //Help help = new Help();
        //help.setVisible(true);
    }
    private void myprogressbutMouseClicked(MouseEvent evt) {
        JOptionPane.showMessageDialog(this, "You are on Guest Mode");
        //Profile Profile = new Profile();
        //Profile.setVisible(true);
        //setVisible(false);
    }
    private void tutorialsbutMouseClicked(MouseEvent evt) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(guestgradeselecttutorials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guestgradeselecttutorials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guestgradeselecttutorials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guestgradeselecttutorials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        guestgradeselecttutorials guestgradeselecttutorials = new guestgradeselecttutorials();
        guestgradeselecttutorials.setVisible(true);
        setVisible(false);
    }

    private void profilebuttonbutMouseClicked() {
        JOptionPane.showMessageDialog(this, "You are on Guest Mode sign up");
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
        login.setVisible(true);
        setVisible(false);
    }

    private void homebuttbutMouseClicked() {

    }

    private void myprogressbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myprogressbutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myprogressbutActionPerformed

    private void testbattlebutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testbattlebutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testbattlebutActionPerformed

    private void recordingsbutMouseClicked(MouseEvent evt) {//GEN-FIRST:event_testbattlebutMouseClicked
        JOptionPane.showMessageDialog(this, "You are on Guest Mode");
    }//GEN-LAST:event_testbattlebutMouseClicked


    private void homebutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homebutActionPerformed

    private void tutorialsbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutorialsbutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tutorialsbutActionPerformed

    private void practicetestbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_practicetestbutActionPerformed

    }//GEN-LAST:event_practicetestbutActionPerformed

    private void practicetestbutMouseClicked(MouseEvent evt) {//GEN-FIRST:event_practicetestbutMouseClicked
        JOptionPane.showMessageDialog(this, "You are on Guest Mode");
    }//GEN-LAST:event_practicetestbutMouseClicked
    // End of variables declaration//GEN-END:variables
    private void unittestbutMouseClicked() {//GEN-FIRST:event_practicetestbutMouseClicked
        JOptionPane.showMessageDialog(this, "You are on Guest Mode");
        //testselect testselect = new testselect();
        //testselect.setVisible(true);
    }
}
