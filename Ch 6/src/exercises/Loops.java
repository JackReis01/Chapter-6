package exercises;

import javax.swing.JOptionPane;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x = 0; x <= 10; ++x) {
			JOptionPane.showMessageDialog(null, x +"");
		}
		
		int y = 0;
		while(y<=10) {
			JOptionPane.showMessageDialog(null, y +"");
			++y;
		}
		int z = 0;
		do
		{
			JOptionPane.showMessageDialog(null, z +"");
			++z;
		}while(z != 10);
	}

}
