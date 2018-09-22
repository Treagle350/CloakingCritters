package GameState;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import Assets.Boundary;
import Characters.characterEntity;
import TileMap.Background;

/**
* @author Treagle350
**/

public class LevelState extends GameState {
	
	protected characterEntity player;
	private characterEntity npc;
	private Background bg;
	boolean happy = false;
	Boundary cliff;
	Font font;
	
	public LevelState(GameStateManager gsm) {
		this.gsm = gsm;

		npc = new characterEntity(70, 170, "/Characters/Blobfake.png");
		player = new characterEntity(70, 70);
		bg = new Background("/Backgrounds/levela.png","/Backgrounds/levelb.png", 350);
		
		cliff = new Boundary();
		
		try {
			font = new Font("Arial", Font.PLAIN, 9);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
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
		player.add(g);
		npc.add(g);
		if(happy) {
			player.greet(g);
		}
		g.setColor(Color.BLACK);
		g.setFont(font);
		g.drawString("Greet others with 'F'.", 70, 215);
	}

	//TODO : Automatic recalculation of bounds with resizing window !
	
	@Override
	public void keyPressed(int k) {
		// TODO Auto-generated method stub
		if(k == KeyEvent.VK_LEFT) {
			player.x = player.x - 2;
			player.x = cliff.checkBoundary(player.x, player.y)[0];
		}
		if(k == KeyEvent.VK_RIGHT) {
			player.x = player.x + 2;
			player.x = cliff.checkBoundary(player.x, player.y)[0];
		}
		if(k == KeyEvent.VK_UP ) {
			player.y = player.y - 2;
			player.y = cliff.checkBoundary(player.x, player.y)[1];
		}
		if(k == KeyEvent.VK_DOWN) {
			player.y = player.y + 2;
			player.y = cliff.checkBoundary(player.x, player.y)[1];
		}
		if(k == KeyEvent.VK_F) {
			happy = true;
		}else {
			happy = false;
		}
	}

	@Override
	public void keyReleased(int k) {
		// TODO Auto-generated method stub
		
	}
	
}
