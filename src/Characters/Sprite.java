package Characters;

import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.Timer;

public class Sprite implements ActionListener {
	
	private int x;
	private int y;
	private int x1;
	private int y1;
	
	private boolean toggle;
	private boolean fresh;
	
	private BufferedImage image;
	private BufferedImage imaged;
	private BufferedImage imagee;
	private BufferedImage image1;
	private BufferedImage image2;
	private BufferedImage image3;
	private BufferedImage image4;
	
	Timer timer;
	
	public Sprite(int x, int y, String s1, String s2, String s3, String s4){
		this.x = x;
		this.y = y;
		
		toggle = true;
		fresh = true;
		
		try {
			image1 = ImageIO.read(getClass().getResourceAsStream(s1));
			image2 = ImageIO.read(getClass().getResourceAsStream(s2));
			image3 = ImageIO.read(getClass().getResourceAsStream(s3));
			image4 = ImageIO.read(getClass().getResourceAsStream(s4));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		timer = new Timer(200, this);
		timer.start();
	}
	
	private void update() {
		if(toggle) {
			imaged = image1;
			imagee = image3;
		}else {
			imaged = image2;
			imagee = image4;
		}
		toggle =! toggle;
	}
	
	public Graphics2D animation(Graphics2D g, int x, int y) {
		if(fresh) {
			g.drawImage(image1, (int)x, (int)y, null);
		}
		
		x1 = this.x;
		y1 = this.y;
		
		this.x = x;
		this.y = y;
		
		if(x<x1) {
			//Walks to the right
			image = imagee;
			fresh = false;
		}else if(x>x1){
			//Walks to the left
			image = imaged;
			fresh = false;
		}else if(y>y1){
			image = imaged;
			fresh = false;
		}else if(y<y1){
			image = imaged;
			fresh = false;
		}else {
			//image = image1;
		}
		
		g.drawImage(image, (int)x, (int)y, null);
		return g;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		update();
	}

}
