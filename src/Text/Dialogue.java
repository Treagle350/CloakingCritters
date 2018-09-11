package Text;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.util.ArrayList;

/**
 *
 * @author Treagle350
 */

public class Dialogue {
	private int lineDIGESTABLE;
	//private int pageDIGESTABLE;
	ArrayList<String> dialogue;
	ArrayList<String> pages;
	String printString;
	final int x;
	final int y;
	Graphics2D g;
	int size;
	
	private Font font;
	
	public Dialogue(int lineDIGESTABLE, final int x, final int y, Graphics2D g, int fontSize){
		this.lineDIGESTABLE = lineDIGESTABLE;
		dialogue = new ArrayList<String>();
		pages = new ArrayList<String>();
		this.x = x;
		this.y = y;
		this.g = g;
		size = 0;
		
		try {
			font = new Font("Century Gothic", Font.PLAIN, fontSize);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public int dialogueMaker(String string) {
		pages.add(string);
		size = pages.size();
		return size;
	}
	
	public void stringPrinter(int currentChoice){
		stringPrintParser(pages.get(currentChoice));
		g.setFont(font);
		g.setColor(Color.BLACK);
		for(int i = 0;i<dialogue.size();i++) {
			printString = dialogue.get(i);
			g.drawString(printString, x, y + (10*i));
		}
	}
	
	private void stringPrintParser(String string) {
		int sentenceLength = 0;
		int alineaLength = 0;
		int index = 0;
		int count = 0;
		
		String digestableString;
		String[] words;
		
		words = string.split(" ");
		alineaLength = words.length;

		while(alineaLength > 0 && index > -1) {
			digestableString = "";
			string = string.substring(index);
			while(sentenceLength < lineDIGESTABLE && count < alineaLength) {
				digestableString = digestableString + words[count] + " ";
				count = count + 1;
				sentenceLength = digestableString.length();
			}
			sentenceLength = 0;
			index = digestableString.lastIndexOf(" ");
			dialogue.add(digestableString);
		}
	}
}
