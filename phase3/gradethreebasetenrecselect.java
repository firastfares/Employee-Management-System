package phase3;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author John Legg
 */
public class gradethreebasetenrecselect extends javax.swing.JFrame {


    public gradethreebasetenrecselect() {
        initComponents();
    }

    private void initComponents() {

        Homebut = new javax.swing.JButton();// button creation
        title = new javax.swing.JLabel();//label creation
        rounding = new javax.swing.JButton();//button creation
        addsub1000 = new javax.swing.JButton();//button creation
        mutliplymutilple10 = new javax.swing.JButton();// button creation
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
        title.setText("Recordings On Third Grade Number and Operation Base Ten");//text of label
        getContentPane().add(title);//label placement
        title.setBounds(50, 180, 900, 60);//label size

        rounding.setText("Rounding to 10 or 100");//text
        rounding.setBackground(new java.awt.Color(139, 139, 139));//button background color
        rounding.setOpaque(true);//opaque
        rounding.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//button borders
        rounding.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/3rdgradebaseten.jpg")));//button icon
        rounding.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text position
        rounding.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text position
        rounding.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) { //when mouse is pressed on this button open link in browser
                try {
                    String url = "https://www.youtube.com/watch?v=jvp0mtr1kFM"; // open this video on rounding to 10 or 100
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (java.io.IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        rounding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whatshapeActionPerformed(evt);
            }
        });
        getContentPane().add(rounding);//placement on jframe
        rounding.setBounds(120, 390, 240, 150);//button size

        addsub1000.setText("Add subtract within 1000");//text
        addsub1000.setBackground(new java.awt.Color(139, 139, 139));//button background color
        addsub1000.setOpaque(true);//opaque
        addsub1000.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//button borders
        addsub1000.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/3rdgradebaseten2.png")));//button icon
        addsub1000.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text position
        addsub1000.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text position
        addsub1000.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) { //when mouse is pressed on this button open link in browser
                try {
                    String url = "https://www.youtube.com/watch?v=hlui5ZdkdQY"; // open this video on add sub within 1000
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (java.io.IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        addsub1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsubtractActionPerformed(evt);
            }
        });
        getContentPane().add(addsub1000);//button placment on frame
        addsub1000.setBounds(410, 390, 240, 150);//button size

        mutliplymutilple10.setText("Multiply by multiples of 10");//button text
        mutliplymutilple10.setBackground(new java.awt.Color(139, 139, 139));//button background color
        mutliplymutilple10.setOpaque(true);//opaque
        mutliplymutilple10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//button borders
        mutliplymutilple10.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/3rdgradebaseten3.jpg")));//button icon
        mutliplymutilple10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text position
        mutliplymutilple10.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text position
        mutliplymutilple10.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) { //when mouse is pressed on this button open link in browser
                try {
                    String url = "https://www.youtube.com/watch?v=jb8mFpA1YI8"; // open this video on multiply be multiples of ten
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (java.io.IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        mutliplymutilple10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compareshapeActionPerformed(evt);
            }
        });
        getContentPane().add(mutliplymutilple10);// placement on to the jframe
        mutliplymutilple10.setBounds(700, 390, 240, 150);//button size
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
            java.util.logging.Logger.getLogger(gradethreebasetenrecselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gradethreebasetenrecselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gradethreebasetenrecselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gradethreebasetenrecselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gradethreebasetenrecselect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Homebut;// variable creation
    private javax.swing.JButton addsub1000;// variable creation
    private javax.swing.JLabel back;// variable creation
    private javax.swing.JButton mutliplymutilple10;// variable creation
    private javax.swing.JLabel title;// variable creation
    private javax.swing.JButton rounding;// variable creation
    // End of variables declaration//GEN-END:variables
}
