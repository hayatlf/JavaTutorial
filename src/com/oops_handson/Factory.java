package com.oops_handson;

public class Factory {

    public void parts(){
        System.out.println("Different part of vehicle");
    }

    public static void main(String[] args) {
      Factory factory =new Car();
      factory.parts();
    }
}
