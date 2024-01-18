package advancedexercise;
import java.util.Scanner;
public class MediaExercise_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Em determinada aula, há 5 testes, cada um valendo 100 pontos. Crie um programa que considere as pontuações dos 5 testes 
		//do usuário, armazene as pontuações em um array e, em seguida, calcule a média dos alunos.8.
		Scanner in = new Scanner(System.in);
		double[] notas;
		notas = new double[5];
		double notaTotal = 0;
		double result = 0;
		System.out.println("Calculo da meida entre 5 testes");
		for(int i=0; i<notas.length; i++) {
			System.out.print("Digite a primeira o"+(i+1)+" nota; ");
			notas[i] = in.nextDouble();
			notaTotal = notaTotal+notas[i];
		}//end for
		result = notaTotal / notas.length;
		System.out.println("Media entre as 5 notas: "+result);
	}//end class MediaExercise_1

}
