
import java.util.Scanner;

public class Palindrome {
	public static void main(String args[])
	{
		Scanner sn = new Scanner(System.in);
		String m = sn.nextLine();
		sn.close();
		StringBuffer n = new StringBuffer(m).reverse();//Reversing the string...
		if(m.equals(n.toString()))
			System.out.println("The given string is a palindrome.");
		else
			System.out.println("The given string is not a palindrome.");
	}
}
