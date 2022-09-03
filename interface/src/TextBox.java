import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TextBox implements ActionListener {
	JFrame jf;
	JFrame jf1=new JFrame();
	JScrollPane scroll;
	JTextField tf1;
	JTextField tf2;
	JPasswordField pf;
	JLabel lb1;
	JLabel lb2;
	JLabel lb3,lb4,lb5;
	JButton get_text;
	JButton decode_password;
	TextBox()
	{
		jf=new JFrame("TextBox Types");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(100,200,700,500);
		jf.setBackground(Color.gray);
		lb1=new JLabel("A multiline textbox");
		lb1.setBounds(30,5,200,100);
		lb4=new JLabel("that accepts tabs");
		lb4.setBounds(30,20,200,100);
		lb5=new JLabel("and return keystrokes");
		lb5.setBounds(30,35,200,100);
		tf1=new JTextField();
		tf1.setBounds(210,15,300,150);
		scroll = new JScrollPane();
	    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	    scroll.setBounds(278,2,20,148);
	    get_text=new JButton("Get Text");
	    get_text.setBounds(30,130,120,30);

	    lb2=new JLabel("Caps only!!!");
	    lb2.setBounds(30,200,100,30);
	    tf2=new JTextField();
	    tf2.setBounds(30,235,150,30);
	    lb3=new JLabel("Password Box");
	    lb3.setBounds(210,200,150,30);
	    decode_password=new JButton("Decode Password");
	    decode_password.setBounds(360,200,150,30);
	    
	    pf=new JPasswordField(30);
	    pf.setBounds(210,235,300,30);
	    pf.setEchoChar('$');
	    jf.add(lb1);
	    jf.add(lb4);
	    jf.add(lb5);
	    jf.add(tf1);
	    tf1.add(scroll);
	    jf.add(get_text);
	    jf.add(lb2);
	    jf.add(tf2);
	    jf.add(lb3);
	    jf.add(decode_password);
	    jf.add(pf);
        jf.setLayout(null);  
        jf.setVisible(true); 
        decode_password.addActionListener(this);
        
	   }
	public void actionPerformed(ActionEvent e)
	{
		String password = String.valueOf(pf.getPassword());
		 int capital=0,digit=0,special=0;
		 int length=password.length();
		 char ch;
		 if(e.getSource()==decode_password)
		 {
			 if(length<10)
			 {
				 JOptionPane.showMessageDialog(jf1,"password length must be greater than 10");
			 }
			 for(int i=0;i<length;i++)
			 {
				 ch=password.charAt(i);
				 if(Character.isUpperCase(ch))
				 {
					 capital++;
				 }
			 }
			 for(int i=0;i<length;i++)
			 {
				 ch=password.charAt(i);
				if(Character.isDigit(ch))
				 {
					 digit=digit+1;
				 }
			 }
			 for(int i=0;i<length;i++)
			 {
				 ch=password.charAt(i);
				if(ch=='!' || ch=='$' || ch=='%' || ch=='^' || ch=='&' || ch=='*' || ch=='(')
				 {
					JOptionPane.showMessageDialog(jf1,"Only # and @ allowed from special characters,try again");
					pf.setText("");
				 }
				else if(ch=='#' || ch=='@')	
				{
					special=special+1;
				}
			 }
			 if(length>10 && capital>=1 && digit>=4 )
			 {
				 JOptionPane.showMessageDialog(jf1,"strong password");
				 pf.setText("");
			 }
			 	
			 else if(capital==0)
			 {
				 JOptionPane.showMessageDialog(jf1,"weak password enter again \n Password contain at least one capital letter ");
				 pf.setText("");
			 }
			 else if(digit<4)
			 {
				 JOptionPane.showMessageDialog(jf1,"weak password enter again \n Password contain at least 4 digits"); 
				 pf.setText("");
			 }
			 else
			 {
				 JOptionPane.showMessageDialog(jf1,"weak password enter again");
				 pf.setText("");
			 }
			 }
	}
	 public static void main(String[] args) {  
	        new TextBox();  
	    } 
}