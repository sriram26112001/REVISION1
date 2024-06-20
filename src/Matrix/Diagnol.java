package Matrix;
import java.util.*;
public class Diagnol
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i,j;
        int[][] input=new int[3][3];
        for(i=0;i<input.length;i++)
        {
            for(j=0;j<input[0].length;j++)
            {
                input[i][j]=in.nextInt();
            }
        }
        int ans=Diagonal_sum_finder(input);
        System.out.println(ans);
    }
    public static int Diagonal_sum_finder(int[][] input)
    {
        int sum=0;
        int i,j;
        for(i=0;i<input.length;i++)
        {
            for(j=0;j<input[0].length;j++)
            {
                if((i+j)%2!=1)
                {
                    sum=sum+input[i][j];
                }
            }
        }
        return sum;
    }
}
