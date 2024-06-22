package Arrays.Longest_subarray_sum;
import java.util.*;
public class optimised_approach {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("enter the elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("enter the value of k");
        int k=in.nextInt();
        int length=maximum_length_finder1(arr,k);
        System.out.println("the maximum length of the subarray with sum k is"+length);
    }
    public static int maximum_length_finder1(int[] arr,int k)
    {
        int p1=0;
        int p2=0;
        int sum=0;
        int length;
        int ans=Integer.MIN_VALUE;
        while(p2<arr.length)
        {
            sum=sum+arr[p2];
            if(sum<k)
            {
                p2++;
            }
            else if(sum==k)
            {
                length=p2-p1+1;
                if(length>ans)
                {
                    ans=length;
                }
                p2++;
            }
            else
            {
                while(sum<=k)
                {
                    sum=sum-arr[p1];
                    p1++;
                }
                if(sum==k)
                {
                    length=p2-p1+1;
                    if(length>ans)
                    {
                        ans=length;
                    }
                }
                p2++;
            }
        }
        return ans;
    }
}
