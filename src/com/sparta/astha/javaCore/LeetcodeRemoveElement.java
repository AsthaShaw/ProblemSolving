package com.sparta.astha.javaCore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetcodeRemoveElement {

    public static int removeElement(int[] nums, int val) {

        System.out.println("Original Array:"+Arrays.toString(nums));
        int numOfNotVal=0;
        for(int i=0;i<nums.length;i++){
            //if(nums[i-1]==val){
                if(nums[i]!=val) {
                    nums[numOfNotVal++]=nums[i];
                }

        }

        for(int i=numOfNotVal;i<nums.length;i++){
            nums[i]=1001;
        }

        System.out.println(Arrays.toString(nums));
        return numOfNotVal;

    }



    public static int removeElement1(int[] nums, int val) {
        List<Integer> numbers=new ArrayList<>();
        //List<String> places = Stream.of("Buenos Aires", "Córdoba", "La Plata").collect(Collectors.toList());

        for(int num:nums){
            if(num!=val){
               numbers.add(num);
            }
        }
        nums = numbers.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(nums));
        return numbers.size();
    }



}
