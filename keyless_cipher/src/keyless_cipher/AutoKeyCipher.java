package keyless_cipher;
import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;
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
public class AutoKeyCipher 
{
	private JTextField encryption_PlainText = new JTextField(10);
	private JTextField encryption_Key =new JTextField(10);
	private JTextField encryption_Cipher = new JTextField(10);
	private JButton encryption_btn = new JButton("Encrypt");
	private JTextField decryption_PlainText = new JTextField(10);
	private JTextField decryption_Key =new JTextField(10);
	private JTextField decryption_Cipher = new JTextField(10);
	private JButton decryption_btn = new JButton("Decrypt");
	public static String alphapetic = "abcdefghijklmnopqrstuvwxyz";
	public AutoKeyCipher()
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
    public static String Encryption(String plainText, String keyPhrase) 
    {
    	int len = plainText.length(); 
        String newKey = keyPhrase.concat(plainText); 
        newKey = newKey.substring(0, newKey.length() - keyPhrase.length()); 
        String encryptMsg = ""; 
        for (int x = 0; x < len; x++) { 
            int first = alphapetic.indexOf(plainText.charAt(x)); 
            int second = alphapetic.indexOf(newKey.charAt(x)); 
            int total = (first + second) % 26; 
            encryptMsg += alphapetic.charAt(total); 
        } 
        return encryptMsg; 
    }
    public static String Decryption(String cipherText, String keyPhrase) 
    {
    	String currentKey = keyPhrase; 
        String decryptMsg = ""; 
        for (int x = 0; x < cipherText.length(); x++) { 
            int get1 = alphapetic.indexOf(cipherText.charAt(x)); 
            int get2 = alphapetic.indexOf(currentKey.charAt(x)); 
            int total = (get1 - get2) % 26; 
            total = (total < 0) ? total + 26 : total; 
            decryptMsg += alphapetic.charAt(total); 
            currentKey += alphapetic.charAt(total); 
        } 
        return decryptMsg; 
    }
}
