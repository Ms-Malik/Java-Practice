import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderEx {
	JFrame jf;  
	BorderEx(){  
	    jf=new JFrame();  
	      JPanel jp=new JPanel(new BorderLayout());
	    JButton b1=new JButton("NORTH"); 
	    JButton b2=new JButton("SOUTH");  
	    JButton b3=new JButton("EAST");  
	    JButton b4=new JButton("WEST");  
	    JButton b5=new JButton("CENTER");  
	      
	    jp.add(b1,BorderLayout.NORTH);  
	    jp.add(b2,BorderLayout.SOUTH);  
	    jp.add(b3,BorderLayout.EAST);  
	    jp.add(b4,BorderLayout.WEST);  
	    jp.add(b5,BorderLayout.CENTER);  
	      jf.add(jp);
	    jf.setSize(300,300);  
	    jf.setVisible(true);  
	}  
	public static void main(String[] args) {  
	    new BorderEx();  
	}  
}
