package com.example.demo;

public class IsUnique {

    public Boolean isUnique(String string){
        if(string.length()>128){
            return false;
        }
        Boolean[] char_set = new Boolean [128];
        for(int i=0;i<string.length();i++){
            int val = string.charAt(i);
            if(char_set[val]){
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
}
