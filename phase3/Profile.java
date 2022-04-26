package phase3;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author John Legg and Firas
 */
public class Profile extends JFrame {

    private int result,count,result1;
    private int resulttest,counttest,resulttest1,total;
    private int stars,starstest;


    public Profile() {
        initComponents();
    }


    private void initComponents() {



        logo = new JLabel();//label creation
        hline1 = new JLabel();//label creation
        vline1 = new JLabel();//label creation
        hline2 = new JLabel();//label creation
        back = new JLabel();//label creation
        user = new JLabel();//label creation
        myrewards = new JButton();//label creation
        stars10 = new JLabel();//label creation
        stars20 = new JLabel();//label creation
        stars30 = new JLabel();//label creation
        stars40 = new JLabel();//label creation
        stars50 = new JLabel();//label creation
        stars60 = new JLabel();//label creation
        stars70 = new JLabel();//label creation
        stars80 = new JLabel();//label creation
        stars90 = new JLabel();//label creation
        stars100 = new JLabel();//label creation
        rewardsinfo = new JButton();// button creation
        myclass = new JButton();//label creation
        active = new JPanel();//label creation
        classname = new JLabel();//label creation
        grade2 = new JLabel();//label creation
        instructorname = new JLabel();//label creation
        activity2 = new JLabel();//label creation
        inactive = new JPanel();//label creation
        classname1 = new JLabel();//label creation
        instructorname2 = new JLabel();//label creation
        activity = new JLabel();//label creation
        grade1 = new JLabel();//label creation
        Homebut = new JButton();// button creation

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1024, 763));//set size
        setSize(new Dimension(1024, 763));//size of frame
        setResizable(false);
        getContentPane().setLayout(null);

        logo.setIcon(new ImageIcon(getClass().getResource("Images/Numbercruncherslogosmall.png")));//logo icon
        getContentPane().add(logo);
        logo.setBounds(20, 20, 80, 60);

        Homebut.setText("Return to Homepage");//button text
        Homebut.setFont(new Font("Impact", 0, 30));//font size and style
        Homebut.setBackground(new Color(139, 139, 139));//bg color
        Homebut.setOpaque(true);//view bg color
        Homebut.setBorder(new LineBorder(new Color(64, 121, 126), 10, true));//border settings
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
        getContentPane().add(Homebut);//placement of button
        Homebut.setBounds(250, 20, 400, 60);//button size

        hline1.setBackground(new Color(0, 0, 0));//bg color
        hline1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));//border setting
        hline1.setOpaque(true);//view bg color
        getContentPane().add(hline1);//add to the frame
        hline1.setBounds(0, 100, 1030, 10);//placement and size

        vline1.setBackground(new Color(0, 0, 0));//bg color
        vline1.setOpaque(true);//view bg color
        vline1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));//border setting
        getContentPane().add(vline1);//add to the frame
        vline1.setBounds(464, 100, 10, 670);//placement and size

        hline2.setBackground(new Color(0, 0, 0));//bg color
        hline2.setOpaque(true);//view bg color
        hline2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));//border setting
        getContentPane().add(hline2);//add to the frame
        hline2.setBounds(0, 210, 1030, 10);//placement and size

        user.setFont(new Font("Tahoma", 0, 30)); // font size and style
        user.setText("Hi, "+login.getdata[0]);//text
        user.setForeground(new Color(255, 255, 255));//font color
        user.setBackground(new Color(139, 139, 139));//bg color
        user.setOpaque(true);//view bg color
        user.setBorder(new LineBorder(new Color(64, 121, 126), 10, true));//border settings
        user.setHorizontalAlignment(SwingConstants.CENTER);//text placement
        getContentPane().add(user);// add to the frame
        user.setBounds(670, 20, 180, 60);//placement and size

        myrewards.setFont(new Font("Tahoma", 0, 30)); // font size and style
        myrewards.setForeground(new Color(255, 255, 255));//font color
        myrewards.setBackground(new Color(139, 139, 139));//bg color
        myrewards.setOpaque(true);//view bg color
        myrewards.setBorder(new LineBorder(new Color(64, 121, 126), 10, true));//border settings
        myrewards.setHorizontalAlignment(SwingConstants.CENTER);//text placement
        myrewards.setText("My Rewards");//text
        getContentPane().add(myrewards);//add to the frame
        myrewards.setBounds(620, 140, 240, 55);//placement and size
        myrewards.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                PreparedStatement ps; ResultSet rs;
                Myconnection conn = new Myconnection();//connect
                String uname = login.getdata[0];//set username from field
                Statement st ;

                String query="SELECT k1practice, k2practice,k3practice ,1g1practice ,1g2practice ,1g3practice,2g1practice\n" +
                        " ,2g2practice ,2g3practice,3g1practice ,3g2practice , 3g3practice,4g1practice ,4g2practice ,4g3practice\n" +
                        " ,k1test,k2test,k3test,1g1test,1g2test,1g3test,2g1test,2g2test,2g3test,"+
                        "  3g1test,3g2test,3g3test,4g1test,4g2test,4g3test \n"+
                        ",k1testhard,k2testhard,k3testhard,1g1testhard,1g2testhard,1g3testhard,2g1testhard,2g2testhard,2g3testhard,"+
                        "  3g1testhard,3g2testhard,3g3testhard,4g1testhard,4g2testhard,4g3testhard FROM numbercruncher.practice_test_grade where student_uname='"+login.getdata[0]+"'";
                try {

                    st = conn.getconnection().createStatement();//call the query

                    rs = st.executeQuery(query);//execute

                    while(rs.next()) {


                        for (int i = 1; i <= 15; i++) {
                            if (rs.getInt(i) >=80) {
                                stars++;//check when his grade is greater then 80 in practice test and add one star
                            }
                        }
                        for (int i = 16; i <= 30; i++) {
                            if (rs.getInt(i) >=80) {
                                starstest+=3;//check when his grade is greater then 80 in easy test and add 3 stars
                            }
                        }

                        for (int i = 31; i <= 45; i++) {
                            if (rs.getInt(i) >=80) {
                                starstest+=5;//check when his grade is greater then 80 in hard unit test and add one stars
                            }
                        }

                        //printing the unit test result
                        JOptionPane.showMessageDialog(null, ""
                                +"Your practice test rewards are : "+stars+" Stars\n"
                                +"Your unit test rewards are : "+starstest+"  Stars\n"
                                +"Your total stars is : "+(starstest+stars)+"  Stars");
                        stars=stars+starstest;
                        if (stars<10){
                            stars10.setIcon(null);
                            stars20.setIcon(null);
                            stars30.setIcon(null);
                            stars40.setIcon(null);
                            stars50.setIcon(null);
                            stars60.setIcon(null);
                            stars70.setIcon(null);
                            stars80.setIcon(null);
                            stars90.setIcon(null);
                            stars100.setIcon(null);
                        }
                        if (stars>=10&&stars<20) {

                            stars20.setIcon(null);
                            stars30.setIcon(null);
                            stars40.setIcon(null);
                            stars50.setIcon(null);
                            stars60.setIcon(null);
                            stars70.setIcon(null);
                            stars80.setIcon(null);
                            stars90.setIcon(null);
                            stars100.setIcon(null);
                        }if (stars>=20&&stars<30) {


                            stars30.setIcon(null);
                            stars40.setIcon(null);
                            stars50.setIcon(null);
                            stars60.setIcon(null);
                            stars70.setIcon(null);
                            stars80.setIcon(null);
                            stars90.setIcon(null);
                            stars100.setIcon(null);
                        }
                        if (stars>=30&&stars<40){

                            stars40.setIcon(null);
                            stars50.setIcon(null);
                            stars60.setIcon(null);
                            stars70.setIcon(null);
                            stars80.setIcon(null);
                            stars90.setIcon(null);
                            stars100.setIcon(null);
                        }
                        if (stars>=40&&stars<50){

                            stars50.setIcon(null);
                            stars60.setIcon(null);
                            stars70.setIcon(null);
                            stars80.setIcon(null);
                            stars90.setIcon(null);
                            stars100.setIcon(null);
                        }
                        if (stars>=50&&stars<60){
                            stars60.setIcon(null);
                            stars70.setIcon(null);
                            stars80.setIcon(null);
                            stars90.setIcon(null);
                            stars100.setIcon(null);
                        }
                        if (stars>=60&&stars<70){

                            stars70.setIcon(null);
                            stars80.setIcon(null);
                            stars90.setIcon(null);
                            stars100.setIcon(null);
                        }
                        if (stars>=70&&stars<80){

                            stars80.setIcon(null);
                            stars90.setIcon(null);
                            stars100.setIcon(null);
                        }
                        if (stars>=80&&stars<90){
                            stars90.setIcon(null);
                            stars100.setIcon(null);
                        }
                        if (stars>=90&&stars<100){
                            stars100.setIcon(null);

                        }
                    }
                    stars=0;
                    starstest=0;



                }catch (SQLException ex) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex); }
            }
        });
        stars10.setFont(new Font("Tahoma", 1, 14)); // font size and style
        stars10.setHorizontalAlignment(SwingConstants.CENTER);//text setting
        stars10.setText("10 Stars");//text
        stars10.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255),4));//border setting
        stars10.setBackground(new Color(139, 139, 139));//bg color
        stars10.setOpaque(true);//view bg color
        stars10.setIcon(new ImageIcon(getClass().getResource("Images/star10-50.png")));//logo icon
        stars10.setHorizontalTextPosition(SwingConstants.CENTER);//text setting
        stars10.setVerticalTextPosition(SwingConstants.BOTTOM);//text setting
        getContentPane().add(stars10);//add to a frame
        stars10.setBounds(610, 290, 80, 84);//placement and size

        stars20.setFont(new Font("Tahoma", 1, 14)); // font size and style
        stars20.setHorizontalAlignment(SwingConstants.CENTER);//text setting
        stars20.setText("20 Stars");//text
        stars20.setBackground(new Color(139, 139, 139));//bg color
        stars20.setOpaque(true);//view bg color
        stars20.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255),4));
        stars20.setIcon(new ImageIcon(getClass().getResource("Images/star10-50.png")));//logo icon
        stars20.setHorizontalTextPosition(SwingConstants.CENTER);//text setting
        stars20.setVerticalTextPosition(SwingConstants.BOTTOM);//text setting
        getContentPane().add(stars20);//add on to the frame
        stars20.setBounds(710, 290, 80, 84);//placement and size

        stars30.setFont(new Font("Tahoma", 1, 14)); // font size and style
        stars30.setHorizontalAlignment(SwingConstants.CENTER);//text setting
        stars30.setText("30 Stars");//text
        stars30.setBackground(new Color(139, 139, 139));//bg color
        stars30.setOpaque(true);//view bg color
        stars30.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255),4));//border setting
        stars30.setIcon(new ImageIcon(getClass().getResource("Images/star10-50.png")));//logo icon
        stars30.setHorizontalTextPosition(SwingConstants.CENTER);//text setting
        stars30.setVerticalTextPosition(SwingConstants.BOTTOM);//text setting
        getContentPane().add(stars30);//add on to the frame
        stars30.setBounds(810, 290, 80, 84);//placement and size

        stars40.setFont(new Font("Tahoma", 1, 14)); // font size and style
        stars40.setHorizontalAlignment(SwingConstants.CENTER);//text setting
        stars40.setText("40 Stars");//text
        stars40.setBackground(new Color(139, 139, 139));//bg color
        stars40.setOpaque(true);//view bg color
        stars40.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255),4));//border setting
        stars40.setIcon(new ImageIcon(getClass().getResource("Images/star10-50.png")));//logo icon
        stars40.setHorizontalTextPosition(SwingConstants.CENTER);//text setting
        stars40.setVerticalTextPosition(SwingConstants.BOTTOM);//text setting
        getContentPane().add(stars40);//add on to the frame
        stars40.setBounds(610, 400, 80, 84);//placement and size

        stars50.setFont(new Font("Tahoma", 1, 14)); // font size and style
        stars50.setHorizontalAlignment(SwingConstants.CENTER);//text setting
        stars50.setText("50 Stars");//text
        stars50.setBackground(new Color(139, 139, 139));//bg color
        stars50.setOpaque(true);//view bg color
        stars50.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255),4));//border settings
        stars50.setIcon(new ImageIcon(getClass().getResource("Images/star10-50.png")));//logo icon
        stars50.setHorizontalTextPosition(SwingConstants.CENTER);//text setting
        stars50.setVerticalTextPosition(SwingConstants.BOTTOM);//text setting
        getContentPane().add(stars50);//add on to the frame
        stars50.setBounds(710, 400, 80, 84);//placement and size

        stars60.setFont(new Font("Tahoma", 1, 14)); // font size and style
        stars60.setHorizontalAlignment(SwingConstants.CENTER);//text setting
        stars60.setText("60 Stars");//text
        stars60.setBackground(new Color(139, 139, 139));//bg color
        stars60.setOpaque(true);//view bg color
        stars60.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255),4));//border setting
        stars60.setIcon(new ImageIcon(getClass().getResource("Images/star60-90.png")));//logo icon
        stars60.setHorizontalTextPosition(SwingConstants.CENTER);//text setting
        stars60.setVerticalTextPosition(SwingConstants.BOTTOM);//text setting
        getContentPane().add(stars60);//add to the frame
        stars60.setBounds(810, 400, 80, 84);//placement and size

        stars70.setFont(new Font("Tahoma", 1, 14)); // font size and style
        stars70.setHorizontalAlignment(SwingConstants.CENTER);//text setting
        stars70.setText("70 Stars");//text
        stars70.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255),4));//border setting
        stars70.setBackground(new Color(139, 139, 139));//bg color
        stars70.setOpaque(true);//view bg color
        stars70.setIcon(new ImageIcon(getClass().getResource("Images/star60-90.png")));//logo icon
        stars70.setHorizontalTextPosition(SwingConstants.CENTER);//text setting
        stars70.setVerticalTextPosition(SwingConstants.BOTTOM);//text setting
        getContentPane().add(stars70);//add to the frame
        stars70.setBounds(610, 510, 80, 84);//placement and size

        stars80.setFont(new Font("Tahoma", 1, 14)); // font size and style
        stars80.setHorizontalAlignment(SwingConstants.CENTER);//text setting
        stars80.setText("80 Stars");//text
        stars80.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255),4));//border setting
        stars80.setBackground(new Color(139, 139, 139));//bg color
        stars80.setOpaque(true);//view bg color
        stars80.setIcon(new ImageIcon(getClass().getResource("Images/star60-90.png")));//logo icon
        stars80.setHorizontalTextPosition(SwingConstants.CENTER);//text setting
        stars80.setVerticalTextPosition(SwingConstants.BOTTOM);//text setting
        getContentPane().add(stars80);//add on to the frame
        stars80.setBounds(710, 510, 80, 84);//placement and size

        stars90.setFont(new Font("Tahoma", 1, 14)); // font size and style
        stars90.setHorizontalAlignment(SwingConstants.CENTER);//text setting
        stars90.setText("90 Stars");//text
        stars90.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255),4));//border setting
        stars90.setBackground(new Color(139, 139, 139));//bg color
        stars90.setOpaque(true);//view bg color
        stars90.setIcon(new ImageIcon(getClass().getResource("Images/star60-90.png")));//logo icon
        stars90.setHorizontalTextPosition(SwingConstants.CENTER);//text settinng
        stars90.setVerticalTextPosition(SwingConstants.BOTTOM);//text setting
        getContentPane().add(stars90);//add to the frame
        stars90.setBounds(810, 510, 80, 84);///placement and size

        stars100.setFont(new Font("Tahoma", 1, 14)); // font size and style
        stars100.setHorizontalAlignment(SwingConstants.CENTER);//text setting
        stars100.setText("100 Stars");//text
        stars100.setBorder(BorderFactory.createLineBorder(new Color(255, 215, 0),4));//border setting
        stars100.setBackground(new Color(139, 139, 139));//bg color
        stars100.setOpaque(true);//view bg color
        stars100.setIcon(new ImageIcon(getClass().getResource("Images/star100.png")));//logo icon
        stars100.setHorizontalTextPosition(SwingConstants.CENTER);//text setting
        stars100.setVerticalTextPosition(SwingConstants.BOTTOM);//text setting
        getContentPane().add(stars100);//add on to the frame
        stars100.setBounds(640, 620, 220, 84);//placement and size

        rewardsinfo.setIcon(new ImageIcon(getClass().getResource("Images/rewardinfo.png")));//logo icon
        rewardsinfo.setOpaque(false);//view bg color
        rewardsinfo.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {//open dialog box
                JOptionPane.showMessageDialog(null, "What are rewards? They are earned by the completion of a practice test or unit test.\n" +
                        "One star for a practice test with 80% or higher grade and three stars for a easy unit test with 80% or higher grade. Five stars for a hard unit test 80% or more.");

            }
        });
        getContentPane().add(rewardsinfo);//add on to the frame
        rewardsinfo.setBounds(890, 20, 60, 60);//placement and size

        myclass.setFont(new Font("Tahoma", 0, 30)); // font size and style
        myclass.setForeground(new Color(255, 255, 255));//font color
        myclass.setBackground(new Color(139, 139, 139));//bg color
        myclass.setOpaque(true);//view bg color
        myclass.setBorder(new LineBorder(new Color(64, 121, 126), 10, true));//border settings
        myclass.setHorizontalAlignment(SwingConstants.CENTER);//text placement
        myclass.setText("My Scores");//text
        getContentPane().add(myclass);//add to frame
        myclass.setBounds(20, 140, 200, 55);//placement and size

        myclass.addMouseListener(new MouseAdapter() {
                                     public void mousePressed(MouseEvent evt) {
                                         PreparedStatement ps; ResultSet rs;
                                         Myconnection conn = new Myconnection();//connect
                                         String uname = login.getdata[0];//set username from field
                                         Statement st ;

                                         String query="SELECT k1practice, k2practice,k3practice ,1g1practice ,1g2practice ,1g3practice,2g1practice\n" +
                                                 " ,2g2practice ,2g3practice,3g1practice ,3g2practice , 3g3practice,4g1practice ,4g2practice ,4g3practice\n" +
                                                 " ,k1test,k2test,k3test,1g1test,1g2test,1g3test,2g1test,2g2test,2g3test,"+
                                                 "  3g1test,3g2test,3g3test,4g1test,4g2test,4g3test \n"+
                                                 ",k1testhard,k2testhard,k3testhard,1g1testhard,1g2testhard,1g3testhard,2g1testhard,2g2testhard,2g3testhard,"+
                                                 "  3g1testhard,3g2testhard,3g3testhard,4g1testhard,4g2testhard,4g3testhard FROM numbercruncher.practice_test_grade where student_uname='"+login.getdata[0]+"'";//check username and pass in database

                                         try {

                                             st = conn.getconnection().createStatement();//call the query

                                             rs = st.executeQuery(query);//execute

                                             while(rs.next()) {

                                                int k1practice, k2practice,k3practice ,fg1practice ,fg2practice ,fg3practice,sg1practice
                                                 ,tg1practice ,tg2practice , tg3practice,fog1practice ,fog2practice ,fog3practice
                                                 ,sg2practice ,sg3practice;


                                                 k1practice = rs.getInt(1);
                                                 k2practice = rs.getInt(2);
                                                 k3practice = rs.getInt(3);
                                                 fg1practice = rs.getInt(4);
                                                 fg2practice = rs.getInt(5);
                                                 fg3practice = rs.getInt(6);
                                                 sg1practice = rs.getInt(7);
                                                 sg2practice = rs.getInt(8);
                                                 sg3practice = rs.getInt(9);
                                                 tg1practice = rs.getInt(10);
                                                 tg2practice = rs.getInt(11);
                                                 tg3practice = rs.getInt(12);
                                                 fog1practice = rs.getInt(13);
                                                 fog2practice = rs.getInt(14);
                                                 fog3practice = rs.getInt(15);
                                                 int k1test= rs.getInt(16);
                                                 int k2test= rs.getInt(17);
                                                 int k3test= rs.getInt(18);
                                                 int og1test = rs.getInt(19);
                                                 int og2test = rs.getInt(20);
                                                 int og3test = rs.getInt(21);
                                                 int tg1test = rs.getInt(22);
                                                 int tg2test = rs.getInt(23);
                                                 int tg3test = rs.getInt(24);
                                                 int thg1test = rs.getInt(25);
                                                 int thg2test = rs.getInt(26);
                                                 int thg3test = rs.getInt(27);
                                                 int fg1test = rs.getInt(29);
                                                 int fg2test = rs.getInt(29);
                                                 int fg3test = rs.getInt(30);
                                                 int k1testhard= rs.getInt(31);
                                                 int k2testhard= rs.getInt(32);
                                                 int k3testhard= rs.getInt(33);
                                                 int og1testhard = rs.getInt(34);
                                                 int og2testhard = rs.getInt(35);
                                                 int og3testhard = rs.getInt(36);
                                                 int tg1testhard = rs.getInt(37);
                                                 int tg2testhard = rs.getInt(38);
                                                 int tg3testhard = rs.getInt(39);
                                                 int thg1testhard = rs.getInt(40);
                                                 int thg2testhard = rs.getInt(41);
                                                 int thg3testhard = rs.getInt(42);
                                                 int fg1testhard = rs.getInt(43);
                                                 int fg2testhard = rs.getInt(44);
                                                 int fg3testhard = rs.getInt(45);


                                                //Printing the hard unit test
                                                 JOptionPane.showMessageDialog(null, "\n\n"
                                                         +"kindergarten unit test hard unit 1 score : "+k1testhard+"/100\n\n"
                                                         +"kindergarten unit test hard unit 2 score : "+k2testhard+"/100\n\n"
                                                         +"kindergarten unit test hard unit 3 score : "+k3testhard+"/100\n\n"
                                                         +"First  grade unit test hard unit 1 score : "+og1testhard+"/100\n\n"
                                                         +"First  grade unit test hard unit 2 score : "+og2testhard+"/100\n\n"
                                                         +"First  grade unit test hard unit 3 score : "+og3testhard+"/100\n\n"
                                                         +"Second grade unit test hard unit 1 score : "+tg1testhard+"/100\n\n"
                                                         +"Second grade unit test hard unit 2 score : "+tg2testhard+"/100\n\n"
                                                         +"Second grade unit test hard unit 3 score : "+tg3testhard+"/100\n\n"
                                                         +"Third  grade unit test hard unit 1 score : "+thg1testhard+"/100\n\n"
                                                         +"Third  grade unit test hard unit 2 score : "+thg2testhard+"/100\n\n"
                                                         +"Third  grade unit test hard unit 3 score : "+thg3testhard+"/100\n\n"
                                                         +"Fourth grade unit test hard unit 1 score : "+fg1testhard+"/100\n\n"
                                                         +"Fourth grade unit test hard unit 2 score : "+fg2testhard+"/100\n\n"
                                                         +"Fourth grade unit test hard unit 3 score : "+fg3testhard+"/100\n\n"
                                                         ,"                   Your Score For hard unit test",1



                                                 );

                                                 //printing the easy unit test result
                                                 JOptionPane.showMessageDialog(null, " \n\n"
                                                         +"kindergarten unit test easy unit 1 score : "+k1test+"/100\n\n"
                                                         +"kindergarten unit test easy unit 2 score : "+k2test+"/100\n\n"
                                                         +"kindergarten unit test easy unit 3 score : "+k3test+"/100\n\n"
                                                         +"First  grade unit test easy unit 1 score : "+og1test+"/100\n\n"
                                                         +"First  grade unit test easy unit 2 score : "+og2test+"/100\n\n"
                                                         +"First  grade unit test easy unit 3 score : "+og3test+"/100\n\n"
                                                         +"Second grade unit test easy unit 1 score : "+tg1test+"/100\n\n"
                                                         +"Second grade unit test easy unit 2 score : "+tg2test+"/100\n\n"
                                                         +"Second grade unit test easy unit 3 score : "+tg3test+"/100\n\n"
                                                         +"Third  grade unit test easy unit 1 score : "+thg1test+"/100\n\n"
                                                         +"Third  grade unit test easy unit 2 score : "+thg2test+"/100\n\n"
                                                         +"Third  grade unit test easy unit 3 score : "+thg3test+"/100\n\n"
                                                         +"Fourth grade unit test easy unit 1 score : "+fg1test+"/100\n\n"
                                                         +"Fourth grade unit test easy unit 2 score : "+fg2test+"/100\n\n"
                                                         +"Fourth grade unit test easy unit 3 score : "+fg3test+"/100\n\n"
                                                         ,"                   Your Score For easy unit test",1



                                                 );
                                                 //printing the practice test result
                                                 JOptionPane.showMessageDialog(null, " \n\n"
                                                         +"kindergarten practice test unit 1 score : "+k1practice+"/100\n\n"
                                                         +"kindergarten practice test unit 2 score : "+k2practice+"/100\n\n"
                                                         +"kindergarten practice test unit 3 score : "+k3practice+"/100\n\n"
                                                         +"First  grade practice test unit 1 score : "+fg1practice+"/100\n\n"
                                                         +"First  grade practice test unit 2 score : "+fg2practice+"/100\n\n"
                                                         +"First  grade practice test unit 3 score : "+fg3practice+"/100\n\n"
                                                         +"Second grade practice test unit 1 score : "+sg1practice+"/100\n\n"
                                                         +"Second grade practice test unit 2 score : "+sg2practice+"/100\n\n"
                                                         +"Second grade practice test unit 3 score : "+sg3practice+"/100\n\n"
                                                         +"Third  grade practice test unit 1 score : "+tg1practice+"/100\n\n"
                                                         +"Third  grade practice test unit 2 score : "+tg2practice+"/100\n\n"
                                                         +"Third  grade practice test unit 3 score : "+tg3practice+"/100\n\n"
                                                         +"Fourth grade practice test unit 1 score : "+fog1practice+"/100\n\n"
                                                         +"Fourth grade practice test unit 2 score : "+fog2practice+"/100\n\n"
                                                         +"Fourth grade practice test unit 3 score : "+fog3practice+"/100\n\n"
                                                         ,"                   Your Score Fore practice test",1



                                                 );

                                                //practice test result average
                                                 for(int i=1;i<=15;i++){
                                                     if (rs.getInt(i)==0) {
                                                         count++;//check how many 0 we have
                                                     } else {
                                                         result += rs.getInt(i);//add values
                                                     }
                                                 }
                                                 try {

                                                     count=15-count;//check how many values more then 0
                                                     result1=result/count;//get the average
                                                     ;
                                                 } catch (Exception e) {
                                                     System.out.println(" ");//check if count=0
                                                 }


                                                 // test result average
                                                 for(int i=16;i<=45;i++){
                                                     if (rs.getInt(i)==0) {
                                                         counttest++;//check how many 0 we have
                                                     } else {
                                                         resulttest += rs.getInt(i);//add the values we have
                                                     }
                                                 }

                                                 try{
                                                     counttest=30-counttest;//check how many values more then 0
                                                     resulttest1=resulttest/counttest;//get the average

                                                 } catch (Exception e) {
                                                     System.out.println(" ");
                                                 }


                                                 total= (int) ((result1*0.2)+(resulttest1*0.8));

                                                 grade2.setText(""+total+"/100");//text

                                             }





                                         } catch (SQLException ex) {
                                             Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex); }


                                         }
                                     });


        active.setBackground(new Color(0, 204, 204));//bg color for panel
        active.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(0, 0, 0), 4, true), BorderFactory.createEtchedBorder(EtchedBorder.RAISED)));//border setting
        active.setLayout(null);

        classname.setFont(new Font("Tahoma", 1, 11)); // font size and style
        classname.setForeground(new Color(255, 255, 255));//font color
        classname.setHorizontalAlignment(SwingConstants.CENTER);//text setting
        classname.setText("Mrs Smith Math class");//text
        active.add(classname);//add to the panel
        classname.setBounds(20, 20, 140, 30);//placement and size

        grade2.setFont(new Font("Tahoma", 1, 11)); // font size and style
        grade2.setForeground(new Color(255, 255, 255));//font color
        grade2.setHorizontalAlignment(SwingConstants.CENTER);//text setting
        grade2.setText("80/100 ");//text
        grade2.setBorder(new LineBorder(new Color(255, 255, 255), 4, true));//border setting
        grade2.setHorizontalTextPosition(SwingConstants.CENTER);//text setting
        active.add(grade2);//add to the panel
        grade2.setBounds(60, 60, 70, 70);//placement and size

        instructorname.setFont(new Font("Tahoma", 1, 11)); // font size and style
        instructorname.setForeground(new Color(255, 255, 255));//font color
        instructorname.setHorizontalAlignment(SwingConstants.CENTER);//text setting
        instructorname.setText("Instructorname: Mrs Smith ");//text
        active.add(instructorname);//add to the panel
        instructorname.setBounds(10, 140, 170, 30);//placement and size

        activity2.setFont(new Font("Tahoma", 1, 11));// font size and style
        activity2.setForeground(new Color(255, 255, 255));//font color
        activity2.setHorizontalAlignment(SwingConstants.CENTER);//text setting
        activity2.setText(" 2020 -2021         ACTIVE");//text
        active.add(activity2);//add to the panel
        activity2.setBounds(20, 190, 150, 30);//placement and size

        getContentPane().add(active);//add to the frame
        active.setBounds(250, 350, 190, 250);//placement and size

        inactive.setBackground(new Color(204, 204, 0));//panel bg color
        inactive.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(0, 0, 0), 4, true), BorderFactory.createEtchedBorder(EtchedBorder.RAISED)));//border setting
        inactive.setLayout(null);

        classname1.setFont(new Font("Tahoma", 1, 11)); // font size and style
        classname1.setForeground(new Color(255, 255, 255));//font color
        classname1.setHorizontalAlignment(SwingConstants.CENTER);//text setting
        classname1.setText("Mrs Smith's Math class");//text
        inactive.add(classname1);//add to the panel
        classname1.setBounds(20, 20, 140, 30);//placement and size

        instructorname2.setFont(new Font("Tahoma", 1, 11)); // font size and style
        instructorname2.setForeground(new Color(255, 255, 255));//font color
        instructorname2.setHorizontalAlignment(SwingConstants.CENTER);//text setting
        instructorname2.setText("Instructorname: Mrs Smith ");//text
        inactive.add(instructorname2);//add to the panel
        instructorname2.setBounds(10, 140, 170, 30);//placement and size

        activity.setFont(new Font("Tahoma", 1, 11)); // font size and style
        activity.setForeground(new Color(255, 255, 255));//font color
        activity.setHorizontalAlignment(SwingConstants.CENTER);//text setting
        activity.setText(" 2019 - 2020         INACTIVE");//text
        inactive.add(activity);//add to the panel
        activity.setBounds(10, 190, 170, 30);//placement and size

        grade1.setFont(new Font("Tahoma", 1, 11)); // font size and style
        grade1.setForeground(new Color(255, 255, 255));//font color
        grade1.setHorizontalAlignment(SwingConstants.CENTER);//text setting
        grade1.setText("95/100");//text
        grade1.setBorder(new LineBorder(new Color(255, 255, 255), 4, true));//border setting
        grade1.setHorizontalTextPosition(SwingConstants.CENTER);//text setting
        inactive.add(grade1);//add to the panel
        grade1.setBounds(60, 60, 70, 70);//placement and size

        getContentPane().add(inactive);//add to the frame
        inactive.setBounds(30, 350, 200, 250);//placement and size
        getContentPane().add(back);//add to the frame
        back.setBounds(0, 0, 1030, 770);//placement and size
        back.setIcon(new ImageIcon(getClass().getResource("Images/background.jpg")));//background label

        pack();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables

    private JPanel active;// variable creation
    private JLabel activity;// variable creation
    private JLabel activity2;// variable creation
    private JLabel back;// variable creation
    private JLabel classname;// variable creation
    private JLabel classname1;// variable creation
    private JLabel grade1;// variable creation
    private JLabel grade2;// variable creation
    private JLabel hline1;// variable creation
    private JLabel hline2;// variable creation
    private JPanel inactive;// variable creation
    private JLabel instructorname;// variable creation
    private JLabel instructorname2;// variable creation
    private JLabel logo;// variable creation
    private JButton myclass;// variable creation
    private JButton myrewards;// variable creation
    private JButton rewardsinfo;// variable creation
    private JLabel stars10;// variable creation
    private JLabel stars100;// variable creation
    private JLabel stars20;// variable creation
    private JLabel stars30;// variable creation
    private JLabel stars40;// variable creation
    private JLabel stars50;// variable creation
    private JLabel stars60;// variable creation
    private JLabel stars70;// variable creation
    private JLabel stars80;// variable creation
    private JLabel stars90;// variable creation
    private JLabel user;// variable creation
    private JLabel vline1;// variable creation
    private JButton Homebut;// variable creation
    // End of variables declaration//GEN-END:variables
}
