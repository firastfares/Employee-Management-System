/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thest
 */
public class tutorialtemplate extends javax.swing.JFrame {

    /**
     * Creates new form tutorialtemplate
     */
    public tutorialtemplate() {
        initComponents();
    }

    private void initComponents() {

        homebut = new javax.swing.JButton();
        profilebut = new javax.swing.JButton();
        progressbut = new javax.swing.JButton();
        classbut = new javax.swing.JButton();
        unitbut = new javax.swing.JButton();
        rewardsbut = new javax.swing.JButton();
        helpbut = new javax.swing.JButton();
        header = new javax.swing.JLabel();
        numcrunch = new javax.swing.JLabel();
        sidebar = new javax.swing.JLabel();
        nextbut = new javax.swing.JButton();
        testarea = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1024, 763));
        setSize(new java.awt.Dimension(1024, 763));
        getContentPane().setLayout(null);

        homebut.setText("Home");
        homebut.setForeground(new java.awt.Color(255, 255, 255));
        homebut.setBackground(new java.awt.Color(48, 126, 143));
        homebut.setOpaque(true);
        getContentPane().add(homebut);
        homebut.setBounds(20, 140, 220, 60);

        profilebut.setText("My Profile");
        profilebut.setForeground(new java.awt.Color(255, 255, 255));
        profilebut.setBackground(new java.awt.Color(48, 126, 143));
        profilebut.setOpaque(true);
        profilebut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilebutActionPerformed(evt);
            }
        });
        getContentPane().add(profilebut);
        profilebut.setBounds(20, 210, 220, 60);

        progressbut.setText("My Progress");
        progressbut.setForeground(new java.awt.Color(255, 255, 255));
        progressbut.setBackground(new java.awt.Color(48, 126, 143));
        progressbut.setOpaque(true);
        getContentPane().add(progressbut);
        progressbut.setBounds(20, 280, 220, 60);

        classbut.setText("My Class");
        classbut.setForeground(new java.awt.Color(255, 255, 255));
        classbut.setBackground(new java.awt.Color(48, 126, 143));
        classbut.setOpaque(true);
        getContentPane().add(classbut);
        classbut.setBounds(20, 350, 220, 60);

        unitbut.setText("Units");
        unitbut.setForeground(new java.awt.Color(255, 255, 255));
        unitbut.setBackground(new java.awt.Color(48, 126, 143));
        unitbut.setOpaque(true);
        getContentPane().add(unitbut);
        unitbut.setBounds(20, 420, 220, 60);

        rewardsbut.setText("Rewards");
        rewardsbut.setForeground(new java.awt.Color(255, 255, 255));
        rewardsbut.setBackground(new java.awt.Color(48, 126, 143));
        rewardsbut.setOpaque(true);
        getContentPane().add(rewardsbut);
        rewardsbut.setBounds(20, 490, 220, 60);

        helpbut.setText("Need Help? ");
        helpbut.setForeground(new java.awt.Color(255, 255, 255));
        helpbut.setBackground(new java.awt.Color(48, 126, 143));
        helpbut.setOpaque(true);
        getContentPane().add(helpbut);
        helpbut.setBounds(20, 560, 220, 60);

        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setBackground(new java.awt.Color(65, 158, 178));
        header.setOpaque(true);
        header.setText("Unit One Test One ");
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(header);
        header.setBounds(260, 110, 763, 210);

        numcrunch.setText("Number Crunchers");
        numcrunch.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(numcrunch);
        numcrunch.setBounds(30, 30, 190, 80);

        sidebar.setBackground(new java.awt.Color(48, 126, 143));
        sidebar.setOpaque(true);
        sidebar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(sidebar);
        sidebar.setBounds(0, 0, 260, 723);

        nextbut.setText("arrow");
        nextbut.setBackground(new java.awt.Color(255, 255, 255));
        nextbut.setOpaque(true);
        getContentPane().add(nextbut);
        nextbut.setBounds(890, 670, 61, 23);

        testarea.setBackground(new java.awt.Color(255, 255, 255));
        testarea.setOpaque(true);
        testarea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(testarea);
        testarea.setBounds(280, 340, 690, 380);
        getContentPane().add(back);
        back.setBounds(0, 0, 1024, 763);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/background.jpg")));

        pack();
    }

    private void profilebutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilebutActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(tutorialtemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tutorialtemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tutorialtemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tutorialtemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tutorialtemplate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JButton classbut;
    private javax.swing.JLabel header;
    private javax.swing.JButton helpbut;
    private javax.swing.JButton homebut;
    private javax.swing.JButton nextbut;
    private javax.swing.JLabel numcrunch;
    private javax.swing.JButton profilebut;
    private javax.swing.JButton progressbut;
    private javax.swing.JButton rewardsbut;
    private javax.swing.JLabel sidebar;
    private javax.swing.JLabel testarea;
    private javax.swing.JButton unitbut;
    // End of variables declaration//GEN-END:variables
}
