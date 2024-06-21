package Arrays.Remove_duplicates;
import java.util.*;
public class Optimized_Two_Pointer {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[5];
        int i;
        System.out.println("enter the element");
        for(i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        int index=rem_dup(arr);
        for(i=0;i<=index;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static int rem_dup(int[] arr)
    {
        int p1=0;
        int p2;
        for(p2=1;p2<arr.length;p2++)
        {
            if(arr[p2]!=arr[p1])
            {
                p1++;
                arr[p1]=arr[p2];
            }
        }
        return p1;
    }
}
