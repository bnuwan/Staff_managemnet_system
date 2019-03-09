/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ems;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;




/**
 *
 * @author Nuwan
 */
public class manegerregister extends javax.swing.JFrame {
    private static final long serialVersionUID = 1L;

    Statement st=null;
     
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    public manegerregister() {
        initComponents();
    }
  
 
      public static Connection Connectdb(){
    
    try{
     Class.forName("com.mysql.jdbc.Driver");
     Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?zeroDateTimeBehavior=convertToNull","root","");
     System.out.println("Connection Successfully");
     return conn;
     
    }catch(ClassNotFoundException | SQLException e){
         JOptionPane.showMessageDialog(null,"Connection Faild"+e,"Erorr",JOptionPane.ERROR_MESSAGE);  
     return null;
     
        
    }
    
}      
          
          

 
 
  public void close(){
        WindowEvent winclosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winclosingEvent);
        
    }

 
    @SuppressWarnings("deprecation")
    private void login(){
        
        String qry="select user_name,password from manager where user_name=? and password=?;";
        
        try{
            pst=conn.prepareStatement(qry);
            pst.setString(1, txtuser.getText());
            pst.setString(2, txtps.getText());
            rs=pst.executeQuery();
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"Username & Password Correct");
               this.dispose();
               new maneger_home().setVisible(true);
  
            }else{
                JOptionPane.showMessageDialog(null,"Username & Password Invalid","Erorr",JOptionPane.ERROR_MESSAGE);

            }
            
            
        }catch(SQLException | HeadlessException e){
    JOptionPane.showMessageDialog(null,e,"Erorr",JOptionPane.ERROR_MESSAGE);

        }
    }
        
     
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtuser = new javax.swing.JTextField();
        txtps = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnmanlogin = new javax.swing.JToggleButton();
        btncancel = new javax.swing.JButton();
        btnbk = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setMaximumSize(new java.awt.Dimension(420, 403));
        jPanel2.setMinimumSize(new java.awt.Dimension(420, 403));
        jPanel2.setLayout(null);

        txtuser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(txtuser);
        txtuser.setBounds(160, 180, 165, 25);

        txtps.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(txtps);
        txtps.setBounds(160, 220, 165, 25);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Passwaord");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(50, 220, 80, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("User Name");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(50, 180, 90, 17);

        btnmanlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/login.png"))); // NOI18N
        btnmanlogin.setPreferredSize(new java.awt.Dimension(125, 35));
        btnmanlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanloginActionPerformed(evt);
            }
        });
        jPanel2.add(btnmanlogin);
        btnmanlogin.setBounds(230, 270, 125, 35);

        btncancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/cn.png"))); // NOI18N
        btncancel.setPreferredSize(new java.awt.Dimension(125, 35));
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel2.add(btncancel);
        btncancel.setBounds(280, 350, 125, 35);

        btnbk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/back.png"))); // NOI18N
        btnbk.setPreferredSize(new java.awt.Dimension(125, 35));
        btnbk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbkActionPerformed(evt);
            }
        });
        jPanel2.add(btnbk);
        btnbk.setBounds(130, 350, 125, 35);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/admnregfrm.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(125, 35));
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 420, 403);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        conn=Connectdb();
    }//GEN-LAST:event_formWindowOpened

    private void btnmanloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanloginActionPerformed
        login();
  
    }//GEN-LAST:event_btnmanloginActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed

this.dispose();


// TODO add your handling code here:
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnbkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbkActionPerformed
this.dispose();
new admin().setVisible(true);
        

// TODO add your handling code here:
    }//GEN-LAST:event_btnbkActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(manegerregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manegerregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manegerregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manegerregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new manegerregister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbk;
    private javax.swing.JButton btncancel;
    private javax.swing.JToggleButton btnmanlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtps;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
