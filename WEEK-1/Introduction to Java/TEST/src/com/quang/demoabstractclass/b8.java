package com.quang.demoabstractclass;

import java.util.Scanner;
public class b8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; i < m; j++){
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
        }
        System.out.print(sum);
    }
}