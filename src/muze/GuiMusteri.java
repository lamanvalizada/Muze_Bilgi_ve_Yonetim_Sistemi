/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package muze;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Huseyn
 */
public class GuiMusteri extends javax.swing.JFrame {

    /** Creates new form GMusteri */
    public GuiMusteri() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        biletAl = new java.awt.Button();
        oneriGonder = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logomini.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 130, 120));

        biletAl.setActionCommand("biletAl");
        biletAl.setBackground(new java.awt.Color(0, 0, 0));
        biletAl.setForeground(new java.awt.Color(240, 240, 240));
        biletAl.setLabel("BILET AL");
        biletAl.setName("BILET AL"); // NOI18N
        biletAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biletAlActionPerformed(evt);
            }
        });
        jPanel1.add(biletAl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 170, 40));

        oneriGonder.setActionCommand("oneri");
        oneriGonder.setBackground(new java.awt.Color(0, 0, 0));
        oneriGonder.setForeground(new java.awt.Color(240, 240, 240));
        oneriGonder.setLabel("ÖNERI GÖNDER");
        oneriGonder.setName("ÖNERI GÖNDER"); // NOI18N
        oneriGonder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneriGonderActionPerformed(evt);
            }
        });
        jPanel1.add(oneriGonder, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 170, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oneriGonderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneriGonderActionPerformed
        GuiOneriGonder oneriGonder=new GuiOneriGonder();
        this.setVisible(false);
        oneriGonder.setVisible(true);
    }//GEN-LAST:event_oneriGonderActionPerformed

    private void biletAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biletAlActionPerformed
        try {
            GuiBiletAl biletAl=new GuiBiletAl();            
            ConnectionDB.biletAl();
            this.setVisible(false);
            biletAl.setBuyuk_fiyat_Label(String.valueOf(Bilet.getBuyuk_bilet()));
            biletAl.setKucuk_fiyat_Label(String.valueOf(Bilet.getKucuk_bilet()));
            biletAl.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(GuiMusteri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_biletAlActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(GuiMusteri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiMusteri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiMusteri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiMusteri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiMusteri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button biletAl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private java.awt.Button oneriGonder;
    // End of variables declaration//GEN-END:variables

}
