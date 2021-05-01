package com.customer.dal;

import com.customer.model.Customer;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CustomerDB {
    public static Map<String, Customer> customerMap;
    static {
        customerMap = new HashMap<>();
    }

    public void add(Customer customer){
        if(customerMap.containsKey(customer.getPhoneNumber()) && customerMap.get(customer.getPhoneNumber()).getEmail().equals(customer.getEmail())){
            System.out.println("Da trung");
        }else {
            customerMap.put(customer.getPhoneNumber(),customer);
        }

    }


    public void saveFile() throws IOException {
        File file = new File("customer.csv");
        if(!file.exists()){
            file.createNewFile();
        }

        FileOutputStream fos = new FileOutputStream("customer.csv");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        for (Map.Entry<String, Customer> entry : customerMap.entrySet()
             ) {
            bos.write(entry.getValue().toStringCSV().getBytes());
        }

        bos.flush();
        bos.close();
        fos.close();
    }

    public void readFile() throws IOException {
        File file = new File("customer.csv");
        if(!file.exists()){
            return;
        }

        FileReader reader = new FileReader("customer.csv");
        BufferedReader bis = new BufferedReader(reader);
        String line;
        while ((line = bis.readLine())!= null){
            String[] arr = line.split(",");
            Customer customer = new Customer(arr[0],arr[1],arr[2],arr[3],arr[4],0);
            add(customer);
        }
    }
}
