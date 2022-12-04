package com.collectionHandsOn.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CompareTwoHashMap {

    //How to compare to hashmap in java
    //by key-value , by value ,by keys

    public static void main(String[] args) {
        HashMap<Integer,String> map1= new HashMap<Integer,String>();
        map1.put(1,"A");
        map1.put(2,"B");
        map1.put(3,"C");

        HashMap<Integer,String> map2= new HashMap<Integer,String>();
        map2.put(3,"C");
        map2.put(1,"A");
        map2.put(2,"B");

        HashMap<Integer,String> map3= new HashMap<Integer,String>();
        map3.put(1,"A");
        map3.put(2,"B");
        map3.put(3,"C");
        map3.put(3,"D");

        HashMap<Integer,String> map4= new HashMap<Integer,String>();
        map4.put(1,"A");
        map4.put(2,"B");
        map4.put(3,"C");
        map4.put(4,"D");

        //On the basis of key-value pair
        System.out.println(map1.equals(map2));
        System.out.println(map1.equals(map3));

        //Compare two hashmap for same keys
        System.out.println(map1.keySet().equals(map2.keySet()));
        System.out.println(map1.keySet().equals(map3.keySet()));

        //find out the extra key
        //combine the keys from  both the maps
        //using hashset

        HashSet<Integer> combineKey = new HashSet<Integer>(map1.keySet());
        combineKey.addAll(map4.keySet());
        combineKey.removeAll(map1.keySet());
        System.out.println(combineKey);

        //compare by value

        HashMap<Integer,String> map5= new HashMap<>();
        map5.put(1,"A");
        map5.put(2,"B");
        map5.put(3,"C");

        HashMap<Integer,String > map6=new HashMap<>();
        map6.put(5,"B");
        map6.put(6,"C");
        map6.put(4,"A");


        HashMap<Integer,String> map7= new HashMap<>();
        map7.put(1,"A");
        map7.put(2,"B");
        map7.put(3,"C");
        map7.put(4,"C");

        //Duplicates are not duplicates ArrayList
        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));//true
        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values())));//false because al will check size and size is unequal so it will give false

        //Duplicates are duplicates HashSet
        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values())));
        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values())));






    }
}
