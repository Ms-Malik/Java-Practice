package keyless_cipher;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
public class Multiplicative 
{
	private JTextField encryption_PlainText = new JTextField(10);
	private JTextField encryption_Key =new JTextField(10);
	private JTextField encryption_Cipher = new JTextField(10);
	private JButton encryption_btn = new JButton("Encrypt");
	private JTextField decryption_PlainText = new JTextField(10);
	private JTextField decryption_Key =new JTextField(10);
	private JTextField decryption_Cipher = new JTextField(10);
	private JButton decryption_btn = new JButton("Decrypt");
	private String alphapetic = "abcdefghijklmnopqrstuvwxyz";
	public Multiplicative()
	{
		encryption_btn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				String text = encrypt(encryption_PlainText.getText().toString(), encryption_Key.getText().toString());
				encryption_Cipher.setText(text);
			}
		});
		
		decryption_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String text = decrypt(decryption_Cipher.getText().toString(), decryption_Key.getText().toString());
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
	public String encrypt(String Msg,String k)
	{
		int key=Integer.valueOf(k);
		int len=Msg.length();
		StringBuilder builder = new StringBuilder();
		for(int in=0; in<len; in++)
		{
			char character = Msg.charAt(in);
            if (Character.isLetter(character)) {
            	character = (char) ((key * (character - 'a')) % 26 + 'a');
            }
            builder.append(character);
        }
        return builder.toString();
	}
	public String decrypt(String msg,String key)
	{
		int a=Integer.valueOf(key);
		int len=msg.length();
    	 StringBuilder builder = new StringBuilder();
    	    BigInteger inverse = BigInteger.valueOf(a).modInverse(BigInteger.valueOf(26));
    	    for(int in=0; in<len; in++)
    		{
    			char character = msg.charAt(in);
                if (Character.isLetter(character)) {
                	int decode=inverse.intValue()*(character);
                	character = (char) (decode % 26 + 'a');
                	builder.append(character);
        	    }
    		}
    	    return builder.toString();
	}
}
