package pe.blueskyairlines.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.blueskyairlines.Model.ModeloAvion;
import pe.blueskyairlines.Service.ModeloAvionService;


@Controller
public class ModeloController {
	
	@Autowired
	private ModeloAvionService modeloService;
	
	
	@RequestMapping( value = "/Modelos", method = RequestMethod.GET)
	public String ModeloGET(Map map) {
		
	map.put("bModelo", modeloService.FindAll());

	 return "/Modelo/listar";
	}
	
	@RequestMapping( value = "/RegistrarModelo", method = RequestMethod.GET)
	public String RegistrarModelo_GET(Model model) {

	 model.addAttribute("Modelo", new ModeloAvion());
	return "/Modelo/registrar";
	}

	@RequestMapping( value = "/Modelo_registrar", method = RequestMethod.POST)
	public String RegistrarModelo_POST(ModeloAvion modelo) {

		modeloService.Insert(modelo);
	return "redirect:/listado_modelo";
	}

	@RequestMapping( value = "/EditarModelo/{modeloid}", method = RequestMethod.GET)
	public String EditarModelo_GET(Model model, @PathVariable("modeloid") Integer modeloid) {

	 model.addAttribute("Modelo", modeloService.FindByID(modeloid));

	 return "/Modelo/Editar";
	}

	@RequestMapping( value = "/EditarModelo/{modeloid}", method = RequestMethod.POST)
	public String EditarModelo_POST(ModeloAvion modelo) {

		modeloService.Update(modelo);

	 return "redirect:/listado_modelo";
	}

	@RequestMapping( value = "/EliminarModelo/{modeloid}", method = RequestMethod.GET)
	public String EliminarModelo_GET(Model model, @PathVariable("modeloid") Integer modeloid) {
		
		
	model.addAttribute("Modelo", modeloService.FindByID(modeloid));

	 return "/Modelo/Eliminar";
	}

	@RequestMapping( value = "/EliminarModelo/{modeloid}", method = RequestMethod.POST)
	public String EliminarModelo_POST(ModeloAvion modelo) {

		modeloService.Delete(modelo.getModeloid());

	 return "redirect:/listado_modelo";
	}

}
