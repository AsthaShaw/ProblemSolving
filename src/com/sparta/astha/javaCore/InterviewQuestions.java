package com.sparta.astha.javaCore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class InterviewQuestions {

    /* An input consists of different type elements. ex: [5,6,new Item[3], new Item[new Item[2],4],9] .
     *  Evaluate the elements: 5+6+2*3+3*2+2*4+9
     * */

    //JavaScript

    /*
    values= [5,6,[3], [[2],4],9]
console.log(values)
let calculate=0;
//let multiplier=1;
for (const obj of values){
    if(typeof(obj)==='number'){
        calculate+=obj;
    }
    else if(typeof(obj)==='object'){
        //multiplier+=1;
        for(i=0;i<obj.length;i++){
            if(typeof(obj[i])==='object'){
                //multiplier+=1;
                for(j=0;j<obj[i].length;j++){
                    if(typeof(obj[i][j])==='number'){
                    calculate+=3*obj[i][j];
            }
        }
    }
    else if(typeof(obj[i])==='number'){
                calculate+=2*obj[i]
                console.log("obj[i]",obj[i])
            }

        }
    }
//console.log(typeof(obj))
console.log(calculate)

}
	//Evaluate the elements: 5+6+2*3+3*2+2*4+9



     */



    public static int calculateLevels() {
        int calculate = 0;
        List<Object> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(6);
        list1.add(new int[]{3});
        list1.add(new int[][]{new int[]{2}, {4}});
        list1.add(9);


        System.out.println("Equivalent of TypeOf" + list1.get(2).getClass());

        return calculate;


    }

    public static int smallestElement(int[] arr){
        int smallestElement=999;
        int count=0;

        for(int i=1;i<arr.length-1;i++){
            if(arr[i-1]>=arr[i] && arr[i]<=arr[i+1]){
                count=1;
               if(arr[i]<smallestElement){
                   smallestElement=arr[i];
               }
            }
        }

        if(count==0){
            throw new IllegalArgumentException("There are no smallestElement from its neighbouring elements");
        }
        return smallestElement;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the size of the array you wish to create(Enter size more than 2):");
        int size=in.nextInt();

        if(size<=2){
            throw new IllegalArgumentException("The array length should be more than 2");
        }

        int[] arr=new int[size];

        System.out.println("Now enter "+size+" elements of the array");

        for(int i=0;i<size;i++){
            arr[i]=in.nextInt();
        }

        in.close();//why?

        System.out.println("Your array elements are ::"+ Arrays.toString(arr));
        System.out.println("Smallest Element from its neighbours::"+smallestElement(arr));
    }
}
