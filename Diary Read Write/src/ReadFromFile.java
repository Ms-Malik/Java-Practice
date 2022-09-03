import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import javax.swing.JOptionPane;
public class ReadFromFile {
	public static void main(String[] args) throws Exception{
		  try {
			  WriteToFile w=new WriteToFile();
		      FileReader myreader = new FileReader("e:\\1.Java\\Diary Read Write text files\\diary.txt");
		      int i;
		      String choice;
		      String f;
		      Date find;
		      Scanner sc=new Scanner(System.in);
		      
		      System.out.println("do you want to find certain date? ");
		      choice=sc.nextLine();
		      if(choice=="yes")
		      {
				System.out.println("Enter date to find");
				f=sc.nextLine();
				 find=new SimpleDateFormat("dd/MM/yyyy").parse(f);
				 
		      }
		    while((i= myreader.read())!=-1)
		    {if ((char)i=='%')
		    {
		    	 
		    	System.out.println("\nNext Day");
		    	
		    }
		    else
		    	System.out.print((char)i);}
		      myreader.close();
		      
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }

	}

}
