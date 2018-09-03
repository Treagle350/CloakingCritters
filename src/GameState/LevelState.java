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

		player = new characterEntity(50, 50);
		bg = new Background("/BackGrounds/level1.png","/BackGrounds/level2.png");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		bg.update();
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
		int delta1 = 1;
		int delta2 = 2;
		
		if(k == KeyEvent.VK_LEFT) {
			/*for(int i = delta1;i<delta2;i++) {
				player.x = player.x - i;
			}*/
			player.x = player.x - delta2;
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
