import java.awt.*;  
import java.awt.event.*;

import javax.swing.*;  
    public class TextHandling  implements ActionListener{  
    JLabel l1,l2;  
    JTextArea area;  
    JButton b; 
    JButton find;
    JTextField tf;
    TextHandling(){  
    	JFrame jf=new JFrame("String Example");
    	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l1=new JLabel();  
        l1.setBounds(10,10,200,30);  
        l2=new JLabel();  
        l2.setBounds(250,10,100,30);  
        area=new JTextArea();  
        area.setBounds(20,50,300,200); 
        tf=new JTextField();
        tf.setBounds(20,350,280,30);
        b=new JButton("Count Words");  
        b.setBounds(20,270,120,30);  
        find=new JButton("Find");
        find.setBounds(200, 270, 120,30);
        b.addActionListener(this);  
        find.addActionListener(this);
        jf.add(l1);
        jf.add(l2);
        jf.add(area);
        jf.add(b); 
        jf.add(find);
        jf.add(tf);
        tf.setVisible(false);
        jf.setSize(400,450);  
        jf.setLayout(null);  
        jf.setVisible(true);  
    }  
    public void actionPerformed(ActionEvent e){ 
    	StringSearch ss=new StringSearch(area.getText());
    	
    String w="";
    	if (e.getSource()==b)
    	{
        
        l1.setText("Words: "+ss.CountWords());  
        l2.setText("Characters: "+ss.CountChars());  }
    	else
    	{
    		tf.setVisible(true);
    		if(e.getSource()==find)
    		{
    			
    			w=tf.getText();
    		}
    			
    	}
    	l1.setText("The word "+w+ " occurs "+ ss.SearchWord(w) +"  times");
    }  
    public static void main(String[] args) {  
        new TextHandling();  
    }  
    }  