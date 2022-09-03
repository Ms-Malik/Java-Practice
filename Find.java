import
javax.swing.JOptionPane;
	public class Find
	{
		public static void main(String args[])
		{
			String a[]= new String[10];
			for(int i=0; i<=9; i++)
			{
				 a[i]= JOptionPane.showInputDialog("enter string: ");
			}
			System.out.println(" string entered");
			for(int i=0; i<=9; i++)
			{
				if(a[i].startsWith("Th"))
				{
					System.out.println(a[i]);
				}
			}
		}
	}  