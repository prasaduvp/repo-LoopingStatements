package loops;

import java.util.Scanner;

public class While6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the starting number");
		int startingNumber = scanner.nextInt();
		System.out.println("Enter the ending number");
		int endingNumber = scanner.nextInt();

		int number = startingNumber;

		while(number<=endingNumber) {
			boolean isPrime = true;
			if(number!=1 && number!=2) {
				int j = 2;
				while(j<number) {
					if(number%j==0) {
						isPrime=false;
						break;
					}
					j++;	
				}
			}
			else isPrime=false;
			if(isPrime) {
				System.out.println(number);
				number++;
			}
				scanner.close();
		}
	}
}
