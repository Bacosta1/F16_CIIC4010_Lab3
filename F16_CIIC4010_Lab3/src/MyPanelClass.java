
	import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
	 
	public class MyPanelClass extends JPanel {
	            /**
		 * 
		 */
		private static final long serialVersionUID = 7057541440811488699L;

				public void paintComponent(Graphics g) {
	                        super.paintComponent(g);
	 
	                        //Compute interior coordinates
	                        Insets myInsets = this.getInsets();
	                        int x1 = myInsets.left;
	                        int y1 = myInsets.top;
	                        int x2 = getWidth() - myInsets.right - 1;
	                        int y2 = getHeight() - myInsets.bottom - 1;
	                        int width = x2 - x1;
	                        int height = y2 - y1;
	 
	                        //Paint the background
	                        g.setColor(Color.RED);
	                        g.fillRect(x1, y1, width + 1, height + 1);
//	                        Draw a border
	                        g.setColor(Color.WHITE);
	                        g.fillRect(x1, y1 + 165, width, 55);
//	                        Draw a border
	                        g.setColor(Color.WHITE);
	                        g.fillRect(x1, y1 + 55 , width, 55);
//	                        g.setColor(Color.WHITE);
//	                        g.drawLine(x1, y1, x2, y2);
//	                        g.setColor(Color.RED);
//	                        g.drawLine(x1, y2, x2, y1);
	                        //Draw Oval
//	                        g.setColor(Color.LIGHT_GRAY);
//	                        g.fillOval(222, 196, 55, 55);//(x1, y1, width, height);
//	                        Draw a polygon
	                        Polygon p = new Polygon();
	                        p.addPoint(x1, y1);
	                        p.addPoint(x1 + 150, y1 + 135);
	                        p.addPoint(x1, y2);
//	                        p.addPoint(x1 + 55, y1 + 25);
//	                        p.addPoint(x1 + 25, y1 + 45);
//	                        p.addPoint(x1 + 15, y1 + 45);
//	                        p.addPoint(x1 + 15, y1 + 25);
	                        g.setColor(Color.BLUE);
	                        g.fillPolygon(p);
	                        // Draw a second polygon
	                        Polygon star = new Polygon();
	                        star.addPoint(x1 + 25, y1 + 123);
	                        star.addPoint(x1 + 41, y1 + 123);
	                        star.addPoint(x1 + 47, y1 + 108);
	                        star.addPoint(x1 + 53, y1 + 123);
	                        star.addPoint(x1 + 69, y1 + 123);
	                        star.addPoint(x1 + 56, y1 + 133);
	                        star.addPoint(x1 + 61, y1 + 148);
	                        star.addPoint(x1 + 47, y1 + 138);
	                        star.addPoint(x1 + 34, y1 + 148);
	                        star.addPoint(x1 + 38, y1 + 133);
	                        g.setColor(Color.WHITE);
	                        g.fillPolygon(star);
	                        
           }
	}

