package GameState;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import Characters.characterEntity;
import TileMap.Background;

public class LevelState extends GameState {
	
	protected characterEntity player;
	private Background bg;
	
	public LevelState(GameStateManager gsm) {
		this.gsm = gsm;

		player = new characterEntity(70, 70);
		bg = new Background("/Backgrounds/level1.png","/Backgrounds/level2.png");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		//bg.update();
	}

	@Override
	public void draw(Graphics2D g) {
		// TODO Auto-generated method stub
		bg.draw(g);
		player.move(g);
	}

	@Override
	public void keyPressed(int k) {
		// TODO Auto-generated method stub
		if(k == KeyEvent.VK_LEFT) {
			player.x = player.x - 2;
		}
		if(k == KeyEvent.VK_RIGHT) {
			player.x = player.x + 2;
		}
		if(k == KeyEvent.VK_UP) {
			player.y = player.y - 2;
		}
		if(k == KeyEvent.VK_DOWN) {
			player.y = player.y + 2;
		}
	}

	@Override
	public void keyReleased(int k) {
		// TODO Auto-generated method stub
		
	}
	
}
