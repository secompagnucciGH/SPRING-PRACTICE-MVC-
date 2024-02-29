package es.pildoras.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AlumnosControlador {

    @GetMapping("/muestraFormulario")
    public String muestraFormulario() {
        return "alumnosFormulario";
    }

    
    
    @PostMapping("/procesarFormulario")
    public String procesarFormulario(@RequestParam("nombreAlumno") String nombreAlumno, Model model) {
        // Aquí puedes procesar los datos del formulario, si es necesario
        
        // Después de procesar el formulario, redirige a la página final
        model.addAttribute("nombreAlumno", nombreAlumno);
        return "alumnosProcesarFormulario"; // Esta es la vista que deseas mostrar después de procesar el formulario
    }
    
    
    
    @RequestMapping("/procesarFormulario2")
    public String procesarFormularioSecundario (HttpServletRequest request, Model Modelo) {
		// lee la informacion del cuadro de texto
    	
    	String nombre = request.getParameter("nombreAlumno");
    	
    	nombre += " es el mejor alumno";
    	
    	// concatena 
    	
    	String mensajeFinal = "¿Quien es el mejor alumno?" + nombre;
    	
    	// agregando datos al modelo
    	
    	Modelo.addAttribute("mensajeIdentificativo", mensajeFinal);
    	
    	// devuelve la vista
    	return "alumnosProcesarFormulario";

    }
}
