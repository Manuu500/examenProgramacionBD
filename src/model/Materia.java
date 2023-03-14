package model;

public class Materia {

	private int id;
	private String nombre;
	private int idNivel;
	private String codigo;
	private String urlClassroom;
	private int admiteMateria;
	private String fechaInicio;
	
	/**
	 * 
	 */
	public Materia() {
		super();
	}

	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param idNivel
	 * @param codigo
	 * @param urlClassroom
	 * @param admiteMateria
	 * @param fechaInicio
	 */
	public Materia(int id, String nombre, int idNivel, String codigo, String urlClassroom, int admiteMateria,
			String fechaInicio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.idNivel = idNivel;
		this.codigo = codigo;
		this.urlClassroom = urlClassroom;
		this.admiteMateria = admiteMateria;
		this.fechaInicio = fechaInicio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdNivel() {
		return idNivel;
	}

	public void setIdNivel(int idNivel) {
		this.idNivel = idNivel;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getUrlClassroom() {
		return urlClassroom;
	}

	public void setUrlClassroom(String urlClassroom) {
		this.urlClassroom = urlClassroom;
	}

	public int getAdmiteMateria() {
		return admiteMateria;
	}

	public void setAdmiteMateria(int admiteMateria) {
		this.admiteMateria = admiteMateria;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Override
	public String toString() {
		return "Materia [id=" + id + ", nombre=" + nombre + ", idNivel=" + idNivel + ", codigo=" + codigo
				+ ", urlClassroom=" + urlClassroom + ", admiteMateria=" + admiteMateria + ", fechaInicio=" + fechaInicio
				+ "]";
	}
	
	
	
}
