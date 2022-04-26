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
public class gradetwoalgebraicrecselect extends javax.swing.JFrame {


    public gradetwoalgebraicrecselect() {
        initComponents();
    }

    private void initComponents() {

        Homebut = new javax.swing.JButton();// button creation
        title = new javax.swing.JLabel();//label creation
        addsubtract = new javax.swing.JButton();//button creation
        totalinarry = new javax.swing.JButton();//button creation
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
        title.setBackground(new java.awt.Color(139, 139, 139));//bg color
        title.setOpaque(true);//view bg color
        title.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border settings
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);//text placement
        title.setText("Recordings On Second Grade Operations and Algebraic Thinking");//text of label
        getContentPane().add(title);//label placement
        title.setBounds(50, 180, 900, 60);//label size

        addsubtract.setText("Add and Subtract within 20");//text
        addsubtract.setBackground(new java.awt.Color(139, 139, 139));//button background color
        addsubtract.setOpaque(true);//opaque
        addsubtract.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//button borders
        addsubtract.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/2ndgradealgebraic.png")));//button icon
        addsubtract.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text position
        addsubtract.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text position
        addsubtract.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) { //when mouse is pressed on this button open link in browser
                try {
                    String url = "https://www.youtube.com/watch?v=ZgzpTx-s9Zo"; // open this video on addition and subtraction within 20 no objects mental strats
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (java.io.IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        addsubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whatshapeActionPerformed(evt);
            }
        });
        getContentPane().add(addsubtract);//placement on jframe
        addsubtract.setBounds(120, 390, 240, 150);//button size

        totalinarry.setText("Number of Objects in a Array");//text
        totalinarry.setBackground(new java.awt.Color(139, 139, 139));//button background color
        totalinarry.setOpaque(true);//opaque
        totalinarry.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//button borders
        totalinarry.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/2ndgradealgebraic2.png")));//button icon
        totalinarry.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text position
        totalinarry.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text position
        totalinarry.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) { //when mouse is pressed on this button open link in browser
                try {
                    String url = "https://www.youtube.com/watch?v=vO6WW1BGbLw"; // open this video on addition of total number of object in a array
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (java.io.IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        totalinarry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsubtractActionPerformed(evt);
            }
        });
        getContentPane().add(totalinarry);//button placment on frame
        totalinarry.setBounds(410, 390, 240, 150);//button size

        wordproblems.setText("Word Problems");//button text
        wordproblems.setBackground(new java.awt.Color(139, 139, 139));//button background color
        wordproblems.setOpaque(true);//opaque
        wordproblems.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//button borders
        wordproblems.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/2ndgradealgebraic3.jpg")));//button icon
        wordproblems.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text position
        wordproblems.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text position
        wordproblems.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) { //when mouse is pressed on this button open link in browser
                try {
                    String url = "https://www.youtube.com/watch?v=jDIj0CUjGvM"; // open this video on word problems of add and subtract within 100
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
            java.util.logging.Logger.getLogger(gradetwoalgebraicrecselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gradetwoalgebraicrecselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gradetwoalgebraicrecselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gradetwoalgebraicrecselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gradetwoalgebraicrecselect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Homebut;// variable creation
    private javax.swing.JButton totalinarry;// variable creation
    private javax.swing.JLabel back;// variable creation
    private javax.swing.JButton wordproblems;// variable creation
    private javax.swing.JLabel title;// variable creation
    private javax.swing.JButton addsubtract;// variable creation
    // End of variables declaration//GEN-END:variables
}
