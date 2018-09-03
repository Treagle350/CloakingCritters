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
		sprite = new Sprite(x, y, "/Profiles/optimism.png", "/Profiles/optimism.png");
	}
	
	public void move(Graphics2D g) {		
		sprite.animation(g, x, y);
	}
	
}
