package Arrays;
import java.util.*;
public class Running_sum_1D_array {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        int[] ans=running_sum_finder(arr);
        System.out.printf(Arrays.toString(ans));
    }
    public static int[] running_sum_finder(int[] arr)
    {
        int[] ans=new int[arr.length];
        int total=0;
        for(int i=0;i<arr.length;i++)
        {
            total=total+arr[i];
            ans[i]=total;
        }
        return ans;
    }
}
