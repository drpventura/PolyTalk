package ventura.poly.icon;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Based on code taken from Horstmann, C. S. (2006). Object-oriented 
 * design & patterns (2nd ed.). Hoboken, NJ: Wiley. (p. 138)
 *
 */
public class IconEx {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Hello, World!");
		
//		JOptionPane.showMessageDialog(null, 
//				"ImageIcon",
//				"ImageIcon Demo",
//				JOptionPane.INFORMATION_MESSAGE,
//				new ImageIcon(IconEx.class.getResource("/images/CC.jpg")));
//		
//		JOptionPane.showMessageDialog(null, 
//				"Hello, world!",
//				"Custom Icon Demo",
//				JOptionPane.INFORMATION_MESSAGE,
//				new MarsIcon(50));
	}
}
