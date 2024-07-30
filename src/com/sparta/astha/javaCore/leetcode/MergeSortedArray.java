package com.sparta.astha.javaCore.leetcode;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        anotherMerge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

      //  for(int i=0;i<((m>n)?m:n);i++){

            int j=0, k=0, temp=0, swap=-1;


            while(j<m && k<n){
                if (nums1[j]>nums2[k]){
                    temp=nums1[j];
                    nums1[j]=nums2[k];
                    swap++;
                    for(int i=m+swap;i>j+1;i--){
                        nums1[i]=nums1[i-1];
                    }
                    nums1[j+1]=temp;
                    k++;
                }
                j++;
            }

        System.out.println(Arrays.toString(nums1));
                while(k<n){
                    nums1[j++]=nums2[k++];
                }


       // }
        System.out.println(Arrays.toString(nums1));
    }

    public static void anotherMerge(int[] nums1, int m, int[] nums2, int n) {

        //  for(int i=0;i<((m>n)?m:n);i++){

        int i=m-1, j=n-1, k=m+n-1, temp=0, swap=-1;

        while(j>=0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] =nums1[i--];
            }
            else{
                nums1[k--]=nums2[j--];
            }
        }

        System.out.println(Arrays.toString(nums1));


        // }
    }
}
