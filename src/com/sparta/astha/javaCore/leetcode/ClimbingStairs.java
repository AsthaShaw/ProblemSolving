package com.sparta.astha.javaCore.leetcode;

public class ClimbingStairs {

    public static void main(String[] args) {

        System.out.println(climbStairs(5));
        System.out.println(anotherApproachclimbStairs(5));
    }

        public static int climbStairs(int n) {
        //the below is wrong!! The second approach is correct
            int numberOfWays=1;
            if(n%2==0){
                numberOfWays=2;
            }

           if(n>2) {
               int numberOf2s=1;
               int numberOf1s=1;
               int numberOfDigits=1;

               if(n%2==0){
                   for (int i = 1; i <n/2; i++) {
                       numberOf2s=i;
                       numberOf1s=n-2*numberOf2s;
                       numberOfDigits=numberOf2s+numberOf1s;

                       numberOfWays = numberOfWays + (factorial(numberOfDigits) / (factorial(numberOf2s) * factorial(numberOf1s)));
                   }
               }
               else {
                   for (int i = 1; i <= n / 2; i++) {
                       numberOf2s = i;
                       numberOf1s = n - 2 * numberOf2s;
                       numberOfDigits = numberOf2s + numberOf1s;

                       numberOfWays = numberOfWays + (factorial(numberOfDigits) / (factorial(numberOf2s) * factorial(numberOf1s)));
                   }
               }
           }
           return numberOfWays;
        }

        public static int factorial(int n){
             int factValue=1;
             for(int i=n;i>1;i--){
                 factValue=factValue*i;
             }
             return factValue;
        }

    public static int anotherApproachclimbStairs(int n) {
        int firstNumber=0;
        int secondNumber=1;
        int numberOfWays=1;
            while (n > 0) {
               numberOfWays=firstNumber+secondNumber;

               firstNumber=secondNumber;
               secondNumber=numberOfWays;
               n--;

            }
            return  numberOfWays;
        }



}
