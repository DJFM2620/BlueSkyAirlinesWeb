package pe.blueskyairlines.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.blueskyairlines.Model.Cliente;
import pe.blueskyairlines.Service.ClienteService;



@Controller
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	
	@RequestMapping( value = "/Clientes", method = RequestMethod.GET)
	public String ClienteGET(Map map) {
		
	map.put("bCliente", clienteService.FindAll());

	 return "/Cliente/listar";
	}
	
	@RequestMapping( value = "/RegistrarCliente", method = RequestMethod.GET)
	public String RegistrarCliente_GET(Model model) {

	 model.addAttribute("Cliente", new Cliente());
	return "/Cliente/registrar";
	}

	@RequestMapping( value = "/Cliente_registrar", method = RequestMethod.POST)
	public String RegistrarCliente_POST(Cliente cliente) {

		clienteService.Insert(cliente);
	return "redirect:/listado_cliente";
	}

	@RequestMapping( value = "/EditarCliente/{clienteid}", method = RequestMethod.GET)
	public String EditarCliente_GET(Model model, @PathVariable("clienteid") Integer clienteid) {

	 model.addAttribute("Cliente", clienteService.FindByID(clienteid));

	 return "/Cliente/Editar";
	}

	@RequestMapping( value = "/EditarCliente/{clienteid}", method = RequestMethod.POST)
	public String EditarCliente_POST(Cliente cliente) {

		clienteService.Update(cliente);

	 return "redirect:/listado_cliente";
	}

	@RequestMapping( value = "/EliminarCliente/{clienteid}", method = RequestMethod.GET)
	public String EliminarCliente_GET(Model model, @PathVariable("clienteid") Integer clienteid) {
		
		
	model.addAttribute("Cliente", clienteService.FindByID(clienteid));

	 return "/Cliente/Eliminar";
	}

	@RequestMapping( value = "/EliminarCliente/{clienteid}", method = RequestMethod.POST)
	public String EliminarCliente_POST(Cliente cliente) {

		clienteService.Delete(cliente.getClienteid());

	 return "redirect:/listado_cliente";
	}

}
