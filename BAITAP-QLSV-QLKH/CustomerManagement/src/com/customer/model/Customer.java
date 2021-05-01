package com.customer.model;

import javax.print.DocFlavor;

public class Customer {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private String gender;
    private int oderNumber;

    public Customer() {
    }

    public Customer(String name, String address, String phoneNumber, String email, String gender, int oderNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.oderNumber = oderNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getOderNumber() {
        return oderNumber;
    }

    public void setOderNumber(int oderNumber) {
        this.oderNumber = oderNumber;
    }

    @Override
    public String toString() {
        return  "Khách hàng: " + name +
                ", Địa chỉ: " + address +
                ", Số điện thoại: " + phoneNumber +
                ", Email: " + email +
                ", Giới tinh: " + gender +
                ", Số đơn hàng đã mua: " + oderNumber;
    }

    public String toStringCSV(){
        return name+","+address+","+phoneNumber+","+ email+","+gender+","+oderNumber +"\n";
    }
}
