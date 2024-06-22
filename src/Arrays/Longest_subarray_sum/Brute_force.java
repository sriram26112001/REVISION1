package Arrays.Longest_subarray_sum;
import java.sql.SQLOutput;
import java.util.*;
public class Brute_force {
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
        //here we are going to implement using the hashmap
        int length=maximum_length_finder(arr,k);
        System.out.println(length);
    }
    public static int maximum_length_finder(int[] arr,int k)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i;
        int length;
        int sum=0;
        int ans=Integer.MIN_VALUE;
        for(i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            if(sum==k)
            {
                length=i+1;
                if(length>ans)
                {
                    ans=length;
                }
            }
            if(map.containsKey(sum-k))
            {
                length=i-(map.get(sum-k));
                if(length>ans)
                {
                    ans=length;
                }
            }
            if(!map.containsKey(sum))
            {
                map.put(sum,i);
            }
        }
        return ans;
    }
}
