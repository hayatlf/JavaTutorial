package com.collectionHandsOn.ArrayListHandsOn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchroniseArrayListExample {
    public static void main(String[] args) {

        //Collections.synchronisedList() ***----method----***
        List<String> namesList= Collections.synchronizedList(new ArrayList<>());
        namesList.add("Rihan");
        namesList.add("Riddhima");
        namesList.add("Rohan");

        //add & remove we don't need explicit synchronisation
        //to fetch the value from this list we have to use explicit synchronisation

        synchronized (namesList){
            Iterator<String> it= namesList.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }

            //CopyOnWriteArrayList ***----Class----***
            CopyOnWriteArrayList<String> emplist= new CopyOnWriteArrayList<>();
            emplist.add("Ravi");
            emplist.add("Nolan");
            emplist.add("August");
            emplist.add("Ivan");

            //We don't need explicit synchronisation for any
            //operation add/traverse/remove

            Iterator<String> itera=emplist.iterator();
            while(itera.hasNext()){
                System.out.println(itera.next());
            }
        }
    }
}
