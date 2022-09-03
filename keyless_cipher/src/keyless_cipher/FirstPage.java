package keyless_cipher;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
public class FirstPage implements ActionListener{
	JFrame jf;
	JButton additive,auto,affine,multiplicative,playfair,vigenere,combination,keyless,keyed;
	JLabel lb;
	public FirstPage()
	{
		jf=new JFrame("Cryptography"); 
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(340,170,635,350);
		lb=new JLabel("Select Cipher");
		lb.setForeground(Color.black);
		lb.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 26));
		lb.setBounds(225,15,500,50);
		additive=new JButton("Additive");
		additive.setBounds(80,75,100,50);
		multiplicative=new JButton("Multiplicative");
		multiplicative.setBounds(230,75,120,50);
		affine=new JButton("Affine");
		affine.setBounds(400,75,100,50);
		auto=new JButton("AutoKey");
		auto.setBounds(80,160,100,50);
		playfair=new JButton("PlayFair");
		playfair.setBounds(230,160,120,50);
		vigenere=new JButton("Vigenere");
		vigenere.setBounds(400,160,100,50);
		keyless=new JButton("RailFence");
		keyless.setBounds(80,245,100,50);
		keyed=new JButton("Keyed");
		keyed.setBounds(400,245,100,50);
		combination=new JButton("Combination");
		combination.setBounds(230,245,120,50);
		jf.add(lb);
		jf.add(additive);
		jf.add(multiplicative);
		jf.add(affine);
		jf.add(auto);
		jf.add(playfair);
		jf.add(vigenere);
		jf.add(keyless);
		jf.add(keyed);
		jf.add(combination);
		jf.setLayout(null);  
	    jf.setVisible(true); 
	    additive.addActionListener(this);
	    keyless.addActionListener(this);
	    multiplicative.addActionListener(this);
	    affine.addActionListener(this);
	    auto.addActionListener(this);
	    playfair.addActionListener(this);
	    vigenere.addActionListener(this);
	    keyed.addActionListener(this);
	    combination.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==keyless)
		{
			jf.dispose();
			KMain km=new KMain();
		}
		else if(e.getSource()==combination)
		{
			jf.dispose();
			Main m=new Main();
		}
		else if(e.getSource()==auto)
		{
			jf.dispose();
			AutoMain am=new AutoMain();
		}
		else if(e.getSource()==affine)
		{
			jf.dispose();
			AffineMain a=new AffineMain();
		}
		else if(e.getSource()==multiplicative)
		{
			jf.dispose();
			MMain mm=new MMain();
		}
		else if(e.getSource()==additive)
		{
			jf.dispose();
			AddMain mm=new AddMain();
		}
	}
	 public static void main(String[] args) {  
		 new FirstPage();
	 }
}
