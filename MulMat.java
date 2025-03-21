import java.util.Scanner;
class MulMat
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the rows and columns:");
        int r = s.nextInt();
        int c = s.nextInt();
        int a2d[][] = new int[r][c];
        int b2d[][] = new int[r][c];
        int c2d[][] = new int[r][c];
        
        System.out.println("Enter the values for Matrix A");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++) 
            {
                a2d[i][j] = s.nextInt();
            }
        }
        
        System.out.println("Enter the values for Matrix B");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                b2d[i][j] = s.nextInt();
            }
        }

        System.out.println("Matrix A:");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                System.out.print(a2d[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Matrix B:");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                System.out.print(b2d[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                for(int k=0;k<c;k++)
                {
                    c2d[i][j] += a2d[i][k] * b2d[k][j];
                }
            }
        }
        
        System.out.println("Resultant Matrix after Multiplication:");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                System.out.print(c2d[i][j] + " ");
            }
            System.out.println();
        }
        
        s.close();
    }
}
