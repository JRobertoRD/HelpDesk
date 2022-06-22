package cr.ac.ucr.proyecto.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "internet")
public class Internet implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idInternet;
	
	private String nombre;
	private int precio;
	
	
	public int getIdInternet() {
		return idInternet;
	}
	public void setIdInternet(int idInternet) {
		this.idInternet = idInternet;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Internet [idInternet=" + idInternet + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	
	
}
	
	
	
	