import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[][] multiIntArray = {
				{1,6,9,6,3},
				{2,11,7,4,8},
				{9,0,1,8,3}
		};
		
		for(int[] iArr : multiIntArray) {
			Arrays.sort(iArr);
		}
		
		for(int[] iArr : multiIntArray) {
			for (int i : iArr) {
				 System.out.println(i);
			}
		}
	}
	
}
