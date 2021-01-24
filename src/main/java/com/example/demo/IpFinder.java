package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class IpFinder {

    public static String findTopIpaddress(String[] lines){
        Integer ans = 0, occurence = 0;
        String resultIp = null;

        Map<String,Integer> map = new HashMap<String,Integer>();
        for(Integer i = 0; i< lines.length; i++){
            Integer lastIndex = lines[i].indexOf('-');
            String ip = lines[i].substring(0,lastIndex);
            if(!map.containsKey(ip)){
                map.put(ip,1);
            }
            else{
                occurence = map.get(ip);
                occurence++;
                map.put(ip,occurence);
                if(occurence>ans){
                    ans = occurence;
                    resultIp = ip;
                }
            }

        }
        return resultIp;
    }
    public static boolean doTestsPass() {
        // TODO: improve the test
        String lines[] = new String[] {
                "10.0.0.1 - frank [10/Dec/2000:12:34:56 -0500] \"GET /a.gif HTTP/1.0\" 200 234",
                "10.0.0.1 - frank [10/Dec/2000:12:34:57 -0500] \"GET /b.gif HTTP/1.0\" 200 234",
                "10.0.0.2 - nancy [10/Dec/2000:12:34:58 -0500] \"GET /c.gif HTTP/1.0\" 200 234" };
        String result = findTopIpaddress(lines);

        if (result.equals("10.0.0.1 ")) {
            System.out.println("Test passed");
            return true;
        } else {
            System.out.println("Test failed");
            return false;
        }



    }

    public static void main(String[] args) {
        doTestsPass();
    }
}
