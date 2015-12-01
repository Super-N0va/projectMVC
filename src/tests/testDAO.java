package tests;
import classes.Division;
import classes.Eleve;
import dao.DAO;
import dao.DivisionDAO;
import dao.EleveDAO;

public class testDAO {

	public static void main(String[] args) {
		DAO<Eleve> eleve = new EleveDAO();
		DAO<Division> division = new DivisionDAO();
		
		Division maDivision = new Division("STS2","classe bts SIO 2");
		
		division.create(maDivision);
		
		System.out.println(division.read("STS2").toString());
		
		maDivision = new Division("STS2","classe bts sio 3");
		
		division.update(maDivision);
		
		System.out.println(division.read("STS2").toString());
		
		division.delete(maDivision);
		
		division.readAll();
		
		
		Eleve unEleve = new Eleve("TR2", "Troudman", "Roger","15/05/1996", new Division("STS1","classe bts SIO 1"));
		
		eleve.create(unEleve);
		
		System.out.println(eleve.read("TR2").toString());
		
		unEleve = new Eleve("TR2", "Troudalidalibaman", "Rogerito","15/05/1996", new Division("STS1","classe bts SIO 1"));
		
		eleve.update(unEleve);
		
		System.out.println(eleve.read("TR2").toString());
		
		eleve.delete(unEleve);
		
	
	}

}
