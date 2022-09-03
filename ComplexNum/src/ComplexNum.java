import java.util.*;
public class ComplexNum {
	Scanner input=new Scanner(System.in);
	int real,imagenary;
	ComplexNum()
	{
		real=0;
		imagenary=0;
	}
	ComplexNum(int r, int i)
	{
		real=r;
		imagenary=i;
	}
	ComplexNum(String r,String i)
	{
		r=String.valueOf(real);
		i=String.valueOf(imagenary);
	}
	void setData(int r,int i)
	{
		System.out.println("enter real num");
		r=input.nextInt();
		System.out.println("enter imagenary num");
		i=input.nextInt();
		real=r;
		imagenary=i;
	}
	int getReal()
	{
		return real;
	}
	int getImaginary()
	{
		return imagenary;
	}
	String displayComplex()
	{ 
		String i,r;
		r=String.valueOf(real);
		i=String.valueOf(imagenary);
		System.out.println(r+ " + " +i+ "i");
		return(r+ " + " +i+ "i");
	}
	ComplexNum addComplex(ComplexNum c,ComplexNum d)
	{
		ComplexNum temp=new ComplexNum();
		ComplexNum t=new ComplexNum();
		t.real=c.real+d.real;
		temp.real=t.real+real;
		temp.imagenary=c.imagenary+d.imagenary+imagenary;
		return temp;
	}
	ComplexNum subtractComplex(ComplexNum c,ComplexNum d)
	{
		ComplexNum temp=new ComplexNum();
		temp.real=real-c.real-d.real;
		temp.imagenary=imagenary-c.imagenary-d.imagenary;
		return temp;
	}
	ComplexNum multiplyComplex(ComplexNum c,ComplexNum d)
	{
		ComplexNum temp=new ComplexNum();
		ComplexNum re=new ComplexNum();
		ComplexNum im=new ComplexNum();
		re.real = real * c.real - imagenary * c.imagenary;
	    im.imagenary = real * c.imagenary + imagenary * c.real;
		temp.real = re.real * d.real -im.imagenary * d.imagenary;
		temp.imagenary = re.real * d.imagenary + im.imagenary * d.real;
		return temp;
	}
	ComplexNum squareComplex()
	{
		ComplexNum temp=new ComplexNum();
		temp.imagenary=2*imagenary*real;
		temp.real=real*real-imagenary*imagenary;
		return temp;
	}
	Boolean compareComplex(ComplexNum c)
	{
		if(real==c.real && imagenary==c.imagenary)
			return true;
		else
			return false;
	}
}
