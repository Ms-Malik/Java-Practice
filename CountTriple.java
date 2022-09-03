import java.util.*;
public class CountTriple
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String i=sc.nextLine();
		int count=0;
		int le=i.length();
		for(int j=0; j<le;j++)
		{
			if(i.charAt(j)==i.charAt(j++))
			{
				if(i.charAt(j++)==i.charAt(j+2))
					count++;
			}
		}
		System.out.println("triple char exist " +count+ " times in string");
	}
}