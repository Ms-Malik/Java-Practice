class LcmHcf
{
	public static void main(String args[])
	{
		int n1=20;
		int n2=5;
		int gcd=1;
		int maxvalue;
		for(int i=2; ((i<=n1)&&(i<=n2));i++)
		{
			if((n1%i==0)&&(n2%i==0))
			{
				gcd=i;
			}
		}
		System.out.println("HCF of " +n1+ " and " +n2+ " is " +gcd);
 		if(n1>n2)
			maxvalue=n1;
		else
			maxvalue=n2;
		while(true)
		{
			if((maxvalue%n1==0)&&(maxvalue%n2==0))
			{
				System.out.println("LCM of " +n1+ " and " +n2+ " is " +maxvalue);
				break;
			}
			maxvalue++;
		}
	}												
}