package StDefaultComponent;
import javax.swing.*;
import java.awt.*;

public class StButton extends JButton{

	public StButton() {
		this("");
	}
	
	public StButton(String text) {
		super(text);
		this.setFont(new Font(Font.SANS_SERIF,Font.BOLD,35));
	}
}
