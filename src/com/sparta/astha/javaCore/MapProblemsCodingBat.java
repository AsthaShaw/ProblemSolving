package com.sparta.astha.javaCore;

import java.util.HashMap;
import java.util.Map;

public class MapProblemsCodingBat {

    public static Map<String, String> mapBully(Map<String, String> map) {

//        mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
//        mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
//        mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}

          if (map.containsKey("a") && map.get("a")!=null){
                  map.put("b", map.get("a"));
                  map.put("a", "");
              }

          return map;
          }


    public Map<String, String> topping1(Map<String, String> map) {

//        topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
//        topping1({}) → {"bread": "butter"}
//        topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
        map.put("bread", "butter");
        if(map.containsKey("ice cream")){
            map.put("ice cream", "cherry");
        }

        return map;
    }

    }

