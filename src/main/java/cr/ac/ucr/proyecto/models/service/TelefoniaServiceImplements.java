package cr.ac.ucr.proyecto.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cr.ac.ucr.proyecto.models.Telefonia;
import cr.ac.ucr.proyecto.models.repository.TelefoniaRepository;

@Service
public class TelefoniaServiceImplements implements ITelefoniaService {

	@Autowired
	private TelefoniaRepository teleRepo;
	
	@Override
	public List<Telefonia> listarTodo() {
		// TODO Auto-generated method stub
		return (List<Telefonia>) teleRepo.findAll();
	}

}
