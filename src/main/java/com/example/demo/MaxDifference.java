package com.example.demo;

public class MaxDifference {

    public Integer maxDifference(Integer[] arr){
        Integer minPrice = Integer.MAX_VALUE;
        Integer maxPrice = 0;
        Integer maxProfit = 0;
        for(Integer i=0; i<arr.length; i++){
            if(arr[i]<minPrice){
                minPrice = arr[i];
            }
            else if((arr[i] - minPrice)>maxProfit){
                maxProfit = arr[i] - minPrice;
            }
        }return maxProfit;
    }


}
