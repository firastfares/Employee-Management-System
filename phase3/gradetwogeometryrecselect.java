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
public class gradetwogeometryrecselect extends javax.swing.JFrame {


    public gradetwogeometryrecselect() {
        initComponents();
    }


    private void initComponents() {

        Homebut = new javax.swing.JButton();//button creation
        title = new javax.swing.JLabel();//label creation
        shapeface = new javax.swing.JButton();//button creation
        rowandcolumns = new javax.swing.JButton();//button creation
        back = new javax.swing.JLabel();//label creation

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 763));//jframe size
        setResizable(false);
        getContentPane().setLayout(null);

        Homebut.setText("Return to Homepage");//text of button
        Homebut.setFont(new java.awt.Font("Impact", 0, 36));//font and font size
        Homebut.setBackground(new java.awt.Color(139, 139, 139));// bg color
        Homebut.setOpaque(true);// view bg color
        Homebut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));// border settings
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
        getContentPane().add(Homebut);// add to the jframe
        Homebut.setBounds(180, 90, 630, 60);//placement and size

        title.setFont(new java.awt.Font("Tahoma", 0, 30)); // font size and type
        title.setForeground(new java.awt.Color(255, 255, 255));//font color
        title.setBackground(new java.awt.Color(139, 139, 139));// bg color
        title.setOpaque(true);//view bg color
        title.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border settings
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);//text properties
        title.setText("Recordings On Second Grade Geometry");//text
        getContentPane().add(title);//add to the jframe
        title.setBounds(150, 180, 700, 60);//label size

        shapeface.setText("Count the faces on a shape");//text
        shapeface.setBackground(new java.awt.Color(139, 139, 139));//bg color
        shapeface.setOpaque(true);//view bg color
        shapeface.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border settings
        shapeface.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/2ndgradegeometry.png")));//button icon
        shapeface.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text properties
        shapeface.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text properties
        shapeface.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {//open video when button is clicked
                try {
                    String url = "https://www.youtube.com/watch?v=RgWKM-e9fWQ"; // open this video on recognizing a shape by number of faces
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (java.io.IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        getContentPane().add(shapeface);// add to the jframe
        shapeface.setBounds(180, 390, 240, 150);//placement and size

        rowandcolumns.setText("Rows and Columns");// text
        rowandcolumns.setBackground(new java.awt.Color(139, 139, 139));// bg color
        rowandcolumns.setOpaque(true);// view bg color
        rowandcolumns.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border settings
        rowandcolumns.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/2ndgradegeometry2.png")));//button icon
        rowandcolumns.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text properties
        rowandcolumns.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text properties
        rowandcolumns.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {//open video on browser
                try {
                    String url = "https://www.youtube.com/watch?v=tGDfRS_czZk"; // open this video on row and columns
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (java.io.IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        getContentPane().add(rowandcolumns);// add to the jframe
        rowandcolumns.setBounds(580, 390, 240, 150);//placement and size
        getContentPane().add(back);// add to the jframe
        back.setBounds(0, 0, 1020, 760);//placement and size
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/background.jpg")));//icon image use the background

        pack();// pack on the jframe
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gradetwogeometryrecselect().setVisible(true);
            }//run the form to display the jframe
        });
    }


    private javax.swing.JButton Homebut;//variable creation
    private javax.swing.JLabel back;//variable creation
    private javax.swing.JButton rowandcolumns;//variable creation
    private javax.swing.JLabel title;//variable creation
    private javax.swing.JButton shapeface;//variable creation

}
