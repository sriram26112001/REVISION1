package Arrays.Rotate_arrays;
import java.util.*;
public class Optimised_approach {
    public static void main(String[] args) {
        int i;
        int[] arr=new int[5];
        Scanner in=new Scanner(System.in);
        System.out.println("enter the elements");
        for(i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("enter the value of k");
        int k=in.nextInt();
        int rotating_times=(k%arr.length);
        if(rotating_times!=0)
        {
            rotate_array1(arr,rotating_times);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void subarray_rotater(int[] arr,int start,int end) {
        //here we are going to use reverse the array algorithm
        int p1 = start;
        int p2 = end;
        int temp;
        while (p1 < p2) {
            temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
    }
    public static void rotate_array1(int[] arr,int rotating_times)
    {
        int p2=arr.length-rotating_times;
        int p1=p2-1;
        subarray_rotater(arr,0,p1);
        subarray_rotater(arr,p2,arr.length-1);
        subarray_rotater(arr,0,arr.length-1);
    }
}
