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
	 * Correspond à la valeur de la clé primaire d'un tuple que l'on souhaite lire
	 * @return Retourne le tuple à lire
	 */
	public abstract T read(String pk);
	/**
	 * 
	 * @param obj
	 * Correspond au tuple que l'on souhaite mettre à jour
	 */
	public abstract void update(T obj);
	/**
	 * 
	 * @param obj
	 * Correspond au nom du tuple que l'on souhaite supprimer
	 */
	public abstract void delete(T obj);
}
