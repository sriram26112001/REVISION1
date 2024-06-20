package Arrays;
import java.util.*;
public class find_the_highest_altitude {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] gain=new int[5];
        System.out.println("enter the gain array values");
        for(int i=0;i<gain.length;i++)
        {
            gain[i]=in.nextInt();
        }
        int ans=maximum_peak(gain);
        System.out.println(ans);
    }
    public static int maximum_finder(int[] arr)
    {
        int maximum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>maximum)
            {
                maximum=arr[i];
            }
        }
        return maximum;
    }
    public static int maximum_peak(int[] gain)
    {
        int j;
        int[] prefix_sum=new int[gain.length];
        prefix_sum[0]=gain[0];
        for(j=1;j< prefix_sum.length;j++)
        {
            prefix_sum[j]=prefix_sum[j-1]+gain[j];
        }
        int ans;
        ans = maximum_finder(prefix_sum);
        return ans;
    }
}
