package loops;

import java.util.Scanner;

public class For6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the starting number");
		int startingNumber = scanner.nextInt();
		System.out.println("Enter the ending number");
		int endingNumber = scanner.nextInt();
		
		
		for(int number=startingNumber; number<=endingNumber; number++) {
			int noOfDividents = 0;
			if(startingNumber!=1 && startingNumber!=2) {
				for(int j=1; j<=endingNumber;j++) {
					if(number%j==0) {
						noOfDividents++;
					}
				}			
		}
		if(noOfDividents<=2 && noOfDividents!=0) {
			System.out.println(number);
		}
		scanner.close();
	}
	
	}

}
