package exercises;
import javax.swing.JOptionPane;
public class Pythagorean {

	public static void main(String[] args) {
		String again;
		do {
			
		String user;
		
		user = JOptionPane.showInputDialog(null,"Which side are you looking for?\n1 - A\n2 - B\n3 - C");
		if ("A".equalsIgnoreCase(user)) {
			String bStr;
			String cStr;
			double b;
			double c;
			double ans;
			double ansReal;
			bStr = JOptionPane.showInputDialog(null,"What is the length?");
			cStr = JOptionPane.showInputDialog(null,"What is the length?");
			b = Double.parseDouble(bStr);
			c = Double.parseDouble(cStr);
			ans = (c * c) - (b * b);
			ansReal = ans / 2;
			JOptionPane.showMessageDialog(null, ansReal +"");
		}
		if ("B".equalsIgnoreCase(user)) {
			String aStr;
			String cStr;
			double a;
			double c;
			double ans;
			double ansReal;
			aStr = JOptionPane.showInputDialog(null,"What is the length?");
			cStr = JOptionPane.showInputDialog(null,"What is the length?");
			a = Double.parseDouble(aStr);
			c = Double.parseDouble(cStr);
			ans = (c * c) - (a * a);
			ansReal = ans / 2;
			JOptionPane.showMessageDialog(null, ansReal +"");
			
		}
		if ("C".equalsIgnoreCase(user)) {
			String aStr;
			String bStr;
			double a;
			double b;
			double ans;
			double ansReal;
			aStr = JOptionPane.showInputDialog(null,"What is the length?");
			bStr = JOptionPane.showInputDialog(null,"What is the length?");
			a = Double.parseDouble(aStr);
			b = Double.parseDouble(bStr);
			ans = (b * b) + (a * a);
			ansReal = ans / 2;
			JOptionPane.showMessageDialog(null, ansReal +"");
		}
			
			again = JOptionPane.showInputDialog(null,"Would you like to go again?");
		}while ("Yes".equalsIgnoreCase(again));
			
			
			// x^2 + 3^2 = 5^2
			//   x^2    9 = 25
			//   x^2 = 16
			// x = 8
		}
		
}
