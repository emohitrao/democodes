package com.example.demo;

import java.util.*;

public class LargestElementInArray {

    public static Integer LargestElementInArray(Integer[] arr,Integer n){

        if(arr.length==0){
            return 0;
        }
        Arrays.sort(arr);

     return arr[arr.length - n];
    }

    public static boolean doTestPass() {
        Integer[] arr = {3,2,1,5,6,4};
        Integer maxElement = LargestElementInArray(arr, 2);
        if (maxElement == 5) {
            System.out.println("Test Passed");
            return true;
        }
        else {
            System.out.println("Test Failed");
            return false;
        }
    }

    public static void main(String[] args){
        doTestPass();
    }
}
