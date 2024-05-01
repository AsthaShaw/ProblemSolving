package com.sparta.astha.javaCore;

public class LeetCodeLongestCommonPrefix {


    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"acc", "aaa", "aaba"}));
    }

    public static String longestCommonPrefix(String[] strs){
        int similarCharacters=strs[0].length();
        int index=0;
        String commonPrefix;
        if(strs==null || strs.length==0){
            commonPrefix="";
        }
        else if(strs.length==1){
            commonPrefix=strs[0];
        }
        else {
            for (int i = 0; i < strs.length - 1; i++) {
                index = 0;
                while (index < strs[i].length() && index < strs[i + 1].length()) {
                    if (strs[i].charAt(index) != strs[i + 1].charAt(index)) {
                        break;
                    } else {
                        index++;
                    }
                }
                if (similarCharacters > index) {
                    similarCharacters = index;
                }
            }
            if (similarCharacters == 0) {
                commonPrefix = "";
            } else {
                commonPrefix = strs[0].substring(0, similarCharacters);
            }
        }

        return commonPrefix;
    }


    //Faster one done my someone in leetcode???

    class Solution {
        public String longestCommonPrefix(String[] strs) {
            String prefix = strs[0];
            for(int index=1;index<strs.length;index++){
                while(strs[index].indexOf(prefix) != 0){
                    prefix=prefix.substring(0,prefix.length()-1);
                }
            }
            return prefix;
        }
    }

}
