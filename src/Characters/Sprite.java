package Characters;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Sprite {
	
	private int x;
	private int y;
	
	private int count = 0;
	
	private BufferedImage image;
	private BufferedImage image1;
	private BufferedImage image2;
	
	public Sprite(int x, int y, String s1, String s2){
		this.x = x;
		this.y = y;
		
		try {
			image1 = ImageIO.read(getClass().getResourceAsStream(s1));
			image2 = ImageIO.read(getClass().getResourceAsStream(s1));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void update() {
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
	
	public Graphics2D animation(Graphics2D g, int x, int y) {
		this.x = x;
		this.y = y;
		
		update();
		g.drawImage(image, (int)x, (int)y, null);
		return g;
	}

}
