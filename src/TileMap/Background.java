package TileMap;

import Main.GamePanel;

import java.awt.*;
import java.awt.image.*;
import javax.imageio.ImageIO;

import Main.GamePanel;

public class Background {
	
	private BufferedImage image;
	private BufferedImage image1;
	private BufferedImage image2;
	
	private double x;
	private double y;
	private int count = 0;
	
	private double moveScale;
	
	public Background(String s1,String s2) {
		try {
			image1 = ImageIO.read(getClass().getResourceAsStream(s1));
			image2 = ImageIO.read(getClass().getResourceAsStream(s2));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
		public void setPosition(double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		public void update() {
			switch(count) {
				case 0:
					image = image1;
					break;
				case 1:
					image = image2;
					break;
				default:
					count = 0;
					break;
			}
			count = count + 1;
			
			if(count > 1) {
				count = 0;
			}
		}
		
		public void draw(Graphics2D g) {
			g.drawImage(image, (int)x, (int)y, null);
		}
		
}
