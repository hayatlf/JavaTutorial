package com.collectionHandsOn.HashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteration {
    public static void main(String[] args) {

        //hashmap is not thread-safe unsynchronised

        HashMap<Integer,String> empDetail= new HashMap<Integer,String>();
        empDetail.put(1,"Trapti");
        empDetail.put(2,"Rihana");
        empDetail.put(3,"Rohan");
        empDetail.put(4,"Riddhima");

        //Traverse over keySet()
        Iterator<Integer> it= empDetail.keySet().iterator();
        //We cannot use iterator directly on the map
        while(it.hasNext()){
            int key=it.next();
            String value=empDetail.get(key);
            System.out.println("key=" +key + " value=" +value);
            //We cannot use iterator directly on the map instead we have to use on keyset()

        }

        //Over the set(pair) : by using entrySet
        Iterator<Map.Entry<Integer,String>> iterator1= empDetail.entrySet().iterator();
        while(it.hasNext()){
          Map.Entry<Integer,String> entry= iterator1.next();
            System.out.println("Key= " + entry.getKey() +"value= "+ entry.getValue());
        }

        System.out.println("********---------Using java8 and lambda------------**********");

        //Iterate hashMap using java8 forEach and lambda
        empDetail.forEach((k,v) -> System.out.println("key= "+k +"value= "+v));
    }
}