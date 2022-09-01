package pe.blueskyairlines.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.blueskyairlines.Model.Estado;
import pe.blueskyairlines.Service.EstadoService;


@Controller
public class EstadoController {
	
	
	
	@Autowired
	private EstadoService estadoService;
	
	
	@RequestMapping( value = "/Estados", method = RequestMethod.GET)
	public String EstadoGET(Map map) {
		
	map.put("bCliente", estadoService.FindAll());

	 return "/Estado/listar";
	}
	
	@RequestMapping( value = "/RegistrarEstado", method = RequestMethod.GET)
	public String RegistrarEstado_GET(Model model) {

	 model.addAttribute("Estado", new Estado());
	return "/Estado/registrar";
	}

	@RequestMapping( value = "/Estado_registrar", method = RequestMethod.POST)
	public String RegistrarEstado_POST(Estado estado) {

		estadoService.Insert(estado);
	return "redirect:/listado_estado";
	}

	@RequestMapping( value = "/EditarEstado/{estadoid}", method = RequestMethod.GET)
	public String EditarEstado_GET(Model model, @PathVariable("estadoid") Integer estadoid) {

	 model.addAttribute("Estado", estadoService.FindByID(estadoid));

	 return "/Estado/Editar";
	}

	@RequestMapping( value = "/EditarEstado/{estadoid}", method = RequestMethod.POST)
	public String EditarEstado_POST(Estado estado) {

		estadoService.Update(estado);

	 return "redirect:/listado_estado";
	}

	@RequestMapping( value = "/EliminarEstado/{estadoid}", method = RequestMethod.GET)
	public String EliminarEstado_GET(Model model, @PathVariable("estadoid") Integer estadoid) {
		
		
	model.addAttribute("Estado", estadoService.FindByID(estadoid));

	 return "/Estado/Eliminar";
	}

	@RequestMapping( value = "/EliminarEstado/{clienteid}", method = RequestMethod.POST)
	public String EliminarEstado_POST(Estado estado) {

		estadoService.Delete(estado.getEstadoid());

	 return "redirect:/listado_estado";
	}


}
