package com.sparta.astha.javaCore;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.of;

public class Main {

    //New concept introduced in Java 9- Static Map in Java
    //A static map is a map which is defined as static. It means that the map becomes a class member and can be easily used using class.
    //
    //Java 9 feature – Map.of() method
    //In Java 9, Map.of() was introduced which is a convenient way to create instances of Map interface. It can hold up to 10 key-value pairs.
    private static Map<String, String> map1
            = Map.of("a", "candy",
            "2", "Geek",
            "3", "GeeksForGeeks");

    public static void main(String[] args) {
	// write your code here

        Map<String, String> map=new HashMap<String, String>();
        map.put("a", "candy");
        map.put("b", "dirt");

        System.out.println( map1);
        System.out.println(MapProblemsCodingBat.mapBully(map));

       // int[] nums=new int[]{0,1,2,2,3,0,4,2};
       int[] nums=new int[]{3,2,2,3};

        //System.out.println(LeetcodeRemoveElement.removeElement(nums,2));
        System.out.println("ArrayList way::"+LeetcodeRemoveElement.removeElement1(nums,3));

        System.out.println(HashMapProblemHackerrank.calculateArea(new int[]{1,2,3},"abc" ));

        System.out.println(LeetcodeRemoveDuplicates.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));

        System.out.println(LeetcodeAddTwoNumsLinkedList.addTwoNumbers(new ListNode(1, new ListNode(2)), new ListNode(5, new ListNode(6))));

        System.out.println(InterviewQuestions.calculateLevels());





        //MapProblemsCodingBat.mapBully({"a": "candy", "b": "dirt"});
    }
//not working

}
