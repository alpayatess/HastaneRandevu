package com.Interface;

import com.JDBConnection.JavaBaglanti;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class RandevuAlma extends javax.swing.JFrame {
Connection con;
ResultSet rs;
PreparedStatement pst;
int Randevuid = 0;
   
       public RandevuAlma() {
     
        super("RandevuAlma");
        initComponents();
        con=JavaBaglanti.ConnectDb();
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jComboBox7 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gazi Üniversite Hastanesi Randevu Sistemi");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Randevu Alma", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jLabel9.setText("Saat");

        jLabel8.setText("Yıl");

        jLabel3.setText("Doktorlar");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023" }));

        jLabel6.setText("Gün");

        jLabel2.setText("Bölümler");

        jLabel5.setText("TC Kimlik No");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10:00", "10:30", "11:00", "11:30", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30" }));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Admin/document_add.png"))); // NOI18N
        jButton1.setText("Randevuyu Al");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık" }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Admin/back.png"))); // NOI18N
        jButton2.setText("Geri Dön");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Hastaneler");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kardiyoloji", "Ortapedi", "Enfeksiyon", "Üroloji", " " }));
        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3İtemStateChanged(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prof.Dr. Mehmet Öz", "Ord.Prof.Dr.Onur Serin" }));

        jLabel4.setText("Tarih");

        jLabel7.setText("Ay");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ankara Meslek Hastalıkları Hastanesi", "Ankara Haymana Devlet Hastanesi", "Ankara Pursaklar Devlet Hastanesi", "Ankara Şehir Hastanesi" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2İtemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel7)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel9)
                                .addGap(20, 20, 20))))
                    .addComponent(jTextField1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String str="Select * from Randevu where Doktorlar=? and Tarih=?";
    try {
        pst=con.prepareStatement(str);
        pst.setString(1,(String)jComboBox4.getSelectedItem());
        pst.setString(2,jComboBox5.getSelectedItem().toString()+" "+jComboBox7.getSelectedItem().toString() +
                " "+jComboBox6.getSelectedItem().toString()+" "+jComboBox1.getSelectedItem().toString());
        rs=pst.executeQuery();
        if(rs.next()){ 
            JOptionPane.showMessageDialog(null,"Randevu tarihi dolu");
        }
        else{
            try{  
            String sql="Insert into Randevu(TCNO,Hastaneler,Bolumler,Doktorlar,Tarih) values(?,?,?,?,?) ";      
            pst=con.prepareStatement(sql);
            pst.setString(1,jTextField1.getText());
            pst.setString(2,(String)jComboBox2.getSelectedItem());
            pst.setString(3,(String)jComboBox3.getSelectedItem());
            pst.setString(4,(String)jComboBox4.getSelectedItem());           
            pst.setString(5,jComboBox5.getSelectedItem().toString()+" "+jComboBox7.getSelectedItem().toString() 
                    +" "+jComboBox6.getSelectedItem().toString()+" "+jComboBox1.getSelectedItem().toString());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Randevu Alındı.");
            setVisible(false);
            AnaEkran ob = new AnaEkran();
            ob.setVisible(true);     
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }
    }
}
    catch(Exception e){
        
        JOptionPane.showMessageDialog(null,e);
    }
        
    }//GEN-LAST:event_jButton1ActionPerformed


        // 
    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

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
            jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doç.Dr.Alexis Berkay Texas", "Dr.Recep Tayyip Erdoğan",  }));
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
            jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doç.Dr.Hatice Altın", "Doç.Dr.Ayşe Fatma Hariye Nuriye",  }));
        }
    }//GEN-LAST:event_jComboBox3İtemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       setVisible(false);
       AnaEkran a=new AnaEkran();
       a.setVisible(true);
       
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(RandevuAlma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RandevuAlma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RandevuAlma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RandevuAlma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RandevuAlma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
