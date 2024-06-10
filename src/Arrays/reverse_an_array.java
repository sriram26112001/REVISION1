package Arrays;
import java.util.*;
public class reverse_an_array {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[6];
        System.out.println("enter the array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        Array_reverser(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Array_reverser(int[] arr)
    {
        int i=0;
        int j=arr.length-1;
        int temp;
        while(i<j)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
