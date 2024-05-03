package com.sparta.astha.javaCore;

import java.util.ArrayList;
import java.util.Scanner;

public class HackerRankArrayListProblem {

    public static void main(String[] args) {

        //https://www.hackerrank.com/challenges/java-arraylist/problem

//        int[][] anotherArray = {
//                {10, 20, 30},
//                {40, 50, 60},
//                {70, 80, 90}
//        };


        Scanner in=new Scanner(System.in);
        System.out.println("Please enter the rows of input you want to have? ");
        int rows=in.nextInt();
        ArrayList<ArrayList<Integer>> TwoDArrayList=new ArrayList<>(rows);
        for(int i=0;i<rows;i++){
            TwoDArrayList.add(new ArrayList<>());
        }

        int column=0;
        for(int i=0;i<rows;i++) {
            System.out.println("Please enter the number of input you want to have in row"+(i+1));
            column = in.nextInt();

            System.out.println("Please enter the elements in the row :");
            int element=0;
            for(int j=0;j<column;j++) {
                element=in.nextInt();
                TwoDArrayList.get(i).add(element);
            }

        }

        for(ArrayList<Integer> innerList:TwoDArrayList){
            for(Integer element:innerList){
                System.out.print(element+" ");
            }
            System.out.println();
        }


        System.out.println("Please enter the number of queries you want to enter:");
        int queries=in.nextInt();
        int x,y=0;
        ArrayList<Object> output=new ArrayList<>();
        for(int i=0;i<queries;i++){
            System.out.println("Please enter the position(x,y) of the element you want to know!!");
            x=in.nextInt();
            y=in.nextInt();
            System.out.println(x+" "+y);
            try{
            //if(TwoDArrayList.get(x-1).get(y-1)!=null) {
                output.add(TwoDArrayList.get(x - 1).get(y - 1));
            }catch(Exception e){
                output.add("ERROR!");
            }

        }

        in.close();

        output.forEach(System.out::println);


    }



}
