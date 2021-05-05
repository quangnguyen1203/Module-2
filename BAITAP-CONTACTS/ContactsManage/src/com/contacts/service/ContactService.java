package com.contacts.service;

import com.contacts.dal.ContactDB;
import com.contacts.model.Contact;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class ContactService {
    public static ContactDB contactDB = new ContactDB();
    public static Scanner sc = new Scanner(System.in);

    public void loadFile() throws IOException {
        contactDB.readFile();
    }

    public String inputPhoneNumber(){
        String phoneNumber;
        do{
            System.out.println("Nhập số điện thoại: ");
            phoneNumber = sc.nextLine();
        } while (!checkPhoneNumber(phoneNumber));
        for(int i=0;i<contactDB.contactList.size();i++){
            if(contactDB.contactList.get(i).getPhoneNumber().equals(phoneNumber)){
                System.out.println("Đã tồn tại số điện thoại.");
                inputPhoneNumber();
            }
        }
        return phoneNumber;
    }

    public boolean checkPhoneNumber(String phoneNumber){
        String regex = "^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.find() ? true : false;
    }

    public String inputGroupContact(){
        System.out.println("Nhập nhóm danh bạ: ");
        return sc.nextLine();
    }

    public String inputName(){
        System.out.println("Nhập họ tên: ");
        return sc.nextLine();
    }

    public String inputGender(){
        System.out.println("Nhập giới tính:");
        return sc.nextLine();
    }

    public String inputAddress(){
        System.out.println("Nhập địa chỉ: ");
        return sc.nextLine();
    }

    public String inputDOB(){
        System.out.println("Nhập ngày sinh: ");
        return sc.nextLine();
    }

    public String inputEmail(){
        String email;
        do {
            System.out.println("Nhập email: ");
            email = sc.nextLine();
        }while (!checkEmail(email));
        return email;
    }

    public boolean checkEmail(String email){
        String regex = "^[a-zA-Z]+[a-zA-Z0-9]*@{1}\\w+mail.com$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.find() ? true : false;
    }

    public void addContact() throws IOException {
        String phoneNumber = inputPhoneNumber();
        String groupContact = inputGroupContact();
        String name = inputName();
        String gender = inputGender();
        String address = inputAddress();
        String dob = inputDOB();
        String email = inputEmail();
        Contact contact = new Contact(phoneNumber,groupContact,name,gender,address,dob,email);
        contactDB.add(contact);
        contactDB.saveFile();
    }

    public void updateContact(String phoneNumber) throws IOException {
        boolean check = false;
        for (int i = 0; i < contactDB.contactList.size() ; i++) {
            if (contactDB.contactList.get(i).getPhoneNumber().equals(phoneNumber)){
                check = true;
                contactDB.contactList.get(i).setGroupContact(inputGroupContact());
                contactDB.contactList.get(i).setName(inputName());
                contactDB.contactList.get(i).setGender(inputGender());
                contactDB.contactList.get(i).setAddress(inputAddress());
                contactDB.contactList.get(i).setDob(inputDOB());
                contactDB.contactList.get(i).setEmail(inputEmail());
                contactDB.saveFile();
                System.out.println("Bạn đã cập nhật thành công!!!");
            }
        }
        if(!check){
            System.out.println("Không tìm được danh bạ với số điện thoại trên.");
        }
    }

    public void deleteContact(String phoneNumber) throws IOException {
        Contact contact = null;
        int size = contactDB.contactList.size();
        for (int i = 0; i < size; i++) {
            if (contactDB.contactList.get(i).getPhoneNumber().equals(phoneNumber)) {
                contact = contactDB.contactList.get(i);
                break;
            }
        }
        if (contact != null) {
            contactDB.contactList.remove(contact);
            contactDB.saveFile();
        } else {
            System.out.printf("id không tồn tại");
        }
    }

    public void searchContact(String phoneNumber){
        for (int i = 0; i < contactDB.contactList.size() ; i++) {
            if(contactDB.contactList.get(i).getPhoneNumber().equals(phoneNumber)){
                System.out.println(contactDB.contactList.get(i).toString());
            }
        }
    }

    public void printContact(){
        if(contactDB.contactList.size()<=0){
            System.out.println("Danh sách hiện tại còn trống.");
        } else {
            for (int i = 0; i < contactDB.contactList.size() ; i++) {
                System.out.println(contactDB.contactList.get(i).toString());
            }
        }
    }
}
