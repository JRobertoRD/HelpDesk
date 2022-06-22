package cr.ac.ucr.proyecto.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cr.ac.ucr.proyecto.models.Internet;
import cr.ac.ucr.proyecto.models.repository.InternetRepository;

@Service
public class InternetServiceImplements implements IInternetService {

	@Autowired
	private InternetRepository interRepo;
	
	@Override
	public List<Internet> listarTodo() {
		// TODO Auto-generated method stub
		return (List<Internet>) interRepo.findAll();
	}

}
