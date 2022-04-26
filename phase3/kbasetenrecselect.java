package phase3;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author John Legg
 */
public class kbasetenrecselect extends javax.swing.JFrame {


    public kbasetenrecselect() {
        initComponents();
    }

    private void initComponents() {

        Homebut = new javax.swing.JButton();// button creation
        title = new javax.swing.JLabel();//label creation
        compdecomp = new javax.swing.JButton();//button creation
        compdecom11to19 = new javax.swing.JButton();//button creation
        placevalsong = new javax.swing.JButton();// button creation
        back = new javax.swing.JLabel();//label for background

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 763));// size of frame
        setResizable(false);
        getContentPane().setLayout(null);

        Homebut.setText("Return to Homepage");//button text
        Homebut.setFont(new java.awt.Font("Impact", 0, 36));//font
        Homebut.setBackground(new java.awt.Color(139, 139, 139));//background color
        Homebut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border property
        Homebut.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {//open home
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
                setVisible(false);//close grade select

            }
        });
        Homebut.setOpaque(true);//see background color
        getContentPane().add(Homebut);//placement of button
        Homebut.setBounds(180, 90, 630, 60);//button size

        title.setFont(new java.awt.Font("Tahoma", 0, 30)); //font
        title.setForeground(new java.awt.Color(255, 255, 255));//font color
        title.setBackground(new java.awt.Color(139, 139, 139));//bg color
        title.setOpaque(true);//see bg color
        title.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border property
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);//text placement
        title.setText("Recordings On Kindergarten Number and Operation Base Ten");//text of label
        getContentPane().add(title);//label placement
        title.setBounds(50, 180, 900, 60);//label size

        compdecomp.setText("Compose and Decompose Numbers");//text
        compdecomp.setBackground(new java.awt.Color(139, 139, 139));//button background color
        compdecomp.setOpaque(true);//opaque
        compdecomp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//button borders
        compdecomp.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/kiderbaseten.png")));//button icon
        compdecomp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text position
        compdecomp.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text position
        compdecomp.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) { //when mouse is pressed on this button open link in browser
                try {
                    String url = "https://www.youtube.com/watch?v=G05AgnEGmgw"; // open this video on composing and decomposing numbers
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (java.io.IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        compdecomp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whatshapeActionPerformed(evt);
            }
        });
        getContentPane().add(compdecomp);//placement on jframe
        compdecomp.setBounds(120, 390, 240, 150);//button size

        compdecom11to19.setText("Compose and Decompose Numbers 11-19");//text
        compdecom11to19.setBackground(new java.awt.Color(139, 139, 139));//button background color
        compdecom11to19.setOpaque(true);//opaque
        compdecom11to19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//button borders
        compdecom11to19.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/kiderbaseten2.png")));//button icon
        compdecom11to19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text position
        compdecom11to19.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text position
        compdecom11to19.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) { //when mouse is pressed on this button open link in browser
                try {
                    String url = "https://www.youtube.com/watch?v=MmLMU8BqyKw"; // open this video on composition and decomposition 11-19
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (java.io.IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        compdecom11to19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsubtractActionPerformed(evt);
            }
        });
        getContentPane().add(compdecom11to19);//button placment on frame
        compdecom11to19.setBounds(410, 390, 240, 150);//button size

        placevalsong.setText("Place value");//button text
        placevalsong.setBackground(new java.awt.Color(139, 139, 139));//button background color
        placevalsong.setOpaque(true);//opaque
        placevalsong.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//button borders
        placevalsong.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/kiderbaseten3.png")));//button icon
        placevalsong.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text position
        placevalsong.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text position
        placevalsong.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) { //when mouse is pressed on this button open link in browser
                try {
                    String url = "https://www.youtube.com/watch?v=PGgLPEdu2EA"; // open this video on place value song
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (java.io.IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        placevalsong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compareshapeActionPerformed(evt);
            }
        });
        getContentPane().add(placevalsong);// placement on to the jframe
        placevalsong.setBounds(700, 390, 240, 150);//button size
        getContentPane().add(back);//plamcent on to the jframe
        back.setBounds(0, 0, 1020, 760);//background size
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/background.jpg")));//background label  image

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
            java.util.logging.Logger.getLogger(kbasetenrecselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kbasetenrecselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kbasetenrecselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kbasetenrecselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kbasetenrecselect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Homebut;// variable creation
    private javax.swing.JButton compdecom11to19;// variable creation
    private javax.swing.JLabel back;// variable creation
    private javax.swing.JButton placevalsong;// variable creation
    private javax.swing.JLabel title;// variable creation
    private javax.swing.JButton compdecomp;// variable creation
    // End of variables declaration//GEN-END:variables
}
