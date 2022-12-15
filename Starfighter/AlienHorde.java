//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>();
		for(int i =0; i < size; i ++) {
			aliens.add(new Alien(i*300/size,100,(300/size),(300/size),5+(i),"right"));
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}
	public void add(int size,int speed) {
		for(int i =0; i < size; i ++) {
			aliens.add(new Alien(i*300/size,100,(300/size),(300/size),5 + speed+(i),"right"));
		}
	}
	public void drawEmAll( Graphics window )
	{
		for (int i = 0; i < aliens.size(); i ++) {
			aliens.get(i).draw(window);
		}
	}

	public void moveEmAll()
	{
		for (Alien a : aliens) {
			if (a.getX() > 800) {
				a.setY(a.getY()+60);
				a.setDirection("left");
			}
			else if (a.getX() + a.getWidth() < 0) {
				a.setY(a.getY()+60);
				a.setDirection("right");
			}
			a.move(a.getDirection());
		}
	}
	public boolean collide(Alien aliencollide, MovingThing ammo) {
		return (Math.max(Math.max(Math.abs(ammo.getX()-aliencollide.getX()), Math.abs(ammo.getX() + ammo.getWidth() -aliencollide.getX())),
				Math.max( Math.abs(ammo.getX() -aliencollide.getX() - aliencollide.getWidth()),Math.abs( ammo.getX() + ammo.getWidth() -aliencollide.getX() - aliencollide.getWidth()))) 
				< ammo.getWidth() + aliencollide.getWidth()
				&&
			Math.max(Math.max(Math.abs(ammo.getY()-aliencollide.getY()),Math.abs( ammo.getY() + ammo.getHeight() -aliencollide.getY())),
					Math.max(Math.abs( ammo.getY() -aliencollide.getY() - aliencollide.getHeight()), Math.abs(ammo.getY() + ammo.getHeight() -aliencollide.getY() - aliencollide.getHeight()))) 
					< ammo.getHeight() + aliencollide.getHeight());
			
		
   }
	public boolean removeDeadOnes(List<Ammo> shots, Ship ship)
	{
		List<Integer> toRemove = new ArrayList<Integer>();
		for (Ammo am : shots) {
			for (int i = 0; i < aliens.size(); i ++) {
				if (collide(aliens.get(i),am)) {
					toRemove.add(i);
				}
				if (collide(aliens.get(i),ship)) {
					return true;
				}
			}
		}
		Collections.sort(toRemove, Collections.reverseOrder());
		int lastIndex = -1;
		for (int i = 0; i < toRemove.size(); i ++) {
			if (toRemove.get(i) != lastIndex) aliens.remove((int) toRemove.get(i));
			lastIndex = toRemove.get(i);
		}
		return false;
	}

	public String toString()
	{
		return "";
	}
}
