package Basics;
import java.util.*;
public class Counting_occurance {
    public static void main(String[] args) {
        //The problem statement is user would input a number we need tpo find the occurance of the particular digit
        //which user would also give in the number and print its occurance
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        int number=in.nextInt();
        System.out.println("enter the digit");
        int digit=in.nextInt();
        int ans=count_digit(number,digit);
        System.out.println("the number of times the digit is appearing in the number is"+ans);
    }
    public static int count_digit(int number,int digit)
    {
        int t=number;
        int count=0;
        while(t!=0)
        {
            int rem=t%10;
            if(rem==digit)
            {
                count++;
            }
            t=t/10;
        }
        return count;
    }
}
