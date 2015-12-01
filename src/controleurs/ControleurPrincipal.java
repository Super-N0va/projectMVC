package controleurs;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import vues.Design;
import vues.panelEleve;
import classes.Division;
import classes.Eleve;
import dao.DAO;
import dao.DivisionDAO;
import dao.EleveDAO;

public class ControleurPrincipal implements ActionListener {
	private Design design; 
	private DAO<Division> laDivision = new DivisionDAO();
	private DAO<Eleve> lEleve = new EleveDAO();
	
	public ControleurPrincipal() {
		super();
	}
	
	public void lienVue(Design design) {
		this.design = design;
	}
	
	public ControleurPrincipal(DAO<Division> modeleD, DAO<Eleve> modeleE)
	{
		this.laDivision = modeleD;
		this.lEleve = modeleE;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == design.mntmFermer)
		{
			design.dispose();
		}
		
		if (e.getSource() == design.mntmVisualiser)
		{
			
		}
	}
	
	
	
}
