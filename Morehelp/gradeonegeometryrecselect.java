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
public class gradeonegeometryrecselect extends javax.swing.JFrame {


    public gradeonegeometryrecselect() {
        initComponents();
    }


    private void initComponents() {

        Homebut = new javax.swing.JButton();//button creation
        title = new javax.swing.JLabel();//label creation
        shapeattribute = new javax.swing.JButton();//button creation
        shapepartition = new javax.swing.JButton();//button creation
        back = new javax.swing.JLabel();//label creation

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 763));//jframe size
        setResizable(false);
        getContentPane().setLayout(null);

        Homebut.setText("Return to Homepage");//text
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
        getContentPane().add(Homebut);//add to the jframe
        Homebut.setBounds(180, 90, 630, 60);//placement and size

        title.setFont(new java.awt.Font("Tahoma", 0, 30)); // font size and style
        title.setForeground(new java.awt.Color(255, 255, 255));//font color
        title.setBackground(new java.awt.Color(139, 139, 139));//bg color
        title.setOpaque(true);//view bg color
        title.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border settings
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);//text properties
        title.setText("Recordings On First Grade Geometry");//text
        getContentPane().add(title);//add to the jframe
        title.setBounds(150, 180, 700, 60);//label size

        shapeattribute.setText("Ways to identify Shapes");//text
        shapeattribute.setBackground(new java.awt.Color(139, 139, 139));//bg color
        shapeattribute.setOpaque(true);//view bg color
        shapeattribute.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border settings
        shapeattribute.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/1stgradegeometry2.png")));//button icon
        shapeattribute.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text properties
        shapeattribute.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text properties
        shapeattribute.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {//open video when pressed
                try {
                    String url = "https://www.youtube.com/watch?v=p2ZvfL_x_WE"; // open this video on shape attributes
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (java.io.IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        getContentPane().add(shapeattribute);//add to the frame
        shapeattribute.setBounds(180, 390, 240, 150);//placement and size

        shapepartition.setText("Breaking up the Shapes");//text
        shapepartition.setBackground(new java.awt.Color(139, 139, 139));//bg color
        shapepartition.setOpaque(true);//view bg color
        shapepartition.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border settings
        shapepartition.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/1stgradegeometry.png")));//button icon
        shapepartition.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text properties
        shapepartition.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text properties
        shapepartition.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {//open video when pressed
                try {
                    String url = "https://www.youtube.com/watch?v=OmI7ymbSjRk"; // open this video shape partitioning
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (java.io.IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        getContentPane().add(shapepartition);//add to the frame
        shapepartition.setBounds(580, 390, 240, 150);//placement and size
        getContentPane().add(back);//add to the frame
        back.setBounds(0, 0, 1020, 760);//placement and size
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/background.jpg")));//icon used as a background for the frame

        pack();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gradeonegeometryrecselect().setVisible(true);
            }
        });
    }


    private javax.swing.JButton Homebut;
    private javax.swing.JLabel back;
    private javax.swing.JButton shapepartition;
    private javax.swing.JLabel title;
    private javax.swing.JButton shapeattribute;

}
