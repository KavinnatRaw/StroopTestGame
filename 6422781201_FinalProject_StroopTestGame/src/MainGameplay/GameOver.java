package MainGameplay;
import StDefaultComponent.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class GameOver extends BaseUI implements ActionListener {
	
	StPanel BTTMpanel3 = new StPanel();
	StPanel LBpanel = new StPanel();
	StPanel BTpanel2 = new StPanel();
	
	StLabel scoreLB = new StLabel("Total Score: "+Play.score);
	StButton retryBT = new StButton("RETRY");
	StButton menuBT = new StButton("MAIN MENU");
	
	BufferedImage img;
	BufferedImage[] imgArray = new BufferedImage[15];
	
	
	Random random = new Random();
	
	GameOver() {
		this.add(LBpanel, BorderLayout.CENTER);
		LBpanel.setLayout(null);
		LBpanel.add(scoreLB);
			scoreLB.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 50));
			scoreLB.setForeground(txtColor);
			scoreLB.setBounds(120,15,1000,1000);
		this.add(BTTMpanel3,BorderLayout.SOUTH);
			BTTMpanel3.setLayout(new FlowLayout(FlowLayout.CENTER,0,10));
			BTTMpanel3.add(BTpanel2);
				BTpanel2.setLayout(new GridLayout(2,1));
				BTpanel2.check();
					BTpanel2.add(retryBT);
						retryBT.setBackground(btColor);
						retryBT.setForeground(txtbtColor);
						retryBT.addActionListener(this);
					BTpanel2.add(menuBT);
						menuBT.setBackground(btColor);
						menuBT.setForeground(txtbtColor);
						menuBT.addActionListener(this);
					
		try {
			imgArray[0] = ImageIO.read(new File(".//ALLimages//images//gj1.jpg"));
			imgArray[1] = ImageIO.read(new File(".//ALLimages//images//gj2.jpg"));
			imgArray[2] = ImageIO.read(new File(".//ALLimages//images//gj3.jpg"));
			imgArray[3] = ImageIO.read(new File(".//ALLimages//images//gj4.jpg"));
			imgArray[4] = ImageIO.read(new File(".//ALLimages//images//gj5.jpg"));
			imgArray[5] = ImageIO.read(new File(".//ALLimages//images//gj6.jpg"));
			imgArray[6] = ImageIO.read(new File(".//ALLimages//images//gj7.jpg"));
			imgArray[7] = ImageIO.read(new File(".//ALLimages//images//gj8.jpg"));
			imgArray[8] = ImageIO.read(new File(".//ALLimages//images//gj9.jpg"));
			imgArray[9] = ImageIO.read(new File(".//ALLimages//images//gj10.jpg"));
			imgArray[10] = ImageIO.read(new File(".//ALLimages//images//bruh1.jpg"));
			imgArray[11] = ImageIO.read(new File(".//ALLimages//images//bruh2.jpg"));
			imgArray[12] = ImageIO.read(new File(".//ALLimages//images//bruh3.jpg"));
			imgArray[13] = ImageIO.read(new File(".//ALLimages//images//bruh4.jpg"));
			imgArray[14] = ImageIO.read(new File(".//ALLimages//images//bruh5.jpg"));
		
		} 
		
		catch (IOException ex) {
		
		}
			
		img = imgArray[random.nextInt(10)];
		if (Play.score == 0) {
			img = imgArray[random.nextInt(10,14)];
		}
	
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(bgColor);
			g.fillRect(0, 0, getWidth(), getHeight());
		g.drawImage(img, 300, 50, 650, 425, this);
			
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == retryBT) {
			swapWindows(new Play());
		}
		if (e.getSource() == menuBT) {
			swapWindows(new Menu());
		}
		
	}
	
}
