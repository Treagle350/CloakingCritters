package GameState;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import TileMap.Background;

/**
* @author Treagle350
**/

public class MenuState extends GameState {
	
	private Background bg;
	
	private int currentChoice;
	private String[] options = {
			"Start",
			"Help",
			"Quit"
	};
	
	private Color titleColor;
	private Font titleFont;
	
	private Font font;
	private Font subFont;
	
	FontMetrics submetrics;
	
	public MenuState(GameStateManager gsm) {
		this.gsm = gsm;
		
		try {
			bg = new Background("/menubg1.png","/menubg2.png", 200);
			
			titleColor = new Color(128, 0, 0);
			titleFont = new Font("Century Gothic", Font.PLAIN, 28);
		
			font = new Font("Arial", Font.PLAIN, 12);
			subFont = new Font("Arial", Font.PLAIN, 9);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void init() {}
	public void update() {
		//bg.update();
	}
	public void draw(Graphics2D g) {
		bg.draw(g);
		
		g.setColor(titleColor);
		g.setFont(titleFont);
		g.drawString("Cloaking Critters", 60, 70);
		
		g.setFont(font);
		for(int i = 0; i < options.length; i++) {
			if(i == currentChoice) {
				g.setColor(Color.BLACK);
			}
			else {
				g.setColor(Color.RED);
			}
			g.drawString(options[i], 145, 140 + i * 15);
		}
		g.setFont(subFont);
		submetrics = g.getFontMetrics(subFont);
		g.setColor(Color.RED);
		String author = "© Treagle350";
		g.drawString(author, 160 - (submetrics.stringWidth(author)/2), 210);
		g.drawString("Disclaimer : All information provided by this program is licensed under", 10, 220);
		g.drawString("the Creative Commons Attribution-ShareAlike 4.0 International License.", 10, 230);
	}
	private void select() {
		if(currentChoice == 0) {
			gsm.setState(GameStateManager.LEVELSTATE);
		}
		if(currentChoice == 1) {
			gsm.setState(GameStateManager.HELPSTATE);
		}
		if(currentChoice == 2) {
			System.exit(0);
		}
	}
	
	public void keyPressed(int k) {
		if(k == KeyEvent.VK_ENTER) {
			select();
		}
		if(k == KeyEvent.VK_UP) {
			currentChoice--;
			if(currentChoice == -1) {
				currentChoice = options.length - 1;
			}
		}
		if(k == KeyEvent.VK_DOWN) {
			currentChoice++;
			if(currentChoice == options.length) {
				currentChoice = 0;
			}
		}
	}
	public void keyReleased(int k) {}
	
}
