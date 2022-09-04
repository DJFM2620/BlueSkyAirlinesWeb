package pe.blueskyairlines.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.blueskyairlines.Model.Aeropuerto;
import pe.blueskyairlines.Service.AeropuertoService;



@Controller
public class ControllerAeropuerto {
	
	@Autowired
	private AeropuertoService aeropuertoService;
	
	
	
	@RequestMapping( value = "/Aeropuertos", method = RequestMethod.GET)
	public String AeropuertoGET(Map map) {
		
	map.put("bAeropuerto", aeropuertoService.FindAll());

	 return "/Aeropuerto/listar";
	}
	
	@RequestMapping( value = "/RegistrarAeropuerto", method = RequestMethod.GET)
	public String RegistrarAeropuerto_GET(Model model) {

	 model.addAttribute("Aeropuerto", new Aeropuerto());
	return "/Aeropuerto/registrar";
	}

	@RequestMapping( value = "/Aeropuerto_registrar", method = RequestMethod.POST)
	public String RegistrarAeropuerto_POST(Aeropuerto aeropuerto) {

		aeropuertoService.Insert(aeropuerto);
	return "redirect:/listado_aeropuerto";
	}

	@RequestMapping( value = "/EditarAeropuerto/{aeropuertoid}", method = RequestMethod.GET)
	public String EditarAeropuerto_GET(Model model, @PathVariable("aeropuertoid") Integer aeropuertoid) {

	 model.addAttribute("Aeropuerto", aeropuertoService.FindByID(aeropuertoid));

	 return "/Aeropuerto/Editar";
	}

	@RequestMapping( value = "/EditarAeropuerto/{clienteid}", method = RequestMethod.POST)
	public String EditarAeropuerto_POST(Aeropuerto aeropuerto) {

		aeropuertoService.Update(aeropuerto);

	 return "redirect:/listado_aeropuerto";
	}

	@RequestMapping( value = "/EliminarAeropuerto/{aeropuertoid}", method = RequestMethod.GET)
	public String EliminarAeropuerto_GET(Model model, @PathVariable("aeropuertoid") Integer aeropuertoid) {
		
		
	model.addAttribute("Aeropuerto", aeropuertoService.FindByID(aeropuertoid));

	 return "/Aeropuerto/Eliminar";
	}

	@RequestMapping( value = "/EliminarAeropuerto/{clienteid}", method = RequestMethod.POST)
	public String EliminarAeropuerto_POST(Aeropuerto aeropuerto) {

		aeropuertoService.Delete(aeropuerto.getAeropuertoid());

	 return "redirect:/listado_aeropuerto";
	}
	
	
	

}
