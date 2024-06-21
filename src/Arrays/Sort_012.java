package Arrays;
import java.util.*;
public class Sort_012 {
    public static void main(String[] args){
        int[] arr=new int[5];
        int i;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the elements of the array");
        for(i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        dutch_nationa_flag_algo(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void dutch_nationa_flag_algo(int[] arr)
    {
        int low=0;
        int mid=0;
        int high=arr.length-1;
        int temp;
        while(mid<high)
        {
            if(arr[mid]==0)
            {
                temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else
            {
                temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }
}
