package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import classes.Eleve;
import classes.Division;

public class EleveDAO extends DAO<Eleve> {

	public void create(Eleve obj) {
		PreparedStatement prepare2 = null;
		try {
			PreparedStatement prepare = this.connect
					.prepareStatement("INSERT INTO \"mvc\".eleve VALUES(?, ?,?,?,?)"
							);
			prepare.setString(1,obj.getCode());
			prepare.setString(2, obj.getNom());
			prepare.setString(3, obj.getPrenom());
			prepare.setString(4, obj.getDateNaiss());

			
			DAO<Division> division = new DivisionDAO();
			Division res = division.read(obj.getDivision().getCode());
			
				if(res.getCode()!=null){
					prepare.setString(5, obj.getDivision().getCode());
				}

				else {
					System.out.println(res.getCode());
					prepare2 = this.connect
								   .prepareStatement("INSERT INTO \"mvc\".division VALUES(?, ?)");
					prepare2.setString(1, obj.getDivision().getCode());
					prepare2.setString(2, obj.getDivision().getLibelle());
					prepare2.executeUpdate();
					
					prepare.setString(5, obj.getDivision().getCode());
				}

			prepare.executeUpdate();
			
			
			obj = this.read(obj.getCode());

		}
		catch (SQLException e) {
			e.printStackTrace();
		}

	}



	public Eleve read(String code) {
		Eleve eleve = new Eleve();
		try {
			ResultSet result = this .connect
					.createStatement(
							ResultSet.TYPE_SCROLL_INSENSITIVE, 
							ResultSet.CONCUR_UPDATABLE)
							.executeQuery("SELECT * FROM \"mvc\".eleve WHERE code = '" + code +"'");
			
			

			if(result.first()){
				
				ResultSet result1 = this .connect
				.createStatement(
						ResultSet.TYPE_SCROLL_INSENSITIVE, 
						ResultSet.CONCUR_UPDATABLE)
						.executeQuery("SELECT libelle FROM \"mvc\".division WHERE code = '" + result.getString("codedivision") +"'");
				if(result1.first())
					eleve = new Eleve(code, result.getString("nom"),result.getString("prenom"),result.getString("dateNaiss"),new Division(result.getString("codedivision"),result1.getString("libelle")));   
			}
			} catch (SQLException e) {
			e.printStackTrace();
		}
		return eleve;
	}

	public void update(Eleve obj) {
		try {

			this .connect	
			.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE, 
					ResultSet.CONCUR_UPDATABLE
					).executeUpdate(
							"UPDATE \"mvc\".eleve SET nom = '" + obj.getNom() + "',prenom = '"+obj.getPrenom() +"', dateNaiss = '"+obj.getDateNaiss()+"', codeDivision = '"+obj.getDivision().getCode()+"'"+
									" WHERE code = '" + obj.getCode()+"'"
							);

			obj = this.read(obj.getCode());
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}


	public void delete(Eleve obj) {
		try {

			this    .connect
			.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE, 
					ResultSet.CONCUR_UPDATABLE
					).executeUpdate(
							"DELETE FROM \"mvc\".Eleve WHERE code = '" + obj.getCode()+"'"
							);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
