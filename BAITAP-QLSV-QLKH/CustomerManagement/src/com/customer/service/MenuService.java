package com.customer.service;

import com.customer.dal.CustomerDB;
import com.customer.model.Customer;

import java.io.IOException;
import java.util.Scanner;

public class MenuService {
    public static Scanner sc = new Scanner(System.in);
    CustomerService customerService = new CustomerService();
    CustomerDB customerDB = new CustomerDB();
    public void showMenu(){
        System.out.println("Bấm 1: Để nhập thông tin khách hàng");
        System.out.println("Bấm 2: Để tìm kiếm khách hàng");
        System.out.println("Bấm 3: Để in thông tin khách hàng");
        System.out.println("Bấm 4: Để in toàn bộ danh sách khách hàng");
        System.out.println("Bấm 5: Để tăng số đơn cho khách hàng");
        System.out.println("Bấm 0: Để thoát");
        System.out.println("Nhập số cần chọn: ");
    }

    public void addCustomer() throws IOException {
        System.out.println("Nhập tên khách hàng: ");
        String name = sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address = sc.nextLine();
        System.out.println("Nhập số điện thoại: ");
        String phoneNumber = sc.nextLine();
        System.out.println("Nhập email: ");
        String email = sc.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = sc.nextLine();
        System.out.println("Nhập số lượng đơn hàng: ");
        int oderNumber = sc.nextInt();
        sc.nextLine();
        Customer customer = new Customer(name,address,phoneNumber,email,gender,oderNumber);
        customerService.add(customer);
        System.out.println("Bạn vừa thêm mới khách hàng " + customer.getName() + " thành công");
        continueConfirm();
    }

    public void searchCustomer(){
        System.out.println("Nhập số điện thoại: ");
        String phoneNumber = sc.nextLine();
        System.out.println("Hệ thống đang tìm kiếm.....");
        customerDB.search(phoneNumber);
        continueConfirm();
    }

    public void displayCustomer(){
        System.out.println("Nhập số điện thoại: ");
        String phoneNumber = sc.nextLine();
        System.out.println("Hệ thống đang tìm kiếm.....");
        customerDB.display(phoneNumber);
        continueConfirm();
    }

    public void oderIncreaseCustomer(){
        System.out.println("Nhập số điện thoại: ");
        String phoneNumber = sc.nextLine();
        System.out.println("Nhập số đơn hàng muốn thêm: ");
        int n = sc.nextInt();
        sc.nextLine();
        customerDB.oder(phoneNumber,n);
        System.out.println("Thông tin sau khi tăng " + n + " đơn hàng");
        customerDB.display(phoneNumber);
        continueConfirm();

    }

    public void printCustomer(){
        customerDB.print();
        System.out.println("Tổng có " + customerDB.customerMap.size() + " khách hàng trong hệ thống");
        continueConfirm();
    }

    public void continueConfirm() {
        System.out.println("Bạn có muốn tiếp tục thực hiện không ?");
        System.out.println("Nhấn Y để tiếp tục, nhấn N để thoát.");
        while (true) {
            String choice = sc.next();
            switch (choice) {
                case "Y": {
                    performCustomer();
                    break;
                }
                case "N": {
                    System.out.println("Thoát.");
                    System.exit(0);
                }
                default:
                    System.out.println("Bạn nhập sai ");
                    System.out.println("Vui lòng chọn lại Y hoặc N:");
                    System.out.println("===========================================");
            }
        }
    }

    public void performCustomer(){
        int choose;
        System.out.println("Chào mừng bạn đến với hệ thống quản lý khách hàng");
        while (true){
            showMenu();
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    try {
                        addCustomer();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    searchCustomer();
                    break;
                case 3:
                    displayCustomer();
                    break;
                case 4:
                    printCustomer();
                    break;
                case 5:
                    oderIncreaseCustomer();
                    break;
                case 0:
                    System.out.println("Thoát.");
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập lại: ");
            }
        }
    }
}
