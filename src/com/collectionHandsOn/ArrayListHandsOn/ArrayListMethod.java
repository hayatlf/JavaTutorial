package com.collectionHandsOn.ArrayListHandsOn;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListMethod {
    public static void main(String[] args) {

        //add
        ArrayList<String> ar= new ArrayList<>();
        ar.add("Java");
        ar.add("python");
        ar.add("ruby");
        ar.add("javascript");
        ar.add("react");
        ar.add("python");

    //--------------------------------------------------//

        //addAll
        ArrayList<String> ar1=new ArrayList<>();
        ar1.add("Testing");
        ar1.add("devops");
        ar1.addAll(ar);
        System.out.println("AddALl");

        for(String language : ar1){
            System.out.println(language);
        }

    //--------------------------------------------------//
        //Clear
        ar1.clear();
        System.out.println(ar1);

    //--------------------------------------------------//
        //Clone
        ArrayList<String> CloneArrayList = (ArrayList<String>) ar.clone();
        System.out.println(CloneArrayList);

    //--------------------------------------------------//
        //Contains
        System.out.println(ar.contains("Java"));

    //--------------------------------------------------//
      //IndexOf
        System.out.println(ar.indexOf("react"));
        System.out.println(ar.indexOf("ruby")>0);

    //--------------------------------------------------//
    //lastIndexOf
        System.out.println(ar.lastIndexOf("python"));

    //--------------------------------------------------//
        //other ways to write ArrayList

        ArrayList<String> list1= new ArrayList<String>(Arrays.asList("Naveen","Tom","Steve","Naveen","Lisa"));
        System.out.println(list1);

        //--------------------------------------------------//

        //Remove
        list1.remove(2);
        System.out.println(list1);


        //*****-----------------interview question------------------------*****//
        //Remove Even Number
        ArrayList<Integer> number=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        number.removeIf(num -> num%2==0);
        System.out.println(number);

        //*****-----------------interview question------------------------*****//
        //Remove Odd Number
        ArrayList<Integer> number1=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        number1.removeIf(num -> num%2!=0);
        System.out.println(number1);

        //--------------------------------------------------//
        //RetainALL
        ArrayList<String> bags=new ArrayList<String>(Arrays.asList("box","books","lunchbox","water bottle"));
        ArrayList<String> box=new ArrayList<String>(Arrays.asList("pen","pencil","rubber"));
        box.addAll(bags);
        System.out.println(box);
        box.retainAll(bags);
        System.out.println(box);

       //--------------------------------------------------//
        //Singleton

        ArrayList<String> al=new ArrayList<String>(Arrays.asList("Rohit","Rina","Raha","Ranvijay","Rina"));
        al.retainAll(Collections.singleton("Rina"));
        System.out.println(al);

    }
}
