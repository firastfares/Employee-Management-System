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
public class Moreproblemone extends javax.swing.JFrame {

    public Moreproblemone() {
        initComponents();
    }


    private void initComponents() {

        Homebut = new javax.swing.JButton();//button creation
        title = new javax.swing.JLabel();//label creation
        geometry = new javax.swing.JButton();//button creation
        baseten = new javax.swing.JButton();//button creation
        algebraic = new javax.swing.JButton();//button creation
        logo = new javax.swing.JLabel();//label creation
        back = new javax.swing.JLabel();//background label creation

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1024, 763));//frame size
        setResizable(false);
        getContentPane().setLayout(null);

        Homebut.setText("Return to Homepage");//text
        Homebut.setBackground(new Color(139, 139, 139));//bg color
        Homebut.setOpaque(true);//view bg color
        Homebut.setFont(new Font("Impact", 0, 18)); // font style and size
        Homebut.setBorder(new javax.swing.border.LineBorder(new Color(64, 121, 126), 10, true));//border setting
        Homebut.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {//open home
                homepagev2 homepagev2 = new homepagev2();
                homepagev2.setVisible(true);
                setVisible(false);//close grade select

            }
        });
        getContentPane().add(Homebut);//place on to frame
        Homebut.setBounds(180, 90, 630, 60);//placement and size

        title.setFont(new Font("Tahoma", 0, 30)); // font style and size
        title.setForeground(new Color(255, 255, 255));//font color
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);//text setting
        title.setBackground(new Color(139, 139, 139));//bg color
        title.setOpaque(true);//veiw bg color
        title.setBorder(new javax.swing.border.LineBorder(new Color(64, 121, 126), 10, true));//border settings
        title.setText("More Problems First Grade");//text
        getContentPane().add(title);//add to the frame
        title.setBounds(250, 175, 500, 60);//placement and size

        geometry.setText("Geometry");//text
        geometry.setBackground(new Color(139, 139, 139));//bg color
        geometry.setOpaque(true);//view bg color
        geometry.setFont(new Font("Impact", 0, 18)); // font size and style
        geometry.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/moreproblemsgeo.png")));//icon for button
        geometry.setBorder(new javax.swing.border.LineBorder(new Color(64, 121, 126), 10, true));//border settings
        geometry.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text settings
        geometry.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text settings
        geometry.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {// open webpage when clicked on
                try {
                    String url = "https://www.education.com/worksheets/first-grade/geometry/"; // open and another kids math app.
                    Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (java.io.IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        getContentPane().add(geometry);// add to the frame
        geometry.setBounds(190, 240, 240, 150);//placement and size

        baseten.setText("Base Ten");//text
        baseten.setBackground(new Color(139, 139, 139));//bg color
        baseten.setOpaque(true);//view bg color
        baseten.setFont(new Font("Impact", 0, 18)); // font size and style
        baseten.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/moreproblemsbaseten.png")));//button icon
        baseten.setBorder(new javax.swing.border.LineBorder(new Color(64, 121, 126), 10, true));//border settings
        baseten.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text setting
        baseten.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text setting
        baseten.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {// open webpage when clicked on
                try {
                    String url = "https://www.khanacademy.org/math/cc-1st-grade-math/cc-1st-place-value"; // open and another kids math app.
                    Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (java.io.IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        getContentPane().add(baseten);//add to the frame
        baseten.setBounds(370, 440, 240, 150);//placement and size

        algebraic.setText("Addition and Subtraction");//text
        algebraic.setBackground(new Color(139, 139, 139));//bg color
        algebraic.setOpaque(true);//view bg color
        algebraic.setFont(new Font("Impact", 0, 18)); // font size and style
        algebraic.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/2ndgradealgebraic.png")));//button icon
        algebraic.setBorder(new javax.swing.border.LineBorder(new Color(64, 121, 126), 10, true));//border setting
        algebraic.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text setting
        algebraic.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text setting
        algebraic.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {// open webpage when clicked on
                try {
                    String url = "https://www.khanacademy.org/math/cc-1st-grade-math/cc-1st-add-subtract"; // open and another kids math app.
                    Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (java.io.IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        getContentPane().add(algebraic);//add on to the frame
        algebraic.setBounds(560, 240, 240, 150);//placement and size
        getContentPane().add(logo);//add on the frame
        logo.setBounds(20, 20, 130, 130);//placement and size
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/Numbercruncherslogo.png")));//icon for the logo
        getContentPane().add(back);//add on the frame
        back.setBounds(0, 0, 1020, 760);//placement and size
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/background.jpg")));//icon used as the background

        pack();
    }



    private void videosbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_videosbutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_videosbutActionPerformed

    private void questionsbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionsbutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questionsbutActionPerformed

    private void moreprobbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moreprobbutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moreprobbutActionPerformed


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Moreproblemone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Moreproblemone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Moreproblemone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Moreproblemone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Moreproblemone().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Homebut;//variable creation
    private javax.swing.JLabel back;//variable creation
    private javax.swing.JButton geometry;//variable creation
    private javax.swing.JButton baseten;//variable creation
    private javax.swing.JLabel title;//variable creation
    private javax.swing.JButton algebraic;//variable creation
    private javax.swing.JLabel logo;//variable creation
    // End of variables declaration//GEN-END:variables
}
