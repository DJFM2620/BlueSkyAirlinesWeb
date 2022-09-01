package pe.blueskyairlines.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.blueskyairlines.Model.Asiento;
import pe.blueskyairlines.Service.AsientoService;


@Controller
public class AsientoController {
	
	@Autowired
	private AsientoService asientoService;
	
	
	@RequestMapping( value = "/Asientos", method = RequestMethod.GET)
	public String AsientoGET(Map map) {
		
	map.put("bAsiento", asientoService.FindAll());

	 return "/Asiento/listar";
	}
	
	@RequestMapping( value = "/RegistrarAsiento", method = RequestMethod.GET)
	public String RegistrarAsiento_GET(Model model) {

	 model.addAttribute("Asiento", new Asiento());
	return "/Asiento/registrar";
	}

	@RequestMapping( value = "/Asiento_registrar", method = RequestMethod.POST)
	public String RegistrarAsiento_POST(Asiento asiento) {

		asientoService.Insert(asiento);
	return "redirect:/listado_asiento";
	}

	@RequestMapping( value = "/EditarAsiento/{asientoid}", method = RequestMethod.GET)
	public String EditarAsiento_GET(Model model, @PathVariable("asientoid") Integer asientoid) {

	 model.addAttribute("Asiento", asientoService.FindByID(asientoid));

	 return "/Asiento/Editar";
	}

	@RequestMapping( value = "/EditarAsiento/{asientoid}", method = RequestMethod.POST)
	public String EditarAsiento_POST(Asiento asiento) {

		asientoService.Update(asiento);

	 return "redirect:/listado_asiento";
	}

	@RequestMapping( value = "/EliminarAsiento/{asientoid}", method = RequestMethod.GET)
	public String EliminarAsiento_GET(Model model, @PathVariable("asientoid") Integer asientoid) {
		
		
	model.addAttribute("Asiento", asientoService.FindByID(asientoid));

	 return "/Asiento/Eliminar";
	}

	@RequestMapping( value = "/EliminarAsiento/{asientoid}", method = RequestMethod.POST)
	public String EliminarAsiento_POST(Asiento asiento) {

		asientoService.Delete(asiento.getAsientoid());

	 return "redirect:/listado_asiento";
	}

}
