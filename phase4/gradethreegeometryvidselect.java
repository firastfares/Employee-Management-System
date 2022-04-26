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
public class gradethreegeometryvidselect extends javax.swing.JFrame {


    public gradethreegeometryvidselect() {
        initComponents();
    }


    private void initComponents() {

        Homebut = new javax.swing.JButton();//button creation
        title = new javax.swing.JLabel();//label creation
        shapecategories = new javax.swing.JButton();//button creation
        shapefractions = new javax.swing.JButton();//button creation
        back = new javax.swing.JLabel();//label creation

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 763));// size of jframe
        setResizable(false);
        getContentPane().setLayout(null);

        Homebut.setText("Return to Homepage");//button text
        Homebut.setFont(new java.awt.Font("Impact", 0, 36));//font size and style
        Homebut.setBackground(new java.awt.Color(139, 139, 139));//bg color
        Homebut.setOpaque(true);//view bg
        Homebut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border settings
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
        getContentPane().add(Homebut);//add to the jframe
        Homebut.setBounds(180, 90, 630, 60);//placement on the jframe and size

        title.setFont(new java.awt.Font("Tahoma", 0, 30)); // font size and style
        title.setForeground(new java.awt.Color(255, 255, 255));//font color
        title.setBackground(new java.awt.Color(139, 139, 139));//bg color
        title.setOpaque(true);//view bg color
        title.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border settings
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);//text properties
        title.setText("Videos On Third Grade Geometry");//text
        getContentPane().add(title);// add to jframe
        title.setBounds(260, 180, 500, 60);// placement and size

        shapecategories.setText("Shape Categories");//text
        shapecategories.setBackground(new java.awt.Color(139, 139, 139));//bg color
        shapecategories.setOpaque(true);//view bg color
        shapecategories.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border settings
        shapecategories.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/3rdgradegeometry.png")));//button icon
        shapecategories.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text placement
        shapecategories.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text placement
        shapecategories.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {//open video when clicked
                try {
                    String url = "https://www.youtube.com/watch?v=0hZ5-_bzz2Q"; // open this video on shape categories
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (java.io.IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        getContentPane().add(shapecategories);// add to the jframe
        shapecategories.setBounds(180, 390, 240, 150);//placement and size

        shapefractions.setText("Factions on Shapes");//text
        shapefractions.setBackground(new java.awt.Color(139, 139, 139));//bg color
        shapefractions.setOpaque(true);//view bg color
        shapefractions.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border settings
        shapefractions.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/3rdgradegeometry2.png")));//button icon
        shapefractions.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text property
        shapefractions.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text property
        shapefractions.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {//open video when pressed
                try {
                    String url = "https://www.youtube.com/watch?v=jgWqSjgMAtw"; // open this video shape fractions
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (java.io.IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        getContentPane().add(shapefractions);// place jframe
        shapefractions.setBounds(580, 390, 240, 150);//placement and size
        getContentPane().add(back);//place jframe
        back.setBounds(0, 0, 1020, 760);//placement and size
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/background.jpg")));//icon use as background image

        pack();// button and labels placed.
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gradethreegeometryvidselect().setVisible(true);
            }//run form and display the frame
        });
    }


    private javax.swing.JButton Homebut;//variable creation
    private javax.swing.JLabel back;//variable creation
    private javax.swing.JButton shapefractions;//variable creation
    private javax.swing.JLabel title;//variable creation
    private javax.swing.JButton shapecategories;//variable creation

}
