package loops;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the starting number");
		int startingNumber = scanner.nextInt();
		System.out.println("Enter the ending number");
		int endingNumber = scanner.nextInt();
		
		//int number = startingNumber;
		
		for(int j=startingNumber; j<=endingNumber; j++) {
			if(j%2==0) {
				System.out.println(j);
			}			
		}	
		scanner.close();
	}
}
