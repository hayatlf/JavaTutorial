package com.collectionHandsOn.ArrayListHandsOn;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<String>();
        studentList.add("Rudra");
        studentList.add("Neha");
        studentList.add("Amrish");
        studentList.add("Trapti");
        studentList.add("Apurva");

        System.out.println("----Simple for loop----");
        for(int i=0;i<studentList.size();i++){
            System.out.println(i);
            System.out.println(studentList.get(i));
        }

        System.out.println("----forEach loop----");
        for(String names:studentList){
            System.out.println(names);

        }
        System.out.println("----lambda-----");
       studentList.stream().forEach(element ->System.out.println(element));
    }
}
