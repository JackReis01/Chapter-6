package exercises;

public class TwelveInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] numbers = {1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		
		for(int x = 0; x < numbers.length; ++x)
			System.out.println(numbers[x]);
		
		for(int x = 12; x < numbers.length; --x)
			System.out.println(numbers[x]);
	}

}
