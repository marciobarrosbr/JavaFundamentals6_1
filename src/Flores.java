import java.util.Arrays;

public class Flores {
	Flores[] myFlores = {new Flores("Rosa"),new Flores("Girassol"), new Flores("Margarida"),
			new Flores("Dandelion"), new Flores("Violeta"), new Flores("Lirio")};
	
	public Flores(String string) {
		// TODO Auto-generated constructor stub
	}
	public Flores(Flores[] myflores) {
		this.myFlores = myflores;
	}
	public Flores[] getMyFlores() {
		return myFlores;
	}//end get method
	
	public void setMyFlores(Flores[] myFlores) {
		this.myFlores = myFlores;
	}
	@Override
	public String toString() {
		String aux = ""+myFlores[0];
		return aux;
	}
	
}
