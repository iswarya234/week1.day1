package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // to find a given input as prime number 
		//input =13;
		
		// Declare an input variable and assign a value 13
				int input = 13, remainder;

				// Declare a boolean variable flag as false
				boolean flag = false;

				// Iterate from 2 to half of the input
				int num = input / 2;
				// Divide the input with each for loop variable
				// and check the remainder

				for (int i = 2; i <= num; i++) {
					remainder = input % i;

					// set the flag as true when there is no remainder

					if (remainder == 0) {
						System.out.println("The given number is not a prime");
						flag = true;
						break;
					}
				}

			

				if (flag == false) {
					System.out.println("The given number is a prime number");
				}
		
	}

}
