package loops;

public class ForEach8 {

	public static void main(String[] args) {
			int [][]j= {
					{10,20,30,40},
					{50},
					{60,70,80}
			};
			
			int sum=0;
			int noOfElements=0;
			
			for(int[]arr:j) {
				for(int values:arr) {
					sum+=values;
					values++;
					noOfElements++;
				}
			}
			System.out.println(sum/noOfElements);
	}

}
