package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import classes.Division;

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
	 * @param i
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
	
	public List<Division> readAll() {
		List<Division> divisions = new ArrayList<Division>();
		try {
			ResultSet result = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE).executeQuery("SELECT * FROM \"mvc\".Division");
			while (result.next()) {
				Division division = new Division(result.getString("code"), result.getString("libelle"));
				divisions.add(division);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return divisions;
	}
}
