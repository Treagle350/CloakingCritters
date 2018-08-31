package GameState;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import TileMap.Background;
import Text.Dialogue;

public class CatalogState extends GameState {
	
	private Background bg;
	final int DIGESTABLE = 23;
	int size = 0;
	
	private BufferedImage image;

	private int currentChoice;
	
	public CatalogState(GameStateManager gsm) {
		this.gsm = gsm;
		
		try {
			bg = new Background("/Backgrounds/book1.png","/Backgrounds/book2.png");
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
		String title1 = "Cloaking Critters";
		String title2 = "Emotions";
		String title3 = "Addressing conflict";
		String title4 = "Cloaked emotions";
		String title5 = "Plutchik wheel";
		String title6 = "Optimism";
		String title7 = "Love";
		String title8 = "Submission";
		String title9 = "Awe";
		String title10 = "Disapproval";
		String title11 = "Remorse";
		String title12 = "Contempt";
		String title13 = "Aggression";
		
		Dialogue title = new Dialogue(DIGESTABLE, 30, 30, g, 12);
		title.dialogueMaker(title1);
		title.dialogueMaker(title2);
		title.dialogueMaker(title3);
		title.dialogueMaker(title4);
		title.dialogueMaker(title5);
		title.dialogueMaker(title6);
		title.dialogueMaker(title7);
		title.dialogueMaker(title8);
		title.dialogueMaker(title9);
		title.dialogueMaker(title10);
		title.dialogueMaker(title11);
		title.dialogueMaker(title12);
		title.dialogueMaker(title13);
		title.stringPrinter(currentChoice);
		
		String string1, string1a, string1b, string1c, string1d, string1e, string1f, string1g, string1h, string1i, string1j, string1k, string1l, string1m;
		String string2, string2a, string2b, string2c, string2d, string2e, string2f, string2g, string2h, string2i, string2j, string2k, string2l, string2m;
		String newLine;
		newLine = "                        ";
		
		string1 = ("Hello, this is the help page of Cloaking Critters.") + newLine + ("This is mainly intended as a fast way to get   aqcuinated with the    ideology behind this   videogame.            ") + newLine  + ("Having said that,      this is a videogame that tries to explain the exact nature of emotions. Or more specifically, the things we end up doing to cover them up.");
		string1a = ("Emotions are a means for two social entities to convey a hierarchical  standing toward one    another. Hence why     emotions, unlike logic, needs to be validated by external means.       ") + newLine + ("To portray this using an example : Imagine an   angry customer yelling at a cashier over a    mispriced item.");
		string1b = ("As stated on the previous page, conflict is a reaction to a perceived social  imbalance.            ")+ newLine +("Hence when the social  imbalance gets resolved, the conflict dissolves." + newLine + "Therefore if one wants to stop conflict effectively you have to address the cause underneath, and  not the consequences   themselves.");
		string1c = ("Every emotion that gets expressed is innately  caused by the exact    opposite emotion.     ") + newLine + ("Consider the emotion we end up expressing the  active one, and the one fuelling it the subconcious emotion.              ") + newLine + ("The active emotion     therefore functions as a coping mechanism to  deal with the subconcious one.");
		string1d = ("The figure on the right is a plutchik wheel.  ") + newLine + ("The parts you see are the different kind of primary emotions in existence. In respecive order they're:" + newLine + "Ectasy in yellow       Vigilance in orange    Rage in red            Loathing in purple     Grief in blue          Amazement in dark green Terror in green        Acceptance in light green");
		string1e = ("Optimism is a secondary emotion arising from both ectasy and vigilance. ")+ newLine +("Someone optimistic is  going to look for answers to allow themselves a  brighter outlook on life.") + newLine + ("They are constantly    looking for hope, because they internally live in disapproval.");
		string1f = ("Love is a secondary    emotion arising from both ectasy and admiration.") + newLine + ("Someone loving is going to...");
		string1g = ("Submission is a secondary emotion arising from both admiration and terror.") + newLine + ("Someone submissive is  going to...");
		string1h = ("Awe is a secondary     emotion arising from both terror and amazement. ") + newLine + ("Someone in awe is going to...");
		string1i = ("Disapproval is a secondary emotion arising from both grief and amazement.  ") + newLine + ("Someone disagreeing is going to...");
		string1j = ("Remorse is a secondary emotion arising from both grief and disgust.    ") + newLine + ("Someone remorsefull is going to...");
		string1k = ("Contempt is a secondary emotion arising from both disgust and rage.     ") + newLine + ("Someone contemptive is going to distance themself from others to protect their own, because they innately live in submission.") + newLine + ("By living in fear for the hazards that could harm, one can put his trust in oneself to eliminate the hazard.");
		string1l = ("Aggression is a secondary emotion arising from both rage and vigilance.   ") + newLine + ("Someone aggressive is  going to look for answers at the cost of themselves and others, because they innately live in awe. ") + newLine + ("Their pursuit for answers stems from the fear they have for the unforseenable.");
		
		Dialogue page1 = new Dialogue(DIGESTABLE, 30, 50, g, 10);
		page1.dialogueMaker(string1);
		page1.dialogueMaker(string1a);
		page1.dialogueMaker(string1b);
		page1.dialogueMaker(string1c);
		page1.dialogueMaker(string1d);
		page1.dialogueMaker(string1e);
		page1.dialogueMaker(string1f);
		page1.dialogueMaker(string1g);
		page1.dialogueMaker(string1h);
		page1.dialogueMaker(string1i);
		page1.dialogueMaker(string1j);
		page1.dialogueMaker(string1k);
		page1.dialogueMaker(string1l);
		page1.stringPrinter(currentChoice);
		
		string2 = ("This theory is based off Robert Plutchik's      representation of emotions.") + newLine + ("I ended up adding a few  things on top of his work, just to show how I ended up interpreting emotions.") + newLine + ("Hence why the following should only be seen as my stance on the matter.") + newLine + ("Feel free to browse around with the arrow keys, use backspace to go to menu.");
		string2a = ("The customer in his anger, feels a sense of       righteousness entitled to him as he feels that the store wronged him.") + newLine + ("By creating this conflict, he is trying to correct the social imbalance he sees. This by positioning himself above the cashier, in an effort to try to compensate for the lower position he received by the mispriced item.");
		string2b = ("To translate this to the previous example :    "+ newLine + "When the cashier       addresses the fact that the item was 'accidentally' mispriced and manages to convince the customer of that fact.            " + newLine +"The conflict will stop.");
		string2c = ("The reason the customer became angry, has to do with the fact that he fears that they may have been messing with him the entire time.                 ") + newLine + ("This is also the reason why the conflict will only get resolved when the  cashier actually manages to tackle the customer's fears regarding this   incident.              ") + newLine + ("*fear (terror) is the opposite of anger (rage)");
		string2d = newLine + newLine + newLine + newLine + newLine + newLine + newLine + newLine + newLine + newLine + "             " + ("These primary emotions then in turn make up new emotions, these emotions are then called secondary emotions.") + " " + ("(E.g. terror + amazement = awe)");
		string2e = newLine + newLine + newLine + newLine + newLine + newLine + "                 " + ("By not agreeing with the current setting around oneself, you can focus on a more brighter future ahead.                ") + newLine + ("However, caution should be exerted to not resort to hedonism to escape the sadness of disapproval.");
		string2f = newLine + newLine + newLine + newLine + newLine + newLine + "                 " + (" ");
		string2g = newLine + newLine + newLine + newLine + newLine + newLine + "                 " + (" ");
		string2h = newLine + newLine + newLine + newLine + newLine + newLine + "                 " + (" ");
		string2i = newLine + newLine + newLine + newLine + newLine + newLine + "                 " + (" ");
		string2j = newLine + newLine + newLine + newLine + newLine + newLine + "                 " + (" ");
		string2k = newLine + newLine + newLine + newLine + newLine + newLine + "                 " + ("However in the process of doing so, one has to submit to the cause he/she is trying to protect. ") + newLine + ("Seeing others around   oneself as a blight enables you to keep yourself and those dear to you safe.");
		string2l = newLine + newLine + newLine + newLine + newLine + newLine + "                 " + ("Seeing everything      unforseenable as an    unwelcome surprise, they can end up pushing     themselves and others to the brink of despair to solve their fears.");
		
		Dialogue page2 = new Dialogue(DIGESTABLE, 167, 50, g, 10);
		page2.dialogueMaker(string2);
		page2.dialogueMaker(string2a);
		page2.dialogueMaker(string2b);
		page2.dialogueMaker(string2c);
		page2.dialogueMaker(string2d);
		page2.dialogueMaker(string2e);
		page2.dialogueMaker(string2f);
		page2.dialogueMaker(string2g);
		page2.dialogueMaker(string2h);
		page2.dialogueMaker(string2i);
		page2.dialogueMaker(string2j);
		page2.dialogueMaker(string2k);
		size = page2.dialogueMaker(string2l);
		page2.stringPrinter(currentChoice);
		
		String string;
		boolean flag;
		
		switch(currentChoice) {
			case 4:
				string = "/Sprites/plutchik.png";
				flag = true;
				break;
			case 5:
				string = "/Profiles/optimism2.png";
				flag = true;
				break;
			case 6:
				string = "/Profiles/love2.png";
				flag = true;
				break;
			case 7:
				string = "/Profiles/submission2.png";
				flag = true;
				break;
			case 8:
				string = "/Profiles/awe2.png";
				flag = true;
				break;
			case 9:
				string = "/Profiles/disapproval2.png";
				flag = true;
				break;
			case 10:
				string = "/Profiles/remorse2.png";
				flag = true;
				break;
			case 11:
				string = "/Profiles/contempt2.png";
				flag = true;
				break;
			case 12:
				string = "/Profiles/aggression2.png";
				flag = true;
				break;
			default:
				flag = false;
				string = null;
				break;
		}
		if(flag) {
			try {
				image = ImageIO.read(getClass().getResourceAsStream(string));
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			g.drawImage(image, (int)0, (int)0, null);
		}
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
		}
		if(k == KeyEvent.VK_BACK_SPACE) {
			gsm.setState(GameStateManager.MENUSTATE);
		}
	}

	@Override
	public void keyReleased(int k) {
		// TODO Auto-generated method stub
	}

}
