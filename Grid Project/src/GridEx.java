import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridEx {
	JFrame jf;  
	GridEx(){  
	    jf=new JFrame();  
	      JPanel jp=new JPanel(new GridLayout(3,3));
	    JButton b1=new JButton("One");  
	    JButton b2=new JButton("TWO");  
	    JButton b3=new JButton("THREE");  
	    JButton b4=new JButton("FOUR");  
	    JButton b5=new JButton("FIVE");  
	    JButton b6=new JButton("SIX");  
	    JButton b7=new JButton("SEVEN");  
	    JButton b8=new JButton("EIGHT");
	    JButton b9=new JButton("NINE");
	    b8.setEnabled(false);
	    b7.setBackground(Color.pink);
	    jp.add(b3);  
	    jp.add(b2);  
	    jp.add(b1);  
	    jp.add(b7);  
	    jp.add(b5);  
	    jp.add(b4);
	    jp.add(b6);
	    jp.add(b8);
	    jp.add(b9);
	    
	      jf.add(jp);
	    jf.setSize(300,300);  
	    jf.setVisible(true);  
	}  
	public static void main(String[] args) {  
	    new GridEx();  
	}
}