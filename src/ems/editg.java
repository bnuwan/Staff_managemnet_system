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
public class editg extends javax.swing.JFrame {
    private static final long serialVersionUID = 1L;

    String url="jdbc:mysql://localhost:3306/project?zeroDateTimeBehavior=convertToNull";
    Statement st=null;
 
   
    public editg() {
        initComponents();
    }
       
    private void setid(){      
       advance_details_edit ade = new advance_details_edit();
       advance_details_edit.lblaid.setText(this.txtedtgid.getText());
       ade.setVisible(true);
       
               }
    
    
private void search(){
String sm,sd,em,ed,sy,ey,ps,user,sch,qry,fnm,mnm,lnm,id,bdy,bdm,bdd,nic,city,age,gender,marital,address,postal,hmno1,hmno2,mo1,mo2,email,center,centerno,desig,sdate,edate="";
sch=txtedtgid.getText();

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
                user=rs.getString("user_name");
                ps=rs.getString("password");
                bdm=rs.getString("dobm");
                bdd=rs.getString("dobd");
                sy=rs.getString("sy");
                ey=rs.getString("ey");
                sm=rs.getString("sm");
                sd=rs.getString("sd");
                em=rs.getString("em");
                ed=rs.getString("ed");
                
                
                
                txtedtgid.setText(id);
                txtfnm.setText(fnm);
                txtmnm.setText(mnm);
                txtlnm.setText(lnm);
                //txtbdy.setText(bdy);
                txtnic.setText(nic);
                txtage.setText(age);
                txtcity.setText(city);
                txtaddress.setText(address);
                txtpostal.setText(postal);
                txthmno1.setText(hmno1);
                txthmno2.setText(hmno2);
                txtmo1.setText(mo1);
                txtmo2.setText(mo2);
                txtemail.setText(email);
                txtcenter.setText(center);
                txtcentercon.setText(centerno);
                txtdesig.setText(desig);
                
                //txtsdate.setText(sdate);
                // txtedate.setText(edate);
                txtuser.setText(user);
                txtps.setText(ps);
                cmby.setSelectedItem(bdy);
                cmbm.setSelectedItem(bdm);
                cmbd.setSelectedItem(bdd);
                cmbsy.setSelectedItem(sy);
                cmbsd.setSelectedItem(sd);
                cmbsm.setSelectedItem(sm);
                cmbey.setSelectedItem(ey);
                cmbed.setSelectedItem(ed);
                cmbem.setSelectedItem(em);
                switch (gender) {
                    case "Male":
                        radmale.setSelected(true);
                        break;
                    case "Female":
                        radfemale.setSelected(true);
                        break;
                }
                
                switch (marital) {
                    case "Unmarried":
                        radunm.setSelected(true);
                        break;
                    case "Married":
                        radmar.setSelected(true);
                        break;
                }
                
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
  private void idtrfr(){
      
      advance_form myad = new advance_form();
      advance_form.lblaid.setText(this.txtedtgid.getText());
      myad.setVisible(true);
  }
    
    
    
private void msgbox() throws SQLException{

    String fnm=txtfnm.getText();
    
    String lnm=txtlnm.getText();
    String id=txtedtgid.getText();
    //String bdy=txtbdy.getText();
    //String y=cmby.getSelectedItem().toString();
    //String m=cmbm.getSelectedItem().toString();
    //String d=cmbd.getSelectedItem().toString();
    String nic=txtnic.getText();
    String age=txtage.getText();
    String address=txtaddress.getText();
    
 
    String mo1=txtmo1.getText();
     String center=txtcenter.getText();
    String centerno=txtcentercon.getText();
    String desig=txtdesig.getText();
  // String sdate=txtadate.getText();
 
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
     else if(btngen.isSelected(null))
             {
             JOptionPane.showMessageDialog(null,"Please Select the gender","Erorr",JOptionPane.ERROR_MESSAGE);
             }
     else if(btnmar.isSelected(null))
             {
             JOptionPane.showMessageDialog(null,"Please Select the Marital Status","Erorr",JOptionPane.ERROR_MESSAGE);
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
         
        idtrfr();  
      
        
        this.dispose();
          
        }
        
}

  private void update() throws SQLException{
    
    String fnm=txtfnm.getText();
    String mnm=txtmnm.getText();
    String lnm=txtlnm.getText();
    String id=txtedtgid.getText();
    
  
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


/*
    
    private void connect() throws SQLException{
    
    String fnm=txtfnm.getText();
    String mnm=txtmnm.getText();
    String lnm=txtlnm.getText();
    String id=txtedtgid.getText();
    //String bdy=txtbdy.getText();
  String y=cmby.getSelectedItem().toString();
    String m=cmbm.getSelectedItem().toString();
    String d=cmbd.getSelectedItem().toString();
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
    String sy=cmbsy.getSelectedItem().toString();
    String sm=cmbsm.getSelectedItem().toString();
    String sd=cmbsd.getSelectedItem().toString();
    String ey=cmbey.getSelectedItem().toString();
    String em=cmbem.getSelectedItem().toString();
    String ed=cmbed.getSelectedItem().toString();
 // String sdate=txtadate.getText();
   //String edate=txtedate.getText();
    String city=txtcity.getText();
    String user=txtuser.getText();
    String ps=txtps.getText();
    String qry="";
    
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
     System.out.println("Connection Successfully");
     qry="INSERT INTO `project`.`genaral` (`id`, `f_nm`, `m_nm`, `l_nm`, `nic`, `age`, `doby`, `gender`, `marital_status`, `city`, `address`, `postal_code`, `home_contact1`, `home_contact2`, `mobile1`, `mobile2`, `email`, `center`, `center_con`, `designation`, `sy`, `ey`, `user_name`, `password`, `dobm`, `dobd`,`sm`,`sd`,`em`,`ed`) VALUES ('"+id+"', '"+fnm+"', '"+mnm+"', '"+lnm+"', '"+nic+"', '"+age+"', '"+y+"', '"+gender+"', '"+mar+"', '"+city+"', '"+address+"', '"+postal+"', '"+hmno1+"', '"+hmno2+"', '"+mo1+"', '"+mo2+"', '"+email+"', '"+center+"', '"+centerno+"', '"+desig+"', '"+sy+"', '"+ey+"','"+user+"','"+ps+"','"+m+"','"+d+"','"+sm+"','"+sd+"','"+em+"','"+ed+"')";
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

        btngen = new javax.swing.ButtonGroup();
        btnmar = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        txtedtgid = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtlnm = new javax.swing.JTextField();
        cmbsd = new javax.swing.JComboBox();
        txtfnm = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbd = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        cmbm = new javax.swing.JComboBox();
        cmbey = new javax.swing.JComboBox();
        cmbsy = new javax.swing.JComboBox();
        txtuser = new javax.swing.JTextField();
        txtcity = new javax.swing.JTextField();
        txthmno1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtmnm = new javax.swing.JTextField();
        cmbsm = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        txtcentercon = new javax.swing.JTextField();
        txtnic = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtcenter = new javax.swing.JTextField();
        cmbed = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        cmby = new javax.swing.JComboBox();
        radfemale = new javax.swing.JRadioButton();
        cmbem = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txthmno2 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtmo1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        radmar = new javax.swing.JRadioButton();
        radunm = new javax.swing.JRadioButton();
        radmale = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtmo2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtdesig = new javax.swing.JTextField();
        txtps = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtpostal = new javax.swing.JTextField();
        btnhm = new javax.swing.JButton();
        btnsv = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        btncn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jScrollPane2.setMaximumSize(new java.awt.Dimension(1360, 768));

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtedtgid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLayeredPane1.add(txtedtgid, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 151, 125, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("End Date :");
        jLayeredPane1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 501, -1, -1));

        txtlnm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLayeredPane1.add(txtlnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 260, -1));

        cmbsd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbsd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "" }));
        jLayeredPane1.add(cmbsd, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 501, -1, -1));

        txtfnm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLayeredPane1.add(txtfnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 260, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("EMP ID :");
        jLayeredPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 153, -1, -1));

        cmbd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "" }));
        jLayeredPane1.add(cmbd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 189, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Gender :");
        jLayeredPane1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 223, -1, -1));

        cmbm.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC", "" }));
        jLayeredPane1.add(cmbm, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 189, -1, -1));

        cmbey.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbey.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2025" }));
        jLayeredPane1.add(cmbey, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 501, -1, -1));

        cmbsy.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbsy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2025" }));
        jLayeredPane1.add(cmbsy, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 501, -1, -1));
        jLayeredPane1.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 181, -1));

        txtcity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLayeredPane1.add(txtcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 301, 125, -1));

        txthmno1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLayeredPane1.add(txthmno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 331, 125, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("User Name :");
        jLayeredPane1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 191, -1, -1));

        txtmnm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLayeredPane1.add(txtmnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 260, -1));

        cmbsm.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbsm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC", "" }));
        jLayeredPane1.add(cmbsm, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 501, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Address :");
        jLayeredPane1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 344, -1, -1));

        txtcentercon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLayeredPane1.add(txtcentercon, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 441, 125, -1));

        txtnic.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLayeredPane1.add(txtnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 260, -1));

        txtaddress.setColumns(20);
        txtaddress.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txtaddress.setRows(5);
        jScrollPane1.setViewportView(txtaddress);

        jLayeredPane1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 344, 242, 77));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("L.Name :");
        jLayeredPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("DOB :");
        jLayeredPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 191, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Designation :");
        jLayeredPane1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 475, -1, -1));

        txtcenter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLayeredPane1.add(txtcenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 441, 125, -1));

        cmbed.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbed.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "" }));
        jLayeredPane1.add(cmbed, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 501, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Age :");
        jLayeredPane1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, -1));

        cmby.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmby.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2010" }));
        jLayeredPane1.add(cmby, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 189, -1, -1));

        radfemale.setBackground(new java.awt.Color(255, 255, 255));
        btngen.add(radfemale);
        radfemale.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radfemale.setText("Female");
        jLayeredPane1.add(radfemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 219, -1, -1));

        cmbem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC", " " }));
        jLayeredPane1.add(cmbem, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 501, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Start Date :");
        jLayeredPane1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 501, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Center Contact No :");
        jLayeredPane1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 441, -1, -1));

        txthmno2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLayeredPane1.add(txthmno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 331, 125, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Password :");
        jLayeredPane1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 231, -1, -1));

        txtmo1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLayeredPane1.add(txtmo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 361, 125, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Email :");
        jLayeredPane1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 401, -1, -1));

        txtemail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLayeredPane1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 401, 264, -1));

        txtage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLayeredPane1.add(txtage, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 260, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("City :");
        jLayeredPane1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 304, -1, -1));

        radmar.setBackground(new java.awt.Color(255, 255, 255));
        btnmar.add(radmar);
        radmar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radmar.setText("Married");
        jLayeredPane1.add(radmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 260, -1, -1));

        radunm.setBackground(new java.awt.Color(255, 255, 255));
        btnmar.add(radunm);
        radunm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radunm.setText("Unmarried");
        jLayeredPane1.add(radunm, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 260, -1, -1));

        radmale.setBackground(new java.awt.Color(255, 255, 255));
        btngen.add(radmale);
        radmale.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radmale.setText("Male");
        jLayeredPane1.add(radmale, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 219, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("F.Name :");
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, 20));

        txtmo2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLayeredPane1.add(txtmo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 361, 125, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("NIC :");
        jLayeredPane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Mobile Contact No :");
        jLayeredPane1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 362, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Marital Status :");
        jLayeredPane1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 264, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Center :");
        jLayeredPane1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 441, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Postal Code :");
        jLayeredPane1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 311, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Home Contact No :");
        jLayeredPane1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 334, -1, -1));

        txtdesig.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLayeredPane1.add(txtdesig, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 472, 125, -1));
        jLayeredPane1.add(txtps, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 181, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("M.Name :");
        jLayeredPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));

        txtpostal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLayeredPane1.add(txtpostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 301, 125, -1));

        btnhm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/homebtn.png"))); // NOI18N
        btnhm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnhm.setPreferredSize(new java.awt.Dimension(125, 35));
        btnhm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhmActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnhm, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, -1, -1));

        btnsv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/update.png"))); // NOI18N
        btnsv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsv.setPreferredSize(new java.awt.Dimension(125, 35));
        btnsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsvActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnsv, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, -1, -1));

        btncancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/clall.png"))); // NOI18N
        btncancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncancel.setPreferredSize(new java.awt.Dimension(125, 35));
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 560, -1, -1));

        btncn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/cn.png"))); // NOI18N
        btncn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncn.setPreferredSize(new java.awt.Dimension(125, 35));
        btncn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncnActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btncn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 560, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/editad.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(270, 35));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 610, -1, -1));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/adbk.png"))); // NOI18N
        jLayeredPane1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane2.setViewportView(jLayeredPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 887, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsvActionPerformed

        
        
       try {
          msgbox();
         
// TODO add your handling code here:
       } catch (SQLException ex) {
           Logger.getLogger(editg.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_btnsvActionPerformed

    private void btnhmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhmActionPerformed
this.dispose();
 new ad_home().setVisible(true);

        
// TODO add your handling code here:
    }//GEN-LAST:event_btnhmActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
       this.dispose();
        new editg().setVisible(true);
       
        
        
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btncancelActionPerformed

    private void btncnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncnActionPerformed
       
        this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_btncnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

search();        
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
setid();
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
   /* private void password(){
    String usernm=txtuser.getText();
    String ps=txtps.getText();
    String qry="";
    
    try{
     Connection conn=DriverManager.getConnection(url,"root","");
      System.out.println("Connection Successfully");
      qry="INSERT INTO `project`.`emp_password` (`user_name`, `password`) VALUES ('"+usernm+"', '"+ps+"')";
      st=conn.createStatement();
       st.executeUpdate(qry);
      st.close();
    }
     catch(SQLException | HeadlessException e){
        System.out.println("Connection Faild.........!"+e);
        JOptionPane.showMessageDialog(null,"Connection Faild"+e,"Erorr",JOptionPane.ERROR_MESSAGE);
       
    }
    }*/
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
            java.util.logging.Logger.getLogger(editg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new editg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btncn;
    private javax.swing.ButtonGroup btngen;
    private javax.swing.JButton btnhm;
    private javax.swing.ButtonGroup btnmar;
    private javax.swing.JButton btnsv;
    private javax.swing.JComboBox cmbd;
    private javax.swing.JComboBox cmbed;
    private javax.swing.JComboBox cmbem;
    private javax.swing.JComboBox cmbey;
    private javax.swing.JComboBox cmbm;
    private javax.swing.JComboBox cmbsd;
    private javax.swing.JComboBox cmbsm;
    private javax.swing.JComboBox cmbsy;
    private javax.swing.JComboBox cmby;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radfemale;
    private javax.swing.JRadioButton radmale;
    private javax.swing.JRadioButton radmar;
    private javax.swing.JRadioButton radunm;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtcenter;
    private javax.swing.JTextField txtcentercon;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtdesig;
    public static javax.swing.JTextField txtedtgid;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfnm;
    private javax.swing.JTextField txthmno1;
    private javax.swing.JTextField txthmno2;
    private javax.swing.JTextField txtlnm;
    private javax.swing.JTextField txtmnm;
    private javax.swing.JTextField txtmo1;
    private javax.swing.JTextField txtmo2;
    private javax.swing.JTextField txtnic;
    private javax.swing.JTextField txtpostal;
    private javax.swing.JTextField txtps;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
