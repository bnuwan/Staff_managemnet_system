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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nuwan
 */
public class viewemp extends javax.swing.JFrame {
    
    
     public viewemp() {
        initComponents();
    }

             
             
             
             
             
    String url="jdbc:mysql://localhost:3306/project?zeroDateTimeBehavior=convertToNull";
    Statement st=null;
   
   
   /* 
    private void srch(){
    String sch=txtsch.getText();
    if(sch.isEmpty())
    {
    JOptionPane.showMessageDialog(null,"Please Enter EMP ID","Erorr",JOptionPane.ERROR_MESSAGE);
    }
    else{
    search();
    
    }
    
    }*/
    
private void search(){
String sm,sd,em,ed,sy,ey,ps,user,sch,qry,fnm,mnm,lnm,id,bdy,bdm,bdd,nic,city,age,gender,marital,address,postal,hmno1,hmno2,mo1,mo2,email,center,centerno,desig,sdate,edate="";
sch=lblid.getText();

try{
    try (Connection conn = DriverManager.getConnection(url,"root","")) {
        System.out.println("Connection Successfully");
        st=conn.createStatement();
        qry="select id,f_nm ,m_nm,l_nm,nic,age,doby,gender,marital_status,city,address,postal_code,home_contact1,home_contact2,mobile1,mobile2,email,center,center_con,designation,sy,ey,user_name,password,dobm,dobd,sm,sd,em,ed from genaral where id=('"+sch+"')";
        try (ResultSet rs = st.executeQuery(qry)) {
            while(rs.next()){
                
                id=rs.getString("id");
                fnm=rs.getString("f_nm");
                mnm=rs.getString("m_nm");
                lnm=rs.getString("l_nm");
                nic=rs.getString("nic");
                bdy=rs.getString("doby");
                age=rs.getString("age");
                city=rs.getString("city");
                gender=rs.getString("gender");
                marital=rs.getString("marital_status");
                address=rs.getString("address");
                postal=rs.getString("postal_code");
                hmno1=rs.getString("home_contact1");
                hmno2=rs.getString("home_contact2");
                mo1=rs.getString("mobile1");
                mo2=rs.getString("mobile2");
                email=rs.getString("email");
                center=rs.getString("center");
                centerno=rs.getString("center_con");
                desig=rs.getString("designation");
                sdate=rs.getString("sd");
                edate=rs.getString("ed");
                bdm=rs.getString("dobm");
                bdd=rs.getString("dobd");
                sy=rs.getString("sy");
                ey=rs.getString("ey");
                sm=rs.getString("sm");
                sd=rs.getString("sd");
                em=rs.getString("em");
                ed=rs.getString("ed");
                
                
                
                lblid.setText(id);
                lblfnm.setText(fnm);
                lblmnm.setText(mnm);
                lbllnm.setText(lnm);
                lblnic.setText(nic);
                lblage.setText(age);
                lblcity.setText(city);
                lbladdress.setText(address);
                lblpostal.setText(postal);
                lblhmno1.setText(hmno1);
                lblhmno2.setText(hmno2);
                lblmo1.setText(mo1);
                lblmo2.setText(mo2);
                lblemail.setText(email);
                lblcenter.setText(center);
                lblcentercon.setText(centerno);
                lbldesig.setText(desig);
                lbly.setText(bdy);
                lblm.setText(bdm);
                lbld.setText(bdd);
                lblsy.setText(sy);
                lblsd.setText(sd);
                lblsm.setText(sm);
                lbley.setText(ey);
                lbled.setText(ed);
                lblem.setText(em);
                lblgen.setText(gender);
                lblmarital.setText(marital);
             
                
            }
        }
        st.close();
    }
  
}
catch(Exception e){
        System.out.println("Result faild.........!"+e);
 JOptionPane.showMessageDialog(null,"Search Faild.....!"+e,"Erorr",JOptionPane.ERROR_MESSAGE);


}

}
    
/*
private void msgbox() throws SQLException{

    String fnm=txtfnm.getText();
    
    String lnm=txtlnm.getText();
    String id=lblid.getText();
   // String bdy=txtbdy.getText();
    String nic=txtnic.getText();
    String age=txtage.getText();
    String address=txtaddress.getText();
 
 
    String mo1=txtmo1.getText();
     String center=txtcenter.getText();
    String centerno=txtcentercon.getText();
    String desig=txtdesig.getText();
 //  String sdate=txtsdate.getText();
 
    String city=txtcity.getText();
    String user=txtuser.getText();
    String pass=txtps.getText();
    if(fnm.isEmpty())
    {
     JOptionPane.showMessageDialog(null,"Please Enter First Name","Erorr",JOptionPane.ERROR_MESSAGE);
    }
    else if(lnm.isEmpty())
    {
     JOptionPane.showMessageDialog(null,"Please Enter Last Name","Erorr",JOptionPane.ERROR_MESSAGE);
   }
    else if(id.isEmpty())
    {
    JOptionPane.showMessageDialog(null,"Please Enter EMP ID","Erorr",JOptionPane.ERROR_MESSAGE);
    }
     else if("Year".equals(cmby.getSelectedItem().toString()))
            
    {
     JOptionPane.showMessageDialog(null,"Please Enter Year of Birthday","Erorr",JOptionPane.ERROR_MESSAGE);
    }
    else if("Month".equals(cmbm.getSelectedItem().toString()))
    {
         JOptionPane.showMessageDialog(null,"Please Enter Month of Birthday","Erorr",JOptionPane.ERROR_MESSAGE);
    }
     else if("Day".equals(cmbd.getSelectedItem().toString()))
     {
          JOptionPane.showMessageDialog(null,"Please Enter Day of Birthday","Erorr",JOptionPane.ERROR_MESSAGE);
     }
   
    else if(nic.isEmpty())
    {
     JOptionPane.showMessageDialog(null,"Please Enter NIC","Erorr",JOptionPane.ERROR_MESSAGE);
    }
    else if(age.isEmpty())
    {
     JOptionPane.showMessageDialog(null,"Please Enter Age","Erorr",JOptionPane.ERROR_MESSAGE);

    }
    else if(city.isEmpty())
    { 
        JOptionPane.showMessageDialog(null,"Please Enter city ","Erorr",JOptionPane.ERROR_MESSAGE);

    }
    else if(address.isEmpty())
    {
        JOptionPane.showMessageDialog(null,"Please Enter Address ","Erorr",JOptionPane.ERROR_MESSAGE);

    }
    else if(user.isEmpty())
    {
             JOptionPane.showMessageDialog(null,"Please Enter User Name ","Erorr",JOptionPane.ERROR_MESSAGE);
   
    }
    else if(pass.isEmpty())
    {        JOptionPane.showMessageDialog(null,"Please Enter Password ","Erorr",JOptionPane.ERROR_MESSAGE);
    }
        
        else if(mo1.isEmpty())
        {
                    JOptionPane.showMessageDialog(null,"Please Enter Mobile No","Erorr",JOptionPane.ERROR_MESSAGE);

        }
        
        else if(center.isEmpty())
        {
                    JOptionPane.showMessageDialog(null,"Please Enter Center Name  ","Erorr",JOptionPane.ERROR_MESSAGE);

        }
        else if(centerno.isEmpty())
        {        
            JOptionPane.showMessageDialog(null,"Please Enter Center Contact No ","Erorr",JOptionPane.ERROR_MESSAGE);

        }
        else if(desig.isEmpty())
        {
        JOptionPane.showMessageDialog(null,"Please Enter Designation ","Erorr",JOptionPane.ERROR_MESSAGE);

        }
         else if("Year".equals(cmbsy.getSelectedItem().toString()))
        {
            JOptionPane.showMessageDialog(null,"Please Enter Start Year ","Erorr",JOptionPane.ERROR_MESSAGE);

        }
         else if("Month".equals(cmbsm.getSelectedItem().toString()))
         {
         JOptionPane.showMessageDialog(null,"Please Enter Start Month ","Erorr",JOptionPane.ERROR_MESSAGE);
         }
          else if("Day".equals(cmbsd.getSelectedItem().toString()))
         {
         JOptionPane.showMessageDialog(null,"Please Enter Start Day ","Erorr",JOptionPane.ERROR_MESSAGE);
         }
        else
        {
        update();
       
        // this.dispose();
          //new advance_form().setVisible(true);
        }
        
}*/





