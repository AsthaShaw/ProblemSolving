package com.sparta.astha.javaCore.leetcode;

import java.util.HashMap;

public class AddTwoBinary {

    public static void main(String[] args) {
        System.out.println(addBinary("111", "111"));
    }


    public static String addBinary(String a, String b) {

        String result = "";
        if (a.length() != b.length()) {
            if (a.length() > b.length()) {
                int diff = a.length() - b.length();
                while (diff != 0) {
                    b = "0" + b;
                    diff--;
                }

            } else {
                int diff = b.length() - a.length();
                while (diff != 0) {
                    a = "0" + a;
                    diff--;
                }

            }
        }

        int carry = 0;
        int value = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            value = Integer.parseInt(a.substring(i, i+1)) + Integer.parseInt(b.substring(i, i+1)) + carry;
            if (value == 2) {
                result = "0" + result;
                carry = 1;
            } else if (value == 3) {
                result = "1" + result;
                carry = 1;
            } else {
                result = String.valueOf(value) + result;
                carry = 0;
            }



        }
        if(carry==1){
            result="1"+result;
        }
        return result;
    }
}
