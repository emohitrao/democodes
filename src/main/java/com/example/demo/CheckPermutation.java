package com.example.demo;

public class CheckPermutation {

    //record all the characters of first string first and then compare it with second string characters
    public Boolean checkPermutation(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        int[] length = new int[128];

        char[] sc = s.toCharArray();
        for(char c:sc){
            length[c]++;
        }
        for(int i=0;i<t.length();i++){
            int val = t.charAt(i);
            length[val]--;
            if(length[val]<0){
                return false;
            }
        }
        return true;
    }
}
