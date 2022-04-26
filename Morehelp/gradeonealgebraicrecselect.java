package phase3;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author thest
 */
public class gradeonealgebraicrecselect extends javax.swing.JFrame {


    public gradeonealgebraicrecselect() {
        initComponents();
    }

    private void initComponents() {

        Homebut = new javax.swing.JButton();// button creation
        title = new javax.swing.JLabel();//label creation
        addsub20 = new javax.swing.JButton();//button creation
        wordproblemsum20 = new javax.swing.JButton();//button creation
        whatisequalssign = new javax.swing.JButton();// button creation
        back = new javax.swing.JLabel();//label for background

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 763));// size of frame
        setResizable(false);
        getContentPane().setLayout(null);

        Homebut.setText("Return to Homepage");//button text
        Homebut.setFont(new java.awt.Font("Impact", 0, 36));//font size and style
        Homebut.setBackground(new java.awt.Color(139, 139, 139));//bg color
        Homebut.setOpaque(true);//view bg color
        Homebut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border settings
        Homebut.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {//open home
                homepagev2 homepagev2 = new homepagev2();
                homepagev2.setVisible(true);
                setVisible(false);//close grade select

            }
        });
        getContentPane().add(Homebut);//placement of button
        Homebut.setBounds(180, 90, 630, 60);//button size

        title.setFont(new java.awt.Font("Tahoma", 0, 30)); //font

        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);//text placement
        title.setText("Recordings On First Grade Operations and Algebraic Thinking");//text of label
        title.setBackground(new java.awt.Color(139, 139, 139));//bg color
        title.setOpaque(true);//view bg color
        title.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border settings
        getContentPane().add(title);//label placement
        title.setBounds(50, 180, 900, 60);//label size

        addsub20.setText("Add and Subtract Within 20");//text
        addsub20.setBackground(new java.awt.Color(139, 139, 139));//button background color
        addsub20.setOpaque(true);//opaque
        addsub20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//button borders
        addsub20.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/1stgradealgebraic.png")));//button icon
        addsub20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text position
        addsub20.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text position
        addsub20.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) { //when mouse is pressed on this button open link in browser
                try {
                    String url = "https://www.youtube.com/watch?v=OPKfK4__mE4"; // open this video on addition and subtraction within 20
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
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

        wordproblemsum20.setText("Word Problems Sum to 20");//text
        wordproblemsum20.setBackground(new java.awt.Color(139, 139, 139));//button background color
        wordproblemsum20.setOpaque(true);//opaque
        wordproblemsum20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//button borders
        wordproblemsum20.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/1stgradealgebraic3.png")));//button icon
        wordproblemsum20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text position
        wordproblemsum20.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text position
        wordproblemsum20.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) { //when mouse is pressed on this button open link in browser
                try {
                    String url = "https://www.youtube.com/watch?v=EA-khC5_zPA"; // open this video on word problems addition and subtraction within 20
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (java.io.IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        wordproblemsum20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsubtractActionPerformed(evt);
            }
        });
        getContentPane().add(wordproblemsum20);//button placment on frame
        wordproblemsum20.setBounds(410, 390, 240, 150);//button size

        whatisequalssign.setText("What is the equals sign?");//button text
        whatisequalssign.setBackground(new java.awt.Color(139, 139, 139));//button background color
        whatisequalssign.setOpaque(true);//opaque
        whatisequalssign.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//button borders
        whatisequalssign.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/1stgradealgebraic2.png")));//button icon
        whatisequalssign.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text position
        whatisequalssign.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text position
        whatisequalssign.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) { //when mouse is pressed on this button open link in browser
                try {
                    String url = "https://www.youtube.com/watch?v=akNAMF-SJkU"; // open this video on what the equals sign means
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (java.io.IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        whatisequalssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compareshapeActionPerformed(evt);
            }
        });
        getContentPane().add(whatisequalssign);// placement on to the jframe
        whatisequalssign.setBounds(700, 390, 240, 150);//button size
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
            java.util.logging.Logger.getLogger(gradeonealgebraicrecselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gradeonealgebraicrecselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gradeonealgebraicrecselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gradeonealgebraicrecselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gradeonealgebraicrecselect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Homebut;// variable creation
    private javax.swing.JButton wordproblemsum20;// variable creation
    private javax.swing.JLabel back;// variable creation
    private javax.swing.JButton whatisequalssign;// variable creation
    private javax.swing.JLabel title;// variable creation
    private javax.swing.JButton addsub20;// variable creation
    // End of variables declaration//GEN-END:variables
}
