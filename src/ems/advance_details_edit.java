/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ems;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Nuwan
 */
public class advance_details_edit extends javax.swing.JFrame {
    

    /**
     * Creates new form advance_form
     */
    String url="jdbc:mysql://localhost:3306/project?zeroDateTimeBehavior=convertToNull";
    Statement st=null;
    
    
    public advance_details_edit() {
        initComponents();
    }
    
    
 private void search(){
 
 String qry,id,qua,c_nm,e_nm,c_add,c_no,essd,eeed,type,prvd,tsd,ted,noti,bsal,alw,ded,tot="";
 String srch=lblaid.getText();
 
 try{
     Connection conn = DriverManager.getConnection(url,"root","");
     System.out.println("Connection Successfully");
     st=conn.createStatement();
     qry="select emp_id,qualification,c_name,e_name,c_address,c_phone_no,st_date,st_m,st_y,en_date,e_m,e_y,t_type,t_provider,s_date,s_m,s_y,e_date,en_y,en_m,notification,b_salary,elawances,deduction,total from emp_advance where emp_id=('"+srch+"')";
     try (ResultSet rs = st.executeQuery(qry)) {
         while(rs.next()){
             id=rs.getString("emp_id");
             qua=rs.getString("qualification");
             c_nm=rs.getString("c_name");
             e_nm=rs.getString("e_name");
             c_add=rs.getString("c_address");
             c_no=rs.getString("c_phone_no");
             String std = rs.getString("st_date");
             String stm = rs.getString("st_m");
             String sty = rs.getString("st_y");
             eeed=rs.getString("en_date");
             String eeem = rs.getString("e_m");
             String eeey = rs.getString("e_y");
             type=rs.getString("t_type");
             prvd=rs.getString("t_provider");
             tsd=rs.getString("s_date");
             String tsm = rs.getString("s_m");
             String tsy = rs.getString("s_y");
             ted=rs.getString("e_date");
             String tey = rs.getString("en_y");
             String tem = rs.getString("en_m");
             noti=rs.getString("notification");
             bsal=rs.getString("b_salary");
             alw=rs.getString("elawances");
             ded=rs.getString("deduction");
             tot=rs.getString("total");
             
             lblaid.setText(id);
             txtqua.setText(qua);
             txtcompany.setText(c_nm);
             txtenm.setText(e_nm);
             txtcadd.setText(c_add);
             txtcno.setText(c_no);
             cmbsy2.setSelectedItem(sty);
             cmbsm2.setSelectedItem(stm);
             cmbsd2.setSelectedItem(std);
             cmbsy3.setSelectedItem(eeey);
             cmbsm3.setSelectedItem(eeem);
             cmbsd3.setSelectedItem(eeed);
             txttype.setText(type);
             txtprvd.setText(prvd);
             cmbsy.setSelectedItem(tsy);
             cmbsm.setSelectedItem(tsm);
             cmbsd.setSelectedItem(tsd);
             cmbsy1.setSelectedItem(tey);
             cmbsm1.setSelectedItem(tem);
             cmbsd1.setSelectedItem(ted);
             txtbsal.setText(bsal);
             txtelw.setText(alw);
             txtded.setText(ded);
             txttot.setText(tot);
             
             
             
             
         }
     }
        st.close();
        
     
 }
 catch(Exception e){
        System.out.println("Result faild.........!"+e);
 JOptionPane.showMessageDialog(null,"Search Faild.....!"+e,"Erorr",JOptionPane.ERROR_MESSAGE);


}
 
 
 }  
    
    
    
