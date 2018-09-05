package Main;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Game {
	
	public static void main(String[] args) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int height = (int)screenSize.getHeight();
		int width = (int)screenSize.getWidth();
		int scale1 = height/240;
		int scale2 = width/320;
		int scale;
		
		if(scale1 < scale2) {
			scale = scale1;
		}else {
			scale = scale2;
		}
		
		scale = scale - 1;
		
		JFrame window = new JFrame("Cloaking Critters");
		window.setContentPane(new GamePanel(scale));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.pack();
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}

}
