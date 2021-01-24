package com.example.demo;

public class StrangeTest {

    public static int strange(int j) {
        int k = 0;
        while (j > 0) {
            k = 10 * k + j % 10;
            j = j / 10;
        }
        return k;


    }

    public static void main(String[] args){
        int num= 1230;
        int output = strange(num);
        System.out.println("Output - "+output);
    }
}
