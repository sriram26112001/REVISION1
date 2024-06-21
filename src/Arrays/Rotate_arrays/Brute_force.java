package Arrays.Rotate_arrays;
import java.util.*;
public class Brute_force {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[5];
        int i;
        System.out.println("enter the elements");
        for(i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("enter the value of k");
        int k=in.nextInt();
        int rotating_times=(k%arr.length);
        rotate_array(arr,rotating_times);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate_array(int[] arr,int rotatingtimes)
    {
        int p=1;
        int i;
        int temp;
        while(p<=rotatingtimes)
        {
            temp=arr[arr.length-1];
            for(i=arr.length-2;i>=0;i--)
            {
                arr[i+1]=arr[i];
            }
            arr[0]=temp;
            p++;
        }
    }
}
