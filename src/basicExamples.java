
public class basicExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare an array using two lines of code
		String[] myBouquet;
		myBouquet = new String[6];
		myBouquet[0] = "Rosa";  //value in each index
		System.out.println(myBouquet[0]);  //show out the value of index "0"
		
		myBouquet[1] = "Girassol"; //Store "Girassol" as the second element
		myBouquet[2] = "Margarida";//and so on
		myBouquet[3] = "Dente-de-leão"; 
		myBouquet[4] = "Violeta";
		myBouquet[5] = "Lírio";
		//use a for each to iterate through the array
		//using Loop for-each to show the values
		for(String myFlowers: myBouquet) {
			System.out.print(myFlowers);
			System.out.print(" ");
		}//end for
		System.out.println("");
		for(int index=0; index<myBouquet.length; index++) {
			System.out.print(myBouquet[index]+" ");			
		}//end for
		System.out.println("");
		//declare an array using one line of code
		String[] myBouguet_2 = new String[6];
		
		//declare an array using two lines of code
		String[] variableName;
		variableName = new String[5];
				
		//declare an array using one line of code
		String[] variableName_2 = new String[5];
		
		//declare an array that the values are already known
		String[][] myBouquet_2 = {
			{"Red", "Peach", "Yellow"}, 
			{"Yellow", "White", "Blue"}, 
			{"Green", "Blue", "Purple"}, 
			{"White", "White", "White"}, 
			{"Purple", "Pink", "Violet"}, 
			{"Pink", "Orange", "White"}};
		
		//use a for loop to iterate through the array
		for (int i = 0; i<myBouquet_2.length; i++) {
			System.out.print("{");
			for(int j=0; j<myBouquet_2[i].length; j++){
				System.out.print(myBouquet_2[i][j]+", ");
			}//inner for
			System.out.print("}");
			System.out.println("");
		}//out for
		System.out.println(myBouquet_2[1][0] + " Rose.");  //retornar o valor no index especificado
		int numArrays = myBouquet_2.length;  //retorna a quantidade de linhas
		System.out.println("Linhas: "+ numArrays);
		int numElementsInEach = myBouquet_2[5].length;  //retorna a quantidade de arry internos
		System.out.println("Elementos: "+numElementsInEach);
		
		
		
		
		int[] allTwos = new int[10];
		for(int index = 0; index<allTwos.length; index++) {
			allTwos[index] = 2;
		}
		for (int index = 0; index<allTwos.length; index ++) {
			System.out.print(allTwos[index]+", ");
		}
		System.out.println("");	
		
		System.out.println("");
		
		//declaração de array bidimencional
		//array bidimencional é um array de arrays
		int[][] nums = {{14,15,16},{12,13,11}};
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				System.out.println(nums[i][j]);
			}//inner for
			System.out.println("");
		}//out for
		
		//declaração de array bidimensional
		double [] [] nums2 = new double[2][3];
		
		//Inicializando um Array Bidimensional - Exemplo Método 1: 
		int[][] myArray = new int[3][2];
		myArray[0][0] = 7;
		myArray[0][1] = 24;
		myArray[1][0] = 352;
		myArray[1][1] = 2;
		myArray[2][0] = 37;
		myArray[2][1] = 65;
		for(int i=0; i<myArray.length; i++) {
			for(int j=0; j<myArray[i].length; j++) {
				System.out.print(myArray[i][j]+", ");
			}//inner for
			System.out.println("");
		}//out for
		
		System.out.println("");
		
		//Método 2: 
		int[][] myArray2 = new int[][] {{7, 24}, {352, 2}, {37, 65}};
		for(int i=0; i<myArray2.length; i++) {
			for(int j=0; j<myArray2[i].length; j++) {
				System.out.print(myArray2[i][j]+", ");
			}//inner for
			System.out.println("");
		}//out for
	}

}
