package Matrix;
import java.util.*;
public class lucky_number {
    public static void main(String[] args) {
        int i,j;
        ArrayList<Integer> list=new ArrayList<>();
        Scanner in=new Scanner(System.in);
        int[][] input=new int[3][3];
        for(i=0;i<input.length;i++) {
            for (j = 0; j < input[0].length; j++) {
                input[i][j] = in.nextInt();
            }
        }
        list=lucky_number_finder(input);
        System.out.println(list);
    }
    public static int[] row_array_creator(int[][] input)
    {
        int[] ans=new int[input.length];
        int i,j;
        int minimum;
        for(i=0;i<input.length;i++)
        {
            minimum=Integer.MAX_VALUE;
            for(j=0;j<input[0].length;j++)
            {
                if(input[i][j]<minimum)
                {
                    minimum=input[i][j];
                }
            }
            ans[i]=minimum;
        }
        return ans;
    }

    public static int[] column_array_creator(int[][] input)
    {
        int[] ans=new int[input[0].length];
        int i,j;
        int maximum;
        for(i=0;i<input[0].length;i++)
        {
            maximum=Integer.MIN_VALUE;
            for(j=0;j<input.length;j++)
            {
                if(input[j][i]>maximum)
                {
                    maximum=input[j][i];
                }
            }
            ans[i]=maximum;
        }
        return ans;
    }
    public static ArrayList<Integer> lucky_number_finder(int[][] input)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        int[] row_array=row_array_creator(input);
        int[] column_array=column_array_creator(input);
        System.out.println(Arrays.toString(row_array));
        System.out.println(Arrays.toString(column_array));
        int i,j;
        //lucky number finder main code
        for(i=0;i<input.length;i++)
        {
            for(j=0;j<input[0].length;j++)
            {
                if(input[i][j]==row_array[i] && input[i][j]==column_array[j])
                {
                    ans.add(input[i][j]);
                }
            }
        }
        return ans;
    }
}
