package entity;

import java.util.Date;

public class Provider
{
    private int id;
    private String proCode;
    private String proName;
    private String proDesc;
    private String proContact;
    private String proPhone;
    private String proAddress;
    private  String proFax;

    public void setProFax(String proFax) {
        this.proFax = proFax;
    }

    public String getProFax() {
        return proFax;
    }

    private int createdBy;
    private Date creationDate;
    private int modifyBy;
    private Date modifyDate;


    public int getId() {
        return id;
    }

    public String getProCode() {
        return proCode;
    }

    public String getProName() {
        return proName;
    }

    public String getProDesc() {
        return proDesc;
    }

    public String getProContact() {
        return proContact;
    }

    public String getProPhone() {
        return proPhone;
    }

    public String getProAddress() {
        return proAddress;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public int getModifyBy() {
        return modifyBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProCode(String proCode) {
        this.proCode = proCode;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public void setProDesc(String proDesc) {
        this.proDesc = proDesc;
    }

    public void setProContact(String proContact) {
        this.proContact = proContact;
    }

    public void setProPhone(String proPhone) {
        this.proPhone = proPhone;
    }

    public void setProAddress(String proAddress) {
        this.proAddress = proAddress;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setModifyBy(int modifyBy) {
        this.modifyBy = modifyBy;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}
