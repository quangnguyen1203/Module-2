

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ATM {
    private String name;
    private int accountBalance;
    private ArrayList<String> history = new ArrayList<String>();

    public ATM(String name, int accountBalance) {
        this.name = name;
        this.accountBalance = accountBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    Scanner sc = new Scanner(System.in);
    public void Menu(){
        System.out.println("Menu:");
        System.out.println("\t1. Nhan phim A de kiem tra tai khoan");
        System.out.println("\t2. Nhan phim D de nap tien");
        System.out.println("\t3. Nhan phim W de rut tien");
        System.out.println("\t4. Nhan phim H de xem lich su 3 lan");
        System.out.println("\t5. Nhan phim X de thoat");
        System.out.println("===========================================");
        System.out.println("Nhap lua chon cua ban: ");
    }

    public void importA(){
        System.out.println("So du tai khoan khach hang la:" + accountBalance);
//        System.out.println("Bam nut theo menu de tiep tuc giao dich");
//        System.out.println("===========================================");
        continueConfirm();
    }

    public void importD(){
        System.out.println("Giao dich Nap tien");
        System.out.println("Vui long nhap so tien:");
        int recharge = sc.nextInt();
        System.out.println("Giao dich thanh cong. Ban vua nap " + recharge + " thanh cong.");
        int total = accountBalance + recharge;
        setAccountBalance(total);
        history.add("Nap tien: " + recharge);
        System.out.println("So du tai khoan khach hang la: " + total + " vnd ");
        System.out.println(" ");
//        System.out.println("Bam nut theo menu de tiep tuc giao dich");
//        System.out.println("===========================================");
//        System.out.println(" ");
        continueConfirm();
    }

    public void importW(){
        System.out.println("Giao dich Rut tien:");
        System.out.println("Vui long nhap so tien:");
        int withdrawal = sc.nextInt();
        System.out.println("Giao dich thanh cong. Ban vua rut " + withdrawal +" thanh cong.");
        int total = getAccountBalance() - withdrawal;
        if(getAccountBalance() > withdrawal) {
            System.out.println("So du tai khoan khach hang la: " + total + " vnd ");
            setAccountBalance(total);
            history.add("Rut tien: " + withdrawal);
//            System.out.println("Bam nut theo menu de tiep tuc giao dich");
//            System.out.println("===========================================");
        } else {
            System.out.println("Giao dich khong thanh cong.");
            System.out.println("So du tai khoan khach hang la: " + getAccountBalance() + " Vnd. ");
            System.out.println("Ban khong the rut so tien hon so du tai khoan");
//            System.out.println("Bam nut theo menu de tiep tuc giao dich");
//            System.out.println("===========================================");
        }
        continueConfirm();
    }

    public void importH(){
        System.out.println("Lich su cua ban: ");
        if(history.size() == 0){
            System.out.println("Hien tai chua co giao dich");
        }
        if (history.size()>3) {
            ArrayList<String> tempHistory = new ArrayList<String>();
            for (int i = history.size()-1; i > 0 ; i--) {
                tempHistory.add(history.get(i));
                if(tempHistory.size() ==3){
                    break;
                }
            }
            Collections.reverse(tempHistory);
            for (int i = 0; i < 3; i++) {
                System.out.println("\t" + (i + 1) + ". " + tempHistory.get(i));
            }
        } else {
            for (int i = 0; i < history.size(); i++) {
                System.out.println("\t" + (i + 1) + ". " + history.get(i));
            }
        }
        continueConfirm();
    }

    public void continueConfirm() {
//        System.out.println("--------------------------");
        System.out.println("Ban co muon tiep tuc thuc hien giao dich khong?");
        System.out.println("Vui long nhap Y, N");
        while (true) {
            String choice = sc.next();
            switch (choice) {
                case "Y": {
                    login();
                    break;
                }
                case "N": {
                    System.out.println("Cam on ban da su dung ATM");
                    System.exit(0);
                }
                default:
                    System.out.println("Ban nhap sai ");
                    System.out.println("Vui long chon Y hoac N");
                    System.out.println("===========================================");
            }
        }
    }

    public void login(){
        System.out.println("Ngan hang ABC kinh chao quy khach " + name);
        Menu();
        while (true) {
            String choice = sc.next();
            switch (choice) {
                case "A": {
                    importA();
                }
                break;

                case "D": {
                    importD();
                }
                break;
                case "W": {
                    importW();
                }
                break;
                case "H":{
                    importH();
                }
                break;
                case "X":
                    System.out.println("Cam on ban da su dung ATM");
                    System.exit(0);
                default:
                    System.out.println("Ban nhap sai chuc nang");
                    System.out.println("Bam nut theo menu de tiep tuc giao dich");
                    System.out.println("===========================================");
            }
        }
    }
}
