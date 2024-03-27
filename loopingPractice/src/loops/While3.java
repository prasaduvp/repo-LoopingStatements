package loops;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the starting number");
		int startingNumber = scanner.nextInt();
		System.out.println("Enter the ending number");
		int endingNumber = scanner.nextInt();
		
		int number = startingNumber;
		
		while(number<=endingNumber) {
			if(number%7==0) {
				System.out.println(number);
			}
			number++;
		}
		scanner.close();

	}

}
