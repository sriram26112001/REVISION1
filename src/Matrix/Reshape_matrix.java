package Matrix;
import java.util.*;
public class Reshape_matrix {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[][] input=new int[2][4];
        int i,j;
        System.out.println("enter the elements of the input matrix");
        for(i=0;i<input.length;i++)
        {
            for(j=0;j<input[0].length;j++)
            {
                input[i][j]=in.nextInt();
            }
        }
        System.out.println("enter the matrix output dimension ...");
        System.out.println("enter the row_width");
        int row=in.nextInt();
        System.out.println("enter the column_width");
        int column=in.nextInt();

        if((row * column) != input.length * (input[0].length))
        {
            System.out.println("you cannot reshape this matrix");
        }
        else
        {
            int[][] ans=matrix_reshaper(input,row,column);
            for(i=0;i<ans.length;i++)
            {
                for(j=0;j<ans[0].length;j++)
                {
                    System.out.print(ans[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
    public static int[][] matrix_reshaper(int[][] input,int row,int column)
    {
        int i,j;
        int p=0;
        // let's count the total_elements in the matrix
        int total_elements=input.length * input[0].length;

        //now let's create a flat array that contains all the elements of the input matrix
        int[] flat_array=new int[total_elements];
        for(i=0;i<input.length;i++)
        {
            for(j=0;j<input[0].length;j++)
            {
                flat_array[p++]=input[i][j];
            }
        }
        p=0;
        //now lets create the reshape matrix
        int[][] ans=new int[row][column];
        for(i=0;i<ans.length;i++)
        {
            for(j=0;j<ans[0].length;j++)
            {
                ans[i][j]=flat_array[p++];
            }
        }
        return ans;
    }
}
