import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.*;
	 
	public class Read {
	 
	    private static final String filepath="D:\\\\ObjFile.txt";
	 
	    public static void main(String args[]) {
	 
	        Read read = new Read();
	 
	       Doctor doctor=new Doctor();
	        read.ReadObjectFromFile(doctor);
	    }
	 
	    public void ReadObjectFromFile(Object serObj) {
	 
	        try {
	 
	         
	        	FileInputStream fileIn = new FileInputStream(filepath);
	            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
	           serObj= objectIn.readObject();
	           System.out.println(serObj);
	            objectIn.close();
	            
	        	
	 
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	    }
	}