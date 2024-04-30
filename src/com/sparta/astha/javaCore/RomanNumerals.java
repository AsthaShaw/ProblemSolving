package com.sparta.astha.javaCore;

import java.util.Arrays;
import java.util.HashMap;

public class RomanNumerals {

    public static void main(String[] args) {
        System.out.println(romanToInteger("DCLIXX"));

    }

    public static int romanToInteger(String romanNumerals){
        int value=0;
        HashMap<String, Integer> hashMap=new HashMap<>();
        hashMap.put("I", 1);
        hashMap.put("V", 5);
        hashMap.put("X", 10);
        hashMap.put("L", 50);
        hashMap.put("C", 100);
        hashMap.put("D", 500);
        hashMap.put("M", 1000);

        String[] values=romanNumerals.split("");
        System.out.println(Arrays.toString(values));

        for(int i=0;i<values.length;i++){
            System.out.println("Value of i:"+i);
            if(i==values.length-1){
                value+=hashMap.get(values[i]);
                break;
            }
            if (hashMap.get(values[i])>=hashMap.get(values[i+1])) {
                value+=hashMap.get(values[i]);
            }
            else{
                value+=(hashMap.get(values[i+1])-hashMap.get(values[i]));
                i++;
            }


        }


        return value;

//        if(values.length%2!=0){
//            value+=hashMap.get(values[values.length-1]);
//        }
//        for(int i=1;i<values.length-1;i++){
//            System.out.println("Value of i:"+i);
//                if (hashMap.get(values[i-1])>=hashMap.get(values[i]) && hashMap.get(values[i])>= hashMap.get(values[i+1])) {
//                    value+=hashMap.get(values[i + 1])+hashMap.get(values[i]);
//
//                }
//                else{
//                    value+=(hashMap.get(values[i+1])-hashMap.get(values[i]));
//                }
//            }



    }


}
