/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

/**
 *
 * @author utpl-4
 */
public class done extends javax.swing.JFrame {

    /**
     * Creates new form done
     */
    public done() {
        initComponents();
    }
    String msg,name,mobile,email;
     public done(String para,String para2,String para3,String para4){
        initComponents();
        
       Address.setText(para);
        CustomerName.setText(para2);
        mobileNum.setText(para3);
        Email.setText(para4);
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
        jPanel2 = new javax.swing.JPanel();
        address = new javax.swing.JLabel();
        thankyou = new javax.swing.JLabel();
        orderagainbutton = new javax.swing.JButton();
        yourorderbutton = new javax.swing.JButton();
        CustomerName = new javax.swing.JLabel();
        mobileNum = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(232, 186, 111));

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 4, 4));
        jLabel1.setText("7 FOOD COURT ORDERING SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(78, 197, 198));

        address.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        address.setForeground(new java.awt.Color(173, 8, 8));
        address.setText("Your Order Placed  to this Address.");

        thankyou.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        thankyou.setForeground(new java.awt.Color(167, 6, 6));
        thankyou.setText("Thank You.!");

        orderagainbutton.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        orderagainbutton.setForeground(new java.awt.Color(14, 77, 22));
        orderagainbutton.setText("Order Again.!");
        orderagainbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderagainbuttonActionPerformed(evt);
            }
        });

        yourorderbutton.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        yourorderbutton.setForeground(new java.awt.Color(14, 77, 22));
        yourorderbutton.setText("Your Order");
        yourorderbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yourorderbuttonActionPerformed(evt);
            }
        });

        CustomerName.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        CustomerName.setForeground(new java.awt.Color(2, 40, 3));

        mobileNum.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        mobileNum.setForeground(new java.awt.Color(2, 40, 3));

        Email.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        Email.setForeground(new java.awt.Color(2, 40, 3));

        Address.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        Address.setForeground(new java.awt.Color(2, 40, 3));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(address)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 485, Short.MAX_VALUE)
                        .addComponent(orderagainbutton)
                        .addGap(191, 191, 191))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(yourorderbutton)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(thankyou))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mobileNum)
                            .addComponent(CustomerName)
                            .addComponent(Email)
                            .addComponent(Address))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(address)
                    .addComponent(orderagainbutton))
                .addGap(29, 29, 29)
                .addComponent(CustomerName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(mobileNum)
                .addGap(34, 34, 34)
                .addComponent(Email)
                .addGap(40, 40, 40)
                .addComponent(Address)
                .addGap(58, 58, 58)
                .addComponent(thankyou)
                .addGap(38, 38, 38)
                .addComponent(yourorderbutton)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void orderagainbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderagainbuttonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Menu ob=new Menu();
        ob.setVisible(true);
        
    }//GEN-LAST:event_orderagainbuttonActionPerformed

    private void yourorderbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yourorderbuttonActionPerformed
        // TODO add your handling code here:
         String msg = Address.getText();
         String name = CustomerName.getText();
         String mobile = mobileNum.getText();
         String email = Email.getText();
       
        
        
        new myorder(msg,name,mobile,email).setVisible(true);
    }//GEN-LAST:event_yourorderbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(done.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(done.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(done.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(done.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new done().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JLabel CustomerName;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel address;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel mobileNum;
    private javax.swing.JButton orderagainbutton;
    private javax.swing.JLabel thankyou;
    private javax.swing.JButton yourorderbutton;
    // End of variables declaration//GEN-END:variables
}
