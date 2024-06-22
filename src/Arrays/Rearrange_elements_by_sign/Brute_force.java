package Arrays.Rearrange_elements_by_sign;
import java.util.*;
public class Brute_force {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[6];
        int i;
        System.out.println("enter the elements");
        for(i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        int[] ans=re_arranger(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] re_arranger(int[] arr)
    {
        int[] positive_array=new int[arr.length/2];
        int[] negative_array=new int[arr.length/2];
        int[] ans=new int[arr.length];
        int i;
        int p=0;
        int n=0;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]>=0)
            {
                positive_array[p++]=arr[i];
            }
            else
            {
                negative_array[n++]=arr[i];
            }
        }
        p=0;
        n=0;
        for(i=0;i<ans.length;i++)
        {
            if(i%2==0)
            {
                //even index
                ans[i]=positive_array[p++];
            }
            else
            {
                ans[i]=negative_array[n++];
            }
        }
        return ans;
    }
}
