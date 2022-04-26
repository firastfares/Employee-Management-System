/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author John Legg
 */
public class gradeselect extends javax.swing.JFrame {

    /**
     * Creates new form tutorialtemplate
     */
    public gradeselect() {
        initComponents();
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        title = new javax.swing.JLabel();
        kindergarden = new javax.swing.JButton();
        firstgrade = new javax.swing.JButton();
        secondgrade = new javax.swing.JButton();
        thirdgrade = new javax.swing.JButton();
        fourthgrade = new javax.swing.JButton();
        Next = new javax.swing.JButton();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1024, 763));
        setSize(new java.awt.Dimension(1024, 763));
        getContentPane().setLayout(null);

        title.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Select a test");
        title.setBackground(new java.awt.Color(139, 139, 139));
        title.setOpaque(true);
        title.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));
        getContentPane().add(title);
        title.setBounds(250, 100, 520, 60);

        kindergarden.setText("kindergarden");
        kindergarden.setBackground(new java.awt.Color(139, 139, 139));
        kindergarden.setOpaque(true);
        kindergarden.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));
        getContentPane().add(kindergarden);
        kindergarden.setBounds(180, 180, 140, 60);

        firstgrade.setText("First Grade");
        firstgrade.setBackground(new java.awt.Color(139, 139, 139));
        firstgrade.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        firstgrade.setOpaque(true);
        firstgrade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));
        getContentPane().add(firstgrade);
        firstgrade.setBounds(340, 180, 100, 60);

        secondgrade.setText("Second Grade");
        secondgrade.setBackground(new java.awt.Color(139, 139, 139));
        secondgrade.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        secondgrade.setOpaque(true);
        secondgrade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));
        getContentPane().add(secondgrade);
        secondgrade.setBounds(460, 180, 110, 60);

        thirdgrade.setText("Third Grade");
        thirdgrade.setBackground(new java.awt.Color(139, 139, 139));
        thirdgrade.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        thirdgrade.setOpaque(true);
        thirdgrade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));
        getContentPane().add(thirdgrade);
        thirdgrade.setBounds(590, 180, 110, 60);

        fourthgrade.setText("Fourth Grade");
        fourthgrade.setBackground(new java.awt.Color(139, 139, 139));
        fourthgrade.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        fourthgrade.setOpaque(true);
        fourthgrade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));
        getContentPane().add(fourthgrade);
        fourthgrade.setBounds(720, 180, 130, 60);

        Next.setText("Next");
        Next.setBackground(new java.awt.Color(139, 139, 139));
        Next.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Next.setOpaque(true);
        Next.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));
        getContentPane().add(Next);
        Next.setBounds(410, 320, 190, 100);
        getContentPane().add(back);
        back.setBounds(0, 0, 1020, 760);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/background.jpg")));

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
            java.util.logging.Logger.getLogger(gradeselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gradeselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gradeselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gradeselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gradeselect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Next;
    private javax.swing.JLabel back;
    private javax.swing.JButton firstgrade;
    private javax.swing.JButton fourthgrade;
    private javax.swing.JButton kindergarden;
    private javax.swing.JButton secondgrade;
    private javax.swing.JButton thirdgrade;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
