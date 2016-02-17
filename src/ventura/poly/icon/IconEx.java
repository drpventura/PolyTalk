package ventura.poly.icon;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class IconEx {

	public static void main(String[] args) {
//		JOptionPane.showMessageDialog(null, 
//				"Hello, world!",
//				"Important Message from JOptionPane",
//				JOptionPane.ERROR_MESSAGE,
//				new ImageIcon("DukeWithHelmet.png"));
		JOptionPane.showMessageDialog(null, 
				"Hello, world!",
				"Important Message from JOptionPane",
				JOptionPane.ERROR_MESSAGE,
				new MarsIcon(130));

	}
}
