package com.sparta.astha.javaCore.leetcode;

public class Sqrt {

    public static void main(String[] args) {

        System.out.println(mySqrt(8));
       System.out.println(mySqrt2(2147395599));

       //copied from leetcode solutions can't understand this approach
        System.out.println(mySqrt3(2147395599));

        //my experiment
        System.out.println(experiment(2147395599));
    }

    public static int mySqrt(int x) {
         long sqrtValue=0;
         while(sqrtValue*sqrtValue<=x){
             sqrtValue++;
         }

         return (int) (sqrtValue-1);
    }

    public static int mySqrt2(int x){

        if(x==0|| x==1){
            return x;
        }
        int low=2, high=x/2, mid=-1;
        long sqrtValue=0;

        while(low<=high){
            mid=(low+high)/2;
            //mid=(low+(high-low))/2;
           // sqrtValue=mid*mid;
           // if(sqrtValue==x){
            if(mid==x/mid){ //doing this instead of sqrtValue as mid*mid is overflowing in case of big integers
                return mid;
            }
            else if(mid>x/mid){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return high;
    }

    public static int mySqrt3(int x){

        if (x == 0 || x == 1)
            return x;

        // Initialize the search range for the square root.
        int start = 1;
        int end = x;
        int mid = -1;

        // Perform binary search to find the square root of x.
        while (start <= end) {
            // Calculate the middle point using "start + (end - start) / 2" to avoid integer overflow.
            mid = start + (end - start) / 2;//can't understand this

            // If the square of the middle value is greater than x, move the "end" to the left (mid - 1).
            if ((long) mid * mid > (long) x)
                end = mid - 1;
            else if (mid * mid == x)
                // If the square of the middle value is equal to x, we found the square root.
                return mid;
            else
                // If the square of the middle value is less than x, move the "start" to the right (mid + 1).
                start = mid + 1;
        }

        // The loop ends when "start" becomes greater than "end", and "end" is the integer value of the square root.
        // However, since we might have been using integer division in the calculations,
        // we round down the value of "end" to the nearest integer to get the correct square root.
        return Math.round(end);
    }

    public static int experiment(int x){

        if(x==0|| x==1){
            return x;
        }
        long low=2, high=x, mid=-1;
        long sqrtValue=0;

        while(low<=high){
          //  mid=(low+high)/2;
            mid=low+(high-low)/2;//to cater to integer flow scenario
            sqrtValue=mid*mid;
            if(sqrtValue==x){
           // if(mid==x/mid){ //doing this instead of sqrtValue as mid*mid is overflowing in case of big integers
                return (int)mid;
            }
            else if(sqrtValue>x){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return (int)high;
    }
}