   /* 
    private void update() throws SQLException{
    
    String fnm=lblfnm.getText();
    String mnm=txtmnm.getText();
    String lnm=txtlnm.getText();
    String id=lblid.getText();
    
  
    String gender="";
   String mar="";
    //String unm=radunm.getText();
   // String mar=radmar.getText();
    String nic=txtnic.getText();
    String age=txtage.getText();
    String address=txtaddress.getText();
    String postal=txtpostal.getText();
    String hmno1=txthmno1.getText();
    String hmno2=txthmno2.getText();
    String mo1=txtmo1.getText();
    String mo2=txtmo2.getText();
    String email=txtemail.getText();
    String center=txtcenter.getText();
    String centerno=txtcentercon.getText();
    String desig=txtdesig.getText();
  // String sdate=txtsdate.getText();
   //String edate=txtedate.getText();
    String city=txtcity.getText();
    String user=txtuser.getText();
    String ps=txtps.getText();
    String qry="";
     String y=cmby.getSelectedItem().toString();
    String m=cmbm.getSelectedItem().toString();
    String d=cmbd.getSelectedItem().toString();
   String sy=cmbsy.getSelectedItem().toString();
    String sm=cmbsm.getSelectedItem().toString();
    String sd=cmbsd.getSelectedItem().toString();
    String ey=cmbey.getSelectedItem().toString();
    String em=cmbem.getSelectedItem().toString();
    String ed=cmbed.getSelectedItem().toString();
    
    if(radmale.isSelected()) {
        gender="Male";
    } else if(radfemale.isSelected()) {
        gender="Female";
    }
    
    
    if(radunm.isSelected()) {
        mar="Unmarried";
    } else if (radmar.isSelected()) {
        mar="Married";
    }
    
    try{
     Connection conn=DriverManager.getConnection(url,"root","");
     qry="UPDATE `project`.`genaral` SET `id` = '"+id+"', `f_nm` = '"+fnm+"', `m_nm` = '"+mnm+"', `l_nm` = '"+lnm+"', `nic` = '"+nic+"', `age` = '"+age+"', `doby` = '"+y+"', `gender` = '"+gender+"', `marital_status` = '"+mar+"', `city` = '"+city+"', `address` = '"+address+"', `postal_code` = '"+postal+"', `home_contact1` = '"+hmno1+"', `home_contact2` = '"+hmno2+"', `mobile1` = '"+mo1+"', `mobile2` = '"+mo2+"', `email` = '"+email+"', `center` = '"+center+"', `center_con` = '"+centerno+"', `designation` = '"+desig+"', `sy` = '"+sy+" ', `ey` = '"+ey+"', `user_name` = '"+user+"', `password` = '"+ps+"', `dobm` = '"+m+"', `dobd` = '"+d+"', `sm` = '"+sm+"', `sd` = '"+sd+"', `em` = '"+em+"', `ed` = '"+ed+"' WHERE `genaral`.`id` = '"+id+"'";
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
    */
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngen = new javax.swing.ButtonGroup();
        btnmar = new javax.swing.ButtonGroup();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lbld = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lbled = new javax.swing.JLabel();
        lblmo2 = new javax.swing.JLabel();
        lbllnm = new javax.swing.JLabel();
        lblnic = new javax.swing.JLabel();
        lblm = new javax.swing.JLabel();
        lblhmno1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        lblsm = new javax.swing.JLabel();
        lbldesig = new javax.swing.JLabel();
        lblmnm = new javax.swing.JLabel();
        lblem = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lbley = new javax.swing.JLabel();
        lblfnm = new javax.swing.JLabel();
        lblsy = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblage = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        lblcity = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblcentercon = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbladdress = new javax.swing.JLabel();
        lbly = new javax.swing.JLabel();
        lblsd = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblhmno2 = new javax.swing.JLabel();
        lblpostal = new javax.swing.JLabel();
        lblgen = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblmarital = new javax.swing.JLabel();
        lblmo1 = new javax.swing.JLabel();
        lblcenter = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setForeground(new java.awt.Color(255, 0, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(887, 665));
        jPanel1.setLayout(null);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("City :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 330, 36, 17);

        lbld.setBackground(new java.awt.Color(255, 255, 255));
        lbld.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbld.setForeground(new java.awt.Color(255, 255, 255));
        lbld.setToolTipText("");
        jPanel1.add(lbld);
        lbld.setBounds(270, 210, 60, 20);

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Start Date :");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(10, 570, 80, 17);

        lbled.setBackground(new java.awt.Color(255, 255, 255));
        lbled.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbled.setForeground(new java.awt.Color(255, 255, 255));
        lbled.setPreferredSize(new java.awt.Dimension(60, 20));
        jPanel1.add(lbled);
        lbled.setBounds(730, 570, 60, 20);

        lblmo2.setBackground(new java.awt.Color(255, 255, 255));
        lblmo2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmo2.setForeground(new java.awt.Color(255, 255, 255));
        lblmo2.setPreferredSize(new java.awt.Dimension(125, 20));
        jPanel1.add(lblmo2);
        lblmo2.setBounds(720, 460, 125, 20);

        lbllnm.setBackground(new java.awt.Color(255, 255, 255));
        lbllnm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbllnm.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbllnm);
        lbllnm.setBounds(520, 220, 290, 20);

        lblnic.setBackground(new java.awt.Color(255, 255, 255));
        lblnic.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblnic.setForeground(new java.awt.Color(255, 255, 255));
        lblnic.setPreferredSize(new java.awt.Dimension(60, 20));
        jPanel1.add(lblnic);
        lblnic.setBounds(520, 250, 160, 20);

        lblm.setBackground(new java.awt.Color(255, 255, 255));
        lblm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblm.setForeground(new java.awt.Color(255, 255, 255));
        lblm.setToolTipText("");
        jPanel1.add(lblm);
        lblm.setBounds(200, 210, 60, 20);

        lblhmno1.setBackground(new java.awt.Color(255, 255, 255));
        lblhmno1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblhmno1.setForeground(new java.awt.Color(255, 255, 255));
        lblhmno1.setPreferredSize(new java.awt.Dimension(125, 20));
        jPanel1.add(lblhmno1);
        lblhmno1.setBounds(570, 430, 125, 20);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Home Contact No :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(420, 430, 133, 17);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NIC :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(420, 250, 37, 17);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Email :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(10, 460, 60, 17);

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Center :");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(10, 490, 56, 17);

        lblemail.setBackground(new java.awt.Color(255, 255, 255));
        lblemail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblemail.setForeground(new java.awt.Color(255, 255, 255));
        lblemail.setPreferredSize(new java.awt.Dimension(240, 20));
        jPanel1.add(lblemail);
        lblemail.setBounds(120, 460, 240, 20);

        lblsm.setBackground(new java.awt.Color(255, 255, 255));
        lblsm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblsm.setForeground(new java.awt.Color(255, 255, 255));
        lblsm.setPreferredSize(new java.awt.Dimension(60, 20));
        jPanel1.add(lblsm);
        lblsm.setBounds(190, 570, 60, 20);

        lbldesig.setBackground(new java.awt.Color(255, 255, 255));
        lbldesig.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbldesig.setForeground(new java.awt.Color(255, 255, 255));
        lbldesig.setPreferredSize(new java.awt.Dimension(240, 20));
        jPanel1.add(lbldesig);
        lbldesig.setBounds(120, 520, 240, 20);

        lblmnm.setBackground(new java.awt.Color(255, 255, 255));
        lblmnm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmnm.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblmnm);
        lblmnm.setBounds(520, 190, 290, 20);

