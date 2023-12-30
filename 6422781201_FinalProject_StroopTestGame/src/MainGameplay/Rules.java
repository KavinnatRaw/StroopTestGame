package MainGameplay;
import StDefaultComponent.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends BaseUI implements ActionListener {
		StPanel TPpanel2 = new StPanel();
		StPanel CTpanel = new StPanel();
		StPanel Bttmpanel2 = new StPanel();
		
		StButton backBT = new StButton("BACK");
		private StButton learnBT = new StButton("Learn more about SCWT!");
		private StButton exBT1 = new StButton("GREEN");
		private StButton exBT2 = new StButton("BLUE");
		
		
		private StLabel rulesLB1 = new StLabel("Stroop Test Game is based on neuropsychological test called Stroop Color Word Test (SCWT)");
		private StLabel rulesLB2 = new StLabel("Rules of this game are very simple");
		private StLabel rulesLB3 = new StLabel("if shows,");
		private StLabel rulesLB4 = new StLabel("CHOOSES,");
		private StLabel rulesLB5 = new StLabel("NOT,");
		private StLabel rulesLB6 = new StLabel("Color and words will be randomized until you select the wrong answer,");
		private StLabel rulesLB7 = new StLabel("the game will eventually end and your scores will be shown!");
		
	public Rules() {
		this.add(TPpanel2, BorderLayout.NORTH);
			TPpanel2.setLayout(new FlowLayout(FlowLayout.LEFT,10,25));
			TPpanel2.add(backBT);
				backBT.setBackground(btColor);
				backBT.setForeground(txtbtColor);
				backBT.addActionListener(this);
		this.add(CTpanel, BorderLayout.CENTER);;
			CTpanel.setLayout(null);
				CTpanel.add(rulesLB1);
					rulesLB1.setForeground(txtColor);
					rulesLB1.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
					rulesLB1.setBounds(0, 0, 1280, 50);
				CTpanel.add(rulesLB2);
					rulesLB2.setForeground(txtColor);
					rulesLB2.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
					rulesLB2.setBounds(5, 35, 1280, 50);
				CTpanel.add(rulesLB3);
					rulesLB3.setForeground(rulesColor);
					rulesLB3.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 30));
					rulesLB3.setBounds(350, 80, 250, 50);
				CTpanel.add(rulesLB4);
					rulesLB4.setForeground(rulesColor);
					rulesLB4.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 30));
					rulesLB4.setBounds(350, 180, 250, 50);
				CTpanel.add(rulesLB5);
					rulesLB5.setForeground(rulesColor);
					rulesLB5.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 30));
					rulesLB5.setBounds(385, 280, 250, 50);
				CTpanel.add(rulesLB6);
					rulesLB6.setForeground(txtColor);
					rulesLB6.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
					rulesLB6.setBounds(0, 395, 1280, 50);
				CTpanel.add(rulesLB7);
					rulesLB7.setForeground(txtColor);
					rulesLB7.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
					rulesLB7.setBounds(0, 430, 1280, 50);
				CTpanel.add(exBT1);
					exBT1.setEnabled(false);
					exBT1.setBounds(550,230,175,50);
				CTpanel.add(exBT2);
					exBT2.setEnabled(false);
					exBT2.setBounds(550,330,175,50);
		this.add(Bttmpanel2, BorderLayout.SOUTH);
			Bttmpanel2.setLayout(new FlowLayout(FlowLayout.RIGHT,10,25));
			Bttmpanel2.add(learnBT);
				learnBT.setBackground(btColor);
				learnBT.setForeground(txtbtColor);
				learnBT.addActionListener(this);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(bgColor);
			g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(StColor.weiﬂ);
			g.fillRect(510,5,250,95);
			g.fillRect(300,190,650,305);
		g.setColor(rulesColor);
			g.setFont(new Font(Font.MONOSPACED, Font.BOLD, 75));
				g.drawString("RULES", 525, 75);
		g.setColor(Color.green);
			g.setFont(new Font(Font.SANS_SERIF,Font.BOLD,60));
				g.drawString("BLUE", 550, 280);
			
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == backBT) {
			swapWindows(new Menu());
		}
		if (e.getSource() == learnBT) {
			new MiniFrame();
		}
	}
	
}