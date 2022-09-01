package pe.blueskyairlines.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.blueskyairlines.Model.Pais;
import pe.blueskyairlines.Service.PaisService;




@Controller
public class PaisController {
	
	
	
	@Autowired
	private PaisService paisService;
	
	
	@RequestMapping( value = "/Paises", method = RequestMethod.GET)
	public String PaisGET(Map map) {
		
	map.put("bPais", paisService.FindAll());

	 return "/Pais/listar";
	}
	
	@RequestMapping( value = "/RegistrarPais", method = RequestMethod.GET)
	public String RegistrarPais_GET(Model model) {

	 model.addAttribute("Pais", new Pais());
	return "/Pais/registrar";
	}

	@RequestMapping( value = "/Pais_registrar", method = RequestMethod.POST)
	public String RegistrarPais_POST(Pais pais) {

		paisService.Insert(pais);
	return "redirect:/listado_pais";
	}

	@RequestMapping( value = "/EditarPais/{paisid}", method = RequestMethod.GET)
	public String EditarPais_GET(Model model, @PathVariable("paisid") Integer paisid) {

	 model.addAttribute("Pais", paisService.FindByID(paisid));

	 return "/Pais/Editar";
	}

	@RequestMapping( value = "/EditarPais/{paisid}", method = RequestMethod.POST)
	public String EditarPais_POST(Pais pais) {

		paisService.Update(pais);

	 return "redirect:/listado_pais";
	}

	@RequestMapping( value = "/EliminarPais/{paisid}", method = RequestMethod.GET)
	public String EliminarPais_GET(Model model, @PathVariable("paisid") Integer paisid) {
		
		
	model.addAttribute("Pais", paisService.FindByID(paisid));

	 return "/Pais/Eliminar";
	}

	@RequestMapping( value = "/EliminarPais/{clienteid}", method = RequestMethod.POST)
	public String EliminarPais_POST(Pais pais) {

		paisService.Delete(pais.getPaisid());

	 return "redirect:/listado_pais";
	}

}
