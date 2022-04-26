package phase3;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author John Legg
 */
public class gradefouralgebraicvidselect extends javax.swing.JFrame {


    public gradefouralgebraicvidselect() {
        initComponents();
    }

    private void initComponents() {

        Homebut = new javax.swing.JButton();// button creation
        title = new javax.swing.JLabel();//label creation
        mutlicomp = new javax.swing.JButton();//button creation
        factorpairs = new javax.swing.JButton();//button creation
        wordproblems = new javax.swing.JButton();// button creation
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
        title.setForeground(new java.awt.Color(255, 255, 255));//font color
        title.setBackground(new java.awt.Color(139, 139, 139));//bg color
        title.setOpaque(true);//view bg color
        title.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border settings
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);//text placement
        title.setText("Videos On Fourth Grade Operations and Algebraic Thinking");//text of label
        getContentPane().add(title);//label placement
        title.setBounds(50, 180, 900, 60);//label size

        mutlicomp.setText("Multiplication as a Comparison");//text
        mutlicomp.setBackground(new java.awt.Color(139, 139, 139));//button background color
        mutlicomp.setOpaque(true);//opaque
        mutlicomp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//button borders
        mutlicomp.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/4thgradealgebraic.png")));//button icon
        mutlicomp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text position
        mutlicomp.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text position
        mutlicomp.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) { //when mouse is pressed on this button open link in browser
                try {
                    String url = "https://www.youtube.com/watch?v=LRAXq_oeGd4"; // open this video on multiplication a comparison
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (java.io.IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        mutlicomp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whatshapeActionPerformed(evt);
            }
        });
        getContentPane().add(mutlicomp);//placement on jframe
        mutlicomp.setBounds(120, 390, 240, 150);//button size

        factorpairs.setText("Factor Pairs 1-100");//text
        factorpairs.setBackground(new java.awt.Color(139, 139, 139));//button background color
        factorpairs.setOpaque(true);//opaque
        factorpairs.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//button borders
        factorpairs.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/4thgradealgebraic2.png")));//button icon
        factorpairs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text position
        factorpairs.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text position
        factorpairs.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) { //when mouse is pressed on this button open link in browser
                try {
                    String url = "https://www.youtube.com/watch?v=kAhpVxd4I0w"; // open this video on factor pairs 1-100
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (java.io.IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        factorpairs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsubtractActionPerformed(evt);
            }
        });
        getContentPane().add(factorpairs);//button placement on frame
        factorpairs.setBounds(410, 390, 240, 150);//button size

        wordproblems.setText("Word Problems, Multiplicative Comp.");//button text
        wordproblems.setBackground(new java.awt.Color(139, 139, 139));//button background color
        wordproblems.setOpaque(true);//opaque
        wordproblems.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//button borders
        wordproblems.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/4thgradealgebraic3.png")));//button icon
        wordproblems.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text position
        wordproblems.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text position
        wordproblems.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) { //when mouse is pressed on this button open link in browser
                try {
                    String url = "https://www.youtube.com/watch?v=4B09Lk6DTyk"; // open this video on word problems on multiplicative comparison
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (java.io.IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        wordproblems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compareshapeActionPerformed(evt);
            }
        });
        getContentPane().add(wordproblems);// placement on to the jframe
        wordproblems.setBounds(700, 390, 240, 150);//button size
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
            java.util.logging.Logger.getLogger(gradefouralgebraicvidselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gradefouralgebraicvidselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gradefouralgebraicvidselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gradefouralgebraicvidselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gradefouralgebraicvidselect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Homebut;// variable creation
    private javax.swing.JButton factorpairs;// variable creation
    private javax.swing.JLabel back;// variable creation
    private javax.swing.JButton wordproblems;// variable creation
    private javax.swing.JLabel title;// variable creation
    private javax.swing.JButton mutlicomp;// variable creation
    // End of variables declaration//GEN-END:variables
}
