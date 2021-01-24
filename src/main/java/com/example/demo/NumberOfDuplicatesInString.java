package com.example.demo;

import java.util.HashSet;
import java.util.Set;

public class NumberOfDuplicatesInString {

    public Integer numberOfDuplicates(String S){
        Integer numDuplicates = 0;
        Set<Character> set = new HashSet<>();
        set.add(S.charAt(0));
        for(Integer i = 1; i<S.length(); i++){
            if(set.contains(toString().charAt(i))){
                set.add(S.charAt(i));
                numDuplicates++;
            }
        }
        return numDuplicates;
    }

}
