
/**
 *
 * @author John Legg
 */


public class testselect extends javax.swing.JFrame {


    public testselect() {
        initComponents();
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        title = new javax.swing.JLabel();
        test1 = new javax.swing.JButton();
        test2 = new javax.swing.JButton();
        test3 = new javax.swing.JButton();
        test4 = new javax.swing.JButton();
        test5 = new javax.swing.JButton();
        test6 = new javax.swing.JButton();
        test7 = new javax.swing.JButton();
        test8 = new javax.swing.JButton();
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

        test1.setText("Test 1");
        test1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        test1.setBackground(new java.awt.Color(139, 139, 139));
        test1.setOpaque(true);
        test1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));
        getContentPane().add(test1);
        test1.setBounds(260, 180, 110, 60);

        test2.setText("Test 2");
        test2.setBackground(new java.awt.Color(139, 139, 139));
        test2.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        test2.setOpaque(true);
        test2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));
        getContentPane().add(test2);
        test2.setBounds(390, 180, 100, 60);

        test3.setText("Test 3");
        test3.setBackground(new java.awt.Color(139, 139, 139));
        test3.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        test3.setOpaque(true);
        test3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));
        getContentPane().add(test3);
        test3.setBounds(510, 180, 110, 60);

        test5.setText("Test 5");
        test5.setBackground(new java.awt.Color(139, 139, 139));
        test5.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        test5.setOpaque(true);
        test5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));
        getContentPane().add(test5);
        test5.setBounds(260, 320, 110, 60);

        test6.setText("Test 6");
        test6.setBackground(new java.awt.Color(139, 139, 139));
        test6.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        test6.setOpaque(true);
        test6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));
        getContentPane().add(test6);
        test6.setBounds(380, 320, 110, 60);

        test7.setText("Test 7");
        test7.setBackground(new java.awt.Color(139, 139, 139));
        test7.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        test7.setOpaque(true);
        test7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));
        getContentPane().add(test7);
        test7.setBounds(510, 320, 110, 60);

        test8.setText("Test 8");
        test8.setBackground(new java.awt.Color(139, 139, 139));
        test8.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        test8.setOpaque(true);
        test8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));
        test8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                test8ActionPerformed(evt);
            }
        });
        getContentPane().add(test8);
        test8.setBounds(640, 320, 110, 60);

        test4.setText("Test 4");
        test4.setBackground(new java.awt.Color(139, 139, 139));
        test4.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        test4.setOpaque(true);
        test4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));
        getContentPane().add(test4);
        test4.setBounds(640, 180, 110, 60);

        Next.setText("Next");
        Next.setBackground(new java.awt.Color(139, 139, 139));
        Next.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Next.setOpaque(true);
        Next.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 121, 126), 10, true));
        getContentPane().add(Next);
        Next.setBounds(410, 510, 190, 100);
        getContentPane().add(back);
        back.setBounds(0, 0, 1020, 760);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/background.jpg")));

        pack();
    }

    private void test8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_test7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_test7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(testselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(testselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(testselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(testselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new testselect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Next;
    private javax.swing.JLabel back;
    private javax.swing.JButton test1;
    private javax.swing.JButton test2;
    private javax.swing.JButton test3;
    private javax.swing.JButton test4;
    private javax.swing.JButton test5;
    private javax.swing.JButton test6;
    private javax.swing.JButton test7;
    private javax.swing.JButton test8;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
