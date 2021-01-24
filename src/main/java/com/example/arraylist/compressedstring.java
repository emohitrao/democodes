package com.example.arraylist;

public class compressedstring {

    public static String compressString(String str){
        StringBuilder new_str = new StringBuilder();
        int count = 1;
        for(int i = 0;i<str.length()-1;i++){
                      count++;

            if(i+1>=str.length()-1||str.charAt(i)!=str.charAt(i+1)){
                new_str.append(str.charAt(i));
                new_str.append(count);
                count = 1;
            }

        }
        return new_str.length()<str.length()?new_str.toString():str;
    }

    public static void main(String[] args) {
        String s = compressString("aabccccaaa");
        System.out.println("Compressed String is "+s);
    }
}
