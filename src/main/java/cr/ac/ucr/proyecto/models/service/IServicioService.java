package cr.ac.ucr.proyecto.models.service;


import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;


import cr.ac.ucr.proyecto.models.Servicio;

public interface IServicioService {

	public List<Servicio> listarTodo();
	public void guardar (Servicio servicio);
	public Servicio buscarXId(int id);
	public void eliminar(int id);
	public Page<Servicio> getAll(Pageable pageRequest);
}
