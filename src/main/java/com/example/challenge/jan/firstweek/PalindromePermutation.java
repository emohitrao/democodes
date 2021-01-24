package com.example.challenge.jan.firstweek;

import java.util.HashMap;

public class PalindromePermutation {

        public static boolean canPermutePalindrome(String s) {
            HashMap<Character, Integer> map = new HashMap<>();
            Boolean flag = false;
            int count = 0;
            for(int i = 0; i<s.length(); i++){
                if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i),(map.get(s.charAt(i))+1));
                }
                else map.put(s.charAt(i),1);
            }

            for(int c: map.values()){
                if(c%2 <= 1){
                    flag = true;
                }
                else flag = false;

            }


            return flag;
        }
    public static void main(String[] args) {
        Boolean isPalindrome =  canPermutePalindrome("aaa");
        System.out.println("ans - "+isPalindrome);
    }
    }

