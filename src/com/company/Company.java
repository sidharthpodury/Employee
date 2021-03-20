package com.company;

public class Company {
    private String companyID;
    private String companyName;
    private String address1;
    private String address2;
    private String City;
    private String State;
    private int zipCode;

    @Override
    public String toString() {
        return "Company{" +
                "companyID='" + getCompanyID() + '\'' +
                ", companyName='" + getCompanyName() + '\'' +
                ", address1='" + getAddress1() + '\'' +
                ", address2='" + getAddress2() + '\'' +
                ", City='" + getCity() + '\'' +
                ", State='" + getState() + '\'' +
                ", zipCode=" + getZipCode() +
                '}';
    }

    public String getCompanyID() {
        return companyID;
    }

    public void setCompanyID(String companyID) {
        this.companyID = companyID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}