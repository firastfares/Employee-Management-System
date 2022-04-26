package phase3;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author John Legg
 */
public class gradetwobasetenvidselect extends javax.swing.JFrame {


    public gradetwobasetenvidselect() {
        initComponents();
    }

    private void initComponents() {

        Homebut = new javax.swing.JButton();// button creation
        title = new javax.swing.JLabel();//label creation
        threedigit = new javax.swing.JButton();//button creation
        addsub10or100 = new javax.swing.JButton();//button creation
        addsub100 = new javax.swing.JButton();// button creation
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
        title.setText("Videos On Grade Two Number and Operation Base Ten");//text of label
        getContentPane().add(title);//label placement
        title.setBounds(50, 180, 900, 60);//label size

        threedigit.setText("Three Digit Numbers");//text
        threedigit.setBackground(new java.awt.Color(139, 139, 139));//button background color
        threedigit.setOpaque(true);//opaque
        threedigit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//button borders
        threedigit.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/2ndgradebaseten.png")));//button icon
        threedigit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text position
        threedigit.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text position
        threedigit.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) { //when mouse is pressed on this button open link in browser
                try {
                    String url = "https://www.youtube.com/watch?v=d1rJlne4ZE0"; // open this video on understanding three digit numbers
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (java.io.IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        threedigit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whatshapeActionPerformed(evt);
            }
        });
        getContentPane().add(threedigit);//placement on jframe
        threedigit.setBounds(120, 390, 240, 150);//button size

        addsub10or100.setText("Add or Subtract 100 with Place Value");//text
        addsub10or100.setBackground(new java.awt.Color(139, 139, 139));//button background color
        addsub10or100.setOpaque(true);//opaque
        addsub10or100.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//button borders
        addsub10or100.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/2ndgradebaseten2.png")));//button icon
        addsub10or100.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text position
        addsub10or100.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text position
        addsub10or100.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) { //when mouse is pressed on this button open link in browser
                try {
                    String url = "https://www.youtube.com/watch?v=zOQJcETXChc"; // open this video on Add or Subtract 10 or 100
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (java.io.IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        addsub10or100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsubtractActionPerformed(evt);
            }
        });
        getContentPane().add(addsub10or100);//button placment on frame
        addsub10or100.setBounds(410, 390, 240, 150);//button size

        addsub100.setText("Add or Subtract 10 or 100");//button text
        addsub100.setBackground(new java.awt.Color(139, 139, 139));//button background color
        addsub100.setOpaque(true);//opaque
        addsub100.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//button borders
        addsub100.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/2ndgradebaseten3.png")));//button icon
        addsub100.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text position
        addsub100.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text position
        addsub100.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) { //when mouse is pressed on this button open link in browser
                try {
                    String url = "https://www.youtube.com/watch?v=nuuxD_J4G2w"; // open this video on add or sub within 100
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (java.io.IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        addsub100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compareshapeActionPerformed(evt);
            }
        });
        getContentPane().add(addsub100);// placement on to the jframe
        addsub100.setBounds(700, 390, 240, 150);//button size
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
            java.util.logging.Logger.getLogger(gradetwobasetenvidselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gradetwobasetenvidselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gradetwobasetenvidselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gradetwobasetenvidselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gradetwobasetenvidselect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Homebut;// variable creation
    private javax.swing.JButton addsub10or100;// variable creation
    private javax.swing.JLabel back;// variable creation
    private javax.swing.JButton addsub100;// variable creation
    private javax.swing.JLabel title;// variable creation
    private javax.swing.JButton threedigit;// variable creation
    // End of variables declaration//GEN-END:variables
}
