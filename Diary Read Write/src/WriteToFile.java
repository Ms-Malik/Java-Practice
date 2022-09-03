import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class WriteToFile{
	public static void main(String[] args) throws Exception {
		try {
			WriteToFile w=new WriteToFile();
		      FileWriter myWriter = new FileWriter("e:\\1.Java\\Diary Read Write text files\\diary.txt",true);
		      String diary=" Today its rainy weather";
		      String day="14/11/2020";
		      Date d;
		      d=new SimpleDateFormat("dd/MM/yyyy").parse(day);
		      myWriter.write(diary);
		      myWriter.write(day);
		      myWriter.write("%\n");
		      myWriter.flush();
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }

	}

}
