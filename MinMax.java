class MinMax
{
	public static void main(String args[])
	{
		int a=1;
		int b=2;
		int c=3;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("max is a " +a);
			}
			else if(c>b)
			{
				System.out.println("max is c " +c);
			}
		}
		else if(b>c)
		{
			if(b>a)
			{
				System.out.println("max is b " +b);
			}
		}
		else
		{
			System.out.println("max is c " +c);
		}
		if(a<b)
		{
			if(a<c)
			{
				System.out.println("min is a " +a);
			}
			else if(c<b)
			{
				System.out.println("min is c " +c);
			}
		}
		else if(b<c)
		{
			if(b<a)
			{
				System.out.println("min is b " +b);
			}
		}
		else
		{
			System.out.println("min is c " +c);
		}
	}
}