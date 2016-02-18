package ventura.poly.icon;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;

import javax.swing.Icon;

/**
 * Code from Horstmann, C. S. (2006). Object-oriented design & 
 * patterns (2nd ed.). Hoboken, NJ: Wiley. (p. 138)
 *
 */
public class MarsIcon implements Icon {
	
	private int _size;
	
	public MarsIcon(int size) {
		_size = size;
	}
	
	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2 = (Graphics2D) g;
		// turn on anti-aliasing
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		Ellipse2D.Double planet = new
				Ellipse2D.Double(x, y, _size, _size);
		g2.setColor(Color.RED);
		g2.fill(planet);
	}
	
	@Override
	public int getIconWidth() {
		return _size;	
	}
	
	@Override
	public int getIconHeight() {
		return _size;
	}
}
