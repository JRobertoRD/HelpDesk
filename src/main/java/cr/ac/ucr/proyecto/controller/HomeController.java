package cr.ac.ucr.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "homeController")
public class HomeController {

	
	@GetMapping({"/index","home","/"})
	public String index() {
		
		return "home";
	}
}
