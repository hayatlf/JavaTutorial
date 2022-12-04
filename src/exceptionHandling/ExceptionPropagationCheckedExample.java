package exceptionHandling;

import java.io.IOException;

public class ExceptionPropagationCheckedExample {
    void m() {

       // throw new java.io.IOException("device error");

    }
    void n() {
        m();
    }

    void p(){
        try{
            n();
        }catch(Exception e){
            System.out.println("Exception is handled");
        }
    }

    public static void main(String[] args) {
        ExceptionPropagationCheckedExample ep= new ExceptionPropagationCheckedExample();
        ep.p();
    }
}
