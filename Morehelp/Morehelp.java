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
public class Morehelp extends javax.swing.JFrame {

    public Morehelp() {
        initComponents();
    }


    private void initComponents() {

        Homebut = new javax.swing.JButton();//button creation
        title = new javax.swing.JLabel();//label creation
        moreprobbut = new javax.swing.JButton();//button creation
        questionsbut = new javax.swing.JButton();//button creation
        videosbut = new javax.swing.JButton();//button creation
        logo = new javax.swing.JLabel();//label creation
        back = new javax.swing.JLabel();//background label creation

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1024, 763));//frame size
        setResizable(false);
        getContentPane().setLayout(null);

        Homebut.setText("Return to Homepage");//text
        Homebut.setBackground(new Color(139, 139, 139));//bg color
        Homebut.setOpaque(true);//view bg color
        Homebut.setFont(new Font("Impact", 0, 36)); // font style and size
        Homebut.setBorder(new javax.swing.border.LineBorder(new Color(64, 121, 126), 10, true));//border setting
        Homebut.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {//open unit select  kindergarten
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
        title.setText("More Help");//text
        getContentPane().add(title);//add to the frame
        title.setBounds(250, 175, 500, 60);//placement and size

        moreprobbut.setText("More Problems");//text
        moreprobbut.setBackground(new Color(139, 139, 139));//bg color
        moreprobbut.setOpaque(true);//view bg color
        moreprobbut.setFont(new Font("Impact", 0, 18)); // font size and style
        moreprobbut.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/moreprobs.png")));//icon for button
        moreprobbut.setBorder(new javax.swing.border.LineBorder(new Color(64, 121, 126), 10, true));//border settings
        moreprobbut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text settings
        moreprobbut.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text settings
        moreprobbut.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {//open unit select  kindergarten
                gradeselectmoreprobs gradeselectmoreprobs = new gradeselectmoreprobs();
                gradeselectmoreprobs.setVisible(true);
                setVisible(false);//close grade select

            }
        });
        getContentPane().add(moreprobbut);// add to the frame
        moreprobbut.setBounds(190, 300, 240, 150);//placement and size

        questionsbut.setText("Questions");//text
        questionsbut.setBackground(new Color(139, 139, 139));//bg color
        questionsbut.setOpaque(true);//view bg color
        questionsbut.setFont(new Font("Impact", 0, 18)); // font size and style
        questionsbut.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/questions.png")));//button icon
        questionsbut.setBorder(new javax.swing.border.LineBorder(new Color(64, 121, 126), 10, true));//border settings
        questionsbut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text setting
        questionsbut.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text setting
        questionsbut.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {//open unit select  kindergarten
                questions questions = new questions();
                questions.setVisible(true);
                setVisible(false);//close grade select

            }
        });
        getContentPane().add(questionsbut);//add to the frame
        questionsbut.setBounds(370, 500, 240, 150);//placement and size

        videosbut.setText("Videos");//text
        videosbut.setBackground(new Color(139, 139, 139));//bg color
        videosbut.setOpaque(true);//view bg color
        videosbut.setFont(new Font("Impact", 0, 18)); // font size and style
        videosbut.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/videos.png")));//button icon
        videosbut.setBorder(new javax.swing.border.LineBorder(new Color(64, 121, 126), 10, true));//border setting
        videosbut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);//text setting
        videosbut.setVerticalTextPosition(javax.swing.SwingConstants.TOP);//text setting
        videosbut.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {//open unit select  kindergarten
                gradeselectvideos gradeselectvideos = new gradeselectvideos();
                gradeselectvideos.setVisible(true);
                setVisible(false);//close grade select

            }
        });
        getContentPane().add(videosbut);//add on to the frame
        videosbut.setBounds(560, 300, 240, 150);//placement and size
        getContentPane().add(logo);//add on the frame
        logo.setBounds(20, 20, 130, 130);//placement and size
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/Numbercruncherslogo.png")));//icon for the logo
        getContentPane().add(back);//add on the frame
        back.setBounds(0, 0, 1020, 760);//placement and size
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/background.jpg")));//icon used as the background

        pack();
    }




    public static void main(String args[]) {
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

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Morehelp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Homebut;//variable creation
    private javax.swing.JLabel back;//variable creation
    private javax.swing.JButton moreprobbut;//variable creation
    private javax.swing.JButton questionsbut;//variable creation
    private javax.swing.JLabel title;//variable creation
    private javax.swing.JButton videosbut;//variable creation
    private javax.swing.JLabel logo;//variable creation
    // End of variables declaration//GEN-END:variables
}
