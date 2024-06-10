package Arrays;
import java.util.*;
public class Shuffle_the_Array {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[6];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        int[] ans=Array_shuffler(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] Array_shuffler(int[] arr)
    {
        int[] ans=new int[arr.length];
        int k=0;
        int i=0;
        int j=arr.length/2;
        while(j<arr.length)
        {
            if(k%2==0)
            {
                ans[k++]=arr[i];
                i++;
            }
            else
            {
                ans[k++]=arr[j];
                j++;
            }
        }
        return ans;
    }
}
