class Prime
{
	public static void main(String args[])
	{
		int a=5;
		int isprime=1;
		for(int i=2; i<a; i++)
		{
			if(a%i==0)
			{
				isprime=0;
			}
		}
		if(isprime==1)
			System.out.println("prime number");
		else
			System.out.println("not a prime number");
	}
}