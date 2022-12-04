package com.trapti;

public class CountNoOfObjectInJava {
    public static void main(String[] args) {
        Counter object = new Counter();
        Counter objec = new Counter();
        Counter obje = new Counter();
        object.show();

    }
}

 class Counter {

    static int i=0;
    public Counter(){
        i++;
    }

    public void show (){
        System.out.print(i);
    }

}
