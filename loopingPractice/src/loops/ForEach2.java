package loops;

public class ForEach2 {

	public static void main(String[] args) {
		int[] j = {10,20,30,40};
		
		int sum=0;
		int noOfElements=0;
		
		for(int value:j) {
			sum+=value;
			value++;
			noOfElements++;
		}
		System.out.println(sum/noOfElements);

}
}