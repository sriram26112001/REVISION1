package Arrays;
import java.util.*;
public class Richest_customer_wealth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] accounts = new int[2][3];
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[0].length; j++) {
                accounts[i][j] = in.nextInt();
            }
        }
        int customer = richest_customer_finder(accounts);
        int wealth = richest_customer_wealth_finder(accounts);
        System.out.println("the " + customer + " has the highest wealth equal to " + wealth);
    }
    public static int richest_customer_finder(int[][] accounts)
    {
        int sum=Integer.MIN_VALUE;
        int ans=-1;
        for(int i=0;i<accounts.length;i++)
        {
            int total=0;
            for(int j=0;j<accounts[0].length;j++)
            {
                total=total+accounts[i][j];
            }
            if(total>sum)
            {
                ans=i+1;
                sum=total;
            }
        }
        return ans;
    }
    public static int richest_customer_wealth_finder(int[][] accounts)
    {
        int sum=Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int total = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                total = total + account[j];
            }
            if (total > sum) {
                sum = total;
            }
        }
        return sum;
    }
}
