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
public class unitselectvideogone extends JFrame {


    public unitselectvideogone() {
        initComponents();
    }



    private void initComponents() {

        Homebut = new JButton();//button creation
        title = new JLabel();//label creation
        geometry = new JButton();//button creation
        Algebraic = new JButton();//button creation
        baseten = new JButton();//button creation
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
            public void mousePressed(MouseEvent evt) {//open unit home
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
        title.setText("Grade 1 Select Unit a to Watch");//text
        getContentPane().add(title);//add on to the frame
        title.setBounds(260, 150, 500, 60);//placement and size

        geometry.setFont(new Font("Tahoma", 1, 11));// font size and style
        geometry.setText("Unit One: Geometry");//text
        geometry.setBackground(new Color(139, 139, 139));//bg color
        geometry.setOpaque(true);//view bg color
        geometry.setBorder(new LineBorder(new Color(64, 121, 126), 10, true));//border settigns
        geometry.setIcon(new ImageIcon(getClass().getResource("Images/kidergeometry.png")));//button icon
        geometry.setHorizontalTextPosition(SwingConstants.CENTER);//text properties
        geometry.setVerticalTextPosition(SwingConstants.TOP);//text properties
        geometry.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {//open video
                try {
                    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                            javax.swing.UIManager.setLookAndFeel(info.getClassName());
                            break;
                        }
                    }
                } catch (ClassNotFoundException ex) {
                    java.util.logging.Logger.getLogger( gradeonegeometryvidselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    java.util.logging.Logger.getLogger( gradeonegeometryvidselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    java.util.logging.Logger.getLogger( gradeonegeometryvidselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                    java.util.logging.Logger.getLogger( gradeonegeometryvidselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                gradeonegeometryvidselect gradeonegeometryvidselect = new gradeonegeometryvidselect();
                gradeonegeometryvidselect.setVisible(true);
                setVisible(false);//close unit select

            }
        });
        getContentPane().add(geometry);//add on to the frame
        geometry.setBounds(320, 290, 190, 150);//placement and size

        Algebraic.setText("Unit Two: Operations");//text
        Algebraic.setFont(new Font("Tahoma", 1, 11)); // font size and style
        Algebraic.setBackground(new Color(139, 139, 139));//bg color
        Algebraic.setOpaque(true);//view bg color
        Algebraic.setBorder(new LineBorder(new Color(64, 121, 126), 10, true));//border settigns
        Algebraic.setIcon(new ImageIcon(getClass().getResource("Images/kideralgebraic.png")));//button icon
        Algebraic.setHorizontalTextPosition(SwingConstants.CENTER);//text properties
        Algebraic.setVerticalTextPosition(SwingConstants.TOP);//text properties
        Algebraic.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {//open video
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
                gradeonealgebraicvidselect gradeonealgebraicvidselect = new gradeonealgebraicvidselect();
                gradeonealgebraicvidselect.setVisible(true);
                setVisible(false);//close unit select

            }
        });
        getContentPane().add(Algebraic);//add on to the frame
        Algebraic.setBounds(540, 290, 190, 150);//placement and size

        baseten.setFont(new Font("Tahoma", 1, 11)); // font size and style
        baseten.setText("Unit Three: Base Ten");//text
        baseten.setBackground(new Color(139, 139, 139));//bg color
        baseten.setOpaque(true);//view bg color
        baseten.setBorder(new LineBorder(new Color(64, 121, 126), 10, true));//border settigns
        baseten.setIcon(new ImageIcon(getClass().getResource("Images/kiderbaseten.png")));//button icon
        baseten.setHorizontalTextPosition(SwingConstants.CENTER);//text properties
        baseten.setVerticalTextPosition(SwingConstants.TOP);//text properties
        baseten.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {//open video
                try {
                    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                            javax.swing.UIManager.setLookAndFeel(info.getClassName());
                            break;
                        }
                    }
                } catch (ClassNotFoundException ex) {
                    java.util.logging.Logger.getLogger(gradeonbasetenvidselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    java.util.logging.Logger.getLogger(gradeonbasetenvidselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    java.util.logging.Logger.getLogger(gradeonbasetenvidselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                    java.util.logging.Logger.getLogger(gradeonbasetenvidselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                gradeonbasetenvidselect gradeonebasetenvidselect = new gradeonbasetenvidselect();
                gradeonebasetenvidselect.setVisible(true);
                setVisible(false);//close unit select

            }
        });
        getContentPane().add(baseten);//add on to the frame
        baseten.setBounds(430, 460, 190, 150);//placement and size
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
            java.util.logging.Logger.getLogger(unitselectvideogone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(unitselectvideogone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(unitselectvideogone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(unitselectvideogone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new unitselectvideogone().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton Algebraic;//variable creation
    private JButton Homebut;//variable creation
    private JLabel back;//variable creation
    private JButton baseten;//variable creation
    private JButton geometry;//variable creation
    private JLabel title;//variable creation
    private JLabel logo;//variable creation
    // End of variables declaration//GEN-END:variables
}
