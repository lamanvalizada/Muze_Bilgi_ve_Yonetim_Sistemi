/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muze;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Huseyn
 */
public class GuiPersonelSil extends javax.swing.JFrame {
    
    private String tcT;
    /**
     * Creates new form GuiPersonelSil
     */
    public GuiPersonelSil() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sil = new java.awt.Button();
        anamenu = new java.awt.Button();
        TcTextField = new javax.swing.JTextField();
        tc = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sil.setActionCommand("ekle");
        sil.setBackground(new java.awt.Color(0, 0, 0));
        sil.setForeground(new java.awt.Color(240, 240, 240));
        sil.setLabel("SIL");
        sil.setName("SIL"); // NOI18N
        sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silActionPerformed(evt);
            }
        });
        jPanel1.add(sil, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 220, 40));
        sil.getAccessibleContext().setAccessibleName("sil");

        anamenu.setActionCommand("anamenu");
        anamenu.setBackground(new java.awt.Color(0, 0, 0));
        anamenu.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));
        anamenu.setForeground(new java.awt.Color(255, 51, 51));
        anamenu.setLabel("Ana Menüye dön");
        anamenu.setName("anamenu"); // NOI18N
        anamenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anamenuActionPerformed(evt);
            }
        });
        jPanel1.add(anamenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 110, 30));

        TcTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TcTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(TcTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 270, 30));

        tc.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        tc.setForeground(new java.awt.Color(240, 240, 240));
        tc.setText("TC");
        jPanel1.add(tc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 40, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anamenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anamenuActionPerformed
        GuiMuzeYoneticisi gmy= new GuiMuzeYoneticisi();
        this.setVisible(false);
        gmy.setVisible(true);
    }//GEN-LAST:event_anamenuActionPerformed

    private void TcTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TcTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TcTextFieldActionPerformed

    private void silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silActionPerformed
        tcT=TcTextField.getText();
        try {
            if(ConnectionDB.isciSil(tcT))
            {
                JOptionPane.showMessageDialog(null, "Personel işden cıkarıldı.");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Böyle TC numarası bulunamadı.");
                TcTextField.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(GuiPersonelSil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_silActionPerformed

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
            java.util.logging.Logger.getLogger(GuiPersonelSil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiPersonelSil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiPersonelSil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiPersonelSil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiPersonelSil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TcTextField;
    private java.awt.Button anamenu;
    private javax.swing.JPanel jPanel1;
    private java.awt.Button sil;
    private java.awt.Label tc;
    // End of variables declaration//GEN-END:variables
}
