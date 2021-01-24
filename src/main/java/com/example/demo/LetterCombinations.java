package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

    Map<String, String> map = new HashMap<String,String>(){
        {
            map.put("2", "abc");
            map.put("3", "def");
            map.put("4", "ghi");
            map.put("5", "jkl");
            map.put("6", "mno");
            map.put("7", "pqrs");
            map.put("8", "tuv");
            map.put("9", "wxyz");
        }};
    List<String> output = new ArrayList<>();

    public List<String> letterCombinations(String num) {
        if(num.length()!=0){
            backtrack("",num);

        }return output;
    }
    public void backtrack(String combination, String num) {
        if (num.length() == 0) {
            output.add(combination);
        } else {
            String val = map.get(num.substring(0, 1));
            for (Integer i = 0; i < val.length(); i++) {
                String letter = val.substring(i,i+1);
                backtrack((combination + letter),num.substring(1));
            }

        }
    }

}
