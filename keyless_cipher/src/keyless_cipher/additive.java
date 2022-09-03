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
public class additive
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
	public additive()
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
	public String encrypt(String plaintext,String s)
	{
		int shift=Integer.valueOf(s);
		String ciphertext = "";
        char alphabet;
		for(int i=0; i < plaintext.length();i++) 
        {
             // Shift one character at a time
            alphabet = plaintext.charAt(i);
            
            // if alphabet lies between a and z 
            if(alphabet >= 'a' && alphabet <= 'z') 
            {
             // shift alphabet
             alphabet = (char) (alphabet + shift);
             // if shift alphabet greater than 'z'
             if(alphabet > 'z') {
                // reshift to starting position 
                alphabet = (char) (alphabet+'a'-'z'-1);
             }
             ciphertext = ciphertext + alphabet;
            }
            
            // if alphabet lies between 'A'and 'Z'
            else if(alphabet >= 'A' && alphabet <= 'Z') {
             // shift alphabet
             alphabet = (char) (alphabet + shift);    
                
             // if shift alphabet greater than 'Z'
             if(alphabet > 'Z') {
                 //reshift to starting position 
                 alphabet = (char) (alphabet+'A'-'Z'-1);
             }
             ciphertext = ciphertext + alphabet;
            }
            else {
             ciphertext = ciphertext + alphabet;   
            }
    }
        return ciphertext;
	}
	public String decrypt(String plaintext,String s)
	{
		int shift=Integer.valueOf(s);
		String ciphertext = "";
        char alphabet;
        String decryptMessage = "";
        for(int i=0; i < ciphertext.length();i++)  

        {
            // Shift one character at a time
            alphabet = ciphertext.charAt(i);
            // if alphabet lies between a and z 
            if(alphabet >= 'a' && alphabet <= 'z')
            {
                // shift alphabet
                alphabet = (char) (alphabet - shift);
            
                // shift alphabet lesser than 'a'
                if(alphabet < 'a') {
                    //reshift to starting position 
                    alphabet = (char) (alphabet-'a'+'z'+1);
                }
                decryptMessage = decryptMessage + alphabet;
            }    
                // if alphabet lies between A and Z
            else if(alphabet >= 'A' && alphabet <= 'Z')
            {
             // shift alphabet
                alphabet = (char) (alphabet - shift);
                
                //shift alphabet lesser than 'A'
                if (alphabet < 'A') {
                    // reshift to starting position 
                    alphabet = (char) (alphabet-'A'+'Z'+1);
                }
                decryptMessage = decryptMessage + alphabet;            
            }
            else 
            {
             decryptMessage = decryptMessage + alphabet;            
            } 
        }
        return decryptMessage;
	}
}
