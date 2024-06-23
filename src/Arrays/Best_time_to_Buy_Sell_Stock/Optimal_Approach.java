package Arrays.Best_time_to_Buy_Sell_Stock;
import java.util.*;
public class Optimal_Approach {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[6];
        int i;
        System.out.println("enter the element");
        for(i=0;i<arr.length;i++) {
            arr[i] = in.nextInt();
        }
        ArrayList<Integer> ans=new ArrayList<>(max_profit_finder(arr));
        System.out.println(ans);
    }
    public static ArrayList<Integer> max_profit_finder(int[] arr)
    {
        int buy=0;
        int sell=1;
        int start=0;
        int max_profit=0;
        int j;
        int i=0;
        int profit;
        ArrayList<Integer> ans=new ArrayList<>();
        for(j=1;j<arr.length;j++)
        {
            if(arr[j]<arr[i])
            {
                i=j;
                start=i;
            }
            else
            {
                profit=arr[j]-arr[i];
                if(profit>max_profit)
                {
                    max_profit=profit;
                    buy=start;
                    sell=j;
                }
            }
        }
        ans.add(max_profit);
        ans.add(buy);
        ans.add(sell);
        return ans;
    }
}
