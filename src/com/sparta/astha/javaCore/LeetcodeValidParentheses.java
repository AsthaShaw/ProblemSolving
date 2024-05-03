package com.sparta.astha.javaCore;

import java.util.*;

public class LeetcodeValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("(){}}{"));
        System.out.println(isValidRefined("(){}}{"));
    }

    public static boolean isValid(String s){
        boolean result=false;
        //int openCounter=0;
        int swap=0;
        Stack<Character> closingParathesisStack=new Stack<>();
        HashMap<Character, Character> hashMap=new HashMap();
        hashMap.put('(', ')');
        hashMap.put('{','}');
        hashMap.put('[',']');

        char[] arrayOfchars=s.toCharArray();
          for(int i=0;i<arrayOfchars.length;i++){
              if(hashMap.get(arrayOfchars[i])!=null){
                  closingParathesisStack.push(hashMap.get(arrayOfchars[i]));
                  //openCounter++;
                  swap++;
              }
              else if(!closingParathesisStack.isEmpty()) {
                  if(arrayOfchars[i] == closingParathesisStack.peek()){
                      closingParathesisStack.pop();
                      swap++;
                      //openCounter--;
                  }
                  else{
                      swap++;
                      break;
                  }
              }else{
                  swap++;
                  break;
              }
          }
          if(swap>0 && swap%2==0 && closingParathesisStack.isEmpty()){
              result=true;
          }
        return result;
    }


    public static boolean isValidRefined(String s){
        boolean result=false;
        Stack<Character> closingParathesisStack=new Stack<>();
        HashMap<Character, Character> hashMap=new HashMap();
        hashMap.put('(', ')');
        hashMap.put('{','}');
        hashMap.put('[',']');
        char[] arrayOfchars=null;
        if(s!=null && !s.isBlank()){
            arrayOfchars =s.toCharArray();
        }
        else{
            return result;
        }

        for(int i=0;i<arrayOfchars.length;i++){
            if(hashMap.get(arrayOfchars[i])!=null){
                closingParathesisStack.push(hashMap.get(arrayOfchars[i]));
                //openCounter++;

            }
            else if(!closingParathesisStack.isEmpty()) {
                if (arrayOfchars[i] == closingParathesisStack.peek()) {
                    closingParathesisStack.pop();

                    //openCounter--;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }

        return closingParathesisStack.isEmpty();
    }
}
