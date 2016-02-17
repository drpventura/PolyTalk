package ventura.poly.icon;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.Icon;

public class MarsIcon implements Icon {

	private int _size;
	
	public MarsIcon(int size) {
		_size = size;
	}
	
	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2 = (Graphics2D) g;
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
