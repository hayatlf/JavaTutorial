package exceptionHandling;

public class ThrowExample {


        public static void validate(int age){
            if(age < 18){
                throw new ArithmeticException("under age not eligible to vote");
            }
            else{
                System.out.println("Person is eligible to vote");
            }
    }

    public static void main(String[] args) {
        validate(12);
        System.out.println("Rest code");
    }
}
