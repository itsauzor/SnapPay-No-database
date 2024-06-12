
package snappayapp;

public class IntroFrame extends javax.swing.JFrame {

        
        public IntroFrame() {
                initComponents();
        }     

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jPanel2 = new javax.swing.JPanel();
                jPanel3 = new javax.swing.JPanel();
                jLabel29 = new javax.swing.JLabel();
                jLabel28 = new javax.swing.JLabel();
                sendMoneyBtn = new javax.swing.JButton();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setUndecorated(true);
                getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel1.setBackground(new java.awt.Color(240, 244, 249));
                jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel2.setBackground(new java.awt.Color(240, 244, 249));
                jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 20, true));
                jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel3.setBackground(new java.awt.Color(255, 255, 255));
                jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snapassets/Picsart-24-06-12-22-44-05-357.png"))); // NOI18N
                jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 130, 130));

                jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snapassets/Picsart-24-06-12-22-43-01-268.png"))); // NOI18N
                jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 130, 130));

                sendMoneyBtn.setBackground(new java.awt.Color(62, 153, 229));
                sendMoneyBtn.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
                sendMoneyBtn.setForeground(new java.awt.Color(255, 255, 255));
                sendMoneyBtn.setText("Snap It!");
                sendMoneyBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 204, 255), new java.awt.Color(153, 204, 255), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
                sendMoneyBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                sendMoneyBtnActionPerformed(evt);
                        }
                });
                jPanel3.add(sendMoneyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 100, 40));

                jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(30, 127, 205));
                jLabel3.setText("Snap Pay makes your transactions effortless. Our system is secure, fast, and easy to use.");
                jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

                jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(30, 127, 205));
                jLabel4.setText("Whether you're a business or an individual, Snap Pay simplifies how you send, receive, and track payments.");
                jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

                jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                jLabel5.setForeground(new java.awt.Color(30, 127, 205));
                jLabel5.setText("Discover the convenience of Snap Pay today.");
                jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

                jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel6.setForeground(new java.awt.Color(195, 191, 191));
                jLabel6.setText("Developed by Group 6");
                jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 620, -1, -1));

                jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 48)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(62, 153, 229));
                jLabel1.setText("Snap Pay");
                jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

                jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 1, 48)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(220, 220, 220));
                jLabel2.setText("Snap Pay");
                jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

                jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1090, 640));

                jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 1090, 660));

                getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 740));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void sendMoneyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMoneyBtnActionPerformed
        AppInterface AppInterfaceInterface = new AppInterface();
        AppInterfaceInterface.setVisible(true);
        AppInterfaceInterface.pack();
        AppInterfaceInterface.setLocationRelativeTo(null);
        this.dispose();
        }//GEN-LAST:event_sendMoneyBtnActionPerformed

        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
                /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(IntroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(IntroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(IntroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(IntroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new IntroFrame().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel28;
        private javax.swing.JLabel jLabel29;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JButton sendMoneyBtn;
        // End of variables declaration//GEN-END:variables
}
