package com.example.demo;

import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(Integer[] nums){
        Arrays.sort(nums);
       List<List<Integer>> res = new ArrayList<>();
       for(Integer i=0; i<nums.length && nums[i]<=0; i++){
           if(i==0 || (nums[i-1]!=nums[i])){
              threeSumII(nums,i,res);

           }
       }
       return res;
    }
       public void threeSumII(Integer[] nums, Integer i, List<List<Integer>> res){
        Integer lo = i+1;
        Integer hi = nums.length - 1;
        while (lo<hi){
            Integer sum = nums[i] + nums[lo] + nums[hi];
            if(sum<0){
                lo++;
            }
            if(sum>0){
                hi--;
            }
            else{
                res.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
                while(lo<hi && nums[lo]==nums[lo-1]){
                    lo++;
                }
            }
        }
    }
}
