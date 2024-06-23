package Arrays.longest_Consequtive_sequence;
import java.util.HashSet;
import java.util.Scanner;
public class Optimal_approach {
    public static void main(String[] args) {
        int[] arr=new int[6];
        int i;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the elements");
        for(i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        int ans=longest_consequtive_sequence_finder(arr);
        System.out.println("the longest consequtive sequence that can be formed is"+ans);
    }
    public static int longest_consequtive_sequence_finder(int[] arr)
    {
        HashSet<Integer> set=new HashSet<>();
        int count;
        int i;
        int ans=Integer.MIN_VALUE;
        int t;
        for(i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        for(i=0;i<arr.length;i++)
        {
            count=1;
            t=arr[i];
            while(set.contains(++t))
            {
                count++;
            }
            if(count>ans)
            {
                ans=count;
            }
        }
        return ans;
    }
}
