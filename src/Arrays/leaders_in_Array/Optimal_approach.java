package Arrays.leaders_in_Array;
import java.util.*;
public class Optimal_approach {
    public static void main(String[] args) {
        int i;
        int[] arr=new int[6];
        Scanner in=new Scanner(System.in);
        System.out.println("enter the elements of the array");
        for(i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        ArrayList<Integer> ans=new ArrayList<>(leaders_finder(arr));
        System.out.println(ans);
    }
    public static ArrayList<Integer> leaders_finder(int[] arr)
    {
        int i;
        ArrayList<Integer> ans=new ArrayList<>();
        int leader=arr[arr.length-1];
        ans.add(leader);
        for(i=arr.length-2;i>=0;i--)
        {
            if(arr[i]>leader)
            {
                leader=arr[i];
                ans.add(leader);
            }
        }
        return ans;
    }
}