     private void update(){
     
     String id=lblaid.getText();
     String qua=txtqua.getText();
     String company=txtcompany.getText();
     String enm=txtenm.getText();
     String cadd=txtcadd.getText();
     String cno=txtcno.getText();
         String sty = cmbsy2.getSelectedItem().toString();
            String stm=cmbsm2.getSelectedItem().toString();
            String std=cmbsd2.getSelectedItem().toString();
            String eeey=cmbsy3.getSelectedItem().toString();
            String eeem=cmbsm3.getSelectedItem().toString();
            String eeed=cmbsd3.getSelectedItem().toString();
     String type=txttype.getText();
     String prvd=txtprvd.getText();
        String tsy = cmbsy.getSelectedItem().toString();
        String tsm = cmbsm.getSelectedItem().toString();
        String tsd = cmbsd.getSelectedItem().toString();
        String tey = cmbsy1.getSelectedItem().toString();
        String tem = cmbsm1.getSelectedItem().toString();
        String ted = cmbsd1.getSelectedItem().toString();
     String noti=txtnoti.getText();
     String bsal=txtbsal.getText();
     String elw=txtelw.getText();
     String ded=txtded.getText();
     String tot=txttot.getText();
      String qry="";
      
      
      try{
        Connection conn=DriverManager.getConnection(url,"root","");
     System.out.println("Connection Successfully");
qry="UPDATE `project`.`emp_advance` SET `emp_id` = '"+id+"', `qualification` = '"+qua+"', `c_name` = '"+company+"', `e_name` = '"+enm+"', `c_address` = '"+cadd+"', `c_phone_no` = '"+cno+"', `st_date` = '"+std+"', `st_m` = '"+stm+"', `st_y` = '"+sty+"', `en_date` = '"+eeed+"', `e_m` = '"+eeem+"', `e_y` = '"+eeey+"', `t_type` = '"+type+"', `t_provider` = '"+prvd+"', `s_date` = '"+tsd+"', `s_m` = '"+tsm+"', `s_y` = '"+tsy+"', `e_date` = '"+ted+"', `en_y` = '"+tey+"', `en_m` = '"+tem+"', `notification` = '"+noti+"', `b_salary` = '"+bsal+"', `elawances` = '"+elw+"', `deduction` = '"+ded+"', `total` = '"+tot+"' WHERE `emp_advance`.`emp_id` = '"+id+"'";     
//qry="UPDATE `project`.`emp_advance` SET `emp_id` = '"+id+"', `qualification` = '"+qua+"', `c_name` = '"+company+"', `e_name` = '"+enm+"', `c_address` = '"+cadd+"', `c_phone_no` = '"+cno+"', `st_date` = '"+esd+"', `en_date` = '"+eed+"', `t_type` = '"+type+"', `t_provider` = '"+prvd+"', `s_date` = '"+tsd+"', `e_date` = '"+ted+"', `notification` = '"+noti+"', `b_salary` = '"+bsal+"', `elawances` = '"+elw+"', `deduction` = '"+ded+"', `total` = '"+tot+"' WHERE `emp_advance`.`emp_id` = '"+id+"'";  
      st=conn.createStatement();
      JOptionPane.showMessageDialog(null,"Saving complete.....!");
      st.executeUpdate(qry);
      st.close();
             
      }
         catch(SQLException | HeadlessException e){
        System.out.println("Connection Faild.........!"+e);
        JOptionPane.showMessageDialog(null,"Connection Faild"+e,"Erorr",JOptionPane.ERROR_MESSAGE);    
     }
            }  

    
   /* 
    private void msgbox(){
 
     
     if(id.isEmpty())
     {
     JOptionPane.showMessageDialog(null,"Please Enter EMP ID","Erorr",JOptionPane.ERROR_MESSAGE);
     }
     else{
     connect();
     this.dispose();
     new add_frm().setVisible(true);
     }
    
    }*/
/*
     private void connect(){
     
     String id=lblaid.getText();
     String qua=txtqua.getText();
     String company=txtcompany.getText();
     String enm=txtenm.getText();
     String cadd=txtcadd.getText();
     String cno=txtcno.getText();
     String esy=cmbsy2.getSelectedItem().toString();
     String esm=cmbsm2.getSelectedItem().toString();
     String esd=cmbsd2.getSelectedItem().toString();
     
     String eey=cmbsy3.getSelectedItem().toString();
     String eem=cmbsm3.getSelectedItem().toString();
     String eed=cmbsd3.getSelectedItem().toString();
     String type=txttype.getText();
     String prvd=txtprvd.getText();
     String tsy =cmbsy.getSelectedItem().toString();
     String tsm =cmbsm.getSelectedItem().toString();
     String tsd =cmbsd.getSelectedItem().toString();
     String tey=cmbsy1.getSelectedItem().toString();
     String tem=cmbsm1.getSelectedItem().toString();
     String ted=cmbsd1.getSelectedItem().toString();
     String noti=txtnoti.getText();
     String bsal=txtbsal.getText();
     String elw=txtelw.getText();
     String ded=txtded.getText();
     String tot=txttot.getText();
     String qry="";
      
      
      try{
        Connection conn=DriverManager.getConnection(url,"root","");
     System.out.println("Connection Successfully");
     qry="INSERT INTO `project`.`emp_advance` (`emp_id`, `qualification`, `c_name`, `e_name`, `c_address`, `c_phone_no`, `st_date`, `st_m`, `st_y`, `en_date`, `e_m`, `e_y`, `t_type`, `t_provider`, `s_date`, `s_m`, `s_y`, `e_date`, `en_y`, `en_m`, `notification`, `b_salary`, `elawances`, `deduction`, `total`) VALUES ('"+id+"', '"+qua+"', '"+company+"', '"+enm+"', '"+cadd+"', '"+cno+"', '"+esy+"', '"+esm+"', '"+esy+"', '"+eed+"', '"+eem+"', '"+eey+"', '"+type+"', '"+prvd+"', '"+tsd+"', '"+tsm+"', '"+tsy+"', '"+ted+"', '"+tey+"', '"+tem+"', '"+noti+"', '"+bsal+"', '"+elw+"', '"+ded+"', '"+tot+"')";
     //qry="INSERT INTO `project`.`emp_advance` (`emp_id`, `qualification`, `c_name`, `e_name`, `c_address`, `c_phone_no`, `st_date`, `en_date`, `t_type`, `t_provider`, `s_date`, `e_date`, `notification`, `b_salary`, `elawances`, `deduction`, `total`)                                                                   VALUES ('"+id+"', '"+qua+"', '"+company+"', '"+enm+"', '"+cadd+"', '"+cno+"', '"+esd+"', '"+eed+"', '                                     "+type+"', '"+prvd+"', '"+tsd+"', '"+ted+"', '"+noti+"', '"+bsal+"', '"+elw+"', '"+ded+"', '"+tot+"')";  
      st=conn.createStatement();
      JOptionPane.showMessageDialog(null,"Saving complete.....!");
      st.executeUpdate(qry);
      st.close();
             
      }
         catch(SQLException | HeadlessException e){
        System.out.println("Connection Faild.........!"+e);
        JOptionPane.showMessageDialog(null,"Connection Faild"+e,"Erorr",JOptionPane.ERROR_MESSAGE);    
     }
            }*/
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txttype = new javax.swing.JTextField();
        txtprvd = new javax.swing.JTextField();
        cmbsy = new javax.swing.JComboBox();
        cmbsm = new javax.swing.JComboBox();
        cmbsd = new javax.swing.JComboBox();
        cmbsy1 = new javax.swing.JComboBox();
        cmbsm1 = new javax.swing.JComboBox();
        cmbsd1 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtcompany = new javax.swing.JTextField();
        txtenm = new javax.swing.JTextField();
        txtcadd = new javax.swing.JTextField();
        txtcno = new javax.swing.JTextField();
        cmbsy2 = new javax.swing.JComboBox();
        cmbsm2 = new javax.swing.JComboBox();
        cmbsd2 = new javax.swing.JComboBox();
        cmbsy3 = new javax.swing.JComboBox();
        cmbsm3 = new javax.swing.JComboBox();
        cmbsd3 = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtnoti = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtbsal = new javax.swing.JTextField();
        txtelw = new javax.swing.JTextField();
        txtded = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txttot = new javax.swing.JTextField();
        txtqua = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblaid = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Qualification");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 112, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Traning Infromation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 1, 14))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(438, 216));
        jPanel1.setLayout(null);

