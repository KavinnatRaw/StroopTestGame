package MainGameplay;
import StDefaultComponent.*;
import javax.swing.*;
import java.awt.*;

public class MiniFrame extends JPanel {

	JFrame mframe = new JFrame("The Stroop Color Word Test & The Stroop Effect Explained!");
	
	StPanel minipanel = new StPanel();
	
	private StLabel miniLB1 = new StLabel("The Stroop Color Word Test (SCWT)");
	private StLabel miniLB2 = new StLabel("The Stroop Color and Word Test (SCWT) is a neuropsychological test");
	private StLabel miniLB3 = new StLabel("extensively used to assess the ability to inhibit cognitive interference");
	private StLabel miniLB4 = new StLabel("that occurs when the processing of a specific stimulus feature impedes");
	private StLabel miniLB5 = new StLabel("the simultaneous processing of a second stimulus attribute,");
	private StLabel miniLB6 = new StLabel("well-known as the Stroop Effect.");
	private StLabel miniLB7 = new StLabel("The Stroop Effect");
	private StLabel miniLB8 = new StLabel("The Stroop effect is a simple phenomenon that reveals a lot");
	private StLabel miniLB9 = new StLabel("about how the how the brain processes information.");
	private StLabel miniLB10 = new StLabel("First described in the 1930s by psychologist John Ridley Stroop,");
	private StLabel miniLB11 = new StLabel("the Stroop effect is our tendency to experience difficulty naming");
	private StLabel miniLB12 = new StLabel("a physical color when it is used to spell the name of a different color.");

	
	private StLabel miniLB13 = new StLabel("CREDIT SOURCES");
	private StLabel miniLB14 = new StLabel("https://lesley.edu/article/what-the-stroop-effect-reveals-about-our-minds");
	private StLabel miniLB15 = new StLabel("& Article from https://www.frontiersin.org");
	
	
	
	public MiniFrame(){
		mframe.add(this);
		mframe.setVisible(true);
		mframe.setResizable(false);
		mframe.setSize(650,450);
		mframe.setLocationRelativeTo(null);
		mframe.setDefaultCloseOperation(StFrame.DISPOSE_ON_CLOSE);
		mframe.getContentPane().setBackground(StColor.Calamansi);
		mframe.add(minipanel);
			minipanel.setLayout(null);
				minipanel.add(miniLB1);
					miniLB1.setFont(new Font(Font.MONOSPACED, Font.BOLD, 22));
					miniLB1.setBounds(0,15,650,20);
				minipanel.add(miniLB2);
					miniLB2.setFont(new Font(Font.MONOSPACED, Font.BOLD, 14));
					miniLB2.setBounds(0,45,650,20);
				minipanel.add(miniLB3);
					miniLB3.setFont(new Font(Font.MONOSPACED, Font.BOLD, 14));
					miniLB3.setBounds(0,65,650,20);
				minipanel.add(miniLB4);
					miniLB4.setFont(new Font(Font.MONOSPACED, Font.BOLD, 14));
					miniLB4.setBounds(0,85,650,20);
				minipanel.add(miniLB5);
					miniLB5.setFont(new Font(Font.MONOSPACED, Font.BOLD, 14));
					miniLB5.setBounds(0,105,650,20);
				minipanel.add(miniLB6);
					miniLB6.setFont(new Font(Font.MONOSPACED, Font.BOLD, 14));
					miniLB6.setBounds(0,125,650,20);
				minipanel.add(miniLB7);
					miniLB7.setFont(new Font(Font.MONOSPACED, Font.BOLD, 22));
					miniLB7.setBounds(0,165,650,20);
				minipanel.add(miniLB8);
					miniLB8.setFont(new Font(Font.MONOSPACED, Font.BOLD, 14));
					miniLB8.setBounds(0,195,650,20);
				minipanel.add(miniLB9);
					miniLB9.setFont(new Font(Font.MONOSPACED, Font.BOLD, 14));
					miniLB9.setBounds(0,215,650,20);
				minipanel.add(miniLB10);
					miniLB10.setFont(new Font(Font.MONOSPACED, Font.BOLD, 14));
					miniLB10.setBounds(0,240,650,20);
				minipanel.add(miniLB11);
					miniLB11.setFont(new Font(Font.MONOSPACED, Font.BOLD, 14));
					miniLB11.setBounds(0,260,650,20);
				minipanel.add(miniLB12);
					miniLB12.setFont(new Font(Font.MONOSPACED, Font.BOLD, 14));
					miniLB12.setBounds(0,280,650,20);
					
				minipanel.add(miniLB13);
					miniLB13.setFont(new Font(Font.MONOSPACED, Font.BOLD, 22));
					miniLB13.setBounds(0,330,650,20);
				minipanel.add(miniLB14);
					miniLB14.setFont(new Font(Font.MONOSPACED, Font.BOLD, 12));
					miniLB14.setBounds(0,360,650,20);
				minipanel.add(miniLB15);
					miniLB15.setFont(new Font(Font.MONOSPACED, Font.BOLD, 12));
					miniLB15.setBounds(0,380,650,20);
	}
	}
