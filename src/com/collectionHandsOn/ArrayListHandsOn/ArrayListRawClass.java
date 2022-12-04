package com.collectionHandsOn.ArrayListHandsOn;

import java.net.SocketOption;
import java.util.ArrayList;

public class ArrayListRawClass {
    public static void main(String[] args) {
        //We should not use default class java doesn't recommed it
         ArrayList ar= new ArrayList();
         ar.add(100);
         ar.add("Trapti");
         ar.add(true);
         ar.add(12.33);

        System.out.println(ar);
    }
}
