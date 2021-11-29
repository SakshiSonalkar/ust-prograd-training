import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in);
       try{
           int num1= Integer.parseInt(scanner.nextLine());
           int num2= Integer.parseInt(scanner.nextLine());
           int div=num1/num2;
           System.out.println(div);
       }catch(ArithmeticException a){
           System.out.println("java.lang.ArithmeticException: / by zero ");
       }catch(Exception e){
           System.out.println("java.util.InputMismatchException");
       }
    }
}