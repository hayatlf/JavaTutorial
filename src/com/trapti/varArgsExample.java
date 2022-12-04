package com.trapti;

/* First create an object */
//ObjectReference = new Constructor();
//
//        /* Now call a variable as follows */
//        ObjectReference.variableName;
//
//        /* Now you can call a class method as follows */
//        ObjectReference.MethodName();


public class varArgsExample {
    public static void main(String[] args) {

        Display obj = new Display();
         obj.show(5,7,9);


    }
}

class Display {

    public void show(int a){

        System.out.println(a +"In show method ");

    }

    public void show(int ... a) {
        for ( int i : a){
            System.out.println(i +" In varArgs");
        }
    }

}
