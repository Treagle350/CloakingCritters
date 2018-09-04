package Characters;

import java.awt.Graphics2D;

public class characterEntity {
	
	int sanity;
	
	public int x, y;
	
	Mood mood;
	Mood nature;
	
	Sprite sprite;

	public characterEntity(int x, int y){
		sanity = 100;
		
		this.x = x;
		this.y = y;
		
		mood = new Mood();
		nature = new Mood();
		sprite = new Sprite(x, y, "/Characters/Blob1.png", "/Characters/Blob2.png", "/Characters/Blob3.png", "/Characters/Blob4.png");
	}
	
	public void move(Graphics2D g) {		
		sprite.animation(g, x, y);
	}
	
}
