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
	private BufferedImage plutchik;
	private BufferedImage optimism;
	private BufferedImage love;
	private BufferedImage submission;
	private BufferedImage awe;
	private BufferedImage disapproval;
	private BufferedImage remorse;
	private BufferedImage contempt;
	private BufferedImage aggression;

	private int currentChoice;
	
	public CatalogState(GameStateManager gsm) {
		this.gsm = gsm;
		
		try {
			bg = new Background("/Backgrounds/book1.png","/Backgrounds/book2.png");
			plutchik = ImageIO.read(getClass().getResourceAsStream("/Sprites/plutchik.png"));
			optimism = ImageIO.read(getClass().getResourceAsStream("/Profiles/optimism2.png"));
			love = ImageIO.read(getClass().getResourceAsStream("/Profiles/love2.png"));
			submission = ImageIO.read(getClass().getResourceAsStream("/Profiles/submission2.png"));
			awe = ImageIO.read(getClass().getResourceAsStream("/Profiles/awe2.png"));
			disapproval = ImageIO.read(getClass().getResourceAsStream("/Profiles/disapproval2.png"));
			remorse = ImageIO.read(getClass().getResourceAsStream("/Profiles/remorse2.png"));
			contempt = ImageIO.read(getClass().getResourceAsStream("/Profiles/contempt2.png"));
			aggression = ImageIO.read(getClass().getResourceAsStream("/Profiles/aggression2.png"));
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
		String title14 = "Emotional Equilibrium";
		
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
		title.dialogueMaker(title14);
		title.stringPrinter(currentChoice);
		
		String newLine = "                        ";
		
		String string1 = ("Hello, this is the help page of Cloaking Critters.") + newLine + ("This is mainly intended as a fast way to get   aqcuinated with the    ideology behind this   videogame.            ") + newLine  + ("Having said that,      this is a videogame that tries to explain the exact nature of emotions. Or more specifically, the things we end up doing to cover them up.");
		String string1a = ("Emotions are a means for two social entities to convey a hierarchical  standing toward one    another. Hence why     emotions, unlike logic, needs to be validated by external means.       ") + newLine + ("To portray this using an example : Imagine an   angry customer yelling at a cashier over a    mispriced item.");
		String string1b = ("As stated on the previous page, conflict is a reaction to a perceived social  imbalance.            ")+ newLine +("Hence when the social  imbalance gets resolved, the conflict dissolves." + newLine + "Therefore if one wants to stop conflict effectively you have to address the cause underneath, and  not the consequences   themselves.");
		String string1c = ("Every emotion that gets expressed is innately  caused by the exact    opposite emotion.     ") + newLine + ("Consider the emotion we end up expressing the  active one, and the one fuelling it the subconcious emotion.              ") + newLine + ("The active emotion     therefore functions as a coping mechanism to  deal with the subconcious one.");
		String string1d = ("The figure on the right is a plutchik wheel.  ") + newLine + ("The parts you see are the different kind of primary emotions in existence. In respecive order they're:" + newLine + "Ectasy in yellow       Vigilance in orange    Rage in red            Loathing in purple     Grief in blue          Amazement in dark green Terror in green        Acceptance in light green");
		String string1e = ("Optimism is a secondary emotion arising from both ectasy and vigilance. ")+ newLine +("Someone optimistic is  going to look for answers to allow themselves a  brighter outlook on life.") + newLine + ("They are constantly    looking for hope, because they internally live in disapproval.");
		String string1f = ("Love is a secondary    emotion arising from both ectasy and admiration.") + newLine + ("Someone loving is going to want to appear      trustworthy as much as possible, this to make sure people like them and they can get along with everyone.             ") + newLine + ("They are constantly    looking for acceptance, because they innately live in remorse.");
		String string1g = ("Submission is a secondary emotion arising from both admiration and terror.") + newLine + ("Someone submissive is  going to avoid conflict as much as possible.  ") + newLine + ("They easily get scared and end up clinging to others in order for them to address their fears, however the only reason why they do so is because they see the thing causing their fear with nothing but contempt.");
		String string1h = ("Awe is a secondary     emotion arising from both terror and amazement. ") + newLine + ("Someone in awe is going to shelter behind others when confronted. Because they're using them as  minions to confront their own fears.            ") + newLine + ("They live in awe because it allows them to use others to solve their fears,  internally however they're fuelled by aggression.");
		String string1i = ("Disapproval is a secondary emotion arising from both grief and amazement.  ") + newLine + ("Someone disagreeing is going to turn their back on others rather quickly.") + newLine + ("Quick to be amazed at  how sad the world tends to be, they end up     dissaproving of a lot of things they come into  contact with by running away from them.");
		String string1j = ("Remorse is a secondary emotion arising from both grief and disgust.    ") + newLine + ("Someone remorseful is  going to regret everything he/she comes into contact with, generally feeling sorry for themselves along the way.              ") + newLine + ("They live in remorse   because they're fuelled by love.");
		String string1k = ("Contempt is a secondary emotion arising from both disgust and rage.     ") + newLine + ("Someone contemptive is going to distance themself from others to protect their own, because they innately live in submission.") + newLine + ("By living in disgust for the hazards that could harm, one can use his  anger to eliminate the hazard.");
		String string1l = ("Aggression is a secondary emotion arising from both rage and vigilance.   ") + newLine + ("Someone aggressive is  going to look for answers at the cost of themselves and others, because they innately live in awe. ") + newLine + ("Their pursuit for answers stems from the fear they have for the unforseenable.");
		String string1m = ("The innate preference  over certain emotions, and dislike over others.");
		
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
		page1.dialogueMaker(string1m);
		page1.stringPrinter(currentChoice);
		
		String string2 = ("This theory is based off Robert Plutchik's      representation of emotions.") + newLine + ("I ended up adding a few  things on top of his work, just to show how I ended up interpreting emotions.") + newLine + ("Hence why the following should only be seen as my stance on the matter.") + newLine + ("Feel free to browse around with the arrow keys, use backspace to go to menu.");
		String string2a = ("The customer in his anger, feels a sense of       righteousness entitled to him as he feels that the store wronged him.") + newLine + ("By creating this conflict, he is trying to correct the social imbalance he sees. This by positioning himself above the cashier, in an effort to try to compensate for the lower position he received by the mispriced item.");
		String string2b = ("To translate this to the previous example :    "+ newLine + "When the cashier       addresses the fact that the item was 'accidentally' mispriced and manages to convince the customer of that fact.            " + newLine +"The conflict will stop.");
		String string2c = ("The reason the customer became angry, has to do with the fact that he fears that they may have been messing with him the entire time.                 ") + newLine + ("This is also the reason why the conflict will only get resolved when the  cashier actually manages to tackle the customer's fears regarding this   incident.              ") + newLine + ("*fear (terror) is the opposite of anger (rage)");
		String string2d = newLine + newLine + newLine + newLine + newLine + newLine + newLine + newLine + newLine + newLine + "             " + ("These primary emotions then in turn make up new emotions, these emotions are then called secondary emotions.") + " " + ("(E.g. terror + amazement = awe)");
		String string2e = newLine + newLine + newLine + newLine + newLine + newLine + "                 " + ("By not agreeing with the current setting around oneself, you can focus on a more brighter future ahead.                ") + newLine + ("However, caution should be exerted to not resort to hedonism to escape the sadness of disapproval.");
		String string2f = newLine + newLine + newLine + newLine + newLine + newLine + "                 " + ("By thinking about the  remorse one encountered, one can use that remorse to better their relations with everyone else.    Therefore avoiding such situations in the future.");
		String string2g = newLine + newLine + newLine + newLine + newLine + newLine + "                 " + ("By having others deal with their fears, they can allow themselves to stay as far away as they see fit. ") + newLine  + ("This reasoning therefore stems from their anger and disgust toward that entity causing it.");
		String string2h = newLine + newLine + newLine + newLine + newLine + newLine + "                 " + ("Under the hood of it all they simply want to    confront the things they see as 'impossible', just not directly.") + ("Seeing    themselves as a medium that tries to herold the world around them of the concepts of 'evil' they want to tackle.");
		String string2i = newLine + newLine + newLine + newLine + newLine + newLine + "                 " + ("By running away from the source of conflict one can however focus on   more optimistic parts of this world.           ") + newLine + ("This reasoning stems from a hope for better      conditions to be out there, optimism if you will.");
		String string2j = newLine + newLine + newLine + newLine + newLine + newLine + "                 " + ("By living in love, one comes to realise the things one could have done better to safeguard that love.") + newLine + ("They end up taking a lot of remorse up as 'their own fault' because they trust and love the ones they're doing it for.");
		String string2k = newLine + newLine + newLine + newLine + newLine + newLine + "                 " + ("However in the process of doing so, one has to submit to the cause he/she is trying to protect. ") + newLine + ("This because one has to trust the cause he/she is trying to defend, whilst simultaneously fearing any threath to it.");
		String string2l = newLine + newLine + newLine + newLine + newLine + newLine + "                 " + ("Seeing everything      unforseenable as an    unwelcome surprise, they can end up pushing     themselves and others to the brink of despair to solve their fears.");
		String string2m = ("Not going to lie, I'm still researching this.");
		
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
		page2.dialogueMaker(string2l);
		size = page2.dialogueMaker(string2m);
		page2.stringPrinter(currentChoice);
		
		switch(currentChoice) {
			case 4:
				image = plutchik;
				break;
			case 5:
				image = optimism;
				break;
			case 6:
				image = love;
				break;
			case 7:
				image = submission;
				break;
			case 8:
				image = awe;
				break;
			case 9:
				image = disapproval;
				break;
			case 10:
				image = remorse;
				break;
			case 11:
				image = contempt;
				break;
			case 12:
				image = aggression;
				break;
			default:
				image = null;
				break;
		}
		g.drawImage(image, (int)0, (int)0, null);
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
