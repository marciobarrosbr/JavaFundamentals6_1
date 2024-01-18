import java.util.Scanner;

public class Student {
	
	private String name;
	
	public Student(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public static void main(String[]args) {
		//Assume studentNames is initialized with 12 names		
		String[] studentName = {"marcio","fernando","batista",
				"barros","maria","silva",
				"barros","luna","barros",
				"Lorenna","silva","barros"};		
		
		Student[][] groups = new Student[4][3];
		int x=0;
		for(int i=0; i<groups.length; i++) {
			for(int j=0; j<groups[i].length; j++) {
				String name = studentName[x];
				groups[i][j] = new Student(name);
				x++;
			}//inner for
		}//out for
		for(int i=0; i<groups.length; i++) {
			for(int j=0; j<groups[i].length; j++) {
				System.out.print(groups[i][j].name+" ");
			}//inner for
			System.out.println("");
		}
		Flores[] myFlores = new Flores[1];
		System.out.println(myFlores.length);
	}//end main method
}
