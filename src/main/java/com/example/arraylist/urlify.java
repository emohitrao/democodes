package com.example.arraylist;

public class urlify {

    public static char[] urlify(String str, int truelength){
        //count the number of spaces
        int num_spaces = 0;
        for(int i = 0;i<truelength;i++){
            if(str.charAt(i) == ' ')
                num_spaces++;
        }
        int actuallength = truelength + 2 * num_spaces;
        char[] ch = new char[actuallength];
        for(int j = truelength - 1; j>=0;j--){
            if(str.charAt(j)== ' '){
                ch[actuallength-1] = '0';
                ch[actuallength-2] = '2';
                ch[actuallength-3] = '%';
                actuallength = actuallength-3;
            }
            else {
                ch[actuallength - 1] = str.charAt(j);
                actuallength--;
            }
        }
        return ch;
    }

    public static void main(String[] args) {
        char[] string = urlify("Mr John Smith",13);
        System.out.println(string);
    }
}
