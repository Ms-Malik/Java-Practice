package keyless_cipher;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
public class MMain extends JFrame {
	public MMain ()
	{
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		setTitle("Multiplicative Encrypt and Decrypt");
		setSize((int)width/2,(int)height/2);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(tabbedPane());
	}
	public JTabbedPane tabbedPane(){
		JTabbedPane MainContainer = new JTabbedPane();
		MainContainer.add("Multiplicative",new Multiplicative().createPanel());
		return MainContainer;
	}
}