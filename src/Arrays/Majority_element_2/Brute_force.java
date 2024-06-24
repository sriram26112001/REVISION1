package Arrays.Majority_element_2;
import java.util.*;
public class Brute_force {
    public static void main(String[] args) {
        int[] arr = new int[8];
        int i;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the elements of the array");
        for (i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        ArrayList<Integer> ans=new ArrayList<>(majority_element_2_finder(arr));
        System.out.println("the majority element is"+ ans);
    }
    public static ArrayList<Integer> majority_element_2_finder(int[] arr)
    {
        int i;
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(i=0;i<arr.length;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i],1);
            }
            else
            {
                int value=map.get(arr[i]);
                map.put(arr[i],value+1);
            }
        }
        for(Map.Entry<Integer,Integer> map1 : map.entrySet())
        {
            if(map1.getValue()>Math.floor((double) arr.length /3))
            {
                ans.add(map1.getKey());
            }
        }
        return ans;
    }
}
