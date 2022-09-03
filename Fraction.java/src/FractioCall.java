import java.util.*;
public class FractioCall
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int choice;
		Fractio f1=new Fractio();
		Fractio f2=new Fractio(5,6);
		Fractio f3=new Fractio();
		f1.inputf();
		do
		{
			System.out.println("1.multiply fractions");
			System.out.println("2.add fractions");
			System.out.println("3.subtract fractions");
			System.out.println("4.divide fractions");
			System.out.println("5.reduce fraction");
			System.out.println("6.compare fractions");
			System.out.println("7.convert fraction");
			System.out.println("8.exit");
			System.out.println("_________");
			System.out.println("enter your option");
			choice=input.nextInt();
			switch(choice)
			{ 
			case 1:
			{
				System.out.println("ans after fractions multiplication is");
				f3=f1.multiply(f2);
				f3.display();
				break;
			}
			case 2:
			{
				f3=f1.addFraction(f2);
				System.out.println("ans after fractions addition is");
				f3.display();
				break;
			}
			case 3:
			{
				f3=f1.subtractFraction(f2);
				System.out.println("ans after fractions subtraction is");
				f3.display();
				break;
			}
			case 4:
			{
				f3=f1.divideFraction(f2);
				System.out.println("ans after fractions division is");
				f3.display();
				break;
			}
			case 5:
			{
				f1.reduceFraction();
				break;
			}
			case 6:
			{
				f1.compareFraction(f2);
				break;
			}
			case 7:
			{
				f1.convertFraction();
				break;
			}
			default:
			{
				System.out.println("thanks");
				break;
			}
		}
		}while(choice!=8);
	}
}
