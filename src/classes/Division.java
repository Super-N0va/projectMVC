package classes;

public class Division {
	
	private String code;
	private String libelle;
	
	/**
	 * @return Retourne la valeur de la variable privée code
	 */
	public String getCode(){
		return code;
	}
	/**
	 * Permet d'affecter une valeur à la variable privée code
	 */
	public void setCode(String code){
		this.code = code;
	}
	/**
	 * @return Retourne la valeur de la variable privée libelle
	 */
	public String getLibelle(){
		return libelle;
	}
	/**
	 * Permet d'affecter une valeur à la variable privée libelle
	 */
	public void setLibelle(String libelle){
		this.libelle = libelle;
	}
	/**
	 * @return Retourne une chaîne de caractère composée des variables code et libelle
	 */
	
	public Division(){}
	
	public Division(String code,String libelle){
		this.code=code;
		this.libelle=libelle;
		
	}
	
	public String toString(){
		return code + " " + libelle;
	}
}
