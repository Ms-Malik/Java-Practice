import java.util.*;
public class print {
	int n;
	public void prime()
	{
		System.out.println("Prime num from 1 to n: ");
		for(int i=2;i<=n;i++)
		{
			int count=0;
			for(int num=1;num<=i;num++)
			{
				if(i%num==0)
					count++;
			}
			if(count==2)
				System.out.println(i + " ");
		}
	}
	public void even()
	{
		System.out.println("Even num from 1 to n: ");
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
	}
	public void odd()
	{
		System.out.println("Odd num from 1 to n: ");
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
				System.out.println(i);
		}
	}
	public static void main(String args[])
	{
		print p=new print();
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter value of n: ");
		p.n=sc.nextInt();	
		p.prime();
		p.odd();
		p.even();
	}
}

