package StDefaultComponent;
import javax.swing.*;

public class StFrame extends JFrame {
	
	public StFrame() {
		this("");
	}
	
	public StFrame(String text) {
		super(text);
		this.setSize(1280,720);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
