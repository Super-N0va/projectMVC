package entree;

import vues.Design;
import controleurs.ControleurPrincipal;
import dao.DAO;
import dao.DivisionDAO;
import dao.EleveDAO;
import classes.Division;
import classes.Eleve;

public class PointEntree {
	
	public static Design graphique;
	
	public static void main(String[] args) {

	DAO<Division> modeleDivision = new DivisionDAO();
	DAO<Eleve> modeleEleve = new EleveDAO();	
		
	ControleurPrincipal controleurPrincipal = new ControleurPrincipal(modeleDivision, modeleEleve);

	
	controleurPrincipal.lienVue(graphique);
	
	
	}

	
}
