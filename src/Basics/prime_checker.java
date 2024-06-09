package Basics;
import java.util.*;
public class prime_checker {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value which you want to check whether it is prime or not");
        int number=in.nextInt();
        int count=0;
        int i;
        for(i=2;i<=number;i++)
        {
            if(number%i==0)
            {
                count++;
            }
        }
        if(count==1)
        {
            System.out.println("it is a prime number");
        }
        else
        {
            System.out.println("it is not a prime number");
        }
    }
}
