package Arrays.Number_Subarrays_sum_k;
import java.util.*;
public class HashMap_approach {
    public static void main(String[] args) {
        int i;
        int[] arr=new int[10];
        Scanner in=new Scanner(System.in);
        System.out.println("enter the elements of the array");
        for(i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("enter the value of k");
        int k=in.nextInt();
        int ans=total_subarrays_k(arr,k);
        System.out.println("Total number of subarrays with sum equals k is"+ans);
    }
    public static int total_subarrays_k(int[] arr,int k)
    {
        int sum=0;
        int i;
        int count=0;
        int value;
        int occurance;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            if(sum==k)
            {
                count++;
            }
            if(map.containsKey(sum-k))
            {
                //there is an internal array which is already present
                value=map.get(sum-k);
                count=count+value;
            }
            if(!map.containsKey(sum))
            {
                map.put(sum,1);
            }
            else
            {
                occurance=map.get(sum);
                map.put(sum,occurance+1);
            }
        }
        return count;
    }
}
