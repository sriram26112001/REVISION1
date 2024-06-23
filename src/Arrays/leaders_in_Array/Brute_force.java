package Arrays.leaders_in_Array;
import java.util.*;
public class Brute_force {
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
        for(i=0;i<arr.length-1;i++)
        {
            boolean leader=true;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[i])
                {
                    leader=false;
                }
            }
            if(leader)
            {
                ans.add(arr[i]);
            }
        }
        ans.add(arr[arr.length-1]);
        return ans;
    }
}
