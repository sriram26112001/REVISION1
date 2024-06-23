package Arrays.Number_Subarrays_sum_k;
import java.util.*;
public class Two_Pointer_approach {
    public static void main(String[] args) {
        int i;
        int[] arr=new int[9];
        Scanner in = new Scanner(System.in);
        System.out.println("enter the elements");
        for (i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("enter the value of k");
        int k=in.nextInt();
        int ans=subarrays_finder1(arr,k);
        System.out.println("the total number of subarray with sum k is"+ans);
    }
    public static int subarrays_finder1(int[] arr,int k)
    {
        int p1=0;
        int p2;
        int sum=0;
        int count=0;
        for(p2=0;p2<arr.length;p2++)
        {
            sum=sum+arr[p2];
            if(sum==k)
            {
                count++;
            }
            else if(sum>k)
            {
                while(sum>k)
                {
                    sum=sum-arr[p1];
                    p1++;
                }
                if(sum==k)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
