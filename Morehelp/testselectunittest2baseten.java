package phase3;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author John Legg
 */
public class testselectunittest2baseten extends JFrame {


    public testselectunittest2baseten() {
        initComponents();
    }



    private void initComponents() {

        Homebut = new JButton();//button creation
        title = new JLabel();//label creation
        easy = new JButton();//button creation
        hard = new JButton();//button creation
        back = new JLabel();//label creation
        logo = new JLabel();//label creation

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1024, 763));
        setSize(new Dimension(1024, 763));//size of the frame
        getContentPane().setLayout(null);

        Homebut.setText("Return to Homepage");//button text
        Homebut.setFont(new Font("Impact", 0, 36));//font size and style
        Homebut.setBackground(new Color(139, 139, 139));//bg color
        Homebut.setOpaque(true);//view bg color
        Homebut.setBorder(new LineBorder(new Color(64, 121, 126), 10, true));//border settings
        Homebut.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {//open home
                homepagev2 homepagev2 = new homepagev2();
                homepagev2.setVisible(true);
                setVisible(false);//close unit select

            }
        });
        getContentPane().add(Homebut); //add on to the frame
        Homebut.setBounds(310, 50, 410, 60);//placement and size

        title.setFont(new Font("Tahoma", 0, 30)); // font size and style
        title.setForeground(new Color(255, 255, 255));//font color
        title.setBackground(new Color(139, 139, 139));//bg color
        title.setOpaque(true);//view bg color
        title.setBorder(new LineBorder(new Color(64, 121, 126), 10, true));//border settings
        title.setHorizontalAlignment(SwingConstants.CENTER);//text properties
        title.setText("2nd Grade Base Ten Tests");//text
        getContentPane().add(title);//add on to the frame
        title.setBounds(260, 150, 500, 60);//placement and size

        easy.setFont(new Font("Tahoma", 1, 11));// font size and style
        easy.setText("Easy Test");//text
        easy.setBackground(new Color(139, 139, 139));//bg color
        easy.setOpaque(true);//view bg color
        easy.setBorder(new LineBorder(new Color(64, 121, 126), 10, true));//border settigns
        easy.setIcon(new ImageIcon(getClass().getResource("Images/easy.png")));//button icon
        easy.setHorizontalTextPosition(SwingConstants.CENTER);//text properties
        easy.setVerticalTextPosition(SwingConstants.TOP);//text properties
        easy.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {//open test
                gradetwobasetenunittesteasy gradetwobasetenunittesteasy = new gradetwobasetenunittesteasy();
                gradetwobasetenunittesteasy.setVisible(true);
                setVisible(false);//close unit select

            }
        });
        getContentPane().add(easy);//add on to the frame
        easy.setBounds(320, 290, 190, 150);//placement and size

        hard.setText("Hard test");//text
        hard.setFont(new Font("Tahoma", 1, 11)); // font size and style
        hard.setBackground(new Color(139, 139, 139));//bg color
        hard.setOpaque(true);//view bg color
        hard.setBorder(new LineBorder(new Color(64, 121, 126), 10, true));//border settigns
        hard.setIcon(new ImageIcon(getClass().getResource("Images/hard.png")));//button icon
        hard.setHorizontalTextPosition(SwingConstants.CENTER);//text properties
        hard.setVerticalTextPosition(SwingConstants.TOP);//text properties
        hard.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {//open test
                gradetwobasetenunittesthard gradetwobasetenunittesthard = new gradetwobasetenunittesthard();
                gradetwobasetenunittesthard.setVisible(true);
                setVisible(false);//close unit select

            }
        });
        getContentPane().add(hard);//add on to the frame
        hard.setBounds(540, 290, 190, 150);//placement and size

        getContentPane().add(logo);//add on to the frame
        logo.setBounds(20, 20, 130, 130);//placement and size
        logo.setIcon(new ImageIcon(getClass().getResource("Images/Numbercruncherslogo.png")));//logo icon
        getContentPane().add(back);//add on to the frame
        back.setBounds(0, 20, 1020, 760);//placement and size
        back.setIcon(new ImageIcon(getClass().getResource("Images/background.jpg")));//icon image used as the background for the frame

        pack();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(testselectunittest2baseten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(testselectunittest2baseten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(testselectunittest2baseten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(testselectunittest2baseten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new testselectunittest2baseten().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton hard;//variable creation
    private JButton Homebut;//variable creation
    private JLabel back;//variable creation
    private JButton easy;//variable creation
    private JLabel title;//variable creation
    private JLabel logo;//variable creation
    // End of variables declaration//GEN-END:variables
}
