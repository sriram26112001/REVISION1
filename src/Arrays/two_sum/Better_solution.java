package Arrays.two_sum;
import java.util.*;
public class Better_solution {
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
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>(pair_finder1(arr,target));
        for(i=0;i<ans.size();i++)
        {
            System.out.println(ans.get(i));
        }
    }
    public static ArrayList<ArrayList<Integer>> pair_finder1(int[] arr,int target)
    {
        int i;
        int value;
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for(i=0;i<arr.length;i++)
        {
            if(map.containsKey(target-arr[i]))
            {
                ArrayList<Integer> pair=new ArrayList<>();
                value=map.get(target-arr[i]);
                pair.add(i);
                pair.add(value);
                ans.add(pair);
            }
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i],i);
            }
        }
        return ans;
    }
}
