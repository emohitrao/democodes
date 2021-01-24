package com.example.demo;

import java.util.stream.Stream;

public class IkmIndia {
    public static void main(String[] args){
        System.out.println(calc(5));
        System.out.println(Stream.of("green","yellow","blue").max((s1,s2) -> s1.compareTo(s2))
                .filter(s -> s.endsWith("n"))
                .orElse("yellow"));
    }
    public static int calc(int x){
        if(x==0)
            return 1;
        else
            return x * calc(x-1);
    }


}
