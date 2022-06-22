package cr.ac.ucr.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping(value="/loginEmp")
public class Login_EmpleadoController {
	
	@GetMapping("/login_Emp")
	public String loginEmpleado() {
		return "empleados/loginEmpleados";
	}
	
	
	@GetMapping("/login")
	public String ingresar(){
		
	
		return "empleados/homeEmpleados";
							 
		
	}
	

}
