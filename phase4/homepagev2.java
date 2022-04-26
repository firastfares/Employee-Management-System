package phase3;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author John Legg
 */
public class homepagev2 extends javax.swing.JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    //public static String [] getdata = new String[1];//user name display
    private javax.swing.JLabel back;//variable creation
    private javax.swing.JPanel base;//variable creation
    private JButton homebut;//variable creation
    private javax.swing.JLabel logo;//variable creation
    private JButton morehelpbut;//variable creation
    private JButton myprogressbut;//variable creation
    private JButton practicetestbut;//variable creation
    private JButton profilebutton;//variable creation
    private JButton recordings;//variable creation
    private JButton tutorialsbut;//variable creation
    private JButton unittestbut;//variable creation
    /**
     * Creates new form homepagev2
     */
    public homepagev2() {
        initComponents();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homepagev2().setVisible(true);
            }
        });

    }

    private void initComponents() {

        base = new javax.swing.JPanel();//panel creation
        morehelpbut = new JButton();//button creation
        tutorialsbut = new JButton();//button creation
        recordings = new JButton();//button creation
        myprogressbut = new JButton();//button creation
        practicetestbut = new JButton();//button creation
        unittestbut = new JButton();//button creation
        homebut = new JButton();//button creation
        profilebutton = new JButton();//button creation
        logo = new javax.swing.JLabel();//label creation
        back = new javax.swing.JLabel();//label creation

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 763));//frame size
        setResizable(false);
        getContentPane().setLayout(new java.awt.FlowLayout());

        base.setPreferredSize(new java.awt.Dimension(1024, 763));//panel size
        base.setLayout(null);
        
        JButton signOutButton = new JButton("");
        signOutButton.setRolloverIcon(new ImageIcon(homepagev2.class.getResource("Images/Webp.net-resizeimage (25).png")));
        signOutButton.setIcon(new ImageIcon(homepagev2.class.getResource("Images/Webp.net-resizeimage (24).png")));
        signOutButton.setOpaque(false);
        signOutButton.setContentAreaFilled(false);
        signOutButton.setBorderPainted(false);
        signOutButton.setBounds(857, 677, 119, 36);
        signOutButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                signOutButtonPressed(evt);
            }
        });
        base.add(signOutButton);

        morehelpbut.setBackground(new java.awt.Color(139, 139, 139));//bg color
        morehelpbut.setOpaque(true);//view bg color
        morehelpbut.setFont(new java.awt.Font("Impact", 0, 18)); // font style and size
        morehelpbut.setIcon(new ImageIcon(getClass().getResource("Images/help.png")));//button icon
        morehelpbut.setText("More Help");//text
        morehelpbut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border settings
        morehelpbut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text setting
        morehelpbut.setPreferredSize(new java.awt.Dimension(171, 139));//size setting
        morehelpbut.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text setting
        base.add(morehelpbut);//add to the panel
        morehelpbut.setBounds(667, 450, 171, 139);//placement and size
        morehelpbut.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                morehelpbutMousePressed(evt);
            }
        });

        tutorialsbut.setBackground(new java.awt.Color(139, 139, 139));//placement and size
        tutorialsbut.setOpaque(true);
        tutorialsbut.setFont(new java.awt.Font("Impact", 0, 18)); // font size and style
        tutorialsbut.setIcon(new ImageIcon(getClass().getResource("Images/tutorial.png")));//button icon
        tutorialsbut.setText("Tutorials");//text
        tutorialsbut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border settings
        tutorialsbut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text setting
        tutorialsbut.setPreferredSize(new java.awt.Dimension(171, 139));//size setting
        tutorialsbut.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text setting
        tutorialsbut.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                tutorialsbutMousePressed(evt);
            }
        });
        base.add(tutorialsbut);//add to the panel
        tutorialsbut.setBounds(184, 269, 171, 139);//placement and size

        recordings.setBackground(new java.awt.Color(139, 139, 139));//bg color
        recordings.setOpaque(true);//view bg color
        recordings.setFont(new java.awt.Font("Impact", 0,18 )); // font size and style
        recordings.setIcon(new ImageIcon(getClass().getResource("Images/recordings.png")));//button icon
        recordings.setText("Recordings");//text
        recordings.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border setting
        recordings.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text setting
        recordings.setPreferredSize(new java.awt.Dimension(171, 139));//size setting
        recordings.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text setting
        recordings.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                recordingsbutMousePressed(evt);
            }
        });

        base.add(recordings);//add to panel
        recordings.setBounds(184, 447, 171, 139);//placement and size

        myprogressbut.setBackground(new java.awt.Color(139, 139, 139));//bg color
        myprogressbut.setOpaque(true);//view bg color
        myprogressbut.setFont(new java.awt.Font("Impact", 0, 18)); // font size and style
        myprogressbut.setIcon(new ImageIcon(getClass().getResource("Images/stars.png")));//button icon
        myprogressbut.setText("My Progress");//text
        myprogressbut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border settings
        myprogressbut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text setting
        myprogressbut.setPreferredSize(new java.awt.Dimension(171, 139));//size setting
        myprogressbut.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text setting
        myprogressbut.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                myprogessbutMousePressed(evt);
            }
        });
        base.add(myprogressbut);//adding to the panel
        myprogressbut.setBounds(422, 447, 171, 139);//placement and size

        practicetestbut.setBackground(new java.awt.Color(139, 139, 139));//bg color
        practicetestbut.setOpaque(true);//view bg color
        practicetestbut.setFont(new java.awt.Font("Impact", 0, 18));//font size and style
        practicetestbut.setIcon(new ImageIcon(getClass().getResource("Images/practicetest.png")));//button icon
        practicetestbut.setText("Practice Tests");//text
        practicetestbut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border settings
        practicetestbut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text setting
        practicetestbut.setPreferredSize(new java.awt.Dimension(171, 139));//size setting
        practicetestbut.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text setting
        practicetestbut.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                practicetestbutMousePressed(evt);
            }
        });

        base.add(practicetestbut);//add to the panel
        practicetestbut.setBounds(422, 269, 171, 139);//placement and size

        unittestbut.setFont(new java.awt.Font("Impact", 0, 18)); // font size and style
        unittestbut.setBackground(new java.awt.Color(139, 139, 139));//bg color
        unittestbut.setOpaque(true);//view bg color
        unittestbut.setIcon(new ImageIcon(getClass().getResource("Images/unittest.png")));//button icon
        unittestbut.setText("Unit Test");//text
        unittestbut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border settings
        unittestbut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text settings
        unittestbut.setPreferredSize(new java.awt.Dimension(171, 139));//size settings
        unittestbut.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text settings
        unittestbut.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                unittestbutMousePressed();
            }
        });

        base.add(unittestbut);//add to the panel
        unittestbut.setBounds(667, 269, 171, 139);//placement and size
        homebut.setFont(new java.awt.Font("Impact", 0, 36));//font size and style
        homebut.setText("Home Page ");//text
        homebut.setBackground(new java.awt.Color(139, 139, 139));//bg color
        homebut.setOpaque(true);//view bg color
        homebut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border setting
        homebut.setPreferredSize(new java.awt.Dimension(368, 60));//size setting
        homebut.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {//open unit select  kindergarten
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
                homepagev2.setVisible(true);//open home
                setVisible(false);//close old home

            }
        });
        base.add(homebut);//add to the panel
        homebut.setBounds(334, 68, 368, 60);//placement and size
        profilebutton.setFont(new java.awt.Font("Impact", 0, 24));//font size and style
        profilebutton.setText("Hi, "+login.getdata[0]);//text
        profilebutton.setBackground(new java.awt.Color(139, 139, 139));//bg color
        profilebutton.setOpaque(true);//view bg color
        profilebutton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border settings
        profilebutton.setPreferredSize(new java.awt.Dimension(168, 47));//size setting
        profilebutton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                profilebuttonbutMousePressed();
            }
        });
        base.add(profilebutton);//add to the panel
        profilebutton.setBounds(776, 68, 200, 60);//placement and size
        base.add(logo);// add to the panel

        logo.setBounds(20, 20, 130, 130);//placement and size
        logo.setIcon(new ImageIcon(getClass().getResource("Images/Numbercruncherslogo.png")));//logo icon
        base.add(back);// add to the panel
        back.setBounds(0, 0, 1024, 763);//placement and size
        back.setIcon(new ImageIcon(getClass().getResource("Images/background.jpg")));//background label

        getContentPane().add(base);//add to the frame

        pack();
    }

    private void recordingsbutMousePressed(MouseEvent evt) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gradeselectrecordings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gradeselectrecordings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gradeselectrecordings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gradeselectrecordings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        gradeselectrecordings gradeselectrecordings= new gradeselectrecordings();
        gradeselectrecordings.setVisible(true);//open gradeselect for recordings
        setVisible(false); //close home

    }
    private void morehelpbutMousePressed(MouseEvent evt) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Morehelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Morehelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Morehelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Morehelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        Morehelp Morehelp = new Morehelp();
        Morehelp.setVisible(true);//open more help
        setVisible(false);//close homepage
    }
    private void tutorialsbutMousePressed(MouseEvent evt) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gradeselecttutorials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gradeselecttutorials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gradeselecttutorials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gradeselecttutorials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        gradeselecttutorials gradeselecttutorials = new gradeselecttutorials();
        gradeselecttutorials.setVisible(true);//open tutorial grade select
        setVisible(false);//close homepage
    }
    private void myprogessbutMousePressed(MouseEvent evt) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        Profile profile = new Profile();
        profile.setVisible(true);
        setVisible(false);//close home
    }

    private void profilebuttonbutMousePressed() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        Profile profile = new Profile();
        profile.setVisible(true);
        setVisible(false);//close home
    }

    private void practicetestbutMousePressed(MouseEvent evt) {//GEN-FIRST:event_practicetestbutMouseClicked
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gradeselectpracticetest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gradeselectpracticetest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gradeselectpracticetest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gradeselectpracticetest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        gradeselectpracticetest gradeselectpracticetest = new gradeselectpracticetest();
        gradeselectpracticetest.setVisible(true);//open gradeselect for practice test
        setVisible(false); //close home


    }
    private void unittestbutMousePressed() {//GEN-FIRST:event_practicetestbutMouseClicked

            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(gradeselectunittest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(gradeselectunittest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(gradeselectunittest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(gradeselectunittest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            gradeselectunittest gradeselectunittest = new gradeselectunittest();
            gradeselectunittest.setVisible(true);//open gradeselect unit test
            setVisible(false); //close home

    }
    
 
    
    private void signOutButtonPressed(MouseEvent evt) {//GEN-FIRST:event_practicetestbutMouseClicked
    	String message = "Are you sure you want to sign out?";
    	  int reply = JOptionPane.showConfirmDialog(base, message, "Wait!", JOptionPane.YES_NO_OPTION);
    	    if (reply == JOptionPane.YES_OPTION) {
                try {
                    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                            javax.swing.UIManager.setLookAndFeel(info.getClassName());
                            break;
                        }
                    }
                } catch (ClassNotFoundException ex) {
                    java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                    java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
    	    	 login login = new login();
    	         login.setVisible(true);//open gradeselect unit test
    	         setVisible(false); //close home
    	    } 
      

}
}
