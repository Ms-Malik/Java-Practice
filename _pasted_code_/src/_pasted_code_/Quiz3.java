package _pasted_code_;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Arrays;
public class Quiz3 implements ActionListener{
	JFrame jf;
	JLabel lb;
	JTextField tf,tf1;
	JButton find;
	String n;
	

	JTextArea area;
	Quiz3()
	{
		jf=new JFrame("Quiz");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(10,200,500,300);
		tf=new JTextField();
		tf1=new JTextField();
		area = new JTextArea();
		tf.setBounds(10,10,200,100);
		lb=new JLabel();
		lb.setBounds(10,150,200,100);
		find=new JButton("find duplicate");
		find.setBounds(10,120,100,40);
		find.addActionListener(this);
		jf.add(tf);
		jf.add(lb);
		jf.add(find);
		jf.setLayout(null);  
		jf.setVisible(true); 
	}
	public void split()
	{
		n=tf.getText();
		String[] s=n.split(",");
		int size=s.length;
		int duplicate=0;
		String[] array=new String[size];
		int[] list=new int[size];
		
		for(int i=0;i<size;i++)
		{
			list[i]=Integer.parseInt(s[i]);
		}
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(list[i]==list[j])
				{
					int[] dup=new int[size];
					dup[duplicate]=list[i];
					array[duplicate]=String.valueOf(dup[duplicate]);
					duplicate++;
				}
			}
		}
		lb.setText(Arrays.toString(array));
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==find)
		{
			split();
		}
	}
	 public static void main(String[] args) {
		 new Quiz3();
	 }
}
