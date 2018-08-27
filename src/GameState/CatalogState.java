package GameState;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.util.Arrays;

import TileMap.Background;

public class CatalogState extends GameState {
	
	private Background bg;
	private Font font;
	private Font subFont;
	
	private int currentChoice;
	private String[] options = {
			"Love",
			"Submission",
			"Awe",
			"Disapproval",
			"Remorse",
			"Contempt",
			"Aggression",
			"Optimism"
	};
	
	public CatalogState(GameStateManager gsm) {
		this.gsm = gsm;
		
		try {
			bg = new Background("/Backgrounds/book1.png","/Backgrounds/book2.png");
		
			font = new Font("Century Gothic", Font.PLAIN, 12);
			subFont = new Font("Century Gothic", Font.PLAIN, 10);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void init() {}

	@Override
	public void update() {
		bg.update();
	}

	private void stringPrintParser(String string, Graphics2D g) {
		int[] spaceIndex;
		int[] pointIndex;
		boolean fillFlag;
		
		int len;
		int len2 = 1;
		int digestable;
		int limit;
		int index = 0;
		int count = 0;
		digestable = 26;
		len = string.length();
		
		int i = 0;
		
		g.setFont(subFont);
		String digestableString;
		String[] subString;
		
		while(index > -1) {
			//1 sentence
			string = string.substring(index);
			subString = string.split(" ");
			digestableString = "";
			while(len2 < digestable) {
				digestableString = digestableString + subString[count] + " ";
				len2 = digestableString.length();
				count = count + 1;
			}
			index = digestableString.lastIndexOf(" ");
			if(index > 0) {
				index = digestableString.lastIndexOf(" ");//replace
				g.drawString(digestableString, 30, 50 + (10*i));
				System.out.println(index);
				i = i + 1;
			}
		}
		/*
		for(int i = 0;i<limit;i++) {
			digestableString = string.substring(i*digestable, (i+1)*digestable);
			g.drawString(digestableString, 30, 50 + (10*i));
		}*/
	}
	
	@Override
	public void draw(Graphics2D g) {
		bg.draw(g);
		
		g.setColor(Color.BLACK);
		g.setFont(font);
		g.drawString("Cloaking Critters", 30, 30);
		
		String string;
		string = "Hello, this is the catalog page of Cloaking Critters. Feel free to browse to your heart's content.";
		
		//Emotions are something special, wouldn't you agree ?
		//I mean, have you ever wondered about their nature ? What happens under the hood of it all ?
		//Because that's what I ended up doing. I came up with this theory to try to figure some things out.
		//I started my research on various forums and moved on from there.
		//After a while I came into contact with Robert Plutchik's work, which significantly helped to shape this theory.
		//What I have now is an explanation for why emotions work the way they do.
		//However there are still a mountain of questions ahead, that all need to tackled.
		//That's why if you want to join you're more than welcome to join the project.
		//There should always be room for different visions to shine heir light upon this matter.
		//
		//- Treagle350
		
		stringPrintParser(string, g);
		
	}

	@Override
	public void keyPressed(int k) {
		if(k == KeyEvent.VK_LEFT) {
			currentChoice--;
			if(currentChoice == -1) {
				currentChoice = options.length - 1;
			}
		}
		if(k == KeyEvent.VK_RIGHT) {
			currentChoice++;
			if(currentChoice == options.length) {
				currentChoice = 0;
			}
		if(k == KeyEvent.VK_DOWN) {
			gsm.setState(GameStateManager.MENUSTATE);
			System.out.println("down pressed");//not executed => y ?
		}
		}
	}

	@Override
	public void keyReleased(int k) {
		// TODO Auto-generated method stub
	}

}
