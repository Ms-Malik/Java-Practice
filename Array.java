class Array
{
	public static void main(String[] args)
	{
		int sum=0;
		int max=1;
		int min=1;
		int isprime=1;
		int a[]={1,2,3,4,5,6,7,8,9,0};
		for(int i=0 ; i<=9 ;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of array is: " +sum);
		for(int i=0; i<=9;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("largest element in array is: " +max);	
		for(int i=0; i<=9;i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("smallest element in array is: " +min);	
		for(int i=2; i<=max; i++)
		{
			if(a[i]%i==0)
			{
				isprime=0;
			}
			if(isprime==1)
				System.out.println("prime number" +a[i]);
		}		
	}
}

