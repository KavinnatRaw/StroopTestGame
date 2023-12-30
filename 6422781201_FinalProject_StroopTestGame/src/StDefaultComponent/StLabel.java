package StDefaultComponent;
import javax.swing.*;
import java.awt.*;

public class StLabel extends JLabel {
	
	public StLabel() {
		this("");
	}
	
	public StLabel(ImageIcon image) {
		super(image);
	}
	
	public StLabel(String text) {
		super(text);
		this.setVerticalAlignment(JLabel.CENTER);
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 120));
	}
}
