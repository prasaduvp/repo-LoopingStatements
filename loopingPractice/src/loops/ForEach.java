package loops;

public class ForEach {

	public static void main(String[] args) {
		int j[] = {20,30,40,50};
		
		int sum=0;
		
		for(int value:j) {
			sum+=value;
			value++;
		}
		System.out.println(sum);
	}
}
