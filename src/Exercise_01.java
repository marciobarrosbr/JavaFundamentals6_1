/** Declare uma pontuação do nome de array de uma dimensão do tipo int que possa conter 9 valores
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class Exercise_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare uma pontuação do nome de array de uma dimensão do tipo int que possa conter 9 valores
		int[] nums;
		nums = new int[9];
		for(int i=0; i<nums.length; i++){
			nums[i] = i;
		}//end for
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]);
		}
		
		System.out.println("");
		
		// Declare um array bidimensional chamado price do tipo flutuante que tenha 10 linhas e 3 colunas.
		double[][] price;
		price = new double[10][3];
		for(int i=0; i<price.length; i++) {
			for(int j=0; j<price[i].length; j++) {
				price[i][j] += 0.1 * 2; 
			}//end inner for
		}//end out for
		for(int i=0;i<price.length; i++) {
			for(int j=0; j<price[i].length; j++) {
				System.out.print(price[i][j]);
			}//end inner for
		}//end out for
		
		System.out.println("");
		
		// Declare e inicialize um array bidimensional denominado matrix do tipo long que tenha 4 linhas e 3 colunas para ter todos os 
		//valores definidos como 5
		long[][] matrix;
		matrix = new long[4][3];
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				matrix[i][j] = 5;
			}//end inner for
		}//end out for
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
			}
		}
		System.out.println("");
		//Declare e inicialize um array de byte unidimensional denominado values de tamanho 10 para que todas as entradas 
		//contenham 1
		byte[] values;
		values = new byte[10];
		for(int i=0; i<values.length; i++) {
			values[i] =1;
		}//end for
		for(int i= 0; i<values.length; i++) {
			System.out.print(values[i]);
		}//end for
		
		System.out.println("");
		
		int num[] = {0,1,0,6,0,5,0,4};
		for(int i=0; i<8; i=i + 2) {			
			System.out.print(num[i]);
		}//end for
		System.out.println("");
		System.out.println(num.length);
		
		System.out.println("");
		
		//Sem digitar o código, determine a saída do seguinte programa.
		int[][] num_1 = {{3,3,3},{2,2,2}};
		int[] array = {4,3,2};
		for(int i = 0; i < 3; i++){
			num_1[1][i] = num_1[0][i]+array[i];
		}//end for
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(num_1[i][j]);
			}//out inner for
			System.out.println();
		}//end out for
		
		System.out.println("");		
	}//end method main
}//end class Exercise_01
