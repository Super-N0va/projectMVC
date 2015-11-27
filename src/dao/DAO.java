package dao;

import java.sql.Connection;

public abstract class DAO<T> {

	public Connection connect = ConnexionPostgreSql.getInstance();
	/**
	 * 
	 * @param obj
	 * Correspond au tuple que l'on souhaite enregistrer
	 */
	public abstract void create(T obj);
	/**
	 * 
	 * @param pk
	 * Correspond � la valeur de la cl� primaire d'un tuple que l'on souhaite lire
	 * @return Retourne le tuple � lire
	 */
	public abstract T read(String pk);
	/**
	 * 
	 * @param obj
	 * Correspond au tuple que l'on souhaite mettre � jour
	 */
	public abstract void update(T obj);
	/**
	 * 
	 * @param obj
	 * Correspond au nom du tuple que l'on souhaite supprimer
	 */
	public abstract void delete(T obj);
}
