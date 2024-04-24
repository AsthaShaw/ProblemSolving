package com.sparta.astha.javaCore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HashMapProblemHackerrank {

    public static double calculateArea(int[] nums, String word){

        double area=0.0;

        HashMap<Character, Integer> hashMap=new HashMap<>();

        char value='a';
        System.out.println((int)value);

        for(int i=0; i<nums.length;i++) {

            hashMap.put((char)(97+i), nums[i]);
        }

        System.out.println(hashMap);

        char words[]=word.toCharArray();
        List<Integer> values=new ArrayList<>();
        for(char letter:words){
           values.add(hashMap.get(letter));
        }

       values.sort(null);

       area=values.get(values.size()-1)*values.size();

        return area;

    }
}
