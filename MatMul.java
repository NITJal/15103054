
import java.util.Scanner;

public class MatMul {
	public static void main(String args[])
	{
		int p,q;
		Scanner input = new Scanner(System.in);


		System.out.println("Enter the order and elements of Matrix");
		p = input.nextInt();
		q = input.nextInt();
		int a[][] = new int[p][q];

		for(int i=0; i<a.length; i++)
			for(int j=0; j<a[0].length; j++)
				a[i][j] = input.nextInt();

		System.out.println("Enter the order and elements of Matrix");
		p = input.nextInt();
		q = input.nextInt();
		int b[][] = new int[p][q];

		for(int i=0; i<b.length; i++)
			for(int j=0; j<b[0].length; j++)
				b[i][j] = input.nextInt();

		input.close();


		int c[][] = new int[a.length][b[0].length];


		for (int i=0; i<a.length; i++)
			for(int j=0; j<b[0].length; j++)
				for(int k=0; k<b.length; k++)
				{
					c[i][j] += a[i][k]*b[k][j];
				}


		System.out.println("The product of the two matrix is");
		for(int i=0; i<c.length; i++)
		{
			for(int j=0; j<c[0].length; j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}

