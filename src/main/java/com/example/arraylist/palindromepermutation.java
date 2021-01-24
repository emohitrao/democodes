package com.example.arraylist;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;

public class palindromepermutation {

    public static Boolean palindromeCheck(String str){
        Boolean flag = false;
        int oddcount = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i= 0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                System.out.println("character is "+str.charAt(i));
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else
                map.put(str.charAt(i),1);
        }
        if (str.length()%2==0){


            for(int j: map.keySet()){
                if(map.get(j)%2==0){
                    flag = true;
                }
                else flag = false;
                break;
            }

            }
            else{

            for(int j: map.keySet()){
                System.out.println("j = "+j);
                System.out.println("value = "+map.get(j));
                if(map.get(j)%2==0){
                    flag = true;
                }
                else {
                    oddcount++;
                    if(oddcount>1){
                        flag = false;
                        break;
                    }
                }
            }
            }
        return flag;
        }

    public static void main(String[] args) {
        Boolean isPalindrome = palindromeCheck("tactcoa");
        System.out.println("ans - "+isPalindrome);
    }
}
