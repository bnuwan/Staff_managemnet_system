/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ems;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "genaral", catalog = "project", schema = "")
@NamedQueries({
    @NamedQuery(name = "Genaral.findAll", query = "SELECT g FROM Genaral g"),
    @NamedQuery(name = "Genaral.findById", query = "SELECT g FROM Genaral g WHERE g.id = :id"),
    @NamedQuery(name = "Genaral.findByFNm", query = "SELECT g FROM Genaral g WHERE g.fNm = :fNm"),
    @NamedQuery(name = "Genaral.findByMNm", query = "SELECT g FROM Genaral g WHERE g.mNm = :mNm"),
    @NamedQuery(name = "Genaral.findByLNm", query = "SELECT g FROM Genaral g WHERE g.lNm = :lNm"),
    @NamedQuery(name = "Genaral.findByFile", query = "SELECT g FROM Genaral g WHERE g.file = :file"),
    @NamedQuery(name = "Genaral.findByNic", query = "SELECT g FROM Genaral g WHERE g.nic = :nic"),
    @NamedQuery(name = "Genaral.findByDoby", query = "SELECT g FROM Genaral g WHERE g.doby = :doby"),
    @NamedQuery(name = "Genaral.findByGender", query = "SELECT g FROM Genaral g WHERE g.gender = :gender"),
    @NamedQuery(name = "Genaral.findByMaritalStatus", query = "SELECT g FROM Genaral g WHERE g.maritalStatus = :maritalStatus"),
    @NamedQuery(name = "Genaral.findByCity", query = "SELECT g FROM Genaral g WHERE g.city = :city"),
    @NamedQuery(name = "Genaral.findByAddress", query = "SELECT g FROM Genaral g WHERE g.address = :address"),
    @NamedQuery(name = "Genaral.findByPostalCode", query = "SELECT g FROM Genaral g WHERE g.postalCode = :postalCode"),
    @NamedQuery(name = "Genaral.findByHomeContact1", query = "SELECT g FROM Genaral g WHERE g.homeContact1 = :homeContact1"),
    @NamedQuery(name = "Genaral.findByHomeContact2", query = "SELECT g FROM Genaral g WHERE g.homeContact2 = :homeContact2"),
    @NamedQuery(name = "Genaral.findByMobile1", query = "SELECT g FROM Genaral g WHERE g.mobile1 = :mobile1"),
    @NamedQuery(name = "Genaral.findByMobile2", query = "SELECT g FROM Genaral g WHERE g.mobile2 = :mobile2"),
    @NamedQuery(name = "Genaral.findByEmail", query = "SELECT g FROM Genaral g WHERE g.email = :email"),
    @NamedQuery(name = "Genaral.findByCenter", query = "SELECT g FROM Genaral g WHERE g.center = :center"),
    @NamedQuery(name = "Genaral.findByCenterCon", query = "SELECT g FROM Genaral g WHERE g.centerCon = :centerCon"),
    @NamedQuery(name = "Genaral.findByDesignation", query = "SELECT g FROM Genaral g WHERE g.designation = :designation"),
    @NamedQuery(name = "Genaral.findBySy", query = "SELECT g FROM Genaral g WHERE g.sy = :sy"),
    @NamedQuery(name = "Genaral.findByEy", query = "SELECT g FROM Genaral g WHERE g.ey = :ey"),
    @NamedQuery(name = "Genaral.findByUserName", query = "SELECT g FROM Genaral g WHERE g.userName = :userName"),
    @NamedQuery(name = "Genaral.findByPassword", query = "SELECT g FROM Genaral g WHERE g.password = :password")})
