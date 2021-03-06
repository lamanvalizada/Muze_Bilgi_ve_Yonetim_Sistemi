/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muze;
   
import java.net.ConnectException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Huseyn
 */
public class GuiLogin extends javax.swing.JFrame {

    private String tc;
    private String sifre;
    /**
     * Creates new form Login
     */
    public GuiLogin() {
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
        jLabel1 = new javax.swing.JLabel();
        oturumText = new java.awt.Label();
        label1 = new java.awt.Label();
        tcTextField = new java.awt.TextField();
        label2 = new java.awt.Label();
        sifrePasswordField = new javax.swing.JPasswordField();
        girisYap = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muzelogo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 430, -1));

        oturumText.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        oturumText.setForeground(new java.awt.Color(240, 240, 240));
        oturumText.setText("OTURUM AÇ");
        jPanel1.add(oturumText, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, -1));

        label1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(240, 240, 240));
        label1.setText("TC");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 80, 30));

        tcTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(tcTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 230, 30));

        label2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        label2.setForeground(new java.awt.Color(240, 240, 240));
        label2.setText("Sifre");
        jPanel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, -1));

        sifrePasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifrePasswordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(sifrePasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 272, 230, 30));

        girisYap.setActionCommand("girisYap");
        girisYap.setBackground(new java.awt.Color(0, 0, 0));
        girisYap.setForeground(new java.awt.Color(240, 240, 240));
        girisYap.setLabel("GIRIS YAP");
        girisYap.setName("girisYap"); // NOI18N
        girisYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisYapActionPerformed(evt);
            }
        });
        jPanel1.add(girisYap, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 889, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tcTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcTextFieldActionPerformed

    private void girisYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisYapActionPerformed
        tc=tcTextField.getText();
        sifre=String.valueOf(sifrePasswordField.getPassword());
        if(tc.equals(""))
        {
            JOptionPane.showMessageDialog(null, "TC numarası boş bırakılamaz.");
        }
        else if(!isNumeric(tc))
        {
            JOptionPane.showMessageDialog(null, "TC numarası sadece rakamlardan oluşa bilir.");
            tcTextField.setText("");
            sifrePasswordField.setText("");
        }
        else if(tc.length()!=11)
        {
           JOptionPane.showMessageDialog(null, "TC numarası 11 rakamdan oluşmalıdır"); 
           tcTextField.setText("");
           sifrePasswordField.setText("");
        }
        else
        {
            Insan.setTCnum(tc);
            Insan.setPassword(sifre);
            try {
                if(ConnectionDB.oturumAc())
                {
                    System.out.print("oturum acildi");
                    if(Insan.getTip().equals("3"))
                    {
                        GuiMuzeYoneticisi gmy=new GuiMuzeYoneticisi();
                        this.setVisible(false);
                        gmy.setVisible(true);
                    }
                    if(Insan.getTip().equals("2"))
                    {
                        ConnectionDB.isciBilgileri();
                        GuiIsci gi=new GuiIsci();
                        gi.getSoyisim_degisken().setText(Insan.getSoyisim());
                        gi.getIsim_degisken().setText(Insan.getIsim());
                        gi.getTc_degisken().setText(Insan.getTCnum());
                        gi.getMaas_degisken().setText(Insan.getMaas());
                        this.setVisible(false);
                        gi.setVisible(true);
                    }
                    if(Insan.getTip().equals("1"))
                    {
                        GuiMusteri gm=new GuiMusteri();
                        this.setVisible(false);
                        gm.setVisible(true);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "TC numarasını ve ya şifrenizi yanlış girdiniz.");
                    System.out.print("Tc veya Sifrenizi yanlis girdiniz");
                    System.out.print("oturum acilmadi");
                    tcTextField.setText("");
                    sifrePasswordField.setText("");
                }
 //               burada tc ve sifre database-de yoxlanilacaq.Eger yoxdursa ekrana error verilecek. tc ve tipi saxlanilacaq insan clasinda
              } catch (SQLException ex) {
                    System.out.println("adfss");
            }
        }
            
    }//GEN-LAST:event_girisYapActionPerformed
    
    public boolean isNumeric(String s) {  
        return s != null && s.matches("[-+]?\\d*\\.?\\d+");  
    }
    
    private void sifrePasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifrePasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sifrePasswordFieldActionPerformed

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
            java.util.logging.Logger.getLogger(GuiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiLogin().setVisible(true);
                
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button girisYap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label oturumText;
    private javax.swing.JPasswordField sifrePasswordField;
    private java.awt.TextField tcTextField;
    // End of variables declaration//GEN-END:variables

    private void sifirla() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