        jLabel4.setText("Privider :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(16, 74, 43, 14);

        jLabel5.setText("Start Date :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(16, 109, 57, 14);

        jLabel3.setText("Type :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(16, 36, 31, 14);

        jLabel6.setText("End Date :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(16, 147, 51, 14);
        jPanel1.add(txttype);
        txttype.setBounds(91, 33, 148, 20);

        txtprvd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprvdActionPerformed(evt);
            }
        });
        jPanel1.add(txtprvd);
        txtprvd.setBounds(91, 71, 148, 20);

        cmbsy.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbsy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2025" }));
        jPanel1.add(cmbsy);
        cmbsy.setBounds(91, 109, 53, 20);

        cmbsm.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbsm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC", "" }));
        jPanel1.add(cmbsm);
        cmbsm.setBounds(151, 109, 61, 20);

        cmbsd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbsd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "" }));
        jPanel1.add(cmbsd);
        cmbsd.setBounds(221, 109, 47, 20);

        cmbsy1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbsy1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2025" }));
        jPanel1.add(cmbsy1);
        cmbsy1.setBounds(90, 150, 53, 20);

        cmbsm1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbsm1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC", "" }));
        jPanel1.add(cmbsm1);
        cmbsm1.setBounds(150, 150, 61, 20);

        cmbsd1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbsd1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "" }));
        jPanel1.add(cmbsd1);
        cmbsd1.setBounds(220, 150, 47, 20);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 320, 190));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Experirnce", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 1, 14))); // NOI18N

        jLabel9.setText("Employer Name :");

        jLabel10.setText("Company Address :");

        jLabel13.setText("End Date :");

        jLabel12.setText("Start Date :");

        jLabel8.setText("Company Name :");

        jLabel11.setText("Company Phone no :");

        txtcno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcnoActionPerformed(evt);
            }
        });

        cmbsy2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbsy2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2025" }));

        cmbsm2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbsm2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC", "" }));

        cmbsd2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbsd2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "" }));

        cmbsy3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbsy3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2025" }));

        cmbsm3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbsm3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC", "" }));

        cmbsd3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbsd3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtenm, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcompany, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcadd, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcno, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbsy2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(cmbsm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(cmbsd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(cmbsy3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(cmbsm3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(cmbsd3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtcompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12)
                        .addComponent(cmbsy2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbsm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbsd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtenm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cmbsy3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbsm3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbsd3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtcadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtcno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 510, 180));

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Notification", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 1, 14))); // NOI18N

        txtnoti.setColumns(20);
        txtnoti.setRows(5);
        jScrollPane1.setViewportView(txtnoti);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 520, 120));

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Salary Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 1, 14))); // NOI18N

        jLabel16.setText("Basic Salary :");

        jLabel17.setText("Elawances :");

        jLabel18.setText("Deduction :");

        jLabel2.setText("Total :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtbsal)
                    .addComponent(txtelw)
                    .addComponent(txtded)
                    .addComponent(txttot, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtbsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtelw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtded, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txttot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 520, 160));
        getContentPane().add(txtqua, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 109, 390, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/homebtn.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(125, 35));
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 580, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/update.png"))); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(125, 35));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, -1, -1));

        lblaid.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        getContentPane().add(lblaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 110, 20));

        jLabel7.setPreferredSize(new java.awt.Dimension(887, 665));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 710));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/bkgrond.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtprvdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprvdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprvdActionPerformed

    private void txtcnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcnoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
