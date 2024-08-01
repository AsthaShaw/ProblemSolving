package com.sparta.astha.javaCore.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class BestTimeToBuyAndSellStocks {

    public static void main(String[] args) {
       // System.out.println(maxProfit(new int[]{1,6,5,11,2}));

        System.out.println(maxProfitOptimumSolution(new int[]{1,6,5,11,2}));
    }

    public static int maxProfit(int[] prices) {
  //Throwing memory limit error
        int maxProfitValue=0;
        if(prices.length==0|| prices.length==1){
            return maxProfitValue;
        }


        String key = "";

        HashMap<String, Integer> profit = new HashMap<>();

        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                key = (i + 1) + "" + (j + 1);
                profit.put(key, prices[j] - prices[i]);
            }
        }

//        List<Map.Entry<String, Integer>> list= profit.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue())
//                        .collect(Collectors.toList()).reversed();

        int value= profit.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList()).reversed().getFirst().getValue();


       if(maxProfitValue<value){
           maxProfitValue=value;
       }

     return maxProfitValue;
    }

    public static int maxProfitAnotherApproach(int[] prices) {
    //throwing memory limit error
        int maxProfitValue=0;
        if(prices.length==0|| prices.length==1){
            return maxProfitValue;
        }


        // String key = "";

      //  HashMap<String, Integer> profit = new HashMap<>();
        List<Long> list=new ArrayList<>();

        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
              //  key = (i + 1) + "" + (j + 1);
                list.add((long) (prices[j] - prices[i]));
            }
        }

        long value=Collections.max(list);

//        List<Map.Entry<String, Integer>> list= profit.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue())
//                        .collect(Collectors.toList()).reversed();

//        int value= profit.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue())
//                .collect(Collectors.toList()).reversed().getFirst().getValue();


        if(maxProfitValue<value){
            maxProfitValue= (int) value;
        }

        return maxProfitValue;

    }

    public static int maxProfitOptimumSolution(int[] prices) {

        //optimum solution

        int buy=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(buy>prices[i]){
                buy=prices[i];
            }else if((prices[i]-buy)>profit){
                profit=prices[i]-buy;
            }
        }
        return profit;
    }

}
