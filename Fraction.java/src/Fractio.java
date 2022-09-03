import java.util.*;
public class Fractio {
	int num,demo;
	Scanner input=new Scanner(System.in);
	Fractio()
	{ 
		num=1;
		demo=1;
	}
	Fractio(int n, int d)
	{
		num=n;
		demo=d;
	}
	void inputf()
	{
		System.out.println("enter fraction nomenator");
		num=input.nextInt();
		System.out.println("enter fraction denomenator");
		demo=input.nextInt();
		if(demo==0)
		{
			System.out.println("enter valid fraction");
		}
	}
	void display()
	{
		System.out.println( num+"/"+demo);
	}
	Fractio multiply(Fractio f)
	{
			Fractio temp=new Fractio();
			temp.num=f.num*num;
			temp.demo=f.demo*demo;
			return temp;
	}
	Fractio subtractFraction(Fractio f)
	{
		Fractio temp=new Fractio();
		if(f.demo==demo)
		{
			temp.num=num-f.num;
			temp.demo=demo;
		}
		else
		{
			temp.demo=f.demo*demo;
			temp.num=(f.demo*num)-(demo*f.num);
		}
		return temp;
	}
	Fractio divideFraction(Fractio f)
	{
		Fractio temp=new Fractio();
		temp.num=f.demo*num;
		temp.demo=f.num*demo;
		return temp;
	}
	Fractio addFraction(Fractio f)
	{
		Fractio temp=new Fractio();
		if(f.demo==demo)
		{
			temp.num=f.num+num;
			temp.demo=demo;
		} 
		else
		{
			temp.demo=demo*f.demo;
			temp.num=(num*f.demo)+(f.num*demo);
		}
		return temp;
	}
	void reduceFraction()
	{
		int j;
		int temp=0;
		if(num>demo)
		{
			j=num;
		}
		else
		{
			j=demo;
		}
		for(int i=j;i<=9;i--)
		{
			if(num%i==0 && demo%i==0)
			{
				temp=i;
			}
		}
		if(temp!=0)
		{
			num=num/temp;
			demo=demo/temp;
		}
		System.out.println("reduce fraction form is");
		System.out.println( num+"/"+demo);
	}
	boolean compareFraction(Fractio f)
	{
		if("f.num".equals("num")&& "f.demo".equals("demo"))
		{
			return true;
		}
		else
			return false;
	}
	float convertFraction()
	{
		int i=0;
		i=num/demo;
		return i;
	}
}