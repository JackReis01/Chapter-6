package exercises;

import javax.swing.JOptionPane;

public class Count3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberLine = 30;
		for(int x= 0 ; x<= 300; x = x+3) {
			JOptionPane.showMessageDialog(null, x +"");
			if(x % numberLine == 0) {
				JOptionPane.showMessageDialog(null,"Divisible by 30");
			}
		}
	}

}