public class Genaral implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "f_nm")
    private String fNm;
    @Basic(optional = false)
    @Column(name = "m_nm")
    private String mNm;
    @Basic(optional = false)
    @Column(name = "l_nm")
    private String lNm;
    @Column(name = "file")
    private String file;
    @Lob
    @Column(name = "pic")
    private byte[] pic;
    @Basic(optional = false)
    @Column(name = "nic")
    private String nic;
    @Basic(optional = false)
    @Column(name = "doby")
    @Temporal(TemporalType.DATE)
    private Date doby;
    @Basic(optional = false)
    @Column(name = "gender")
    private String gender;
    @Basic(optional = false)
    @Column(name = "marital_status")
    private String maritalStatus;
    @Basic(optional = false)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @Column(name = "postal_code")
    private String postalCode;
    @Basic(optional = false)
    @Column(name = "home_contact1")
    private String homeContact1;
    @Basic(optional = false)
    @Column(name = "home_contact2")
    private String homeContact2;
    @Basic(optional = false)
    @Column(name = "mobile1")
    private String mobile1;
    @Basic(optional = false)
    @Column(name = "mobile2")
    private String mobile2;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "center")
    private String center;
    @Basic(optional = false)
    @Column(name = "center_con")
    private int centerCon;
    @Basic(optional = false)
    @Column(name = "designation")
    private String designation;
    @Basic(optional = false)
    @Column(name = "sy")
    @Temporal(TemporalType.DATE)
    private Date sy;
    @Basic(optional = false)
    @Column(name = "ey")
    private String ey;
    @Basic(optional = false)
    @Column(name = "user_name")
    private String userName;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;

    public Genaral() {
    }

    public Genaral(String id) {
        this.id = id;
    }

    public Genaral(String id, String fNm, String mNm, String lNm, String nic, Date doby, String gender, String maritalStatus, String city, String address, String postalCode, String homeContact1, String homeContact2, String mobile1, String mobile2, String email, String center, int centerCon, String designation, Date sy, String ey, String userName, String password) {
        this.id = id;
        this.fNm = fNm;
        this.mNm = mNm;
        this.lNm = lNm;
        this.nic = nic;
        this.doby = doby;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.city = city;
        this.address = address;
        this.postalCode = postalCode;
        this.homeContact1 = homeContact1;
        this.homeContact2 = homeContact2;
        this.mobile1 = mobile1;
        this.mobile2 = mobile2;
        this.email = email;
        this.center = center;
        this.centerCon = centerCon;
        this.designation = designation;
        this.sy = sy;
        this.ey = ey;
        this.userName = userName;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        String oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getFNm() {
        return fNm;
    }

    public void setFNm(String fNm) {
        String oldFNm = this.fNm;
        this.fNm = fNm;
        changeSupport.firePropertyChange("FNm", oldFNm, fNm);
    }

    public String getMNm() {
        return mNm;
    }

    public void setMNm(String mNm) {
        String oldMNm = this.mNm;
        this.mNm = mNm;
        changeSupport.firePropertyChange("MNm", oldMNm, mNm);
    }

    public String getLNm() {
        return lNm;
    }

    public void setLNm(String lNm) {
        String oldLNm = this.lNm;
        this.lNm = lNm;
        changeSupport.firePropertyChange("LNm", oldLNm, lNm);
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        String oldFile = this.file;
        this.file = file;
        changeSupport.firePropertyChange("file", oldFile, file);
    }

    public byte[] getPic() {
        return pic;
    }

    public void setPic(byte[] pic) {
        byte[] oldPic = this.pic;
        this.pic = pic;
        changeSupport.firePropertyChange("pic", oldPic, pic);
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        String oldNic = this.nic;
        this.nic = nic;
        changeSupport.firePropertyChange("nic", oldNic, nic);
    }

    public Date getDoby() {
        return doby;
    }

    public void setDoby(Date doby) {
        Date oldDoby = this.doby;
        this.doby = doby;
        changeSupport.firePropertyChange("doby", oldDoby, doby);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        String oldMaritalStatus = this.maritalStatus;
        this.maritalStatus = maritalStatus;
        changeSupport.firePropertyChange("maritalStatus", oldMaritalStatus, maritalStatus);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        String oldCity = this.city;
        this.city = city;
        changeSupport.firePropertyChange("city", oldCity, city);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        String oldPostalCode = this.postalCode;
        this.postalCode = postalCode;
        changeSupport.firePropertyChange("postalCode", oldPostalCode, postalCode);
    }

    public String getHomeContact1() {
        return homeContact1;
    }

    public void setHomeContact1(String homeContact1) {
        String oldHomeContact1 = this.homeContact1;
        this.homeContact1 = homeContact1;
        changeSupport.firePropertyChange("homeContact1", oldHomeContact1, homeContact1);
    }

    public String getHomeContact2() {
        return homeContact2;
    }

    public void setHomeContact2(String homeContact2) {
        String oldHomeContact2 = this.homeContact2;
        this.homeContact2 = homeContact2;
        changeSupport.firePropertyChange("homeContact2", oldHomeContact2, homeContact2);
    }

    public String getMobile1() {
        return mobile1;
    }

    public void setMobile1(String mobile1) {
        String oldMobile1 = this.mobile1;
        this.mobile1 = mobile1;
        changeSupport.firePropertyChange("mobile1", oldMobile1, mobile1);
    }

    public String getMobile2() {
        return mobile2;
    }

    public void setMobile2(String mobile2) {
        String oldMobile2 = this.mobile2;
        this.mobile2 = mobile2;
        changeSupport.firePropertyChange("mobile2", oldMobile2, mobile2);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        String oldCenter = this.center;
        this.center = center;
        changeSupport.firePropertyChange("center", oldCenter, center);
    }

    public int getCenterCon() {
        return centerCon;
    }

    public void setCenterCon(int centerCon) {
        int oldCenterCon = this.centerCon;
        this.centerCon = centerCon;
        changeSupport.firePropertyChange("centerCon", oldCenterCon, centerCon);
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        String oldDesignation = this.designation;
        this.designation = designation;
        changeSupport.firePropertyChange("designation", oldDesignation, designation);
    }

    public Date getSy() {
        return sy;
    }

    public void setSy(Date sy) {
        Date oldSy = this.sy;
        this.sy = sy;
        changeSupport.firePropertyChange("sy", oldSy, sy);
    }

    public String getEy() {
        return ey;
    }

    public void setEy(String ey) {
        String oldEy = this.ey;
        this.ey = ey;
        changeSupport.firePropertyChange("ey", oldEy, ey);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        String oldUserName = this.userName;
        this.userName = userName;
        changeSupport.firePropertyChange("userName", oldUserName, userName);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Genaral)) {
            return false;
        }
        Genaral other = (Genaral) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ems.Genaral[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
