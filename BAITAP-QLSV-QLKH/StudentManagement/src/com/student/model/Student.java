package com.student.model;

public class Student {
    private int rollNo;
    private int stCode;
    private String name;
    private int age;
    private String address;
    private float score1;
    private float score2;
    private float score3;
    private float score4;
    private float GPA;

    public Student() {
    }

    public Student(int stCode, String name, int age, String address) {
        this.stCode = stCode;
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public Student(int stCode, String name, int age, String address, float score1, float score2, float score3, float score4, float GPA) {
        this.stCode = stCode;
        this.name = name;
        this.age = age;
        this.address = address;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.score4 = score4;
        this.GPA = GPA;
    }

    public Student(int rollNo, int stCode, String name, int age, String address, float score1, float score2, float score3, float score4, float GPA) {
        this.rollNo = rollNo;
        this.stCode = stCode;
        this.name = name;
        this.age = age;
        this.address = address;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.score4 = score4;
        this.GPA = GPA;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getStCode() {
        return stCode;
    }

    public void setStCode(int stCode) {
        this.stCode = stCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getScore1() {
        return score1;
    }

    public void setScore1(float score1) {
        this.score1 = score1;
    }

    public float getScore2() {
        return score2;
    }

    public void setScore2(float score2) {
        this.score2 = score2;
    }

    public float getScore3() {
        return score3;
    }

    public void setScore3(float score3) {
        this.score3 = score3;
    }

    public float getScore4() {
        return score4;
    }

    public void setScore4(float score4) {
        this.score4 = score4;
    }


    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public String toStringCSV(){
        return rollNo+ "," +stCode + "," + name + "," + age  + "," + address + "," + score1 + "," + score2 + "," + score3 + "," + score4 + "," + GPA + "\n";
    }

    public String toStringGPA(){
        return name + ":" + " ??i???m h??? s??? 1: " + score1 + "," +  " ??i???m h??? s??? 1: " + score2 + "," + " ??i???m h??? s??? 2: " + score3 + "," +  " ??i???m h??? s??? 3: " + score4 + "," +  " ??i???m trung b??nh: " + GPA + "\n";
    }

    public void displayAll() {
        System.out.printf("| %6s | %20s | %12s | %10s | %12.02f | %12.02f | %12.02f | %12.02f | %12.02f |"
                , stCode,name,age,address,score1,score2,score3,score4,GPA);
    }


}
