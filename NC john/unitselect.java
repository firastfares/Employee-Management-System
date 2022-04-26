

/**
 *
 * @author John Legg
 */
public class unitselect extends javax.swing.JFrame {

    public unitselect() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        title = new javax.swing.JLabel();
        unit1 = new javax.swing.JButton();
        unit2 = new javax.swing.JButton();
        unit3 = new javax.swing.JButton();
        unit4 = new javax.swing.JButton();
        Next = new javax.swing.JButton();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 763));
        setResizable(false);
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

        unit1.setText("Unit 1");
        unit1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        unit1.setBackground(new java.awt.Color(139, 139, 139));
        unit1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));
        unit1.setOpaque(true);
        getContentPane().add(unit1);
        unit1.setBounds(260, 180, 110, 60);

        unit2.setText("Unit 2");
        unit2.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        unit2.setBackground(new java.awt.Color(139, 139, 139));
        unit2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));
        unit2.setOpaque(true);
        getContentPane().add(unit2);
        unit2.setBounds(390, 180, 100, 60);

        unit3.setText("Unit 3");
        unit3.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        unit3.setBackground(new java.awt.Color(139, 139, 139));
        unit3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));
        unit3.setOpaque(true);
        getContentPane().add(unit3);
        unit3.setBounds(510, 180, 110, 60);

        unit4.setText("Unit 4 ");
        unit4.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        unit4.setBackground(new java.awt.Color(139, 139, 139));
        unit4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));
        unit4.setOpaque(true);
        getContentPane().add(unit4);
        unit4.setBounds(640, 180, 110, 60);

        Next.setText("Next");
        Next.setBackground(new java.awt.Color(139, 139, 139));
        Next.setOpaque(true);
        Next.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Next.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));
        getContentPane().add(Next);
        Next.setBounds(410, 320, 190, 100);
        getContentPane().add(back);
        back.setBounds(0, 0, 1020, 760);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/background.jpg")));

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
            java.util.logging.Logger.getLogger(unitselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(unitselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(unitselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(unitselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new unitselect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Next;
    private javax.swing.JLabel back;
    private javax.swing.JButton unit1;
    private javax.swing.JButton unit2;
    private javax.swing.JButton unit3;
    private javax.swing.JButton unit4;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
