
public class NewJFrame extends javax.swing.JFrame {
       public static int fin_k=500,fis_k=500,cek_k=500,leb_k=500;
       public static int fin=250,fis=0,cek=0,leb=0,indeks,kg;

    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pb1 = new javax.swing.JProgressBar();
        cb1 = new javax.swing.JComboBox<>();
        t1 = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pb1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fıstık", "Fındık", "Çekirdek", "Leblebi" }));
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });

        b1.setText("AL");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setText("SAT");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 0, 102));
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Her Ürün İçin Depo Kapasitesi 500 KG dır...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pb1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(b1)
                                    .addGap(18, 18, 18)
                                    .addComponent(b2))
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1)
                    .addComponent(b2))
                .addGap(18, 18, 18)
                .addComponent(pb1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
       if(cb1.getSelectedIndex()==0)
       {
           pb1.setValue(((fis*100)/fis_k));
           l1.setText(String.valueOf(pb1.getValue()));
       }else if(cb1.getSelectedIndex()==1)
       {
           pb1.setValue(((fin*100)/fin_k));
           l1.setText(String.valueOf(pb1.getValue()));
       }else if(cb1.getSelectedIndex()==2)
       {
           pb1.setValue(((cek*100)/cek_k));
           l1.setText(String.valueOf(pb1.getValue()));
       }else if(cb1.getSelectedIndex()==3)
       {
           pb1.setValue(((leb*100)/leb_k));
           l1.setText(String.valueOf(pb1.getValue()));
       }           
    }//GEN-LAST:event_cb1ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        indeks=cb1.getSelectedIndex();
        kg=Integer.valueOf(t1.getText());
        switch(indeks)
        {
            case 0: 
            {
                setActionBarIncrease(fis,fis_k);
            }break;
            case 1: 
            {
                setActionBarIncrease(fin,fin_k);
            }break;
            case 2: 
            {
                setActionBarIncrease(cek,cek_k);
            }break;
            case 3: 
            {
                setActionBarIncrease(leb,leb_k);
            }break;
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        indeks=cb1.getSelectedIndex();
        kg=Integer.valueOf(t1.getText());
        switch(indeks)
        {
            case 0: 
            {
                setActionBarRemove(fis,fis_k);
            }break;
            case 1: 
            {
                setActionBarRemove(fin,fin_k);
            }break;
            case 2: 
            {
                setActionBarRemove(cek,cek_k);
            }break;
            case 3: 
            {
                setActionBarRemove(leb, leb_k);
            }break;
        }
    }//GEN-LAST:event_b2ActionPerformed

    public void setActionBarIncrease(Integer param, Integer param2){
        if((param+kg)>param2)
                {
                    l1.setText("Depoda yeterli miktarda yer yok...");
                }else
                {
                    param+=kg;
                    pb1.setValue(((param*100)/param2));
                    l1.setText(String.valueOf(pb1.getValue()));
                }
    }
    
    public void setActionBarRemove(Integer param, Integer param2){
        if((param-kg)<0)
                {
                    l1.setText("Depoda yeterli miktarda ürün yok...");
                }else
                {
                    param-=kg;
                    pb1.setValue(((param*100)/param2));
                    l1.setText(String.valueOf(pb1.getValue()));
                }
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });

    }
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel l1;
    private javax.swing.JProgressBar pb1;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}
