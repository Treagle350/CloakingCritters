package Characters;

/**
* @author Treagle350
**/

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import Assets.RadiusBoundary;

public class characterEntity {
	
	int sanity;
	
	public int x, y;
	
	Mood mood;
	Mood nature;
	BufferedImage image;
	Sprite sprite;
	
	public RadiusBoundary personalSpace;

	public characterEntity(int x, int y){
		sanity = 100;
		personalSpace = new RadiusBoundary();
		
		this.x = x;
		this.y = y;
		
		mood = new Mood();
		nature = new Mood();
		sprite = new Sprite(x, y, "/Characters/Blob1.png", "/Characters/Blob2.png", "/Characters/Blob3.png", "/Characters/Blob4.png");
	
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/Characters/emoticon_ectasy.png"));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void greet(Graphics2D g) {
		g.drawImage(image, (int)x, (int)y-13, null);
	}
	
	public characterEntity(int x, int y, String s){
		sanity = 100;
		
		this.x = x;
		this.y = y;
		
		mood = new Mood();
		nature = new Mood();
		sprite = new Sprite(x, y, s, s, s, s);
	}
	
	public void add(Graphics2D g) {		
		sprite.animation(g, x, y);
	}
	
}
