package loops;

public class ForEach7 {

	public static void main(String[] args) {
		int [][] j= {
				{10,20,30,40},
				{50},
				{60,70,80}
		};
		
		int sum=0;
		
		for(int[]arr:j) {
			for(int value:arr) {
				sum+=value;
			}
		}
		System.out.println(sum);
	}

}
