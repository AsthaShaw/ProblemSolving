package com.sparta.astha.javaCore.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {
        List<List<Integer>> pascal=generate(1);
        pascal.forEach(System.out::println);

    }

    public static  List<List<Integer>> generate(int numRows) {

        List<List<Integer>> pascal=new ArrayList<>();
        if(numRows>=1) {
            List<Integer> index0 = new ArrayList<>();
            index0.add(1);
            pascal.add(index0);
        }
        if(numRows>=2) {
            List<Integer> index1 = new ArrayList<>();
            index1.add(1);
            index1.add(1);


            pascal.add(index1);
        }

        for(int i=2;i<numRows;i++){
            List<Integer> index=new ArrayList<>();
            index.add(1);
            int sum=0;
            int prev=0;
            int counter=0;
            for(int j=0;j<i;j++){
                counter++;
                sum=prev+pascal.get(i-1).get(j);
                 prev=pascal.get(i-1).get(j);
                 if(counter>=2){
                     index.add(sum);
                 }
                }

            index.add(1);
            index.forEach(System.out::println);
            pascal.add(index);
            }

        return pascal;
    }


    public static  List<List<Integer>> generateAnotherApproach(int numRows) {
        //Brute Force
                List<List<Integer>> al = new ArrayList();
                List<Integer> prev = new ArrayList();
                prev.add(1);
                al.add(prev);
                for(int i = 0; i < numRows - 1; i++) {
                    List<Integer> curr = new ArrayList();
                    curr.add(1);
                    for(int j = 0; j < prev.size() - 1; j++) {
                        curr.add(prev.get(j) + prev.get(j + 1));
                    }
                    curr.add(1);
                    al.add(curr);
                    prev = curr;
                }
                return al;
            }
        }

