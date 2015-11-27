package classes;

public class Eleve {
	private String code;
	private String nom;
	private String prenom;
	private String dateNaiss;
	private Division division;
	/**
	 * @return Retourne la valeur de la variable privée code
	 */
	public String getCode(){
		return code;
	}
	
	/**
	 * @return Retourne la valeur de la variable privée nom
	 */
	public String getNom(){
		return nom;
	}
	
	/**
	 * @return Retourne la valeur de la variable privée prenom
	 */
	public String getPrenom(){
		return prenom;
	}
	
	/**
	 * @return Retourne la valeur de la variable privée dateNaiss
	 */
	public String getDateNaiss(){
		return dateNaiss;
	}
	
	/**
	 * @return Retourne la valeur de la variable privée division
	 */
	public Division getDivision(){
		return division;
	}
	
	/**
	 * Permet d'affecter une valeur à la variable privée code
	 */
	public void setCode(String code){
		this.code=code;		
	}
	
	/**
	 * Permet d'affecter une valeur à la variable privée nom
	 */
	public void setNom(String nom){
		this.nom=nom;
	}
	
	/**
	 * Permet d'affecter une valeur à la variable privée prenom
	 */
	public void setPreom(String prenom){
		this.prenom=prenom;
	}
	
	/**
	 * Permet d'affecter une valeur à la variable privée dateNaiss
	 */
	public void setDateNaiss(String dateNaiss){
		this.dateNaiss=dateNaiss;
	}
	
	/**
	 * Permet d'affecter une valeur à la variable privée division
	 */
	public void setDivision(Division division){
		this.division=division;
	}
	
	/**
	 * Constructeur par défaut
	 */
	public Eleve(){}
	
	/**
	 * Constructeur initialisé
	 * @param code
	 * @param nom
	 * @param prenom
	 * @param dateNaiss
	 */
	public Eleve(String code,String nom,String prenom,String dateNaiss, Division division){
		this.code=code;
		this.nom=nom;
		this.prenom=prenom;
		this.dateNaiss=dateNaiss;
		this.division=division;
	}
	
	/**
	 * @return Retourne une chaîne de caractère composée des variables code, nom, prenom et dateNaiss
	 */
	public String toString(){
		return code + " " + nom + " " + prenom + " " + dateNaiss + " " + division.toString();
		
	}
}
