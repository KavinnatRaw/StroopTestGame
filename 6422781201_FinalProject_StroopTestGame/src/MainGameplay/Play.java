package MainGameplay;
import StDefaultComponent.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;

public class Play extends BaseUI implements ActionListener {
	
	StPanel TPpanel3 = new StPanel();
	StPanel CTpanel2 = new StPanel();
	StPanel BTTMpanel3 = new StPanel();
	StPanel BTpanel2 = new StPanel();
	
	StButton backBT2 = new StButton("BACK");
	StButton redBT = new StButton("RED");
	StButton blueBT = new StButton("BLUE");
	StButton pinkBT = new StButton("PINK");
	StButton greenBT = new StButton("GREEN");
	StButton orangeBT = new StButton("ORANGE");
	StButton purpleBT = new StButton("PURPLE");
	
	StLabel shownLB = new StLabel();
	
	public static int time = 30;
	public static double allscore = 0;
	
	public static int score = (int)allscore;
	
	int correctAnswer;
	
	String[] txtArray = {"RED","BLUE","PINK","GREEN","ORANGE","PURPLE"};
	Color[] colorArray = {Color.red,StColor.bleu,StColor.rosa,Color.green,StColor.orange,StColor.lila};
	StButton[] btArray = {redBT,blueBT,pinkBT,greenBT,orangeBT,purpleBT};

	Random random = new Random();
	
	Timer timer = new Timer(1000, this);
	
	Play() {
		correctAnswer = random.nextInt(6);
		timer.start();
		this.add(TPpanel3, BorderLayout.NORTH);
		TPpanel3.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		TPpanel3.add(backBT2);
			backBT2.setBackground(btColor);
			backBT2.setForeground(txtbtColor);
			backBT2.addActionListener(this);
		this.add(CTpanel2, BorderLayout.CENTER);
			CTpanel2.setLayout(new FlowLayout(FlowLayout.CENTER,0,95));
			CTpanel2.add(shownLB);
			shownLB.setText(txtArray[random.nextInt(6)]);
			shownLB.setForeground(colorArray[correctAnswer]);
		this.add(BTTMpanel3, BorderLayout.SOUTH);
		BTTMpanel3.setLayout(new FlowLayout(FlowLayout.CENTER,0,55));
		BTTMpanel3.add(BTpanel2);
			BTpanel2.setLayout(new GridLayout(2,3,0,0));
			BTpanel2.add(redBT);
				redBT.setBackground(btColor);
				redBT.setForeground(txtbtColor);
				redBT.setFont(new Font(Font.SANS_SERIF,Font.BOLD,75));
				redBT.addActionListener(this);
			BTpanel2.add(blueBT);
				blueBT.setBackground(btColor);
				blueBT.setForeground(txtbtColor);
				blueBT.setFont(new Font(Font.SANS_SERIF,Font.BOLD,75));
				blueBT.addActionListener(this);
			BTpanel2.add(pinkBT);
				pinkBT.setBackground(btColor);
				pinkBT.setForeground(txtbtColor);
				pinkBT.setFont(new Font(Font.SANS_SERIF,Font.BOLD,75));
				pinkBT.addActionListener(this);
			BTpanel2.add(greenBT);
				greenBT.setBackground(btColor);
				greenBT.setForeground(txtbtColor);
				greenBT.setFont(new Font(Font.SANS_SERIF,Font.BOLD,75));
				greenBT.addActionListener(this);
			BTpanel2.add(orangeBT);
				orangeBT.setBackground(btColor);
				orangeBT.setForeground(txtbtColor);
				orangeBT.setFont(new Font(Font.SANS_SERIF,Font.BOLD,75));
				orangeBT.addActionListener(this);
			BTpanel2.add(purpleBT);
				purpleBT.setBackground(btColor);
				purpleBT.setForeground(txtbtColor);
				purpleBT.setFont(new Font(Font.SANS_SERIF,Font.BOLD,75));
				purpleBT.addActionListener(this);
			
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(bgColor);
			g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(StColor.weiﬂ);
			g.fillRect(0, 115, 1280, 250);
		g.setColor(txtColor);
			g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 50));
			g.drawString("SCORE: "+score,1000,55);
			
			g.drawString(""+time,620,55);
	
	}
			
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == backBT2) {
			swapWindows(new Menu());
			score = 0;
			time = 30;
			timer.stop();
		}
		else if (e.getSource() == timer) {
			time--;
			repaint();
			if (time == 0) {
				swapWindows(new GameOver());
				score = 0;
				time = 30;
				timer.stop();
			}
		}
		else if (e.getSource() == btArray[correctAnswer]) {
			score = Math.addExact(score, 1);
			timer.stop();
			swapWindows(new Play());
		}
		else {
			swapWindows(new GameOver());
			score = 0;
			time = 30;
			timer.stop();
		}
	}
}
	
