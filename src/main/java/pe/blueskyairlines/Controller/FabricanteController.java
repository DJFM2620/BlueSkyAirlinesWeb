package pe.blueskyairlines.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.blueskyairlines.Model.FabricanteAvion;
import pe.blueskyairlines.Service.FabricanteAvionService;

@Controller
public class FabricanteController {
	
	
	@Autowired
	private FabricanteAvionService fabricanteService;
	
	
	@RequestMapping( value = "/Fabricantes", method = RequestMethod.GET)
	public String FabricanteGET(Map map) {
		
	map.put("bFabricante", fabricanteService.FindAll());

	 return "/Fabricante/listar";
	}
	
	@RequestMapping( value = "/RegistrarFabricante", method = RequestMethod.GET)
	public String RegistrarFabricante_GET(Model model) {

	 model.addAttribute("FabricanteAvion", new FabricanteAvion());
	return "/Fabricante/registrar";
	}

	@RequestMapping( value = "/Fabricante_registrar", method = RequestMethod.POST)
	public String RegistrarFabricante_POST(FabricanteAvion fabricante) {

		fabricanteService.Insert(fabricante);
	return "redirect:/listado_fabricante";
	}

	@RequestMapping( value = "/EditarFabricante/{fabricanteid}", method = RequestMethod.GET)
	public String EditarFabricante_GET(Model model, @PathVariable("fabricanteid") Integer fabricanteid) {

	 model.addAttribute("FabricanteAvion", fabricanteService.FindByID(fabricanteid));

	 return "/Fabricante/Editar";
	}

	@RequestMapping( value = "/EditarFabricante/{clienteid}", method = RequestMethod.POST)
	public String EditarFabricante_POST(FabricanteAvion fabricante) {

		fabricanteService.Update(fabricante);

	 return "redirect:/listado_fabricante";
	}

	@RequestMapping( value = "/EliminarFabricante/{fabricanteid}", method = RequestMethod.GET)
	public String EliminarFabricante_GET(Model model, @PathVariable("fabricanteid") Integer fabricanteid) {
		
		
	model.addAttribute("FabricanteAvion", fabricanteService.FindByID(fabricanteid));

	 return "/Fabricante/Eliminar";
	}

	@RequestMapping( value = "/EliminarFabricante/{fabricanteid}", method = RequestMethod.POST)
	public String EliminarFabricante_POST(FabricanteAvion fabricante) {

		fabricanteService.Delete(fabricante.getFabricanteid());

	 return "redirect:/listado_fabricante";
	}

}
