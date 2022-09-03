import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.ImageIcon;
public class Emojiquiz implements MouseListener{
	JFrame jf;
	JPanel jp;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	JTextField tf;
	String url1,url2,url3,url4;
	Emojiquiz()
	{
		jp=new JPanel();
		jp.setLayout(null);
		jf=new JFrame("Emojis name");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(10,200,800,800);
		l1=new JLabel();
		l1.setBounds(10,10,500,200);
		l1.setIcon(new ImageIcon("C:\\Users\\Lenovo 330\\Desktop\\Emoji\\smile.jpg"));
		l2=new JLabel();
		l2.setBounds(550,10,500,200);
		l2.setIcon(new ImageIcon("C:\\Users\\Lenovo 330\\Desktop\\Emoji\\sad.jpg"));
		l3=new JLabel();
		l3.setBounds(550,250,500,200);
		l3.setIcon(new ImageIcon("C:\\Users\\Lenovo 330\\Desktop\\Emoji\\cry.jpg"));
		l4=new JLabel();
		l4.setBounds(10,250,500,200);
		l4.setIcon(new ImageIcon("C:\\Users\\Lenovo 330\\Desktop\\Emoji\\love-emoji_53876-25514.jpg"));
		tf=new JTextField();
		tf.setBounds(30,480,300,30);
		jf.add(l1);
		jf.add(l2);
		jf.add(l3);
		jf.add(l4);
		jf.add(tf);
		jf.add(jp); 
        jf.setVisible(true); 
        l1.addMouseListener(this);
        l2.addMouseListener(this);
        l3.addMouseListener(this);
        l4.addMouseListener(this);
	}
	public void mouseClicked(MouseEvent e)
	{
		if(e.getSource()==l1)
		{
			tf.setText("smile");
		}
		else if(e.getSource()==l2)
		{
			tf.setText("sad");
		}
		else if(e.getSource()==l3)
		{
			tf.setText("cry");
		}
		else if(e.getSource()==l4)
		{
			tf.setText("heart with smile");
		}
	}
	public void mousePressed(MouseEvent e)
	{
		//TODO Auto-generated method sub
	}
	public void mouseReleased(MouseEvent e)
	{
		//TODO Auto-generated method sub
	}
	public void mouseEntered(MouseEvent e)
	{
		//TODO Auto-generated method sub
	}
	public void mouseExited(MouseEvent e)
	{
		//TODO Auto-generated method sub
	}
	public static void main(String args[]) {
		new Emojiquiz();  
	}

}
