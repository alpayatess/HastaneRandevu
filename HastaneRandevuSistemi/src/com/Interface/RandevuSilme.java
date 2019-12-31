package com.Interface;

import com.JDBConnection.JavaBaglanti;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class RandevuSilme extends javax.swing.JFrame {
Connection con;
ResultSet rs;
PreparedStatement pst;
    
    public RandevuSilme() {
        super("RandevuSilme");
        initComponents();
        con=JavaBaglanti.ConnectDb();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gazi Üniversite Hastanesi Randevu Sistemi");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Randevu Silme", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ankara Meslek Hastalıkları Hastanesi", "Ankara Haymana Devlet Hastanesi", "Ankara Pursaklar Devlet Hastanesi", "Ankara Şehir Hastanesi" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2İtemStateChanged(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel6.setText("TC NO");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kardiyoloji", "Ortapedi", "Enfeksiyon", "Üroloji" }));
        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3İtemStateChanged(evt);
            }
        });
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Bölümler");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prof.Dr. Mehmet Öz", "Ord.Prof.Dr.Onur Serin" }));

        jLabel4.setText("Tarih");

        jLabel5.setText("Silmek istediğiniz randevunun bilgilerini doğru bir şekilde giriniz");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Admin/home.png"))); // NOI18N
        jButton2.setText("Ana Ekran");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Doktorlar");

        jTextField1.setText("5 Ocak 2020 11:30 şeklinde randevu tarihinizi giriniz.");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField1MousePressed(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Admin/delete.png"))); // NOI18N
        jButton3.setText("Randevu Sil");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Hastaneler");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2))
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2İtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2İtemStateChanged
        if(jComboBox2.getSelectedIndex()==0){
            jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kardiyoloji", "Ortapedi", "Enfeksiyon", "Üroloji" }));
        }
        else if(jComboBox2.getSelectedIndex()==1){
            jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nöroloji", "Genel Cerrahi", "Çocuk Hastalıkları", "Göz Hastalıkları" }));
        }
        else if(jComboBox2.getSelectedIndex()==2){
            jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kulak burun boğaz", "Kadın doğum","Hemotoloji", "Kalp Hastalıkları" }));
        }
        else if(jComboBox2.getSelectedIndex()==3){
            jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Endokronoloji", "Göğüs Hastalıkları","Jinekoloji", "Fizik Tedavi" }));
        }
    }//GEN-LAST:event_jComboBox2İtemStateChanged

    private void jComboBox3İtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3İtemStateChanged
        if(jComboBox2.getSelectedIndex()==0 && jComboBox3.getSelectedIndex()==0){
            jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prof.Dr. Mehmet Öz", "Ord.Prof.Dr.Onur Serin"  }));
        }
        else if(jComboBox2.getSelectedIndex()==0 && jComboBox3.getSelectedIndex()==1){
            jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doç.Dr.Ahmet Yavuz", "Alper Doğru"  }));
        }
        else if(jComboBox2.getSelectedIndex()==0 && jComboBox3.getSelectedIndex()==2){
            jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prof.Dr.Esra Çınar", "Doç.Dr.Selcen Taşer",  }));
        }
        else if(jComboBox2.getSelectedIndex()==0 && jComboBox3.getSelectedIndex()==3){
            jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doç.Dr.Berkay Yılan", "Dr.Recep Erdoğdu",  }));
        }
        else if(jComboBox2.getSelectedIndex()==1 && jComboBox3.getSelectedIndex()==0){
            jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dr.Talha Kartal", "Dr.Onur Ahmet",  }));
        }
        else if(jComboBox2.getSelectedIndex()==1 && jComboBox3.getSelectedIndex()==1){
            jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prof.Dr.Muhammed Osman Eroğlu", "Prof.Dr.BFT",  }));
        }
        else if(jComboBox2.getSelectedIndex()==1 && jComboBox3.getSelectedIndex()==2){
            jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doç.Dr.İlayda Erdoğan", "Yrd.Doç.Dr.Zeynep Okçu",  }));
        }
        else if(jComboBox2.getSelectedIndex()==1 && jComboBox3.getSelectedIndex()==3){
            jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ord.Prof.Dr.Mustafa Alpay Ateş", "Dr.Sualp Okur",  }));
        }
        else if(jComboBox2.getSelectedIndex()==2 && jComboBox3.getSelectedIndex()==0){
            jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prof.Dr.Abdullah Arda Kılıç", "Doç.Dr.Mehmet Yakar",  }));
        }
        else if(jComboBox2.getSelectedIndex()==2 && jComboBox3.getSelectedIndex()==1){
            jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prof.Dr.Cemal Vur", "Doç.Dr.Uğur Taş",  }));
        }
        else if(jComboBox2.getSelectedIndex()==2 && jComboBox3.getSelectedIndex()==2){
            jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dr.Hakan Yıldırım", "Dr.Cemre Işık",  }));
        }
        else if(jComboBox2.getSelectedIndex()==2 && jComboBox3.getSelectedIndex()==3){
            jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prof.Dr.Alev Ateş", "Ord.Prof.Dr.Yıldız Yılmaz",  }));
        }
        else if(jComboBox2.getSelectedIndex()==3 && jComboBox3.getSelectedIndex()==0){
            jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prof.Dr.Fecir Duran", "Prof.Dr.Ayhan Erdem",  }));
        }
        else if(jComboBox2.getSelectedIndex()==3 && jComboBox3.getSelectedIndex()==1){
            jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prof.Dr.Muhammed Enes Karakaya", "Habip Şana",  }));
        }
        else if(jComboBox2.getSelectedIndex()==3 && jComboBox3.getSelectedIndex()==2){
            jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ord.Prof.Dr.Onur Deniz Yiğitbaşı", "Prof.Dr.Alp Doğukan Şahin",  }));
        }
        else if(jComboBox2.getSelectedIndex()==3 && jComboBox3.getSelectedIndex()==3){
            jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doç.Dr.Hatice Altın", "Doç.Dr.Ayşe Fatma Hariye Nuriye",  }));}
    }//GEN-LAST:event_jComboBox3İtemStateChanged

    private void jTextField1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MousePressed
        jTextField1.setText(" ");
    }//GEN-LAST:event_jTextField1MousePressed

 
            
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    // GERİ BUTONU      
        setVisible(false);
            AnaEkran a=new AnaEkran();
            a.setVisible(true);       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String str="DELETE from Randevu where (TCNO=? and Hastaneler=? and Bolumler=? and Doktorlar=? and Tarih=?)";
    try {
        pst=con.prepareStatement(str);
        pst.setString(1,jTextField2.getText());
        pst.setString(2,(String)jComboBox2.getSelectedItem());
        pst.setString(3,(String)jComboBox3.getSelectedItem());
        pst.setString(4,(String)jComboBox4.getSelectedItem());
        pst.setString(5,jTextField1.getText());
        if(jTextField1.getText()!=null){
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null,"Randevu başarıyla silindi.");
        }
        else{
            JOptionPane.showMessageDialog(null,"Randevu bulunamadı");
        }
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
    }
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

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
            java.util.logging.Logger.getLogger(RandevuSilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RandevuSilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RandevuSilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RandevuSilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RandevuSilme().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
