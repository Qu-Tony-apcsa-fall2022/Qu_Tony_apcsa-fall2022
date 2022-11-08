package Unit15;

import java.awt.Color;
import java.awt.Graphics;

public class Wall extends Block {

	boolean vertical;
	public Wall (int x, int y, int leng, boolean vert) {
		
		super(x, y, vert ? 5 : leng, vert ? leng : 5, new Color(0,0,0));
		vertical = vert;

	}

	
}
