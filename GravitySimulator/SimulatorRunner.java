 //(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class SimulatorRunner extends Canvas implements Runnable, KeyListener
{
	

	private BufferedImage back;
  private FreeBody circle;
  private FreeBody circle2;
  private FreeBody circle3;
  private FreeBody rectangle;
  private FreeBody[] otherFrees;
  private boolean[] keys;
  private boolean pressed;
  private int time = 0;
  private StaticBody[] otherStatics;
	public SimulatorRunner()
	{
		keys = new boolean[6];
		setBackground(Color.black);
		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
		otherFrees = new FreeBody[]{};
		otherStatics = new StaticBody[]{};
		pressed = false;
	}

   public void update(Graphics window)
   {
	
	   paint(window);
   }
   
	public void paint( Graphics window)
	{
		time++;
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;
	 //of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("Gravity Simulator", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		if (keys[4] && (!pressed || time > 20)) {
			pressed = true;
			time = 0;
			FreeBody[] copy = new FreeBody[otherFrees.length+1];
			for (int i = 0; i < otherFrees.length; i ++) {
				copy[i] = otherFrees[i];
			}
			int mouse_x=MouseInfo.getPointerInfo().getLocation().x;
			int mouse_y=MouseInfo.getPointerInfo().getLocation().y;
			copy[otherFrees.length] = new FreeBody(new double[]{mouse_x,mouse_y}, new double[]{keys[0] ? -1 : keys[1] ? 1 : 0.0,keys[2] ? -1 : keys[3] ? 1 : 0.0},keys[5] ? 10000: 1000);
			copy[otherFrees.length].setColor(keys[5] ? Color.yellow: Color.blue);
			otherFrees = copy;
		}
		else if (!keys[4]) {
			pressed = false;
		}
		
		for (FreeBody free : otherFrees) {
	    	free.move();
	    }
    twoDGraph.drawImage(back, null, 0, 0);
    
    for (FreeBody free : otherFrees) {
    	free.draw(twoDGraph);
    }
    
    int id = 0;
    
    	
    ArrayList<FreeBody> freesArray = new ArrayList<FreeBody>();
    for (FreeBody free : otherFrees) {
    	freesArray.add(free);
    }
    while (id < freesArray.size()) {
    	
    	FreeBody free = freesArray.get(id);
    	boolean[] remove = free.update(otherFrees, otherStatics);
    	ArrayList<Integer> indexes = new ArrayList<Integer>();
    	for (int i = 0; i < remove.length; i ++) {
    		if (remove[i]) indexes.add(i);
    	}
    	Collections.sort(indexes,Collections.reverseOrder());
    	for (int i : indexes) {
    		freesArray.remove(i);
    		System.out.println(i);
    	}
    	id ++;
    	otherFrees = new FreeBody[freesArray.size()];
        for (int i = 0; i < freesArray.size(); i ++) {
        	otherFrees[i] = freesArray.get(i);
        }
 
    }
    
    

    
    
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
		if (e.getKeyCode() == KeyEvent.VK_B)
		{
			keys[5] = true;
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
		if (e.getKeyCode() == KeyEvent.VK_B)
		{
			keys[5] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
    //no code needed here
	}
}

