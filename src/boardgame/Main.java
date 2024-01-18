package boardgame;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck d = new Deck();
		
		String resp= "y";
		String resp_ = "y";
		int option;
		Scanner in = new Scanner(System.in);
		while(resp.equals(resp_)) {
			System.out.println("1-criar cartas: ");			
			System.out.println("2-embaralhar cartas: ");		
			System.out.println("3-mostrar cartas: ");
			System.out.println("4-mostrar hand: ");
			System.out.println("5-Sair(y/n): ");
			option = in.nextInt();
			if(option==1) {
				//Deck d = new Deck();
			}
			else if(option ==2){
				d.shuffle();
			}
			else if(option ==3) {
				d.print();
			}
			else if(option == 5){
				System.out.println("Encerrando programa");
				resp = "sair";
			}//end if else				
		}//end while loop		
	}//end main method
}//end class Deck