update();
        new add_frm().setVisible(true);
this.dispose();
       

// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
search();
        
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(advance_details_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(advance_details_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(advance_details_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(advance_details_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new advance_details_edit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbsd;
    private javax.swing.JComboBox cmbsd1;
    private javax.swing.JComboBox cmbsd2;
    private javax.swing.JComboBox cmbsd3;
    private javax.swing.JComboBox cmbsm;
    private javax.swing.JComboBox cmbsm1;
    private javax.swing.JComboBox cmbsm2;
    private javax.swing.JComboBox cmbsm3;
    private javax.swing.JComboBox cmbsy;
    private javax.swing.JComboBox cmbsy1;
    private javax.swing.JComboBox cmbsy2;
    private javax.swing.JComboBox cmbsy3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lblaid;
    private javax.swing.JTextField txtbsal;
    private javax.swing.JTextField txtcadd;
    private javax.swing.JTextField txtcno;
    private javax.swing.JTextField txtcompany;
    private javax.swing.JTextField txtded;
    private javax.swing.JTextField txtelw;
    private javax.swing.JTextField txtenm;
    private javax.swing.JTextArea txtnoti;
    private javax.swing.JTextField txtprvd;
    private javax.swing.JTextField txtqua;
    private javax.swing.JTextField txttot;
    private javax.swing.JTextField txttype;
    // End of variables declaration//GEN-END:variables
}
