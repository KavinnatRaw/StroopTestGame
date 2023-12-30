package MainGameplay;
import StDefaultComponent.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends BaseUI implements KeyListener {
	
	StFrame frame = new StFrame("6422781201, KAVINNAT RAWANGGIJ - STROOP TEST GAME");
	
	public MainFrame(){
		frame.add(this);
		frame.setFocusable(true);
		frame.addKeyListener(this);
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(bgColor);
			g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(StColor.weiﬂ);
			g.fillRect(0, 85, 1280, 500);
		g.setColor(logoColor);
			g.setFont(new Font(Font.MONOSPACED, Font.BOLD|Font.ITALIC, 150));
			g.drawString("STROOP", 150, 235);
			g.drawString("TEST", 720, 235);
			g.setFont(new Font(Font.MONOSPACED, Font.BOLD|Font.ITALIC, 275));
			g.drawString("GAME", 180, 435);
			g.setFont(new Font(Font.MONOSPACED, Font.BOLD|Font.ITALIC, 55));
			g.drawString("DES103: FINAL PROJECT", 155, 510);
			g.setFont(new Font(Font.MONOSPACED, Font.BOLD, 35));
			g.drawString("PRESS ANY KEY TO CONTINUE...", 325, 640);
		g.setColor(bulbColor1);
			g.fillOval(905, 270, 175, 175);
			g.fillOval(1090, 345, 12, 12);
			g.fillOval(925, 492, 12, 12);
			g.fillArc(1010,250,180,180,55,20);
			g.fillArc(835,400,180,180,115,20);
		g.setColor(bulbColor2);
			g.fillOval(916,	282, 150, 150);
			g.setColor(filamentColor1)	;
			g.setFont(new Font(Font.SERIF, Font.PLAIN, 175));
			g.drawString("?", 952, 450);
		g.setColor(filamentColor2);
			g.fillRoundRect(957, 432, 70, 15, 15, 15);
			g.fillRoundRect(957, 444, 70, 15, 15, 15);
			g.fillRoundRect(957, 456, 70, 15, 15, 15);
			g.fillRoundRect(957, 468, 70, 15, 15, 15);
			g.fillRoundRect(957, 480, 70, 15, 15, 15);
			g.fillRoundRect(965, 475, 55, 30, 20, 20);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		swapWindows(new Menu());
	}

	@Override
	public void keyReleased(KeyEvent e) {}
}
