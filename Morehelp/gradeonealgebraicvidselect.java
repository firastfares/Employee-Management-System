package phase3;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author John Legg
 */
public class gradeonealgebraicvidselect extends javax.swing.JFrame {


    public gradeonealgebraicvidselect() {
        initComponents();
    }

    private void initComponents() {

        Homebut = new javax.swing.JButton();// button creation
        title = new javax.swing.JLabel();//label creation
        addsub20 = new javax.swing.JButton();//button creation
        wordproblems = new javax.swing.JButton();//button creation
        whatistheequalsign = new javax.swing.JButton();// button creation
        back = new javax.swing.JLabel();//label for background

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1024, 763));// size of frame
        setSize(new Dimension(1024, 763));//size of frame
        setResizable(false);
        getContentPane().setLayout(null);

        Homebut.setText("Return to Homepage");//button text
        Homebut.setFont(new Font("Impact", 0, 36));//font size and style
        Homebut.setBackground(new Color(139, 139, 139));//bg color
        Homebut.setOpaque(true);//view bg color
        Homebut.setBorder(new javax.swing.border.LineBorder(new Color(64, 121, 126), 10, true));//border settings
        Homebut.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {//open home
                homepagev2 homepagev2 = new homepagev2();
                homepagev2.setVisible(true);
                setVisible(false);//close grade select

            }
        });
        getContentPane().add(Homebut);//placement of button
        Homebut.setBounds(180, 90, 630, 60);//button size

        title.setFont(new Font("Tahoma", 0, 30)); //font

        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);//text placement
        title.setText("Videos On First Grade Operations and Algebraic Thinking");//text of label
        title.setForeground(new Color(255, 255, 255));//font color
        title.setBackground(new Color(139, 139, 139));//bg color
        title.setOpaque(true);//view bg color
        title.setBorder(new javax.swing.border.LineBorder(new Color(64, 121, 126), 10, true));//border settings
        getContentPane().add(title);//label placement
        title.setBounds(50, 180, 900, 60);//label size

        addsub20.setText("Add and Subtract Within 20");//text
        addsub20.setBackground(new Color(139, 139, 139));//button background color
        addsub20.setOpaque(true);//opaque
        addsub20.setBorder(new javax.swing.border.LineBorder(new Color(64, 121, 126), 10, true));//button borders
        addsub20.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/1stgradealgebraic.png")));//button icon
        addsub20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text position
        addsub20.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text position
        addsub20.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) { //when mouse is pressed on this button open link in browser
                try {
                    String url = "https://www.youtube.com/watch?v=zJyT6MIlkAw"; // open this video on addition and subtraction within 20
                    Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (java.io.IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        addsub20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whatshapeActionPerformed(evt);
            }
        });
        getContentPane().add(addsub20);//placement on jframe
        addsub20.setBounds(120, 390, 240, 150);//button size

        wordproblems.setText("Word Problem within 20");//text
        wordproblems.setBackground(new Color(139, 139, 139));//button background color
        wordproblems.setOpaque(true);//opaque
        wordproblems.setBorder(new javax.swing.border.LineBorder(new Color(64, 121, 126), 10, true));//button borders
        wordproblems.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/1stgradealgebraic3.png")));//button icon
        wordproblems.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text position
        wordproblems.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text position
        wordproblems.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) { //when mouse is pressed on this button open link in browser
                try {
                    String url = "https://www.youtube.com/watch?v=FDP0mbsVX9A"; // open this video on word problems addition and subtraction within 20
                    Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (java.io.IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        wordproblems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsubtractActionPerformed(evt);
            }
        });
        getContentPane().add(wordproblems);//button placment on frame
        wordproblems.setBounds(410, 390, 240, 150);//button size

        whatistheequalsign.setText("What is the equals sign?");//button text
        whatistheequalsign.setBackground(new Color(139, 139, 139));//button background color
        whatistheequalsign.setOpaque(true);//opaque
        whatistheequalsign.setBorder(new javax.swing.border.LineBorder(new Color(64, 121, 126), 10, true));//button borders
        whatistheequalsign.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/1stgradealgebraic2.png")));//button icon
        whatistheequalsign.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text position
        whatistheequalsign.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text position
        whatistheequalsign.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) { //when mouse is pressed on this button open link in browser
                try {
                    String url = "https://www.youtube.com/watch?v=tlHMLEq6kXs"; // open this video on what the equals sign means
                    Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (java.io.IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        whatistheequalsign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compareshapeActionPerformed(evt);
            }
        });
        getContentPane().add(whatistheequalsign);// placement on to the jframe
        whatistheequalsign.setBounds(700, 390, 240, 150);//button size
        getContentPane().add(back);//plamcent on to the jframe
        back.setBounds(0, 0, 1020, 760);//background size
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/background.jpg")));//icon used as a background for the frame

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void compareshapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compareshapeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compareshapeActionPerformed

    private void whatshapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whatshapeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_whatshapeActionPerformed

    private void addsubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addsubtractActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addsubtractActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gradeonealgebraicvidselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gradeonealgebraicvidselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gradeonealgebraicvidselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gradeonealgebraicvidselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gradeonealgebraicvidselect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Homebut;// variable creation
    private javax.swing.JButton wordproblems;// variable creation
    private javax.swing.JLabel back;// variable creation
    private javax.swing.JButton whatistheequalsign;// variable creation
    private javax.swing.JLabel title;// variable creation
    private javax.swing.JButton addsub20;// variable creation
    // End of variables declaration//GEN-END:variables
}
