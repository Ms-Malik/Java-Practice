import java.io.*;
	 
	public class Write {
	 
	    private static final String filepath="D:\\ObjFile.txt";
	 
	    public static void main(String args[]) {
	 
	        Write write = new Write();
	 
	       Doctor doctor=new Doctor("Haris","general","mbbs",123,055,'m');
	        write.WriteObjectToFile(doctor);
	    }
	 
	    public void WriteObjectToFile(Object serObj) {
	 
	        try {
	 
	        	FileOutputStream fileOut = new FileOutputStream(filepath);
	            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
	            objectOut.writeObject(serObj);
	            objectOut.close();
	            System.out.println("The Object  was succesfully written to a file");
	        	
	            objectOut.close();
	            
	        	
	 
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	    }
	}
	