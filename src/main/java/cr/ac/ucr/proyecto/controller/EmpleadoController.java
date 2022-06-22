package cr.ac.ucr.proyecto.controller;

import java.util.List;

import javax.naming.Binding;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cr.ac.ucr.proyecto.models.Empleado;
import cr.ac.ucr.proyecto.models.service.IEmpleadoService;

@Controller
@RequestMapping(value = "empleadoController")
public class EmpleadoController {
	
	@Autowired
	private IEmpleadoService empleadoService;
	
	@GetMapping("/listarEmpleados")
	public String listarEmpleados(Model model) {
		
		model.addAttribute("titulo", "Listado de empleados");
		List<Empleado> listaEmpleado = empleadoService.listarTodo();
		
		model.addAttribute("empleados", listaEmpleado);
		
		return "empleados/listar_Empleados";
	}
	
	@GetMapping("/create")
	public String crear(Model model) {
		
		Empleado empleado = new Empleado();
		
		model.addAttribute("titulo", "Ingresar nuevo empleado");
		model.addAttribute("empleado", empleado);
		return "empleados/createEmpleados";
	}
	
	@PostMapping("/save")
	public String guardar(@Valid @ModelAttribute Empleado empleado, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			
			model.addAttribute("titulo", "Ingresar nuevo empleado");
			model.addAttribute("empleado", empleado);
			System.out.println("Errores en el form");
			return "empleados/createEmpleados";
			
		}
		
		empleadoService.guardar(empleado);
		return "redirect:/empleadoController/listarEmpleados";
	}
	
	@GetMapping("/edit/{codigo}")
	public String editar(@PathVariable("codigo") int codigoEmpleado,Model model) {
		
		Empleado empleado = empleadoService.buscarXId(codigoEmpleado);
		
		model.addAttribute("titulo", "Editar empleado");
		model.addAttribute("empleado", empleado);
		return "empleados/createEmpleados";
	}
	
	@GetMapping("/delete/{codigo}")
	public String delete(@PathVariable("codigo") int codigoEmpleado,Model model) {
		

		empleadoService.eliminar(codigoEmpleado);
		System.out.println("Registro eliminado con exito");
		
		return "redirect:/empleadoController/listarEmpleados";
	}


}
