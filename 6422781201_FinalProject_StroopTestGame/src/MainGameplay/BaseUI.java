package MainGameplay;
import StDefaultComponent.*;
import java.awt.*;

public class BaseUI extends StPanel {
	
	public static Color bgColor = StColor.beige;
	public static Color logoColor = StColor.schwarz;
	public static Color txtColor = StColor.schwarz;
	public static Color btColor = StColor.weiﬂ;
	public static Color txtbtColor = StColor.schwarz;
	public static Color rulesColor = StColor.schwarz;
	public static Color bulbColor1 = StColor.Rajah;
	public static Color bulbColor2 = StColor.Jasmine;
	public static Color filamentColor1 = StColor.schwarz;
	public static Color filamentColor2 = StColor.grau;
	
	BaseUI(){
		this.setLayout(new BorderLayout());
	}
	
	public void swapWindows(BaseUI newWindow) {
		this.removeAll();
		this.revalidate();
		this.add(newWindow);
	}
	public void print(String text) {
		System.out.println(text);
	}
}
