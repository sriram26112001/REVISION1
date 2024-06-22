package Arrays;
import java.util.*;
public class Maximum_Subarray_sum {
    public static void main(String[] args) {
        int i;
        int[] arr=new int[8];
        Scanner in=new Scanner(System.in);
        System.out.println("enter the elements of the array");
        for(i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        int max_sum=maximum_sum_finder(arr);
        System.out.println(max_sum);
    }
    public static int maximum_sum_finder(int[] arr)
    {
        //kadanes algo
        int sum=0;
        int i;
        int ans=Integer.MIN_VALUE;
        for(i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            if(sum>ans)
            {
                ans=sum;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        return ans;
    }
}
