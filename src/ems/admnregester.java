/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ems;

import java.awt.HeadlessException;
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
public class admnregester extends javax.swing.JFrame {

     Statement st=null;
     
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    
    public admnregester() {
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
      
      
     @SuppressWarnings("deprecation")
        private void login(){
        
        String qry="select user_name,password from admin where user_name=? and password=?;";
        
        try{
            pst=conn.prepareStatement(qry);
            pst.setString(1, txtuser.getText());
            pst.setString(2, txtps.getText());
            rs=pst.executeQuery();
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"Username & Password Correct");
               this.dispose();
              new ad_home().setVisible(true);
  
            }else{
                JOptionPane.showMessageDialog(null,"Username & Password Invalid","Erorr",JOptionPane.ERROR_MESSAGE);

            }
            
            
        }catch(SQLException | HeadlessException e){
    JOptionPane.showMessageDialog(null,e,"Erorr",JOptionPane.ERROR_MESSAGE);

        }
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
        jLabel3 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        txtps = new javax.swing.JPasswordField();
        btnlogin = new javax.swing.JToggleButton();
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

        jPanel1.setMaximumSize(new java.awt.Dimension(420, 403));
        jPanel1.setMinimumSize(new java.awt.Dimension(420, 403));
        jPanel1.setPreferredSize(new java.awt.Dimension(420, 403));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("User Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 160, 80, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Passwaord");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 210, 90, 20);

        txtuser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtuser);
        txtuser.setBounds(150, 160, 165, 25);

        txtps.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtps);
        txtps.setBounds(150, 210, 165, 25);

        btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/login.png"))); // NOI18N
        btnlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlogin.setPreferredSize(new java.awt.Dimension(125, 35));
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogin);
        btnlogin.setBounds(210, 270, 125, 35);

        btncancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/cn.png"))); // NOI18N
        btncancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncancel.setPreferredSize(new java.awt.Dimension(125, 35));
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel1.add(btncancel);
        btncancel.setBounds(270, 350, 125, 35);

        btnbk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/back.png"))); // NOI18N
        btnbk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbk.setPreferredSize(new java.awt.Dimension(125, 35));
        btnbk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbkActionPerformed(evt);
            }
        });
        jPanel1.add(btnbk);
        btnbk.setBounds(120, 350, 125, 35);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/admnregfrm.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 420, 403);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

conn=Connectdb();        

// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed

login();        
// TODO add your handling code here:
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnbkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbkActionPerformed

this.dispose();
 new admin().setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_btnbkActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
this.dispose();
        

// TODO add your handling code here:
    }//GEN-LAST:event_btncancelActionPerformed

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
            java.util.logging.Logger.getLogger(admnregester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admnregester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admnregester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admnregester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new admnregester().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbk;
    private javax.swing.JButton btncancel;
    private javax.swing.JToggleButton btnlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtps;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}