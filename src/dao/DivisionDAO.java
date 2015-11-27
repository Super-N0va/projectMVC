package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import classes.Division;

public class DivisionDAO extends DAO<Division> {

		public void create(Division obj) {
			try {
				 	PreparedStatement prepare = this.connect
	                                                .prepareStatement("INSERT INTO \"mvc\".division VALUES(?, ?)"
	                                                    );
					prepare.setString(1,obj.getCode());
					prepare.setString(2, obj.getLibelle());
					
					prepare.executeUpdate();
					obj = this.read(obj.getCode());	
					
				}
		    catch (SQLException e) {
		            e.printStackTrace();
		    }
		    
		}
		
		
		
		public Division read(String code) {
			Division laDivision = new Division();
			try {
	            ResultSet result = this .connect
	                                    .createStatement(
	                                            	ResultSet.TYPE_SCROLL_INSENSITIVE, 
	                                                ResultSet.CONCUR_UPDATABLE)
	                                    .executeQuery("SELECT * FROM \"mvc\".division WHERE code = '" + code +"'");
	            if(result.first())
	            		laDivision = new Division(code, result.getString("libelle"));   
			    } catch (SQLException e) {
			            e.printStackTrace();
			    }
			   return laDivision;
		}
		
		public void update(Division obj) {
			try {
				
	                this .connect	
	                     .createStatement(
	                    	ResultSet.TYPE_SCROLL_INSENSITIVE, 
	                        ResultSet.CONCUR_UPDATABLE
	                     ).executeUpdate(
	                    	"UPDATE \"mvc\".division SET libelle = '" + obj.getLibelle() + "'"+
	                    	" WHERE code = '" + obj.getCode()+"'"
	                     );
				
				obj = this.read(obj.getCode());
		    } catch (SQLException e) {
		            e.printStackTrace();
		    }
		    
		    
		}


		public void delete(Division obj) {
			try {
				
	                this    .connect
	                    	.createStatement(
	                             ResultSet.TYPE_SCROLL_INSENSITIVE, 
	                             ResultSet.CONCUR_UPDATABLE
	                        ).executeUpdate(
	                             "DELETE FROM \"mvc\".division WHERE code = '" + obj.getCode()+"'"
	                        );
				
		    } catch (SQLException e) {
		            e.printStackTrace();
		    }
		}

		

}
