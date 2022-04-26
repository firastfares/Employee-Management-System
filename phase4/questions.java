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
public class questions extends javax.swing.JFrame {


    public questions() {
        initComponents();
    }



    private void initComponents() {

        Homebut = new javax.swing.JButton();//button creation
        title = new javax.swing.JLabel();//label create
        questionpanel = new javax.swing.JPanel();//panel creation
        question1 = new javax.swing.JLabel();//label create
        Answer1 = new javax.swing.JLabel();//label create
        Question2 = new javax.swing.JLabel();//label create
        Answer2 = new javax.swing.JLabel();//label create
        Question3 = new javax.swing.JLabel();//label create
        Answer3 = new javax.swing.JLabel();//label create
        back = new javax.swing.JLabel();//label create
        questback = new javax.swing.JLabel();//label create
        logo = new javax.swing.JLabel();//label create

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 763));//frame size
        setResizable(false);
        getContentPane().setLayout(null);

        Homebut.setText("Return to Homepage");//button text
        Homebut.setBackground(new java.awt.Color(139, 139, 139));//bg color
        Homebut.setOpaque(true);//view bg color
        Homebut.setFont(new java.awt.Font("Impact", 0, 18)); // font style and size
        Homebut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border setting
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
        getContentPane().add(Homebut);//place on the frame
        Homebut.setBounds(310, 50, 410, 60);//placement and size


        title.setFont(new java.awt.Font("Tahoma", 0, 30)); // font style and size
        title.setForeground(new java.awt.Color(255, 255, 255));//font color
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);//text setting
        title.setBackground(new java.awt.Color(139, 139, 139));//bg color
        title.setOpaque(true);//veiw bg color
        title.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));//border settings
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);//text setting
        title.setText("Frequently Asked Questions");//text
        getContentPane().add(title);//place on frame
        title.setBounds(300, 160, 430, 60);//placement and size


        questionpanel.setLayout(null);//panel layout

        question1.setFont(new java.awt.Font("Tahoma", 0, 14)); // fotn style and size
        question1.setForeground(new java.awt.Color(255, 0, 51));//font color
        question1.setBackground(new java.awt.Color(255, 255, 255));//bg color
        question1.setOpaque(true);//view bg color
        question1.setText("Q:  What are the properties of the Multiplication? - Jack ");//text
        question1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));//border setting
        questionpanel.add(question1);//add to panel
        question1.setBounds(100, 50, 580, 60);//placement and size

        Answer1.setFont(new java.awt.Font("Tahoma", 0, 14)); // font size and style
        Answer1.setForeground(new java.awt.Color(0, 204, 102));//font color
        Answer1.setText("A: The properties are the commutative, associative, distributive, and identity - Mrs.Smith");//text
        Answer1.setBackground(new java.awt.Color(255, 255, 255));//bg color
        Answer1.setOpaque(true);//view bg color
        Answer1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));//border settings
        questionpanel.add(Answer1);//place on panel
        Answer1.setBounds(100, 110, 580, 60);//placement and size

        Question2.setFont(new java.awt.Font("Tahoma", 0, 14)); // font size and style
        Question2.setForeground(new java.awt.Color(255, 0, 51));//font color
        Question2.setText("Q: If I get all the rewards can I get a cookie? - Jill");//text
        Question2.setBackground(new java.awt.Color(255, 255, 255));//bg color
        Question2.setOpaque(true);//view bg color
        Question2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));//border settings
        questionpanel.add(Question2);//place on panel
        Question2.setBounds(100, 190, 580, 60);//placement and size

        Answer2.setFont(new java.awt.Font("Tahoma", 0, 14)); // font style and size
        Answer2.setForeground(new java.awt.Color(0, 204, 102));//font color
        Answer2.setText("A: Maybe Jill, if that helps you understand math that is great! - Mrs. Bowen");//text
        Answer2.setBackground(new java.awt.Color(255, 255, 255));//bg color
        Answer2.setOpaque(true);//view bg color
        Answer2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));//border settings
        questionpanel.add(Answer2);//add to the panel
        Answer2.setBounds(100, 250, 580, 60);//placement and size

        Question3.setFont(new java.awt.Font("Tahoma", 0, 14)); // font size and style
        Question3.setForeground(new java.awt.Color(255, 0, 51));//font color
        Question3.setText("Q:  Will we ever be able to test against our friends? - Timmy ");//text
        Question3.setBackground(new java.awt.Color(255, 255, 255));//bg color
        Question3.setOpaque(true);//view bg color
        Question3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));//border settings
        questionpanel.add(Question3);//place on panel
        Question3.setBounds(100, 330, 580, 60);//placement and size

        Answer3.setFont(new java.awt.Font("Tahoma", 0, 14)); // font style and size
        Answer3.setForeground(new java.awt.Color(0, 204, 102));//font color
        Answer3.setText("A: Maybe in the future, Timmy for now no. - NumCrunch ");//text
        Answer3.setBackground(new java.awt.Color(255, 255, 255));//bg color
        Answer3.setOpaque(true);//view bg color
        Answer3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));//border settings
        questionpanel.add(Answer3);//place on panel
        Answer3.setBounds(100, 390, 580, 60);//placement and size
        questionpanel.add(questback);//place on panel
        questback.setBounds(0, 0, 760, 490);//placement and size
        questback.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/questionbackground.jpg")));//paper background image
        questback.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));//border settings
        getContentPane().add(questionpanel);//add panel to the frame
        questionpanel.setBounds(130, 230, 760, 490);//placement and size of panel
        getContentPane().add(logo);//add on the frame
        logo.setBounds(20, 20, 130, 130);//placement and size
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/Numbercruncherslogo.png")));//icon for the logo
        getContentPane().add(back);//add on the frame
        back.setBounds(0, 0, 1020, 760);//placement and size
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/background.jpg")));//background for the frame.

        pack();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new questions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Answer1;//variable creation
    private javax.swing.JLabel Answer2;//variable creation
    private javax.swing.JLabel Answer3;//variable creation
    private javax.swing.JButton Homebut;//variable creation
    private javax.swing.JLabel Question2;//variable creation
    private javax.swing.JLabel Question3;//variable creation
    private javax.swing.JLabel back;//variable creation
    private javax.swing.JLabel questback;//variable creation
    private javax.swing.JPanel questionpanel;//variable creation
    private javax.swing.JLabel question1;//variable creation
    private javax.swing.JLabel title;//variable creation
    private javax.swing.JLabel logo;//variable creation
    // End of variables declaration//GEN-END:variables
}
