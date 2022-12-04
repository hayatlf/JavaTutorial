package exceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class throwCheckedExample {
    public static void method() throws FileNotFoundException{
        FileReader fb =new FileReader("Documents:\\pancard.txt");
        BufferedReader br=new BufferedReader(fb);
        throw new FileNotFoundException();
    }

    public static void main(String[] args) {
        try{
            method();
        }catch(FileNotFoundException e){
            e.printStackTrace();

        }finally{
            System.out.println("Rest of the code");
        }
    }
}
