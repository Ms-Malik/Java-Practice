import java.util.*;
public class StrInput
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String i=sc.nextLine();
		System.out.println("enter character");
		char ch;
		ch=sc.next().charAt(0); 
		int counter=0;
		for(int j=0; j<i.length();j++)
		{
			if(i.charAt(j)==ch)
				counter++;
		}
		System.out.println("char exist " +counter+ " times in string");
	}
}