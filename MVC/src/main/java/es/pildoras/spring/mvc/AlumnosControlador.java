package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlumnosControlador {

	@RequestMapping ("/muestraFormulario")
	public String muestraFormulario() {
		
		// proporciona el formulario
		
		return "alumnosFormulario";
		
		}
	
	@RequestMapping ("procesarFormulario")
	public String procesarFormulario () {
	
		return "alumnosProcesarFormulario";
	}
}