        lblem.setBackground(new java.awt.Color(255, 255, 255));
        lblem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblem.setForeground(new java.awt.Color(255, 255, 255));
        lblem.setPreferredSize(new java.awt.Dimension(60, 20));
        jPanel1.add(lblem);
        lblem.setBounds(650, 570, 60, 20);

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Age :");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(420, 290, 36, 17);

        lbley.setBackground(new java.awt.Color(255, 255, 255));
        lbley.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbley.setForeground(new java.awt.Color(255, 255, 255));
        lbley.setPreferredSize(new java.awt.Dimension(60, 20));
        jPanel1.add(lbley);
        lbley.setBounds(570, 570, 60, 20);

        lblfnm.setBackground(new java.awt.Color(255, 255, 255));
        lblfnm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblfnm.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblfnm);
        lblfnm.setBounds(520, 160, 290, 20);

        lblsy.setBackground(new java.awt.Color(255, 255, 255));
        lblsy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblsy.setForeground(new java.awt.Color(255, 255, 255));
        lblsy.setPreferredSize(new java.awt.Dimension(60, 20));
        jPanel1.add(lblsy);
        lblsy.setBounds(120, 570, 60, 20);

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("End Date :");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(420, 570, 72, 17);

        lblage.setBackground(new java.awt.Color(255, 255, 255));
        lblage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblage.setForeground(new java.awt.Color(255, 255, 255));
        lblage.setPreferredSize(new java.awt.Dimension(40, 20));
        jPanel1.add(lblage);
        lblage.setBounds(520, 290, 40, 20);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Center Contact No :");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(420, 490, 139, 17);

        lblid.setBackground(new java.awt.Color(255, 255, 255));
        lblid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblid.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblid);
        lblid.setBounds(130, 160, 173, 20);

        lblcity.setBackground(new java.awt.Color(255, 255, 255));
        lblcity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcity.setForeground(new java.awt.Color(255, 255, 255));
        lblcity.setPreferredSize(new java.awt.Dimension(60, 20));
        jPanel1.add(lblcity);
        lblcity.setBounds(120, 330, 240, 20);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Mobile Contact No :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(420, 460, 136, 17);

        lblcentercon.setBackground(new java.awt.Color(255, 255, 255));
        lblcentercon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcentercon.setForeground(new java.awt.Color(255, 255, 255));
        lblcentercon.setPreferredSize(new java.awt.Dimension(125, 20));
        jPanel1.add(lblcentercon);
        lblcentercon.setBounds(570, 490, 125, 20);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Marital Status :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 290, 104, 17);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Gender :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 250, 59, 17);

        lbladdress.setBackground(new java.awt.Color(255, 255, 255));
        lbladdress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbladdress.setForeground(new java.awt.Color(255, 255, 255));
        lbladdress.setPreferredSize(new java.awt.Dimension(60, 14));
        jPanel1.add(lbladdress);
        lbladdress.setBounds(120, 370, 740, 30);

        lbly.setBackground(new java.awt.Color(255, 255, 255));
        lbly.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbly.setForeground(new java.awt.Color(255, 255, 255));
        lbly.setToolTipText("");
        jPanel1.add(lbly);
        lbly.setBounds(130, 210, 60, 20);

        lblsd.setBackground(new java.awt.Color(255, 255, 255));
        lblsd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblsd.setForeground(new java.awt.Color(255, 255, 255));
        lblsd.setPreferredSize(new java.awt.Dimension(60, 20));
        jPanel1.add(lblsd);
        lblsd.setBounds(260, 570, 60, 20);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("EMP ID :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 160, 60, 17);

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Designation :");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(10, 520, 90, 17);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("F.Name :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(420, 160, 61, 17);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Postal Code :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 430, 91, 17);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("L.Name :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(420, 220, 61, 17);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("M.Name :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(420, 190, 65, 17);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DOB :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 210, 40, 17);

        lblhmno2.setBackground(new java.awt.Color(255, 255, 255));
        lblhmno2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblhmno2.setForeground(new java.awt.Color(255, 255, 255));
        lblhmno2.setPreferredSize(new java.awt.Dimension(125, 20));
        jPanel1.add(lblhmno2);
        lblhmno2.setBounds(720, 430, 125, 20);

        lblpostal.setBackground(new java.awt.Color(255, 255, 255));
        lblpostal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblpostal.setForeground(new java.awt.Color(255, 255, 255));
        lblpostal.setPreferredSize(new java.awt.Dimension(240, 20));
        jPanel1.add(lblpostal);
        lblpostal.setBounds(120, 430, 240, 20);

        lblgen.setBackground(new java.awt.Color(255, 255, 255));
        lblgen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblgen.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblgen);
        lblgen.setBounds(120, 250, 70, 20);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Address :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 370, 65, 17);

        lblmarital.setBackground(new java.awt.Color(255, 255, 255));
        lblmarital.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmarital.setForeground(new java.awt.Color(255, 255, 255));
        lblmarital.setPreferredSize(new java.awt.Dimension(70, 20));
        jPanel1.add(lblmarital);
        lblmarital.setBounds(130, 290, 110, 20);

        lblmo1.setBackground(new java.awt.Color(255, 255, 255));
        lblmo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmo1.setForeground(new java.awt.Color(255, 255, 255));
        lblmo1.setPreferredSize(new java.awt.Dimension(125, 20));
        jPanel1.add(lblmo1);
        lblmo1.setBounds(570, 460, 125, 20);

        lblcenter.setBackground(new java.awt.Color(255, 255, 255));
        lblcenter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcenter.setForeground(new java.awt.Color(255, 255, 255));
        lblcenter.setPreferredSize(new java.awt.Dimension(240, 20));
        jPanel1.add(lblcenter);
        lblcenter.setBounds(120, 490, 240, 20);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/homebtn.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(125, 35));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(350, 620, 125, 35);

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/viewbk_1.png"))); // NOI18N
        jLabel21.setPreferredSize(new java.awt.Dimension(887, 665));
        jPanel1.add(jLabel21);
        jLabel21.setBounds(0, 0, 887, 665);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
search();        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.dispose();
    new emphome().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(viewemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new viewemp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btngen;
    private javax.swing.ButtonGroup btnmar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblage;
    private javax.swing.JLabel lblcenter;
    private javax.swing.JLabel lblcentercon;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lbld;
    private javax.swing.JLabel lbldesig;
    private javax.swing.JLabel lbled;
    private javax.swing.JLabel lblem;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lbley;
    private javax.swing.JLabel lblfnm;
    private javax.swing.JLabel lblgen;
    private javax.swing.JLabel lblhmno1;
    private javax.swing.JLabel lblhmno2;
    public static javax.swing.JLabel lblid;
    private javax.swing.JLabel lbllnm;
    private javax.swing.JLabel lblm;
    private javax.swing.JLabel lblmarital;
    private javax.swing.JLabel lblmnm;
    private javax.swing.JLabel lblmo1;
    private javax.swing.JLabel lblmo2;
    private javax.swing.JLabel lblnic;
    private javax.swing.JLabel lblpostal;
    private javax.swing.JLabel lblsd;
    private javax.swing.JLabel lblsm;
    private javax.swing.JLabel lblsy;
    private javax.swing.JLabel lbly;
    // End of variables declaration//GEN-END:variables
}
