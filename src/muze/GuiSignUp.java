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
public class GuiSignUp extends javax.swing.JFrame {
    
    private String isim,soyisim,sifre,tc,sifreTekrar;
    /**
     * Creates new form SignUp
     */
    public GuiSignUp() {
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
        jLabel2 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        isimlabel = new java.awt.Label();
        isimTextField = new javax.swing.JTextField();
        soyisimlabel = new java.awt.Label();
        soyIsimTextField = new javax.swing.JTextField();
        tclabel = new java.awt.Label();
        tcTextField = new javax.swing.JTextField();
        sifrelabel = new java.awt.Label();
        sifrePasswordField = new javax.swing.JPasswordField();
        sifretekrarlabel = new java.awt.Label();
        sifreTekrarPasswordField = new javax.swing.JPasswordField();
        kayitOl = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muzelogo.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -20, 390, 500));

        label1.setFont(new java.awt.Font("Bauhaus 93", 0, 48)); // NOI18N
        label1.setForeground(new java.awt.Color(240, 240, 240));
        label1.setText("KAYIT OL");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, 70));

        isimlabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        isimlabel.setForeground(new java.awt.Color(240, 240, 240));
        isimlabel.setText("Isim");
        jPanel1.add(isimlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 60, 30));

        isimTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isimTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(isimTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 240, 30));

        soyisimlabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        soyisimlabel.setForeground(new java.awt.Color(240, 240, 240));
        soyisimlabel.setText("Soy Isim");
        jPanel1.add(soyisimlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 110, -1));

        soyIsimTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soyIsimTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(soyIsimTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 240, 30));

        tclabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        tclabel.setForeground(new java.awt.Color(240, 240, 240));
        tclabel.setText("TC");
        jPanel1.add(tclabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 130, -1));

        tcTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(tcTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 240, 30));

        sifrelabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        sifrelabel.setForeground(new java.awt.Color(240, 240, 240));
        sifrelabel.setText("Sifre");
        jPanel1.add(sifrelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, -1, 30));

        sifrePasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifrePasswordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(sifrePasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 240, 30));

        sifretekrarlabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        sifretekrarlabel.setForeground(new java.awt.Color(240, 240, 240));
        sifretekrarlabel.setName(""); // NOI18N
        sifretekrarlabel.setText("Sifre Tekrar");
        jPanel1.add(sifretekrarlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, -1, 50));

        sifreTekrarPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifreTekrarPasswordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(sifreTekrarPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 240, 30));

        kayitOl.setActionCommand("kayıtOl");
        kayitOl.setBackground(new java.awt.Color(0, 0, 0));
        kayitOl.setForeground(new java.awt.Color(240, 240, 240));
        kayitOl.setLabel("KAYIT OL");
        kayitOl.setName("KAYIT OL"); // NOI18N
        kayitOl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitOlActionPerformed(evt);
            }
        });
        jPanel1.add(kayitOl, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 170, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void isimTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isimTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isimTextFieldActionPerformed

    private void soyIsimTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soyIsimTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soyIsimTextFieldActionPerformed

    private void tcTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcTextFieldActionPerformed

    private void sifrePasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifrePasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sifrePasswordFieldActionPerformed

    private void sifreTekrarPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifreTekrarPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sifreTekrarPasswordFieldActionPerformed

    private void kayitOlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitOlActionPerformed
        isim=isimTextField.getText();
        soyisim=soyIsimTextField.getText();
        tc=tcTextField.getText();
        sifre=String.valueOf(sifrePasswordField.getPassword());
        sifreTekrar=String.valueOf(sifreTekrarPasswordField.getPassword());
        
        if(isim.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Isim boş bırakılamaz.");
            sifirla();
        }
        else if(soyisim.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Soyisim boş bırakılamaz.");
            sifirla();
        }
        else if(tc.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Tc numarası boş bırakılamaz.");
            sifirla();
        }
        else if(!isNumeric(tc))
        {
            JOptionPane.showMessageDialog(null, "TC numarası sadece rakamlardan oluşa bilir.");
            sifirla();
        }
        else if(tc.length()!=11)
        {
           JOptionPane.showMessageDialog(null, "TC numarası 11 rakamdan oluşmalıdır"); 
           sifirla();
        }
        else if(!sifre.equals(sifreTekrar))
        {
            JOptionPane.showMessageDialog(null, "Şifre ve ŞifreTekrar bir biri ile eşleşmelidir."); 
            sifreTekrarPasswordField.setText("");
        }
        else
        {
            Insan.setIsim(isim);
            Insan.setPassword(sifre);
            Insan.setSoyisim(soyisim);
            Insan.setTCnum(tc);
            Insan.setTip("1");
            Insan.setMaas("0");
            try {
                if(ConnectionDB.kayitOl())
                {
                    this.setVisible(false);
                    GuiLogin login=new GuiLogin();
                    login.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Bu TC numarası ile kayıt vardır."); 
                    sifirla();
                }
                } catch (SQLException ex) {
                Logger.getLogger(GuiSignUp.class.getName()).log(Level.SEVERE, null, ex);
            }
            /*
            Bu hissede database-e isim,soyisim,tc ve sifre atilmadir.
            */
        }
    }//GEN-LAST:event_kayitOlActionPerformed

    public boolean isNumeric(String s) {  
        return s != null && s.matches("[-+]?\\d*\\.?\\d+");  
    }
    public void sifirla()
    {
        isimTextField.setText("");
        soyIsimTextField.setText("");
        tcTextField.setText("");
        sifrePasswordField.setText("");
        sifreTekrarPasswordField.setText("");
    }
    
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
            java.util.logging.Logger.getLogger(GuiSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiSignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField isimTextField;
    private java.awt.Label isimlabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private java.awt.Button kayitOl;
    private java.awt.Label label1;
    private javax.swing.JPasswordField sifrePasswordField;
    private javax.swing.JPasswordField sifreTekrarPasswordField;
    private java.awt.Label sifrelabel;
    private java.awt.Label sifretekrarlabel;
    private javax.swing.JTextField soyIsimTextField;
    private java.awt.Label soyisimlabel;
    private javax.swing.JTextField tcTextField;
    private java.awt.Label tclabel;
    // End of variables declaration//GEN-END:variables
}
