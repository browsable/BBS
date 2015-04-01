package bbs;

import java.awt.*;

import javax.swing.*;

public class Draw extends JPanel {
	private static int x,y;
	public void drawing(int xx, int yy){
		x = xx;
		y = yy;
		repaint();
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.fillOval(x, y, 20, 20);
	}
}
