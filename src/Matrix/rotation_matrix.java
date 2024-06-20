package Matrix;
import java.util.*;
public class rotation_matrix {
    public static void main(String[] args)
    {
        int i,j;
        Scanner in=new Scanner(System.in);
        int[][] input=new int[3][3];
        for(i=0;i<input.length;i++)
        {
            for(j=0;j<input[0].length;j++)
            {
                input[i][j]=in.nextInt();
            }
        }
        Matrix_transposer(input);
        row_reverser(input);
        for(i=0;i<input.length;i++)
        {
            for(j=0;j<input[0].length;j++)
            {
                System.out.print(input[i][j]);
            }
            System.out.println();
        }
    }
    public static void row_reverser(int[][] input)
    {
        int i,j;
        int temp;
        for(i=0;i<input.length;i++)
        {
            for(j=0;j<input[0].length/2;j++)
            {
                temp=input[i][j];
                input[i][j]=input[i][input[0].length-1-j];
                input[i][input[0].length-1-j]=temp;
            }
        }
    }
    public static void Matrix_transposer(int[][] input)
    {
        int i,j;
        int temp;
        for(i=0;i<input.length;i++)
        {
            for(j=0;j<i;j++)
            {
                temp=input[i][j];
                input[i][j]=input[j][i];
                input[j][i]=temp;
            }
        }
    }
}
