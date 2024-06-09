package Basics;
import java.util.Scanner;
public class fibonocci_series {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the nth  fibonocci number which you want to get");
        int n=in.nextInt();
        int ans=fibonocci_finder(n);
        System.out.println("the nth fibonocci number is"+ans);
    }
    public static int fibonocci_finder(int n)
    {
        int first=0;
        int second=0;
        if(n==0)
        {
            return first;
        }
        else if(n==1)
        {
            return second;
        }
        else
        {
            int t=n-2;
            int total;
            while(t!=0)
            {
                total=first+second;
                first=second;
                second=total;
                t--;
            }
            return second;
        }
    }
}
