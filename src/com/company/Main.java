package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum = 0;
        for (int i=1; i<=10; i++){
            for (int x = 1; x<=i; x++){
                sum = sum + x;
            }
            System.out.println(sum);
            sum=0;
        }

    }
}
