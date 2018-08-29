package GameState;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import TileMap.Background;
import Text.Dialogue;

public class CatalogState extends GameState {
	
	private Background bg;
	private Font font;
	private Font subFont;
	final int DIGESTABLE = 23;
	int size = 0;

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
	
	@Override
	public void draw(Graphics2D g) {
		
		bg.draw(g);
		
		g.setColor(Color.BLACK);
		g.setFont(font);
		ArrayList<String> titles = new ArrayList<String>();
		String title1 = "Cloaking Critters";
		String title2 = "Emotions";
		String title3 = "Addressing conflict";
		
		Dialogue title = new Dialogue(DIGESTABLE, 30, 30, g, 12);
		title.dialogueMaker(title1);
		title.dialogueMaker(title2);
		title.dialogueMaker(title3);
		title.stringPrinter(currentChoice);
		
		String string1;
		String string1a;
		String string1b;
		String string2;
		String string2a;
		String string2b;
		String newLine;
		newLine = "                        ";
		
		string1 = ("Hello, this is the help page of Cloaking Critters.") + newLine + ("This is mainly intended as a fast way to get   aqcuinated with the    ideology behind this   videogame.            ") + newLine ;//("Here, you can browse through the different aspects of this theory.");
		string1 = string1 + ("Having said that,      this is a videogame that tries to explain the exact nature of emotions. Or more specifically, the things we end up doing to cover them up.");
		
		string1a = "Emotions are a means for two social entities to convey a hierarchical  standing toward one    another. Hence why     emotions, unlike logic, needs to be validated by external means.       ";
		string1a = string1a + newLine + ("To portray this using an example : Imagine an   angry customer yelling at a cashier over a    mispriced item.");
		
		string1b = ("As stated on the previous page, conflict is a reaction to a perceived social  imbalance.            ");
		string1b = string1b + newLine +("Hence when the social  imbalance gets resolved, the conflict dissolves." + newLine + "Therefore if one wants to stop conflict effectively you have to address the cause underneath, and  not the consequences   themselves.");
		
		String printString;
		ArrayList<String> stringArray;
		
		Dialogue page1 = new Dialogue(DIGESTABLE, 30, 50, g, 10);
		page1.dialogueMaker(string1);
		page1.dialogueMaker(string1a);
		page1.dialogueMaker(string1b);
		page1.stringPrinter(currentChoice);

		String printString2;
		ArrayList<String> stringArray2;
		
		string2 = ("This theory is based off Robert Plutchik's      representation of emotions.") + newLine + ("I ended up adding a few  things on top of his work, just to show how I ended up interpreting emotions.") + newLine + ("Hence why the following should only be seen as my stance on the matter.") + newLine;
		string2 = string2 + ("Feel free to browse around.") + newLine + ("- Treagle350");
		
		string2a = ("The customer in his anger, feels a sense of       righteousness entitled to him as he feels that the store wronged him.");
		string2a = string2a + newLine + ("By creating this conflict, he is trying to correct the social imbalance he sees. This by positioning himself above the cashier, in an effort to try to compensate for the lower position he received by the mispriced item.");
		
		string2b = ("To translate this to the previous example :    "+ newLine + "When the cashier       addresses the fact that the item was 'accidentally' mispriced and manages to convince the customer of that fact.            " + newLine +"The conflict will stop." + newLine + "Now that the basics are out of the way, let's delve deeper...");
		
		Dialogue page2 = new Dialogue(DIGESTABLE, 167, 50, g, 10);
		page2.dialogueMaker(string2);
		page2.dialogueMaker(string2a);
		size = page2.dialogueMaker(string2b);
		page2.stringPrinter(currentChoice);
	}

	@Override
	public void keyPressed(int k) {
		if(k == KeyEvent.VK_LEFT) {
			currentChoice--;
			if(currentChoice == -1) {
				currentChoice = size - 1;
			}
		}
		if(k == KeyEvent.VK_RIGHT) {
			currentChoice++;
			if(currentChoice == size) {
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
