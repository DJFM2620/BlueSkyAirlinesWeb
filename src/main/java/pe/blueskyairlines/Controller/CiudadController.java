package pe.blueskyairlines.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.blueskyairlines.Model.Ciudad;
import pe.blueskyairlines.Service.CiudadService;


@Controller
public class CiudadController {

	
	@Autowired
	private CiudadService ciudadService;
	
	
	@RequestMapping( value = "/Ciudades", method = RequestMethod.GET)
	public String CiudadGET(Map map) {
		
	map.put("bCiudad", ciudadService.FindAll());

	 return "/Ciudad/listar";
	}
	
	@RequestMapping( value = "/RegistrarCiudad", method = RequestMethod.GET)
	public String RegistrarCiudad_GET(Model model) {

	 model.addAttribute("Ciudad", new Ciudad());
	return "/Ciudad/registrar";
	}

	@RequestMapping( value = "/Ciudad_registrar", method = RequestMethod.POST)
	public String RegistrarCiudad_POST(Ciudad ciudad) {

		ciudadService.Insert(ciudad);
	return "redirect:/listado_ciudad";
	}

	@RequestMapping( value = "/EditarCiudad/{ciudadid}", method = RequestMethod.GET)
	public String EditarCiudad_GET(Model model, @PathVariable("ciudadid") Integer ciudadid) {

	 model.addAttribute("Ciudad", ciudadService.FindByID(ciudadid));

	 return "/Ciudad/Editar";
	}

	@RequestMapping( value = "/EditarCiudad/{ciudadid}", method = RequestMethod.POST)
	public String EditarCiudad_POST(Ciudad ciudad) {

		ciudadService.Update(ciudad);

	 return "redirect:/listado_ciudad";
	}

	@RequestMapping( value = "/EliminarCiudad/{ciudadid}", method = RequestMethod.GET)
	public String EliminarCiudad_GET(Model model, @PathVariable("ciudadid") Integer ciudadid) {
		
		
	model.addAttribute("Ciudad", ciudadService.FindByID(ciudadid));

	 return "/Ciudad/Eliminar";
	}

	@RequestMapping( value = "/EliminarCiudad/{ciudadid}", method = RequestMethod.POST)
	public String EliminarCiudad_POST(Ciudad ciudad) {

		ciudadService.Delete(ciudad.getCiudadid());

	 return "redirect:/listado_ciudad";
	}
	
}
