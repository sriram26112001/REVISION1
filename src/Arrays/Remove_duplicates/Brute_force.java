package Arrays.Remove_duplicates;
import java.util.*;
public class Brute_force {
    public static void main(String[] args) {
        int i;
        Scanner in=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("enter the elements of the array");
        for(i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        ArrayList<Integer> ans=new ArrayList<>(DuplicateRemover(arr));
        System.out.println(ans);
    }
    public static ArrayList<Integer> DuplicateRemover(int[] arr)
    {
        int i;
        ArrayList<Integer> ans=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(i=0;i<arr.length;i++)
        {
            if(!set.contains(arr[i])) {
                set.add(arr[i]);
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}
