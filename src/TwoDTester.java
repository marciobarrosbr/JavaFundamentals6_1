import java.util.Scanner;
import java.util.Arrays;
public class TwoDTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int [][] nums = new int[3][2];
		
		for (int i=0; i<nums.length; i++) {
			for(int j = 0; j<nums[i].length; j++) {
				System.out.println("Enter a value for row "+i+", coumn "+ j);
				nums[i][j] = 1;
			}//inner for
		}//out for
		
		for (int i=0; i<nums.length; i++) {
			System.out.print("{");
			for(int j=0; j<nums[i].length; j++) {				
				System.out.print(nums[i][j]+" ");
			}//inner for
			System.out.print("}");
			System.out.println("");
		}//out for
		
		String[] works;
		works = new String[5];
		for(int i=0; i<works.length; i++) {
			works[i] = "temp";
		}//end for
		for(int i=0; i<works.length; i++) {
			System.out.print(works[i]);
		}//end for
		
		Flores flores = new Flores("test");
		Flores[] myFlores = flores.getMyFlores();
		System.out.println(Arrays.toString(myFlores));
	}//main method
}
