package Arrays.Majority_element_2;
import java.util.*;
public class Optimal_approach {
    public static void main(String[] args) {
        int[] arr=new int[8];
        int i;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the elements of the array");
        for(i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        ArrayList<Integer> ans=new ArrayList<>(Majority_element_2_finder1(arr));
        System.out.println("the majority elements are"+ans);
    }
    public static ArrayList<Integer> Majority_element_2_finder1(int[] arr)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        int cnt1=0,cnt2=0;
        int ele1=-1,ele2=-1;
        int i;
        for(i=0;i<arr.length;i++)
        {
            if(cnt1==0 && arr[i]!=ele2)
            {
                cnt1=1;
                ele1=arr[i];
            }
            else if(cnt2==0 && arr[i]!=ele1)
            {
                cnt2=1;
                ele2=arr[i];
            }
            else if(arr[i]==ele1)
            {
                cnt1++;
            }
            else if(arr[i]==ele2)
            {
                cnt2++;
            }
            else
            {
                cnt1--;
                cnt2--;
            }
        }
        ans.add(ele1);
        ans.add(ele2);
        return ans;
    }
}
