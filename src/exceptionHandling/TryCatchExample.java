package exceptionHandling;


public class TryCatchExample {
    public static void main(String[] args) {
        int i ,j,k;
        i=8;
        j=0;
        try {
            k = i / j;
        }catch(Exception e){
            System.out.println(e);

        }
    }
}
