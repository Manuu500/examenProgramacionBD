package controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.CentroEducativo;
import model.Nivel;

public class ControladorNivel {

	/**
	 * 
	 * @return
	 */
	public static List<Nivel> encuentraTodosPrimerInstituto() {
		List<Nivel> niveles = new ArrayList<Nivel>();
		
		niveles.removeAll(niveles);
		try {
			Connection conn = ConnectionManager.getConexion();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from colegio.nivel where idCentro = 1");
			
			while (rs.next()) {
				Nivel n = new Nivel();
				n.setDescripcion(rs.getString("descripcion"));
				niveles.add(n);
			}
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return niveles;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public static List<Nivel> encuentraTodosSegundoInstituto() {
		List<Nivel> niveles = new ArrayList<Nivel>();
		
		try {
			Connection conn = ConnectionManager.getConexion();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from colegio.nivel where idCentro = 2");
			
			while (rs.next()) {
				Nivel n = new Nivel();
				n.setDescripcion(rs.getString("descripcion"));
				niveles.add(n);
			}
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return niveles;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public static List<Nivel> encuentraTodosTercerInstituto() {
		List<Nivel> niveles = new ArrayList<Nivel>();
		
		try {
			Connection conn = ConnectionManager.getConexion();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from colegio.nivel where idCentro = 3");
			
			while (rs.next()) {
				Nivel c = new Nivel();
				c.setDescripcion(rs.getString("descripcion"));
				niveles.add(c);
			}
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return niveles;
	}
}
