package Main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

import GameState.GameStateManager;

import java.awt.event.*;

/**
* @author Treagle350
**/

@SuppressWarnings("serial")
public class GamePanel extends JPanel implements Runnable, KeyListener{
	
	public static final int WIDTH = 320;
	public static final int HEIGHT = 240;
	public int SCALE = 1;
	
	private Thread thread;
	private boolean running;
	private int FPS = 60;
	private long targetTime = 1000/FPS;
	
	private BufferedImage image;
	private Graphics2D g;
	
	private GameStateManager gsm;
	
	public GamePanel(int scale) {
		super();
		this.SCALE = scale;
		setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		setFocusable(true);
		requestFocus();
	}
	
	public void addNotify() {
		super.addNotify();
		if(thread == null) {
			thread = new Thread(this);
			addKeyListener(this);
			thread.start();
		}
	}
	
		private void init() {
			
			image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
			g = (Graphics2D) image.getGraphics();
			running = true;
			
			gsm = new GameStateManager();
		}
		
		public void run() {
			init();
			
			long start;
			long elapsed;
			long wait;
			
			while(running) {
				start = System.nanoTime();
				
				update();
				draw();
				drawToScreen();
			
				elapsed = System.nanoTime() - start;
				
				wait = targetTime - elapsed / 1000000;
				
				if (wait < 0) {
					wait = 5;
				}
				
				try {
					Thread.sleep(wait);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		private void update() {
			gsm.update();
		}
		private void draw() {
			gsm.draw(g);
		}
		private void drawToScreen() {
			Graphics g2 = getGraphics();
			g2.drawImage(image, 0, 0, WIDTH*SCALE, HEIGHT*SCALE, null);
			g2.dispose();
		}

		@Override
		public void keyPressed(KeyEvent key) {
			gsm.keyPressed(key.getKeyCode());
		}

		@Override
		public void keyReleased(KeyEvent key) {
			gsm.keyReleased(key.getKeyCode());
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
		}

}
