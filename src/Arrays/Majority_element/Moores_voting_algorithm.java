package Arrays.Majority_element;
import java.util.*;
public class Moores_voting_algorithm {
    public static void main(String[] args) {
        int[] arr=new int[16];
        int i;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the elements");
        for(i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        int ans=majority_element_finder1(arr);
        System.out.println("the majority element that appears more than n/2 times is"+ans);
    }
    public static int majority_element_finder1(int[] arr)
    {
        int majority_element=arr[0];
        int votes=1;
        int i;
        for(i=1;i<arr.length;i++)
        {
            if(arr[i]!=majority_element)
            {
                votes--;
                if(votes==0)
                {
                    majority_element=arr[i];
                    votes=1;
                }
            }
            else
            {
                votes++;
            }
        }
        return majority_element;
    }
}
