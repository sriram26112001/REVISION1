package Basics;
import java.util.Scanner;
public class largest_of_3_numbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the three numbers");
        int[] arr=new int[3];
        for(int i=0;i<3;i++)
        {
            System.out.println("enter the "+(i+1)+"number");
            arr[i]=in.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println("the largest of the three numbers is"+max);
    }
}
