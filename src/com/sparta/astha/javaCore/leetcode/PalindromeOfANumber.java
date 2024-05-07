package com.sparta.astha.javaCore.leetcode;

public class PalindromeOfANumber {

    public static void main(String[] args) {
        System.out.println(isPalindrrome(121));
        System.out.println(isPalindromeString(121));
    }

    public static boolean isPalindrrome(int x){
        boolean result=false;
        int reversedNumber=0;
        int actualNumber=x;
        int rem=0;

        while(x>0){
            rem=x%10;
            reversedNumber=reversedNumber*10+rem;
            x=x/10;
        }

        if(reversedNumber==actualNumber){
            result=true;

        }

        return result;
    }

    public static boolean isPalindromeString(int x){

        //concise solution
//        String actualNumber=Integer.toString(x);
//        return actualNumber.equals(new StringBuilder(actualNumber).reverse().toString());


        boolean result=false;
        String actualNumber=Integer.toString(x);
        System.out.println("actualNumber"+actualNumber);

        StringBuilder reversedNumber=new StringBuilder(actualNumber);

        if(actualNumber.equals(reversedNumber.reverse().toString())){
            result=true;
        }

        return result;
    }
}
