package exceptionHandling;

class UserDefined extends Exception {
    public UserDefined(String str){
        super(str);
    }
  }

public class CustomException{
    public static void main(String[] args) {
        try{
          throw new UserDefined("This is user defined exception");
        }catch(UserDefined ude){
            System.out.println("Error is caught");
            System.out.println(ude.getMessage());

        }

    }
}
