package Arrays.two_sum;
import java.util.*;
public class Optimal_approach {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[4];
        int i;
        System.out.println("enter the elements");
        for(i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("enter the target");
        int target=in.nextInt();
        ArrayList<Integer> ans=new ArrayList<>(pair_finder2(arr,target));
        System.out.println(ans);
    }
    public static ArrayList<Integer> pair_finder2(int[] arr,int target)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        int low=0;
        int high=arr.length-1;
        while(low<high)
        {
            if(arr[low]+arr[high]==target)
            {
                //ele found
                ans.add(low);
                ans.add(high);
                break;
            }
            else if(arr[low]+arr[high]>target)
            {
                high--;
            }
            else if(arr[low]+arr[high]<target)
            {
                low++;
            }
        }
        return ans;
    }
}
