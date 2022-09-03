package keyless_cipher;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
public class Keyed {
	private JTextField encryption_PlainText = new JTextField(10);
	private JTextField encryption_Key =new JTextField(10);
	private JTextField encryption_Cipher = new JTextField(10);
	private JButton encryption_btn = new JButton("Encrypt");
	private JTextField decryption_PlainText = new JTextField(10);
	private JTextField decryption_Key =new JTextField(10);
	private JTextField decryption_Cipher = new JTextField(10);
	private JButton decryption_btn = new JButton("Decrypt");
	private String alphapetic = "abcdefghijklmnopqrstuvwxyz";
	public Keyed()
	{
		encryption_btn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				String text = Encryption(encryption_PlainText.getText().toString(), encryption_Key.getText().toString());
				encryption_Cipher.setText(text);
			}
		});
		
		decryption_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String text = Decryption(decryption_Cipher.getText().toString(), decryption_Key.getText().toString());
				decryption_PlainText.setText(text);
			}
		});
	}	
	public JPanel createPanel(){
		JPanel Main = new JPanel(new BorderLayout());
		TitledBorder encryption = BorderFactory.createTitledBorder("Encryption");
		JPanel encryption_panel = new JPanel(new GridLayout(4,2));
		encryption_panel.setBorder(encryption);
		encryption_panel.add(new JLabel("Plain Text"));
		encryption_panel.add(encryption_PlainText);
		encryption_panel.add(new JLabel("Key"));
		encryption_panel.add(encryption_Key);
		encryption_panel.add(new JLabel("Cipher Text"));
		encryption_panel.add(encryption_Cipher);
		encryption_panel.add(new JLabel(""));
		encryption_panel.add(encryption_btn);
		TitledBorder decryption = BorderFactory.createTitledBorder("Decryption");
		JPanel decryption_panel = new JPanel(new GridLayout(4,2));
		decryption_panel.setBorder(decryption);
		decryption_panel.add(new JLabel("Plain Text"));
		decryption_panel.add(decryption_PlainText);
		decryption_panel.add(new JLabel("Key"));
		decryption_panel.add(decryption_Key);
		decryption_panel.add(new JLabel("Cipher Text"));
		decryption_panel.add(decryption_Cipher);
		decryption_panel.add(new JLabel(""));
		decryption_panel.add(decryption_btn);
		Main.add(encryption_panel,BorderLayout.NORTH);
		Main.add(decryption_panel,BorderLayout.SOUTH);
		return Main;
	}
	String Encryption(String data,String key)
	{
		int length=key.length();
		int len=data.length();
		int n=len/length;
		int temp=0;
		String[] newString=new String[length];
		if(len%length==0)
		{
			for(int i=0;i<len;i=i+n)
			{
				String part=data.substring(i,i+n);
				newString[temp]=part;
				temp++;
			}
		}
		else
		{
			
		}
		return encryption;
	}
}
