package vues;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import java.awt.TextField;

import javax.swing.JTextArea;
import javax.swing.JButton;

import classes.Division;
import controleurs.ControleurPrincipal;

public class panelEleve extends JPanel {
	private JTextField txtPrenom;
	private JTextField txtNom;
	private JTextField txtDateNaiss;
	protected ControleurPrincipal controleur;
	public Division division;

	/**
	 * Create the panel.
	 */
	public panelEleve(ControleurPrincipal unControleur) {
		this.controleur = unControleur;
		
		// Définition de la vue		
		setLayout(null);		
		JLabel lblClasse = new JLabel();
		lblClasse.setFont(new Font("Arial", Font.BOLD, 13));
		lblClasse.setBounds(24, 29, 130, 14);
		add(lblClasse);
		
		JLabel lblEleve = new JLabel("S\u00E9lectionner un \u00E9l\u00E8ve :");
		lblEleve.setFont(new Font("Arial", Font.BOLD, 12));
		lblEleve.setBounds(10, 82, 166, 14);
		add(lblEleve);
		
		JComboBox cbbEleve = new JComboBox<String>();
		cbbEleve.setBounds(151, 80, 28, 20);
		add(cbbEleve);
		
		txtPrenom = new JTextField();
		txtPrenom.setEnabled(false);
		txtPrenom.setBounds(145, 133, 106, 20);
		add(txtPrenom);
		txtPrenom.setColumns(10);
		
		txtNom = new JTextField();
		txtNom.setEnabled(false);
		txtNom.setBounds(24, 133, 105, 20);
		add(txtNom);
		txtNom.setColumns(10);
		
		txtDateNaiss = new JTextField();
		txtDateNaiss.setEnabled(false);
		txtDateNaiss.setBounds(24, 164, 106, 20);
		add(txtDateNaiss);
		txtDateNaiss.setColumns(10);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setEnabled(false);
		btnModifier.addActionListener(controleur);
		btnModifier.setBounds(40, 227, 89, 23);
		add(btnModifier);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setEnabled(false);
		btnSupprimer.addActionListener(controleur);
		btnSupprimer.setBounds(288, 227, 89, 23);
		add(btnSupprimer);
		
		JButton btnAddEleve = new JButton("Ajouter un nouvel \u00E9l\u00E8ve");
		btnAddEleve.setEnabled(false);
		btnAddEleve.addActionListener(controleur);
		btnAddEleve.setBounds(136, 266, 147, 23);
		add(btnAddEleve);

	}
	
	
	
}
