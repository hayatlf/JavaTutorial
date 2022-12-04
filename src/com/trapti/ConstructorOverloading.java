package com.trapti;

public class ConstructorOverloading {

    public static void main(String[] args) {
        DConstructor object = new DConstructor(5);
    }
}


class DConstructor{

    public DConstructor() {
        System.out.println("Default Consturtor");
    }

    public DConstructor(int i ){
        System.out.println("parameterized constructor"+i);
    }


}


