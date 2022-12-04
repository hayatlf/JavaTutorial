package com.collectionHandsOn.HashMap;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<String,String> capitalMap= new HashMap<String, String>();
        capitalMap.put("India","New Delhi");
        capitalMap.put("USA","WashingtonDC");
        capitalMap.put("Uk","London");
        capitalMap.put("China","beijing");

        System.out.println(capitalMap.get("USA"));
        System.out.println(capitalMap.get("Germany"));
        //If we don't have key then we get null

        capitalMap.put("Uk","London1");
        //As key cannot be duplicate the new value of uk
        //is updates as london1 the values get overwritten
        System.out.println(capitalMap.get("Uk"));

        capitalMap.put(null,"Berlin");
        System.out.println(capitalMap.get(null));

        capitalMap.put("Russia",null);
        capitalMap.put("France",null);
        System.out.println(capitalMap.get("Russia"));
        System.out.println(capitalMap.get("France"));
        //key should be unique but values can be duplicate

        //Remove the key and value of france
        capitalMap.remove("France");



    }
}
