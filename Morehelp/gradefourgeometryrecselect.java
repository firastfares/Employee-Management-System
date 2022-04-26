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
public class gradefourgeometryrecselect extends javax.swing.JFrame {


    public gradefourgeometryrecselect() {
        initComponents();
    }


    private void initComponents() {

        Homebut = new javax.swing.JButton();//button creation
        title = new javax.swing.JLabel();//label creation
        whatareangles = new javax.swing.JButton();//button creation
        shapeidentifcation = new javax.swing.JButton();//button creation
        back = new javax.swing.JLabel();//label creation

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 763));//jframe size
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
        getContentPane().add(Homebut);//place on jframe
        Homebut.setBounds(180, 90, 630, 60);//placement and size

        title.setFont(new java.awt.Font("Tahoma", 0, 30)); // font size and style
        title.setForeground(new java.awt.Color(255, 255, 255));//font color
        title.setBackground(new java.awt.Color(139, 139, 139));//bg color
        title.setOpaque(true);//view bg color
        title.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border settings
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);//text properties
        title.setText("Recordings On Fourth Grade Geometry");//text
        getContentPane().add(title);//add to the frame
        title.setBounds(150, 180, 700, 60);//label size

        whatareangles.setText("What are angles?");//text
        whatareangles.setBackground(new java.awt.Color(139, 139, 139));//bg color
        whatareangles.setOpaque(true);//view bg color
        whatareangles.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border settigns
        whatareangles.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/4thgradegeometry.png")));//button icon
        whatareangles.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text properties
        whatareangles.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text properties
        whatareangles.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {//open video when pressed
                try {
                    String url = "https://www.youtube.com/watch?v=9O7D-YiSxOo"; // open this video on angles
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (java.io.IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        getContentPane().add(whatareangles);//place on jframe
        whatareangles.setBounds(180, 390, 240, 150);//placement and size

        shapeidentifcation.setText("Breaking up the Shapes");//text
        shapeidentifcation.setBackground(new java.awt.Color(139, 139, 139));//bg color
        shapeidentifcation.setOpaque(true);//view bg color
        shapeidentifcation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border settings
        shapeidentifcation.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/4thgradegeometry2.png")));//button icon
        shapeidentifcation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text properties
        shapeidentifcation.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text properties
        shapeidentifcation.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {//open the video when pressed
                try {
                    String url = "https://www.youtube.com/watch?v=KkG_9KBWctk"; // open this video shape identification base lines and angles
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (java.io.IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        getContentPane().add(shapeidentifcation);//add to the jframe
        shapeidentifcation.setBounds(580, 390, 240, 150);//placement and size
        getContentPane().add(back);//add to the jframe
        back.setBounds(0, 0, 1020, 760);//placement and size
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/background.jpg")));//icon image used as the background for the frame

        pack();//pack all the button and labels on the jframe
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gradefourgeometryrecselect().setVisible(true);
            }//run the form and display the frame
        });
    }


    private javax.swing.JButton Homebut;//variable creation
    private javax.swing.JLabel back;//variable creation
    private javax.swing.JButton shapeidentifcation;//variable creation
    private javax.swing.JLabel title;//variable creation
    private javax.swing.JButton whatareangles;//variable creation


}
