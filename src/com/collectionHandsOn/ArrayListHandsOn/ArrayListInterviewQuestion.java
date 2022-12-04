package com.collectionHandsOn.ArrayListHandsOn;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListInterviewQuestion {
    public static void main(String[] args) {
        //How to get sublist from arraylist
        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80));
        System.out.println(number.subList(3, 6));


        //How to convert arraylist to array


        ArrayList<String> Names = new ArrayList<>(Arrays.asList("Ram","Shyam","sundar","Priya"));
        Object arr[]=Names.toArray();
        // we have used the toArray() method to convert the arraylist into an array.
        // Here, the method does not include the optional parameter.
        // Hence, an array of objects is returned.
        //It is recommended to use the toArray() method with the parameter.
        System.out.println(Arrays.toString(arr));

        //Iterating the array
        for(Object o:arr){
            System.out.println(o);
        }
        //To convert the object value in string
        for(Object ob: arr){
            System.out.println((String)ob);
        }

        //Remove Even Number from the list
        ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        numbers.removeIf(num -> num%2==0);
        System.out.println(numbers);


        //Remove Odd Number from the list
        ArrayList<Integer> number1=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        number1.removeIf(num -> num%2!=0);
        System.out.println(number1);

        //How to remove duplicate element from an arraylist using
        //linked hashset and jdk8 streams

        //Linked hashset
        ArrayList<Integer> numb= new ArrayList<>(Arrays.asList(1,2,1,2,1,4,5,3,5,6,7,8,6,7));
        LinkedHashSet<Integer> UniqueNumber= new LinkedHashSet<Integer>(numb);
        ArrayList<Integer> UniqueNum=new ArrayList<>(UniqueNumber);
        System.out.println(UniqueNum);

        //JDK8 streams
        ArrayList<Integer> distinctNum = new ArrayList<>(Arrays.asList(10,20,23,21,20,15,50,60,15,30));
        List<Integer> Unique=distinctNum.stream().distinct().collect(Collectors.toList());
      //  toList() is a static method of the Collectors class that is used to collect/accumulate all the elements to a new List.
        System.out.println(Unique);








    }
}
