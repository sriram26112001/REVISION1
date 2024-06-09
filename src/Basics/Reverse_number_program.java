package Basics;
import java.util.*;
public class Reverse_number_program {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //here we have to reverse a number
        System.out.println("enter the number which you want to reverse");
        int number=in.nextInt();
        int ans=number_reverser(number);
        System.out.println("the reversed number is "+ans);
    }
    public static int number_reverser(int number)
    {
        int t=number;
        int total=0;
        while(t!=0)
        {
            int rem=t%10;
            total=total*10+rem;
            t=t/10;
        }
        return total;
    }
}
