package Arrays.Best_time_to_Buy_Sell_Stock;
import java.util.*;
public class Better_solution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the element");
        int[] arr=new int[6];
        int i;
        for(i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        int max_profit=maximum_profit_finder1(arr);
        System.out.println(max_profit);
    }
    public static int[] suffix_array_creator1(int[] arr)
    {
        int i;
        int[] ans=new int[arr.length];
        ans[ans.length-1]=arr[arr.length-1];
        for(i=arr.length-2;i>=0;i--)
        {
            if(ans[i+1]>arr[i])
            {
                ans[i]=ans[i+1];
            }
            else
            {
                ans[i]=arr[i];
            }
        }
        return ans;
    }
    public static int maximum_profit_finder1(int[] arr)
    {
        int i;
        int max_profit=0;
        int profit;
        int[] suffix_array=suffix_array_creator1(arr);
        // System.out.println(Arrays.toString(suffix_array));
        for(i=0;i<arr.length-1;i++)
        {
            profit=suffix_array[i+1]-arr[i];
            if(profit>max_profit)
            {
                max_profit=profit;
            }
        }
        return max_profit;
    }
}
