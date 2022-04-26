//package NC;
package phase3;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.event.MouseEvent;

/**
 * @author thest
 */
public class guesthomepagev2 extends javax.swing.JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel base;
    private javax.swing.JButton homebut;
    private javax.swing.JLabel homeicon;
    private javax.swing.JLabel logo;
    private javax.swing.JButton morehelpbut;
    private javax.swing.JButton myprogressbut;
    private javax.swing.JButton practicetestbut;
    private javax.swing.JButton profilebutton;
    private javax.swing.JButton testbattlebut;
    private javax.swing.JButton tutorialsbut;
    private javax.swing.JButton unittestbut;
    private javax.swing.JLabel usericon;
    /**
     * Creates new form homepagev2
     */
    public guesthomepagev2() {
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
            java.util.logging.Logger.getLogger(guesthomepagev2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guesthomepagev2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guesthomepagev2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guesthomepagev2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guesthomepagev2().setVisible(true);
            }
        });

    }

    private void initComponents() {

        base = new javax.swing.JPanel();
        morehelpbut = new javax.swing.JButton();
        tutorialsbut = new javax.swing.JButton();
        testbattlebut = new javax.swing.JButton();
        myprogressbut = new javax.swing.JButton();
        practicetestbut = new javax.swing.JButton();
        unittestbut = new javax.swing.JButton();
        homebut = new javax.swing.JButton();
        usericon = new javax.swing.JLabel();
        profilebutton = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 763));
        setResizable(false);
        getContentPane().setLayout(new java.awt.FlowLayout());

        base.setPreferredSize(new java.awt.Dimension(1024, 763));
        base.setLayout(null);

        morehelpbut.setBackground(new java.awt.Color(139, 139, 139));
        morehelpbut.setOpaque(true);
        morehelpbut.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        morehelpbut.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/help.png")));
        morehelpbut.setText("More Help");
        morehelpbut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));
        morehelpbut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        morehelpbut.setPreferredSize(new java.awt.Dimension(171, 139));
        morehelpbut.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        base.add(morehelpbut);
        morehelpbut.setBounds(667, 450, 171, 139);

        tutorialsbut.setBackground(new java.awt.Color(139, 139, 139));
        tutorialsbut.setOpaque(true);
        tutorialsbut.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        tutorialsbut.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/tutorial.png")));
        tutorialsbut.setText("Tutorials");
        tutorialsbut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));
        tutorialsbut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tutorialsbut.setPreferredSize(new java.awt.Dimension(171, 139));
        tutorialsbut.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        tutorialsbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutorialsbutActionPerformed(evt);
            }
        });
        base.add(tutorialsbut);
        tutorialsbut.setBounds(184, 269, 171, 139);

        testbattlebut.setBackground(new java.awt.Color(139, 139, 139));
        testbattlebut.setOpaque(true);
        testbattlebut.setFont(new java.awt.Font("Impact", 0,18 )); // NOI18N
        testbattlebut.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/battle.png")));
        testbattlebut.setText("Test Battle");
        testbattlebut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));
        testbattlebut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        testbattlebut.setPreferredSize(new java.awt.Dimension(171, 139));
        testbattlebut.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        testbattlebut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                testbattlebutMouseClicked(evt);
            }
        });
        testbattlebut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testbattlebutActionPerformed(evt);
            }
        });
        base.add(testbattlebut);
        testbattlebut.setBounds(184, 447, 171, 139);

        myprogressbut.setBackground(new java.awt.Color(139, 139, 139));
        myprogressbut.setOpaque(true);
        myprogressbut.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        myprogressbut.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/stars.png")));
        myprogressbut.setText("My Progress");
        myprogressbut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));
        myprogressbut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        myprogressbut.setPreferredSize(new java.awt.Dimension(171, 139));
        myprogressbut.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        myprogressbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myprogressbutActionPerformed(evt);
            }
        });
        base.add(myprogressbut);
        myprogressbut.setBounds(422, 447, 171, 139);

        practicetestbut.setBackground(new java.awt.Color(139, 139, 139));
        practicetestbut.setOpaque(true);
        practicetestbut.setFont(new java.awt.Font("Impact", 0, 18));
        practicetestbut.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/practicetest.png")));
        practicetestbut.setText("Practice Tests");
        practicetestbut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));
        practicetestbut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        practicetestbut.setPreferredSize(new java.awt.Dimension(171, 139));
        practicetestbut.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        practicetestbut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                practicetestbutMouseClicked(evt);
            }
        });
        practicetestbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                practicetestbutActionPerformed(evt);
            }
        });
        base.add(practicetestbut);
        practicetestbut.setBounds(422, 269, 171, 139);

        unittestbut.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        unittestbut.setBackground(new java.awt.Color(139, 139, 139));
        unittestbut.setOpaque(true);
        unittestbut.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/unittest.png")));
        unittestbut.setText("Unit Test");
        unittestbut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));
        unittestbut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        unittestbut.setPreferredSize(new java.awt.Dimension(171, 139));
        unittestbut.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        unittestbut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                unittestbutMouseClicked();
            }
        });

        base.add(unittestbut);
        unittestbut.setBounds(667, 269, 171, 139);
        homebut.setFont(new java.awt.Font("Impact", 0, 36));
        homebut.setText("Home Page ");
        homebut.setBackground(new java.awt.Color(139, 139, 139));
        homebut.setOpaque(true);
        homebut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));
        homebut.setPreferredSize(new java.awt.Dimension(368, 60));
        homebut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebutActionPerformed(evt);
            }
        });
        base.add(usericon);
        usericon.setBounds(784, 74, 47, 47);
        usericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/profile.png")));
        base.add(homebut);
        homebut.setBounds(334, 68, 368, 60);

        profilebutton.setFont(new java.awt.Font("Impact", 0, 24));
        profilebutton.setText("Hi, User");
        profilebutton.setBackground(new java.awt.Color(139, 139, 139));
        profilebutton.setOpaque(true);
        profilebutton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));
        profilebutton.setPreferredSize(new java.awt.Dimension(168, 47));
        profilebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilebuttonActionPerformed(evt);
            }
        });
        profilebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                profilebuttonMouseClicked(evt);
            }
        });
        base.add(profilebutton);
        profilebutton.setBounds(776, 68, 200, 60);
        base.add(logo);

        logo.setBounds(20, 20, 130, 130);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/Numbercruncherslogo.png")));
        base.add(back);
        back.setBounds(0, 0, 1024, 763);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/background.jpg")));

        getContentPane().add(base);

        pack();
    }

    private void profilebuttonMouseClicked(MouseEvent evt) {
        login login = new login();
        login.setVisible(true);
    }

    private void myprogressbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myprogressbutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myprogressbutActionPerformed

    private void testbattlebutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testbattlebutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testbattlebutActionPerformed

    private void testbattlebutMouseClicked(MouseEvent evt) {//GEN-FIRST:event_testbattlebutMouseClicked

    }//GEN-LAST:event_testbattlebutMouseClicked

    private void profilebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilebuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profilebuttonActionPerformed

    private void homebutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homebutActionPerformed

    private void tutorialsbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutorialsbutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tutorialsbutActionPerformed

    private void practicetestbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_practicetestbutActionPerformed
        JOptionPane.showMessageDialog(this, "You are on Guest Mode");
    }//GEN-LAST:event_practicetestbutActionPerformed

    private void practicetestbutMouseClicked(MouseEvent evt) {//GEN-FIRST:event_practicetestbutMouseClicked

    }//GEN-LAST:event_practicetestbutMouseClicked
    // End of variables declaration//GEN-END:variables
    private void unittestbutMouseClicked() {//GEN-FIRST:event_practicetestbutMouseClicked
        JOptionPane.showMessageDialog(this, "You are on Guest Mode");
        //testselect testselect = new testselect();
        //testselect.setVisible(true);
    }
}
