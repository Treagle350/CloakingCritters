package TileMap;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.*;
import javax.imageio.ImageIO;
import javax.swing.Timer;

/**
* @author Treagle350
**/

public class Background implements ActionListener {
	
	private BufferedImage image;
	private BufferedImage image1;
	private BufferedImage image2;
	
	private double x;
	private double y;
	private boolean toggle;
	
	private Timer timer;
	
	public Background(String s1,String s2, int time) {
		
		toggle = true;
		
		try {
			image1 = ImageIO.read(getClass().getResourceAsStream(s1));
			image2 = ImageIO.read(getClass().getResourceAsStream(s2));
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
		timer = new Timer(time, this);
		timer.start();
	}
		public void setPosition(double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		private void update() {
			if(toggle) {
				image = image1;
			}else {
				image = image2;
			}
			toggle =! toggle;
		}
		
		public void draw(Graphics2D g) {
			g.drawImage(image, (int)x, (int)y, null);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			update();
		}
		
}
