package keyless_cipher;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
public class AffineMain extends JFrame {
	public AffineMain ()
	{
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		setTitle("Affine Encrypt and Decrypt");
		setSize((int)width/2,(int)height/2);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(tabbedPane());
	}
	public JTabbedPane tabbedPane(){
		JTabbedPane MainContainer = new JTabbedPane();
		MainContainer.add("Affine",new affine().createPanel());
		return MainContainer;
	}
}