package loops;

public class ForEach5 {

	public static void main(String[] args) {
			int[][]j= {
					{10,20,30},
					{40,50,60},
					{70,80,90},
			};
			
			int sum=0;
			int noOfElements=0;
			
			for(int[] singleArr:j) {
				for(int value:singleArr) {
					sum+=value;
					noOfElements++;
				}
			}
			System.out.println(sum/noOfElements);
	}
}
