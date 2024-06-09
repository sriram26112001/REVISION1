package Basics;
import java.util.Scanner;
public class Type_Casting {
    public static void main(String[] args) {
        //type casting
        Scanner in=new Scanner(System.in);
        System.out.println("enter a float value that I will convert to integer");
        float a=in.nextFloat();
        int result=(int)(a);
        System.out.println("your result is"+result);
    }
}
