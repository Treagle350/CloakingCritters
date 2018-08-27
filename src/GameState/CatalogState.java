package GameState;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;

import TileMap.Background;

public class CatalogState extends GameState {
	
	private Background bg;
	private Font font;
	private Font subFont;
	final int DIGESTABLE = 25;

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

	private ArrayList<String> stringPrintParser(String string) {
		int len = 0;
		int len2 = 99;
		int index = 0;
		int count = 0;
		ArrayList<String> stringArray = new ArrayList<String>();
		
		String digestableString;
		String[] subString;
		
		subString = string.split(" ");
		
		while(index > -1) {
			digestableString = "";
			string = string.substring(index);
			while(len < DIGESTABLE && len2 > DIGESTABLE) {
				digestableString = digestableString + subString[count] + " ";
				len = digestableString.length();
				count = count + 1;
				len2 = string.length();
			}
			len = 0;
			index = digestableString.lastIndexOf(" ");
			stringArray.add(digestableString);
			}
		return stringArray;
	}
	
	private String stringStuffer(String string) {
		int diff = string.length()%25;
		while(diff != 0) {
			string = string + " ";
			diff = string.length()%25;
		}
		return string;
	}
	
	@Override
	public void draw(Graphics2D g) {
		bg.draw(g);
		
		g.setColor(Color.BLACK);
		g.setFont(font);
		g.drawString("Cloaking Critters", 30, 30);
		
		String string;
		String string2;
		String newLine;
		newLine = "                          ";
		string = ("Hello, this is the catalog page of Cloaking Critters.") + newLine + ("Feel free to browse to your heart's content.") + newLine + newLine + ("Made by Treagle350");
		string = stringStuffer(string);
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
		
		String printString;
		ArrayList<String> stringArray;
		
		stringArray = stringPrintParser(string);
		
		g.setFont(subFont);
		
		for(int i = 0;i<stringArray.size();i++) {
			printString = stringArray.get(i);
			g.drawString(printString, 30, 50 + (10*i));
		}
		
		String printString2;
		ArrayList<String> stringArray2;
		
		//string2 = ("I came up with this theory to try to figure some things out regarding emotions.") + newLine + ("I mainly ended up using Robert Plutchik's theory to come up with this.");// + newLine + ("Hence why the following should only be seen as my stance on the matter, a stance which you are free to contest."); + newLine + ("Please do therefore take it with a grain of salt.");
		
		stringArray2 = stringPrintParser(string);
		
		for(int i = 0;i<stringArray2.size();i++) {
			printString2 = stringArray2.get(i);
			g.drawString(printString2, 167, 50 + (10*i));
		}
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
