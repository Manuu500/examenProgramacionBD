package controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.CentroEducativo;

public class ControladorCentroEducativo {

	/**
	 * 
	 * @return
	 */
	public static List<CentroEducativo> encuentraTodos() {
		List<CentroEducativo> cursos = new ArrayList<CentroEducativo>();
		
		try {
			Connection conn = ConnectionManager.getConexion();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select descripcion from colegio.centroeducativo");
			
			while (rs.next()) {
				CentroEducativo c = new CentroEducativo();
				c.setDescripcion(rs.getString("descripcion"));
				cursos.add(c);
			}
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return cursos;
	}
	
	
}
