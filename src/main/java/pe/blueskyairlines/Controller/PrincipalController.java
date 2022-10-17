package pe.blueskyairlines.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.blueskyairlines.Service.ClienteService;
import pe.blueskyairlines.Service.VueloService;

@Controller
public class PrincipalController {

	@Autowired
	private VueloService serviceVuelo;

	@Autowired
	private ClienteService serviceCliente;
	
	@RequestMapping(value = "/Inicio", method = RequestMethod.GET)
	public String MenuPrincipal(Map map) {
		
		map.put("Vuelos", serviceVuelo.FindAll());
		map.put("Clientes", serviceCliente.FindAll());
		map.put("CantidadCli", serviceCliente.CantidadClientes());
		map.put("CantidadVue", serviceVuelo.CantidadVuelos());
		
		return "MenuPrincipal";
	}
}
