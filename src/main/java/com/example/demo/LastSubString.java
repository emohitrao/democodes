package com.example.demo;

import java.util.ArrayList;

public class LastSubString {

    public String LastSubString(String S){
        ArrayList<String> as = new ArrayList<>();
        as.add(S.substring(0));
     /*   for(Integer i=1; i<S.length(); i++){
            if(S.charAt(i)<as.get()){
                as.add(S.substring(i));
            }
            else
        }*/
     return S;
    }
}
