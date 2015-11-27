package tests;
import classes.Eleve;
import classes.Division;

public class TestsEleve {

	public static void main(String[] args) {
		
		Eleve eleve1;
		
		Eleve eleve2 = new Eleve("zrr","Rabbit","Roger","26/10/1998",new Division("azr","TerminaleS1"));
		
		System.out.print(eleve2.toString());
	}

}
