
import java.util.Scanner;

public class Sort {
	public static void main(String args[])
	{
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the number of names");
		int n = sn.nextInt();
		String [] p = new String[n];


		System.out.println("Enter names");
		for(int i=0; i<n; i++)
		{
			p[i] = sn.next();
		}
		sn.close();

		for(int i=0; i<n; i++)
		{
			p[i] = p[i].toLowerCase();
		}


		String q = new String();
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(p[i].compareTo(p[j]) > 0)
				{
					q = p[i];
					p[i] = p[j];
					p[j] = q;
				}
			}
		}


		System.out.println("Names in sorted order are");
		for(int i=0; i<n; i++)
		{
			System.out.println(p[i]);
		}
	}
}
