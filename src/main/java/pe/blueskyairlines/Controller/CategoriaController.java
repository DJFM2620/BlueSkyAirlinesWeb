package pe.blueskyairlines.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.blueskyairlines.Model.CategoriaAsiento;
import pe.blueskyairlines.Service.CategoriaAsientoService;


@Controller
public class CategoriaController {
	
	
	@Autowired
	private CategoriaAsientoService categoriaService;
	
	
	@RequestMapping( value = "/Categorias", method = RequestMethod.GET)
	public String CategoriaGET(Map map) {
		
	map.put("bCategoria", categoriaService.FindAll());

	 return "/Categoria/listar";
	}
	
	@RequestMapping( value = "/RegistrarCategoria", method = RequestMethod.GET)
	public String RegistrarCategoria_GET(Model model) {

	 model.addAttribute("CategoriaAsiento", new CategoriaAsiento());
	return "/Ciudad/registrar";
	}

	@RequestMapping( value = "/Categoria_registrar", method = RequestMethod.POST)
	public String RegistrarCategoria_POST(CategoriaAsiento categoria) {

		categoriaService.Insert(categoria);
	return "redirect:/listado_categoria";
	}

	@RequestMapping( value = "/EditarCategoria/{categoriaid}", method = RequestMethod.GET)
	public String EditarCategoria_GET(Model model, @PathVariable("categoriaid") Integer categoriaid) {

	 model.addAttribute("CategoriaAsiento", categoriaService.FindByID(categoriaid));

	 return "/Categoria/Editar";
	}

	@RequestMapping( value = "/EditarCategoria/{categoriaid}", method = RequestMethod.POST)
	public String EditarCategoria_POST(CategoriaAsiento categoria) {

		categoriaService.Update(categoria);

	 return "redirect:/listado_categoria";
	}

	@RequestMapping( value = "/EliminarCategoria/{categoriaid}", method = RequestMethod.GET)
	public String EliminarCategoria_GET(Model model, @PathVariable("categoriaid") Integer categoriaid) {
		
		
	model.addAttribute("CategoriaAsiento", categoriaService.FindByID(categoriaid));

	 return "/Categoria/Eliminar";
	}

	@RequestMapping( value = "/EliminarCategoria/{categoriaid}", method = RequestMethod.POST)
	public String EliminarCategoria_POST(CategoriaAsiento categoria) {

		categoriaService.Delete(categoria.getCategoriaid());

	 return "redirect:/listado_categoria";
	}

}
