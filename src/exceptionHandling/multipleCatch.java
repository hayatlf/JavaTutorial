package exceptionHandling;

public class multipleCatch {

    public static void main(String[] args) {
        int i,j,k;
        i =2;
        j=0;
        int a[]= new int[4];
        try {
            k=i/j;
            for(int c=0;c<=4;c++){
                a[c]=c+1;
            }
            for(int value : a){
                System.out.println(value);
            }

        }catch(ArithmeticException ae){
            System.out.println("Divided by zero "+i/(i+j));
        }
        catch(ArrayIndexOutOfBoundsException AI){
            System.out.println("ArrayIndex out of bound");
        }catch(Exception ex){
            System.out.println(ex);
        }
    }

}
