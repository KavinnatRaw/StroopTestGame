package MainGameplay;
import javax.swing.*;
import StDefaultComponent.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends BaseUI implements ActionListener, ItemListener, KeyListener {
	
	String[] modeStrings = {"<<Theme>>","Light Mode","Dark Mode","Pastel Mode"};
	private JComboBox modeLists = new JComboBox(modeStrings);
	private StPanel TPpanel = new StPanel();
	private StPanel BTTMpanel = new StPanel();
	private StPanel CMBpanel = new StPanel();
	private StPanel BTpanel = new StPanel();
	private StButton playBT = new StButton("PLAY");
	private StButton rulesBT = new StButton("RULES");
	
	
	public Menu() {
		this.add(TPpanel, BorderLayout.NORTH);
			TPpanel.setLayout(new FlowLayout(FlowLayout.RIGHT,15,5));
			TPpanel.add(CMBpanel);
				CMBpanel.add(modeLists);
				modeLists.setForeground(txtColor);
				modeLists.setBackground(btColor);
					modeLists.addItemListener(this);
		this.add(BTTMpanel, BorderLayout.SOUTH);
			BTTMpanel.setLayout(new FlowLayout(FlowLayout.CENTER,0,50));
			BTTMpanel.add(BTpanel);
				BTpanel.setLayout(new GridLayout(2,1,0,20));
				BTpanel.add(playBT);
					playBT.setBackground(btColor);
					playBT.setForeground(txtbtColor);
					playBT.addActionListener(this);
				BTpanel.add(rulesBT);
					rulesBT.setBackground(btColor);
					rulesBT.setForeground(txtbtColor);
					rulesBT.addActionListener(this);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(bgColor);
			g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(StColor.weiﬂ);
			g.fillRect(0, 115, 1280, 340);
			g.fillOval(1125,15,15,15);
		g.setColor(logoColor);
			g.setFont(new Font(Font.MONOSPACED, Font.BOLD|Font.ITALIC, 125));
			g.drawString("STROOP", 215, 225);
			g.drawString("TEST", 700, 225);
			g.setFont(new Font(Font.MONOSPACED, Font.BOLD|Font.ITALIC, 225));
			g.drawString("GAME", 275, 375);
			g.setFont(new Font(Font.MONOSPACED, Font.BOLD|Font.ITALIC, 45));
			g.drawString("DES103: FINAL PROJECT", 255, 415);
		g.setColor(txtColor);
			g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
			g.drawString("Kavinnat Rawanggij (STUDENT ID: 6422781201)", 15, 30);
		g.setColor(bulbColor1);
			g.fillOval(850, 250, 125, 125);
			g.fillOval(982, 298, 8, 8);
			g.fillOval(880, 425, 8, 8);
			g.fillArc(910,218,160,160,50,17);
			g.fillArc(800,345,160,160,115,17);
		g.setColor(bulbColor2);
			g.fillOval(858,	257, 110, 110);
			g.setColor(filamentColor1)	;
			g.setFont(new Font(Font.SERIF, Font.PLAIN, 125));
			g.drawString("?", 883, 380);
		g.setColor(filamentColor2);
			g.fillRoundRect(885, 365, 55, 10, 8, 8);
			g.fillRoundRect(885, 375, 55, 10, 8, 8);
			g.fillRoundRect(885, 385, 55, 10, 8, 8);
			g.fillRoundRect(885, 395, 55, 10, 8, 8);
			g.fillRoundRect(898, 390, 27, 20, 13, 13);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == playBT) {
			swapWindows(new Play());
		}
		if (e.getSource() == rulesBT) {
			swapWindows(new Rules());
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (modeLists.getSelectedItem() == "Light Mode" && e.getStateChange() == 1) {
			bgColor = StColor.beige;
			logoColor = StColor.schwarz;
			txtColor = StColor.schwarz;
			btColor = StColor.weiﬂ;
			txtbtColor = StColor.schwarz;
			rulesColor = StColor.schwarz;
			bulbColor1 = StColor.Rajah;
			bulbColor2 = StColor.Jasmine;
			filamentColor1 = StColor.schwarz;
			filamentColor2 = StColor.grau;
			print("hi");
			swapWindows(new Menu());
		}
		if (modeLists.getSelectedItem() == "Dark Mode" && e.getStateChange() == 1) {
			bgColor = StColor.schwarz;
			logoColor = StColor.schwarz;
			txtColor = StColor.weiﬂ;
			btColor = StColor.Mintgr¸n;
			txtbtColor = StColor.weiﬂ;
			rulesColor = StColor.schwarz;
			bulbColor1 = StColor.Rajah;
			bulbColor2 = StColor.Jasmine;
			filamentColor1 = StColor.schwarz;
			filamentColor2 = StColor.grau;
			swapWindows(new Menu());
		}
		if (modeLists.getSelectedItem() == "Pastel Mode" && e.getStateChange() == 1) {
			bgColor = StColor.PalePink;
			logoColor = StColor.Vodka;
			txtColor = Color.WHITE;
			btColor = StColor.Vodka;
			txtbtColor = Color.WHITE;
			rulesColor = StColor.CherryBlossomPink;
			bulbColor1 = StColor.PeachYellow;
			bulbColor2 = StColor.Calamansi;
			filamentColor1 = StColor.SilverFoil;
			filamentColor2 = StColor.SilverSand;
			swapWindows(new Menu());
		}
	}
}
