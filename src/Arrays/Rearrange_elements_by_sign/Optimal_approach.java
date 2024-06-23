package Arrays.Rearrange_elements_by_sign;
import java.util.*;
public class Optimal_approach {
    public static void main(String[] args) {
        int[] arr=new int[6];
        int i;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the elements");
        for(i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        re_arranger1(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void re_arranger1(int[] arr)
    {
        //implementing using the two pointer Approach
        int p=0;
        int temp;
        int i;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]>=0)
            {
                if((i%2)!=0)
                {
                    temp=arr[i];
                    arr[i]=arr[p];
                    arr[p]=temp;
                }
                p=p+2;
            }
        }
    }
}
