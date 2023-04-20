//Game.java
/*Allows net and score dividers to be displayed. */

import java.awt.*;
import java.awt.event.*;

//Abstract method
public  class Game extends UserPad2 implements ActionListener {

	public int x = 0, y = 450;
	 public void Net(Graphics g, int xVel, int yVel, int width, int height) {

	 	//Creates net.
		g.drawRect(xVel, yVel, width, height);
		g.setColor(Color.BLUE);
	}



	//UNUSED BUFFER CODE
	//  public class MyCanvas extends Canvas  {

	public void actionPerformed(ActionEvent e) {

         /*   BufferStrategy bs = getBufferStrategy();
            if (bs == null) {
                createBufferStrategy(3);
                return;
            }*/

		repaint();
		//bs.show();
	}

	public void paintComponent(Graphics g) {

		  //Draws score dividers and net.
		super.paintComponent(g);
		g.setColor(Color.ORANGE);
		g.drawLine(0,150,150,0);
		Net(g, x, y, 1200, 1);
		g.drawLine(1050,0,1200,150);
		g.setColor(Color.BLUE);

	 }
  }
