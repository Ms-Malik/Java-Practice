import java.util.*;
public class ComplexNumCall
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int choice;
		ComplexNum f1=new ComplexNum();
		ComplexNum f2=new ComplexNum(5,6);
		ComplexNum f3=new ComplexNum();
		ComplexNum f4=new ComplexNum();
		do
		{
			System.out.println("1.add complex num");
			System.out.println("2.subtract complex num");
			System.out.println("3.multiply complex num");
			System.out.println("4.square complex num");
			System.out.println("5.compare complex num");
			System.out.println("6.exit");
			System.out.println("_________");
			System.out.println("enter your option");
			choice=input.nextInt();
			switch(choice)
			{
			case 1:
			{
				f1.setData(0,0);
				f2.setData(0,0);
				f3.setData(0,0);
				System.out.println("ans of addition is:");
				f4=f1.addComplex(f2, f3);
				f4.displayComplex();
				break;
			}
			case 2:
				f1.setData(0,0);
				f2.setData(0,0);
				f3.setData(0,0);
				f4=f3.subtractComplex(f1, f2);
				System.out.println("ans of subtraction is:");
				f4.displayComplex();
				break;
			case 3:
				f1.setData(0,0);
				f2.setData(0,0);
				f3.setData(0,0);
				f4=f3.multiplyComplex(f1, f2);
				System.out.println("ans of multiplication is:");
				f4.displayComplex();
				break;
			case 4:
				f1.setData(0, 0);
				System.out.println("square is:");
				f2=f1.squareComplex();
				f2.displayComplex();
				break;
			case 5:
				f1.setData(0,0);
				f2.setData(0,0);
				if (f1.compareComplex(f2)==true)
					System.out.println("both numbers are equal");
				else
					System.out.println("both numbers are not equal");
				break;
			default:
				System.out.println("thanks\n");
				break;
			}
		}while(choice!=6);
	}
}
