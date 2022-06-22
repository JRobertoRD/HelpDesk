package cr.ac.ucr.proyecto.models.service;

import java.util.List;

import cr.ac.ucr.proyecto.models.Empleado;

public interface IEmpleadoService {
	
	public List<Empleado> listarTodo();
	public void guardar (Empleado empleado);
	public Empleado buscarXId(int id);
	public void eliminar(int id);
	

}
