package vues;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import controleurs.ControleurPrincipal;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Design extends JFrame {

	protected ControleurPrincipal controleur;
	
	private JMenuBar menuBar;
	private JMenuBar mnDivision;
	private JMenuBar mnEleves;
	private JPanel contentPanel;
	
	public JMenuItem mntmVisualiser;
	public JMenuItem mntmModifier;
	public JMenuItem mntmAjouter;
	public JMenuItem mntmSupprimer;
	public JMenuItem mntmFermer;

	public panelEleve panelEleve;
	
	
	/**
	 * Create the frame.
	 */
	public Design(ControleurPrincipal unControleur) {
		this.controleur = unControleur;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnDivision = new JMenu("Division");
		menuBar.add(mnDivision);
		
		JMenuItem mntmVisualiser = new JMenuItem("Visualiser");
		mntmVisualiser.addActionListener(controleur);		
		mnDivision.add(mntmVisualiser);
		
		JMenuItem mntmModifier = new JMenuItem("Modifier");
		mntmModifier.addActionListener(controleur);		
		mnDivision.add(mntmModifier);
		
		JMenuItem mntmAjouter = new JMenuItem("Ajouter");
		mntmAjouter.addActionListener(controleur);
		mnDivision.add(mntmAjouter);
		
		JMenuItem mntmSupprimer = new JMenuItem("Supprimer");
		mntmSupprimer.addActionListener(controleur);		
		mnDivision.add(mntmSupprimer);
		
		JMenu mnEleves = new JMenu("El\u00E8ves");
		menuBar.add(mnEleves);
		
		JMenuItem mntmFermer = new JMenuItem("Fermer");
	    mntmFermer.addActionListener(controleur);
		menuBar.add(mntmFermer);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPanel);
	}

}
