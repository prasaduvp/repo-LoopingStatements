package loops;

public class ForEach4 {

	public static void main(String[] args) {
		int j[][]= {
				{10,20,30},
				{40,50,60},
				{70,80,90}
		};
		
		int sum=0;
		
		for(int[]Singlearr:j) {
			for(int value:Singlearr) {
				sum+=value;
				value++;
//				System.out.print(value + " ");
			}
//			System.out.println();
		}
		System.out.println(sum);
		
	}

}
