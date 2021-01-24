package com.example.arraylist;

public class oneaway {

    public Boolean replace(String str1, String str2) {
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                count++;
            }
        }
        return (count == 1)?true:false;
    }

    public Boolean insertorremove(String str1, String str2) {
        int count = 0;
        if (str1.length() > str2.length() && str1.length()-str2.length() == 1) {
            int i=0,j=0;
            while(i < str2.length()){
                if(str1.charAt(j)!=str2.charAt(i)){
                    count++;
                    j++;
                }
                else{
                    j++;
                    i++;
                }
            }
        }
        return (count == 1)?true:false;
    }
}
