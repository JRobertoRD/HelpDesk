package cr.ac.ucr.proyecto.controller;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cr.ac.ucr.proyecto.models.Cable;
import cr.ac.ucr.proyecto.models.Internet;
import cr.ac.ucr.proyecto.models.Servicio;
import cr.ac.ucr.proyecto.models.Telefonia;
import cr.ac.ucr.proyecto.models.service.ICableService;
import cr.ac.ucr.proyecto.models.service.IInternetService;
import cr.ac.ucr.proyecto.models.service.IServicioService;
import cr.ac.ucr.proyecto.models.service.ITelefoniaService;

@Controller
@RequestMapping(value = "ServiController")
public class ServicioController {
	
	@Autowired
	private IServicioService serviServ;
	
	@Autowired 
	private ICableService cabServ;
	
	@Autowired
	private IInternetService interServ;
	
	@Autowired
	private ITelefoniaService telServ;
	
	@GetMapping("/listarServicios")
	public String listarServicios(@RequestParam Map<String, Object> params, Model model) {
		
		/*****************************************Paginacion*****************************************************************/
		int page = params.get("page") != null ? (Integer.valueOf(params.get("page").toString())) - 1 : 0;
		
		PageRequest pageRequest = PageRequest.of(page, 10);
		
		Page<Servicio> pageServis = serviServ.getAll(pageRequest);
		
		int totalPage = pageServis.getTotalPages();
		
		if(totalPage > 0 ) {
			List<Integer> pages = IntStream.rangeClosed(1, totalPage).boxed().collect(Collectors.toList());
			model.addAttribute("pages", pages);
		}
		
		model.addAttribute("servicios", pageServis.getContent());
		
		/*****************************************Paginacion*****************************************************************/
		
		
		/*model.addAttribute("titulo", "Listado de Servicios");
		List<Servicio> listaServicios = serviServ.listarTodo();
		
		model.addAttribute("servicios", listaServicios);*/
						  
		return "servicios/listar_Servicios";
	}
	
	@GetMapping("/create")
	public String crear(Model model) {
		
		Servicio servicio = new Servicio();
		
		List<Internet> listarInternet = interServ.listarTodo();
		List<Cable> listarCable = cabServ.listarTodo();
		List<Telefonia> listarTelefonia = telServ.listarTodo();
		
		
		model.addAttribute("titulo", "Ingresar nuevo servicio");
		model.addAttribute("servicio", servicio);
		
		model.addAttribute("internet", listarInternet);
		model.addAttribute("cable", listarCable);
		model.addAttribute("telefono", listarTelefonia);
						  
		return "servicios/CreateServicio";
	}
	
	@PostMapping("/save")
	public String guardar(@ModelAttribute Servicio servicio) {
		
		serviServ.guardar(servicio);
		return "redirect:/ServiController/listarServicios";
	}
	
	@GetMapping("/edit/{idServicio}")
	public String editar(@PathVariable("idServicio") int idServicio,Model model) {
		
		Servicio servicio = serviServ.buscarXId(idServicio);
		
		List<Internet> listarInternet = interServ.listarTodo();
		List<Cable> listarCable = cabServ.listarTodo();
		List<Telefonia> listarTelefonia = telServ.listarTodo();
		
		model.addAttribute("internet", listarInternet);
		model.addAttribute("cable", listarCable);
		model.addAttribute("telefono", listarTelefonia);
		
		model.addAttribute("titulo", "Editar servicio");
		model.addAttribute("servicio", servicio);
		return "servicios/CreateServicio";
	}
	
	@GetMapping("/delete/{idServicio}")
	public String delete(@PathVariable("idServicio") int idServicio,Model model) {
		

		serviServ.eliminar(idServicio);
		System.out.println("Registro eliminado con exito");
		
		return "redirect:/ServiController/listarServicios";
	}
	
	/*public String paginacion(@RequestParam Map<String, Object> params, Model model) {
		
		int page = params.get("page") != null ? (Integer.valueOf(params.get("page").toString())) - 1 : 0;
		
		PageRequest pageRequest = PageRequest.of(page, 10);
		
		Page<Servicio> pageServis = serviServ.getAll((Pageable) pageRequest);
		
		int totalPage = pageServis.getTotalPages();
		
		if(totalPage > 0 ) {
			List<Integer> pages = IntStream.rangeClosed(1, totalPage).boxed().collect(Collectors.toList());
		}
		
		model.addAttribute("list", pageServis.getContent());
		
		return null;
		
	}*/

}
