package phase3;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author John Legg
 */
public class gradeonbasetenrecselect extends javax.swing.JFrame {


    public gradeonbasetenrecselect() {
        initComponents();
    }

    private void initComponents() {

        Homebut = new javax.swing.JButton();// button creation
        title = new javax.swing.JLabel();//label creation
        count120 = new javax.swing.JButton();//button creation
        twodigitplus10 = new javax.swing.JButton();//button creation
        submultiple10 = new javax.swing.JButton();// button creation
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
        title.setText("Recordings On First Grade Number and Operation Base Ten");//text of label
        getContentPane().add(title);//label placement
        title.setBounds(50, 180, 900, 60);//label size

        count120.setText("Counting to 120");//text
        count120.setBackground(new java.awt.Color(139, 139, 139));//button background color
        count120.setOpaque(true);//opaque
        count120.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//button borders
        count120.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/1stgradebaseten.png")));//button icon
        count120.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text position
        count120.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text position
        count120.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) { //when mouse is pressed on this button open link in browser
                try {
                    String url = "https://www.youtube.com/watch?v=mmOYygjuZWM"; // open this video on counting to 120
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (java.io.IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        count120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whatshapeActionPerformed(evt);
            }
        });
        getContentPane().add(count120);//placement on jframe
        count120.setBounds(120, 390, 240, 150);//button size

        twodigitplus10.setText("Two digit number + multiple of 10");//text
        twodigitplus10.setBackground(new java.awt.Color(139, 139, 139));//button background color
        twodigitplus10.setOpaque(true);//opaque
        twodigitplus10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//button borders
        twodigitplus10.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/1stgradebaseten3.png")));//button icon
        twodigitplus10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text position
        twodigitplus10.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text position
        twodigitplus10.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) { //when mouse is pressed on this button open link in browser
                try {
                    String url = "https://www.youtube.com/watch?v=gCE4iy9YRVM"; // open this video on Two digit number + multiple of 10
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (java.io.IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        twodigitplus10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsubtractActionPerformed(evt);
            }
        });
        getContentPane().add(twodigitplus10);//button placment on frame
        twodigitplus10.setBounds(410, 390, 240, 150);//button size

        submultiple10.setText("Subtract multiples of 10");//button text
        submultiple10.setBackground(new java.awt.Color(139, 139, 139));//button background color
        submultiple10.setOpaque(true);//opaque
        submultiple10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//button borders
        submultiple10.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/1stgradebaseten2.png")));//button icon
        submultiple10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text position
        submultiple10.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text position
        submultiple10.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) { //when mouse is pressed on this button open link in browser
                try {
                    String url = "https://www.youtube.com/watch?v=Tc-C_804hdE"; // open this video on Subtract multiples of 10 from multiple of 10
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (java.io.IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        submultiple10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compareshapeActionPerformed(evt);
            }
        });
        getContentPane().add(submultiple10);// placement on to the jframe
        submultiple10.setBounds(700, 390, 240, 150);//button size
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
            java.util.logging.Logger.getLogger(gradeonbasetenrecselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gradeonbasetenrecselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gradeonbasetenrecselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gradeonbasetenrecselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gradeonbasetenrecselect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Homebut;// variable creation
    private javax.swing.JButton twodigitplus10;// variable creation
    private javax.swing.JLabel back;// variable creation
    private javax.swing.JButton submultiple10;// variable creation
    private javax.swing.JLabel title;// variable creation
    private javax.swing.JButton count120;// variable creation
    // End of variables declaration//GEN-END:variables
}
