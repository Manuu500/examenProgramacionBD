package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Materia;

public class ControladorMateria {
	static Scanner sc = new Scanner(System.in);
	
	
	
	/**
	 * 
	 * @param rs
	 * @return
	 */
	private static Materia getEntidadFromResultSet(String sql) {
		Materia materia = null;
		try {
			Connection conn = ConnectionManager.getConexion();
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery(sql);
			System.out.println(sql);
			if (rs != null && rs.next()) {
				materia = new Materia();
				materia.setId(rs.getInt("id"));
				materia.setNombre(rs.getString(2));
				materia.setCodigo(rs.getString(4));
				materia.setUrlClassroom(rs.getString(5));
				materia.setFechaInicio(rs.getString(7));
			}
			rs.close();
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return materia;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public static List<Materia> encuentraTodosPrimerInstituto() {
		List<Materia> Materia = new ArrayList<Materia>();
		
		
		try {
			Connection conn = ConnectionManager.getConexion();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select nombre from colegio.materia, colegio.centroeducativo where centroeducativo.id = 1"
					+ " ");
			
			while (rs.next()) {
				Materia n = new Materia();
				n.setNombre(rs.getString("nombre"));
				Materia.add(n);
			}
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return Materia;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public static List<Materia> encuentraTodosSegundoInstituto() {
		List<Materia> Materia = new ArrayList<Materia>();
		
		try {
			Connection conn = ConnectionManager.getConexion();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select nombre from colegio.materia, colegio.centroeducativo where centroeducativo.id = 2"
					+ "");
			
			while (rs.next()) {
				Materia n = new Materia();
				n.setNombre(rs.getString("nombre"));
				Materia.add(n);
			}
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return Materia;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public static List<Materia> encuentraTodosTercerInstituto() {
		List<Materia> Materia = new ArrayList<Materia>();
		
		try {
			Connection conn = ConnectionManager.getConexion();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select nombre from colegio.materia, colegio.centroeducativo where centroeducativo.id = 3"
					+ "");
			
			while (rs.next()) {
				Materia c = new Materia();
				c.setNombre(rs.getString("nombre"));
				Materia.add(c);
			}
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return Materia;
	}
	
	public static Materia ultimoElemento() {
		return getEntidadFromResultSet("select * from colegio.materia");
	}
	
	
	/**
	 * 
	 * @param c
	 * @return
	 */
	public static Materia modificar () {
		
		try {		
			System.out.println("Introduce el nombre que desea poner:");
			String nombre = sc.next();
			System.out.println("Intorduce el codigo");
			int codigo = sc.nextInt();
			System.out.println("Intorduce el urlClassroom");
			String url = sc.next();
			System.out.println("Intorduce el fecha");
			String fecha = sc.next();
			System.out.println("Introduce el id que quieras poner:");
			int id = sc.nextInt();
			Connection conn = ConnectionManager.getConexion();
			PreparedStatement ps = conn.prepareStatement(
					"update colegio.materia set nombre = ?, codigo = ?, urlClassroom = ?, fechaInicio = ? where id = ?");
		
			ps.setString(1, nombre);
			ps.setInt(2, codigo);
			ps.setString(3, url);
			ps.setString(4, fecha);
			ps.setInt(5, id);
			ps.executeUpdate();
			
			System.out.println("Los datos se actualizaron.");
			ps.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
