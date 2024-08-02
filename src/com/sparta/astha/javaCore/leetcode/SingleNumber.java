package com.sparta.astha.javaCore.leetcode;

import java.util.Arrays;

public class SingleNumber {

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,1}));
        System.out.println(singleNumberMoreBetterLeetcodeSolution(new int[]{2,2,1}));
        System.out.println(singleNumberBestSolutionUsingLeetcode(new int[]{2,2,1}));
    }

    public static  int singleNumber(int[] nums) {
        int nonDuplicatingNumber=0;
        int arrayLength=nums.length;
        if(nums.length==1){
            nonDuplicatingNumber=nums[0];
        }

        int i=0;
        for(int j=0;j<arrayLength;j++){
            int count=1;
            i=j+1;
            if(nums[j]!=-9999){
                while(i<arrayLength){
                    if(nums[i]==nums[j]){
                        count++;
                        nums[j]=-9999;
                        nums[i]=-9999;
                        break;
                    }
                    i++;
                }
                if(count == 1){

                    nonDuplicatingNumber=nums[j];
                    break;

                }

            }


        }


        return nonDuplicatingNumber;

    }

    public static  int singleNumberMoreBetterLeetcodeSolution(int[] nums) {

        Arrays.sort(nums);
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }

    //XOR concept-well explained-https://www.geeksforgeeks.org/bitwise-xor-operator-in-programming/
//    Explanation: 1’s and 2’s appear twice, only 4 appears exactly once. So the answer is 4.
//    Concept of XOR:
//    XOR of zero and some bit returns that bit i.e. x^0 = x...
//    XOR of two same bits returns 0 i.e. x^x = 0...
//    And, x^y^x = (x^x)^y = 0^y = y...
//    XOR all bits together to find the unique number.

    public static  int singleNumberBestSolutionUsingLeetcode(int[] nums){
       int result=0;
       for(int num:nums){
           result^=num;
       }
       return result;
    }
    }






