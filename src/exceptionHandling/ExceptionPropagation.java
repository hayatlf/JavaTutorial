package exceptionHandling;

public class ExceptionPropagation {
    void m(){
        int n=500/0;
    }
    void n(){
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){
            System.out.println("Divided by Zero");
        }
    }

    public static void main(String[] args) {
        ExceptionPropagation ep= new ExceptionPropagation();
        ep.p();
        System.out.println("Normal flow");
    }
}
