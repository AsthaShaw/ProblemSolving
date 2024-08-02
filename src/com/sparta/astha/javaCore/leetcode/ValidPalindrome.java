package com.sparta.astha.javaCore.leetcode;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
    }

    public static boolean isPalindrome(String s) {
        boolean palindromeOrNot = true;

        if (s != null) {

            s=s.replaceAll("[^a-zA-Z0-9]", "");
            //System.out.println(s.toLowerCase());

            char[] charactersOfString=s.toLowerCase().toCharArray();
             int lengthOfString=s.length();
            for(int i=0;i<lengthOfString/2;i++){
                if(charactersOfString[i]!=charactersOfString[lengthOfString-(i+1)]){
                    palindromeOrNot=false;
                    break;
                }
            }

        }

        return palindromeOrNot;
    }

    public static boolean moreOptimumSolution(String s){
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if (!Character.isLetterOrDigit(currFirst )) {
                start++;
            } else if(!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }

}
