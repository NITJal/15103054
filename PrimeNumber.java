
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[])
	{
		int p,q,n;
		Scanner sn = new Scanner(System.in);
		n = sn.nextInt();
		sn.close();
		for(p=2; p<=n; p++)
		{
			for(q=2; q<p; q++)
				if(p%q == 0)
					break;
			if(q == p)
				System.out.println(q);
		}
	}
}
