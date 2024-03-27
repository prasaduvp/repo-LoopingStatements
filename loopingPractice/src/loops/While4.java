package loops;

import java.util.Scanner;

public class While4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the starting number");
		int startingNumber = scanner.nextInt();
		System.out.println("Enter the ending number");
		int endingNumber = scanner.nextInt();
		
		int number=startingNumber;
		
		int sum=0;
		
		while(number<=endingNumber) {
			
			if(number%2==0) {
				sum +=number;	
			}
			number++;
		}
		System.out.println(sum);
		scanner.close();
	}

}
