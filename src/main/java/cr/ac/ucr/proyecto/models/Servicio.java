package cr.ac.ucr.proyecto.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "servicio")
public class Servicio implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idServicio;
	
	private String nombre;
	private int precio;
	
	
	@OneToOne
	@JoinColumn(name = "idInternet")
	private Internet internet;
	
	@OneToOne
	@JoinColumn(name = "idTelefonia")
	private Telefonia telefonia;
	
	@OneToOne
	@JoinColumn(name = "idCable")
	private  Cable cable;
	
	
	public int getIdServicio() {
		return idServicio;
	}
	public void setIdServicio(int idServicio) {
		this.idServicio = idServicio;
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
	public Internet getInternet() {
		return internet;
	}
	public void setInternet(Internet internet) {
		this.internet = internet;
	}
	public Telefonia getTelefonia() {
		return telefonia;
	}
	public void setTelefonia(Telefonia telefonia) {
		this.telefonia = telefonia;
	}
	public Cable getCable() {
		return cable;
	}
	public void setCable(Cable cable) {
		this.cable = cable;
	}

	
	
	
	
	
	
	

}
