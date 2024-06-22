package Arrays.Majority_element;
import java.util.*;
public class Brute_force {
    public static void main(String[] args) {
        int[] arr=new int[16];
        int i;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the element");
        for(i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        int ans=majority_element_finder(arr);
        System.out.println(ans);
    }
    public static int majority_element_finder(int[] arr)
    {
        int i;
        int ans=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(i=0;i<arr.length;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i],1);
            }
            else
            {
                int count=map.get(arr[i]);
                map.put(arr[i],count+1);
            }
        }
        int length=arr.length;
        //now we will iterate through the map.

        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(entry.getValue()>(length/2))
            {
                ans=entry.getKey();
            }
        }
        return ans;
    }
}
