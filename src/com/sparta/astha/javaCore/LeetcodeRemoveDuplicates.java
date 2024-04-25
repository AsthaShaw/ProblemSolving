package com.sparta.astha.javaCore;

import java.util.Arrays;
import java.util.HashSet;

public class LeetcodeRemoveDuplicates {


    public static int  removeDuplicates(int[] nums){
        int uniqueElements=0;




     
        //Arrays.stream(nums).distinct().forEach(System.out::println);

        //First way

      // uniqueElements=  (int)Arrays.stream(nums).distinct().count();


        //2nd way

          HashSet<Integer> hashSet=new HashSet<>();

        for(int num:nums){
            hashSet.add(num);
        }
         int i=0;
        for(int num:hashSet){
             nums[i++]=num;
        }

        uniqueElements=hashSet.size();

        return uniqueElements;
    }
}
