import
java.util.Scanner;
class Copy
{
	public static void main(String args[])
	{
	 System in=new Scanner(System.in);
		int a[]=new int[12];	
		int b[]=new int[12];
		for(int i=0; i<=11; i++)
		{
			System.out.println("enter an integer");
		 	a[i]=input.nextInt();
		}
		for(int i=0; i<=11; i++)
		{
			for(int j=0;j<=11;j++)
			{
				if(a[i]%2==0)
				{
					a[i]=b[j];
				}
			}
		}
		for(int i=0; i<=11; i++)
		{
			System.out.println("original string is:");
			System.out.println(a[i]);
			System.out.println("even num string is:");
			System.out.println(b[i]);
		}
	}
}
