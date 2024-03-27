package loops;

public class ForEach6 {

	public static void main(String[] args) {
		int [][]j= {
				{10,20,30,40},
				{50},
				{60,70,80}
		};
		
		for(int[] arr:j) {
			for(int value:arr) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
		
	}

}
