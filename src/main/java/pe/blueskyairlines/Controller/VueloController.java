package pe.blueskyairlines.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.blueskyairlines.Model.Vuelo;
import pe.blueskyairlines.Service.VueloService;



@Controller
public class VueloController {
	
	@Autowired
	private VueloService vueloService;
	
	
	@RequestMapping( value = "/Vuelos", method = RequestMethod.GET)
	public String ClienteGET(Map map) {
		
	map.put("bVuelo", vueloService.FindAll());

	 return "/Vuelo/listar";
	}
	
	@RequestMapping( value = "/RegistrarVuelo", method = RequestMethod.GET)
	public String RegistrarVuelo_GET(Model model) {

	 model.addAttribute("Vuelo", new Vuelo());
	return "/Vuelo/registrar";
	}

	@RequestMapping( value = "/Vuelo_registrar", method = RequestMethod.POST)
	public String RegistrarVuelo_POST(Vuelo vuelo) {

		vueloService.Insert(vuelo);
	return "redirect:/listado_vuelos";
	}

	@RequestMapping( value = "/EditarVuelo/{vueloid}", method = RequestMethod.GET)
	public String EditarVuelo_GET(Model model, @PathVariable("vueloid") Integer vueloid) {

	 model.addAttribute("Vuelo", vueloService.FindByID(vueloid));

	 return "/Vuelo/Editar";
	}

	@RequestMapping( value = "/EditarVuelo/{vueloid}", method = RequestMethod.POST)
	public String EditarVuelo_POST(Vuelo vuelo) {

		vueloService.Update(vuelo);

	 return "redirect:/listado_vuelos";
	}

	@RequestMapping( value = "/EliminarVuelo/{vueloid}", method = RequestMethod.GET)
	public String EliminarVuelo_GET(Model model, @PathVariable("vueloid") Integer vueloid) {
		
		
	model.addAttribute("Vuelo", vueloService.FindByID(vueloid));

	 return "/Vuelo/Eliminar";
	}

	@RequestMapping( value = "/EliminarVuelo/{vueloid}", method = RequestMethod.POST)
	public String EliminarVuelo_POST(Vuelo vuelo) {

		vueloService.Delete(vuelo.getVueloid());

	 return "redirect:/listado_vuelos";
	}


}
