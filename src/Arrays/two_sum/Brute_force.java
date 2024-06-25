package Arrays.two_sum;
import java.util.ArrayList;
import java.util.Scanner;
public class Brute_force {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[4];
        int i;
        System.out.println("enter the elements of the array");
        for(i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("enter the target");
        int target=in.nextInt();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>(pair_finder(arr,target));
        for(i=0;i<ans.size();i++)
        {
            System.out.println(ans.get(i));
        }
    }
    public static ArrayList<ArrayList<Integer>> pair_finder(int[] arr,int target)
    {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        int i,j;
        for(i=0;i<arr.length;i++)
        {
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    ArrayList<Integer> pair=new ArrayList<>();
                    pair.add(i);
                    pair.add(j);
                    ans.add(pair);
                }
            }
        }
        return ans;
    }
}
