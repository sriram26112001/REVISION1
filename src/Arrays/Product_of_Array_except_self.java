package Arrays;
import java.util.*;
public class Product_of_Array_except_self {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the elements");
        int i;
        int[] arr=new int[5];
        for(i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        int[] ans=product_finder(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] prefix_array_finder(int[] arr)
    {
        int[] ans=new int[arr.length];
        int i;
        ans[0]=arr[0];
        for(i=1;i<arr.length;i++)
        {
            ans[i]=arr[i]*ans[i-1];
        }
        return ans;
    }
    public static int[] suffix_array_finder(int[] arr)
    {
        int[] ans=new int[arr.length];
        int i;
        ans[ans.length-1]=arr[arr.length-1];
        for(i=arr.length-2;i>=0;i--)
        {
            ans[i]=arr[i] * ans[i+1];
        }
        return ans;
    }
    public static int[] product_finder(int[] arr)
    {
        int i;
        int[] ans=new int[arr.length];
        int[] prefix_array=prefix_array_finder(arr);
        int[] suffix_array=suffix_array_finder(arr);
        System.out.println(Arrays.toString(prefix_array));
        System.out.println(Arrays.toString(suffix_array));
        //------------------------------------------------------
        for(i=0;i<ans.length;i++)
        {
            if(i==0)
            {
                ans[i]=suffix_array[i+1];
            }
            else if(i==ans.length-1)
            {
                ans[i]=prefix_array[i-1];
            }
            else
            {
                ans[i]=suffix_array[i+1] * prefix_array[i-1];
            }
        }
        return ans;
    }
}
