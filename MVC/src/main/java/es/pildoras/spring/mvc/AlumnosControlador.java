package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AlumnosControlador {

    @GetMapping("/muestraFormulario")
    public String muestraFormulario() {
        return "alumnosFormulario";
    }

    @GetMapping("/procesarFormulario")
    public String procesarFormulario(@RequestParam("nombreAlumno") String nombreAlumno, Model model) {
        // Aquí puedes procesar los datos del formulario, si es necesario
        
        // Después de procesar el formulario, redirige a la página final
        model.addAttribute("nombreAlumno", nombreAlumno);
        return "alumnosProcesarFormulario";
    }
}
