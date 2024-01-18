package advancedexercise;
import java.util.Scanner;
public class CalularMatrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//declaração de variavel
		String resp= "y";
		int key = 0;		
		Object resp_0 = null;
		//declarando intancia de matrizes
		//menu of options with do while
		do {
			System.out.println("Menu de opçoes");
			System.out.println("1 - para criar matriz A");
			System.out.println("2 - para criar matriz B");
			System.out.println("3 - Somar as matrizes A e B");
			System.out.println("4 - Subtrair as matrizes A e B");
			System.out.println("5 - Multlicar matrizes A e B");
			System.out.println("6 - para sair");
			System.out.println("Escolha agora");
			key = in.nextInt();
			switch (key) {
				case 1: System.out.println(toString(creatMatriz_A()));
				break;
				case 2: System.out.println(toString(creatMatriz_B()));
				break;
				case 3:	System.out.println(toString(sumMatrix(creatMatriz_A(), creatMatriz_B())));
				break;
				case 4:	System.out.println(toString(subMatrix(creatMatriz_A(), creatMatriz_B())));
				break;
				case 5: System.out.println(toString(multMatrix(creatMatriz_A(), creatMatriz_B())));
				break;				
				default: System.out.println("invalid option/confirme y/n");
			}//end while
			System.out.print("Repetir o processo: ");
			resp_0 = in.next();
		}//end do		
		while(resp_0.equals(resp));
		in.close();
		System.out.println("Encerrando programa");		
		
	}//end method main

	//method that create matriz A
	public static double[][] creatMatriz_A(){
		double[][] A;
		A = new double[][] {{3,4},
			{5,6}};
		return A;
	}//end method creatMatriz_A
	
	//Method that create matriz B
	public static double[][] creatMatriz_B() {
		double [][] B;
		B = new double[][] {{1,0},
			{-2,3}};
		return B;
	}//end method creatMatriz_B
	
	//Method that create Matrix C with the sum of Matrix A with Matrix B
	public static double[][] sumMatrix(double[][] A, double[][] B){
		double[][] C;
		C = new double[2][2];
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<B[i].length; j++) {
				C[i][j] = A[i][j]+B[i][j];
			}//end inner for
		}//end out for
		return C;
	}//end method sumMatix
	
	//Method that create Matrix C with the subtraction of Matrix with Matrix B
	public static double[][] subMatrix(double[][] A, double[][] B){
		double[][] C = new double[2][2];
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<B[i].length; j++) {
				C[i][j] = A[i][j] - B[i][j];
				
			}//end inner for j
		}//end out for i
		return C;
	}//end method subMatrix
	
	//Method that create Matrix C with multiply of Matrix A with Matrix B
	public static double[][] multMatrix(double[][] A, double[][] B){
		double[][] C = new double[2][2];
		int rown = A.length;  //linhas de da matriz A
		int cols = B[0].length;  //colunas da matrix B
		for(int i=0; i<rown; i++) {
			for(int j=0; j<cols; j++) {
				for(int k=0; k<A[0].length; k++) {
					C[i][j] += A[i][k] * B[k][j];					
				}//end inner for k
			}//end inner for j
		}//end out for i
		return C;
	}// method multMatrix
	
	//Metodo auxiliar para converter uma matrix to String
	private static String toString(double[][] matrix) {
		String aux = "";
		for(int i=0; i<matrix.length; i++) {
			aux += "[" + matrix[i][0];	//no prmeiro laço é adicionando a chave de abertura do array e i primeiro indice da linha
			for(int j=1; j<matrix[i].length; j++) {
				aux += "," + matrix[i][j];
			}//end inner for j
			aux +="]";	//no final do segundo laço é adicionando a chave de fechamento do array interno
			if(i != matrix.length -1) {	//caso não esteja na linha final será
				aux +="\n";	//adicionando uma quebra de linha
			}//end if
		}//end out for i;
		return aux;
	}//end method toString
}//end class CalcularMatrizes
