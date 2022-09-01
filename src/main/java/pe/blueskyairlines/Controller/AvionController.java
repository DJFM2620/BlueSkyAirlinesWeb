package pe.blueskyairlines.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.blueskyairlines.Model.Asiento;
import pe.blueskyairlines.Model.Avion;

import pe.blueskyairlines.Service.AvionService;


@Controller
public class AvionController {
	@Autowired
	private AvionService avionService;
	
	
	@RequestMapping( value = "/Aviones", method = RequestMethod.GET)
	public String AvionGET(Map map) {
		
	map.put("BAvion", avionService.FindAll());

	 return "/Avion/listar";
	}
	
	@RequestMapping( value = "/RegistrarAvion", method = RequestMethod.GET)
	public String RegistrarAvion_GET(Model model) {

	 model.addAttribute("Avion", new Avion());
	return "/Avion/registrar";
	}

	@RequestMapping( value = "/Avion_registrar", method = RequestMethod.POST)
	public String RegistrarAvion_POST(Avion avion) {

		avionService.Insert(avion);
	return "redirect:/listado_aviones";
	}

	@RequestMapping( value = "/EditarAvion/{avionid}", method = RequestMethod.GET)
	public String EditarAvion_GET(Model model, @PathVariable("avionid") Integer avionid) {

	 model.addAttribute("Avion", avionService.FindByID(avionid));

	 return "/Avion/Editar";
	}

	@RequestMapping( value = "/EditarAvion/{avionid}", method = RequestMethod.POST)
	public String EditarAvion_POST(Avion avion) {

		avionService.Update(avion);

	 return "redirect:/listado_aviones";
	}

	@RequestMapping( value = "/EliminarAvion/{avionid}", method = RequestMethod.GET)
	public String EliminarAvion_GET(Model model, @PathVariable("avionid") Integer avionid) {
		
		
	model.addAttribute("Avion", avionService.FindByID(avionid));

	 return "/Avion/Eliminar";
	}

	@RequestMapping( value = "/EliminarAvion/{avionid}", method = RequestMethod.POST)
	public String EliminarAvion_POST(Avion avion) {

		avionService.Delete(avion.getAvionid());

	 return "redirect:/listado_aviones";
	}

}
