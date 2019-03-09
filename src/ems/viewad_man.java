/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ems;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Nuwan
 */
public class viewad_man extends javax.swing.JFrame {
    private static final long serialVersionUID = 1L;
    
    
     public viewad_man() {
        initComponents();
    }

       private void setid(){      
       advance_details_view advw = new advance_details_view();
       advance_details_view.lblaid.setText(viewad_man.lblid.getText());
       advw.setVisible(true);
       
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

private void agesch(){
String ageqry,sch,as;
sch=lblid.getText();

try{
    try (Connection conn = DriverManager.getConnection(url,"root","")) {
        System.out.println("Connection Successfully");
        st=conn.createStatement();
        ageqry="SELECT get_age(doby, NOW()) AS age FROM genaral WHERE id =('"+sch+"')";
        //qry="select id,f_nm ,m_nm,l_nm,nic,ag,doby,gender,marital_status,city,address,postal_code,home_contact1,home_contact2,mobile1,mobile2,email,center,center_con,designation,sy,ey,user_name,password,sm,sd,em,ed from genaral where id=('"+sch+"')";
       // qryage="SELECT get_age(doby, NOW()) AS age FROM genaral WHERE id =('"+sch+"')";
        try (ResultSet rs = st.executeQuery(ageqry))
            
        {
            while(rs.next()){
               as=rs.getString("age");
               lblcage.setText(as);
                System.out.println(as);
                
          
             
                
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
private void search(){
String as,qryagsm,sd,em,ed,sy,ey,ps,user,sch,qry,fnm,mnm,lnm,id,bdy,nic,city,age,gender,marital,address,postal,hmno1,hmno2,mo1,mo2,email,center,centerno,desig,sdate,edate="";
sch=lblid.getText();

try{
    try (Connection conn = DriverManager.getConnection(url,"root","")) {
        System.out.println("Connection Successfully");
        st=conn.createStatement();
        qry="select * from genaral where id=('"+sch+"')";
        //qry="select id,f_nm ,m_nm,l_nm,nic,ag,doby,gender,marital_status,city,address,postal_code,home_contact1,home_contact2,mobile1,mobile2,email,center,center_con,designation,sy,ey,user_name,password,sm,sd,em,ed from genaral where id=('"+sch+"')";
       // qryage="SELECT get_age(doby, NOW()) AS age FROM genaral WHERE id =('"+sch+"')";
        try (ResultSet rs = st.executeQuery(qry))
            
        {
            if(rs.next()){
               // as=rs.getString("ag");
                byte[] img=rs.getBytes("pic");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(lblimage.getWidth(),lblimage.getHeight(),Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                lblimage.setIcon(newImage);
                id=rs.getString("id");
                fnm=rs.getString("f_nm");
                mnm=rs.getString("m_nm");
                lnm=rs.getString("l_nm");
                nic=rs.getString("nic");
                bdy=rs.getString("doby");
                
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
               
                
                sy=rs.getString("sy");
                ey=rs.getString("ey");
                
               
                
                
                
                lblid.setText(id);
                lblfnm.setText(fnm);
                lblmnm.setText(mnm);
                lbllnm.setText(lnm);
                lblnic.setText(nic);
                
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
               
                lblsy.setText(sy);
                
                
                lbley.setText(ey);
                
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
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngen = new javax.swing.ButtonGroup();
        btnmar = new javax.swing.ButtonGroup();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblmo2 = new javax.swing.JLabel();
        lbllnm = new javax.swing.JLabel();
        lblnic = new javax.swing.JLabel();
        lblhmno1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        lbldesig = new javax.swing.JLabel();
        lblmnm = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lbley = new javax.swing.JLabel();
        lblfnm = new javax.swing.JLabel();
        lblsy = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblcage = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        lblcity = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblcentercon = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbladdress = new javax.swing.JLabel();
        lbly = new javax.swing.JLabel();
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
        jButton3 = new javax.swing.JButton();
        lblimage = new javax.swing.JLabel();
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

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Start Date :");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(10, 570, 80, 17);

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
        lblmnm.setBounds(510, 190, 290, 20);

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
        lbley.setBounds(570, 570, 180, 20);

        lblfnm.setBackground(new java.awt.Color(255, 255, 255));
        lblfnm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblfnm.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblfnm);
        lblfnm.setBounds(510, 160, 290, 20);

        lblsy.setBackground(new java.awt.Color(255, 255, 255));
        lblsy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblsy.setForeground(new java.awt.Color(255, 255, 255));
        lblsy.setPreferredSize(new java.awt.Dimension(60, 20));
        jPanel1.add(lblsy);
        lblsy.setBounds(120, 570, 160, 20);

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("End Date :");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(420, 570, 72, 17);

        lblcage.setBackground(new java.awt.Color(255, 255, 255));
        lblcage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcage.setForeground(new java.awt.Color(255, 255, 255));
        lblcage.setPreferredSize(new java.awt.Dimension(40, 20));
        jPanel1.add(lblcage);
        lblcage.setBounds(520, 290, 40, 20);

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
        lbly.setBounds(130, 210, 190, 20);

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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/viewad.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(270, 35));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(520, 620, 270, 35);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/homebtn.png"))); // NOI18N
        jButton3.setPreferredSize(new java.awt.Dimension(125, 35));
        jPanel1.add(jButton3);
        jButton3.setBounds(370, 620, 125, 35);

        lblimage.setText("jLabel22");
        jPanel1.add(lblimage);
        lblimage.setBounds(10, 10, 230, 140);

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/viewbk_1.png"))); // NOI18N
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
search();
agesch();        
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
setid();
this.dispose();
//setid();        
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
            java.util.logging.Logger.getLogger(viewad_man.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewad_man.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewad_man.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewad_man.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new viewad_man().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btngen;
    private javax.swing.ButtonGroup btnmar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel lblcage;
    private javax.swing.JLabel lblcenter;
    private javax.swing.JLabel lblcentercon;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lbldesig;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lbley;
    private javax.swing.JLabel lblfnm;
    private javax.swing.JLabel lblgen;
    private javax.swing.JLabel lblhmno1;
    private javax.swing.JLabel lblhmno2;
    public static javax.swing.JLabel lblid;
    private javax.swing.JLabel lblimage;
    private javax.swing.JLabel lbllnm;
    private javax.swing.JLabel lblmarital;
    private javax.swing.JLabel lblmnm;
    private javax.swing.JLabel lblmo1;
    private javax.swing.JLabel lblmo2;
    private javax.swing.JLabel lblnic;
    private javax.swing.JLabel lblpostal;
    private javax.swing.JLabel lblsy;
    private javax.swing.JLabel lbly;
    // End of variables declaration//GEN-END:variables
}
