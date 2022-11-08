package Unit15;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private BlinkyBall ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private Graphics back2;
	private Wall[] walls;
	private int[] scores;
	public Pong()
	{
		ball = new SpeedUpBall();
		
		leftPaddle = new Paddle(100,220,10,80, Color.GREEN,5);
	
		rightPaddle = new Paddle(640,220,10,80, Color.RED,5);
		keys = new boolean[4];
		walls = new Wall[4];
		walls[0] = new Wall(50,50,650,false);
		walls[1] = new Wall(50,495,650,false);
		walls[2] = new Wall(50,50,450,true);
		walls[3] = new Wall(695,50,450,true);

		scores = new int[2];
	
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
	   	Graphics2D twoDGraph = (Graphics2D) window;
	  //take a snap shop of the current screen and same it as an image
	  		//that is the exact same width and height as the current screen
  		if(back==null)
  		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

  		//create a graphics reference to the back ground image
  		//we will draw all changes on the background image
  		Graphics back2 = back.createGraphics();
		ball.moveAndDraw(back2);
		leftPaddle.draw(back2);
		rightPaddle.draw(back2);
	
		back2.setColor(new Color(0,0,0));
		back2.drawString(scores[0] + "", 100, 100);
		back2.drawString(scores[1] + "", 640, 100);
		for (int i = 0; i < walls.length; i ++) {
			walls[i].draw(back2,new Color(0,0,0));
			if (ball.didCollideLeft(walls[i])) {
				ball.setXSpeed(-ball.getXSpeed());
				back2.setColor(new Color(255,255,255));
				back2.drawString(scores[0] + "", 100, 100);
				back2.drawString(scores[1] + "", 640, 100);
				scores[0] += 1;
				ball.draw(back2,new Color(255,255,255));
				ball = new SpeedUpBall();
			}
			else if (ball.didCollideRight(walls[i])) {
				ball.setXSpeed(-ball.getXSpeed());
				back2.setColor(new Color(255,255,255));
				back2.drawString(scores[0] + "", 100, 100);
				back2.drawString(scores[1] + "", 640, 100);
				scores[1] += 1;
				ball.draw(back2,new Color(255,255,255));
				ball = new SpeedUpBall();
			}
			else if (ball.didCollideTop(walls[i]) || ball.didCollideBottom(walls[i])) {
				ball.setYSpeed(-ball.getYSpeed());
			}
		}

		//see if the ball hits the left paddle
		if (ball.didCollideLeft(leftPaddle) || ball.didCollideRight(leftPaddle) || ball.didCollideLeft(rightPaddle) || ball.didCollideRight(rightPaddle)) {
			ball.setXSpeed(-ball.getXSpeed());
		}
		else if (ball.didCollideTop(leftPaddle) || ball.didCollideBottom(leftPaddle) || ball.didCollideTop(rightPaddle) || ball.didCollideBottom(rightPaddle)) {
			ball.setYSpeed(-ball.getYSpeed());
		}
		

		//see if the paddles need to be moved
		boolean lefthittop = false;
		boolean righthittop = false;
		boolean lefthitbot = false;
		boolean righthitbot = false;
		for (int i = 0; i < walls.length; i ++) {
			if (walls[i].didCollideTop(leftPaddle)) {
				lefthittop  = true;
				
			}
			if (walls[i].didCollideBottom(leftPaddle)) {
				lefthitbot = true;
			}
			if (walls[i].didCollideTop(rightPaddle)) {
				righthittop = true;
			}
			if (walls[i].didCollideBottom(rightPaddle)) {
				righthitbot = true;
			}
		}
		if(keys[0] == true && !lefthittop)
		{
			//move left paddle up and draw it on the window
			leftPaddle.moveUpAndDraw(back2);
		}
		if(keys[1] == true&& !lefthitbot)
		{
			//move left paddle down and draw	 it on the window
			leftPaddle.moveDownAndDraw(back2);

		}
		if(keys[2] == true&& !righthittop)
		{
			rightPaddle.moveUpAndDraw(back2);
		}
		if(keys[3] == true&& !righthitbot)
		{
			rightPaddle.moveDownAndDraw(back2);
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}