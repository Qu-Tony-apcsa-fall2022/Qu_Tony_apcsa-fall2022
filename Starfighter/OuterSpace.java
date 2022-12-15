//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;

	private Ammo ammo;

    private AlienHorde horde;
	private Bullets shots;
	
	private boolean shotAlready = false;
	private boolean[] keys;
	private BufferedImage back;
	private boolean gameOver = false;
	private int time;
	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other instance variables
		//Ship, Alien
		ship = new Ship(370,500,120,120,1);
		shots = new Bullets();
		horde = new AlienHorde(5);
		ammo = new Ammo(390,-100,3);
		this.addKeyListener(this);
		new Thread(this).start();
		time = 0;
		
		setVisible(true);
	}

   public void update(Graphics window)
   {
	   if (!gameOver)
	   paint(window);
   }
   
	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;
		time ++;
		
		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);

		if(keys[0] == true)
		{
			ship.move("left");
		}
		if(keys[1] == true)
		{
			ship.move("right");
		}
		if(keys[2] == true)
		{
			ship.move("up");
		}
		if(keys[3] == true)
		{
			ship.move("down");
		}
		if (keys[4] == true && !shotAlready) {
			ammo = new Ammo(390,-100,3);
			ammo.setPos(ship.getX() + (ship.getWidth()/2) - 1, ship.getY()  - (ammo.getHeight()/2)+6);
			shotAlready = true;
			shots.add(ammo);
		}
		else if (!keys[4]) {
			shotAlready = false;
		}
		//add code to move Ship, Alien, etc.

		
		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship
		if (time % 600 == 0) {
			horde.add(5,time/600);
		}
		if (horde.removeDeadOnes(shots.getList(),ship)) {
			gameOver = true;
			window.setColor(Color.red);
			twoDGraph = (Graphics2D)window;
			twoDGraph.drawImage(back, null, 0, 0);
			window.setFont(new Font("TimesRoman", Font.PLAIN, 100));
			window.drawString("Game Over",100,100);
			return;
		}
		
		shots.moveEmAll();
		if (time % 5 == 0) {
			horde.moveEmAll();
		}
		if (time % 10 == 0) {
			
			twoDGraph.drawImage(back, null, 0, 0);
		}
		
		shots.drawEmAll(window);
		ship.draw(window);

		horde.drawEmAll(window);
		
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT ||e.getKeyCode() == KeyEvent.VK_A )
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT||e.getKeyCode() == KeyEvent.VK_D)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP||e.getKeyCode() == KeyEvent.VK_W)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN||e.getKeyCode() == KeyEvent.VK_S)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT|| e.getKeyCode() == KeyEvent.VK_D)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

