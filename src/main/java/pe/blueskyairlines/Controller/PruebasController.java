package pe.blueskyairlines.Controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.blueskyairlines.Model.Vuelo;
import pe.blueskyairlines.Service.ClienteService;
import pe.blueskyairlines.Service.VueloService;

@RestController
@RequestMapping("/Api")
public class PruebasController {

	@Autowired
	private ClienteService serviceCli;
	
	@Autowired
	private VueloService serviceVue;
	
	@GetMapping
	public List<Object[]> DestinosRecurrentes(){
		
		return serviceCli.DestinosRecurrentes(1);
	}
	
	@GetMapping(path = "/H")
	public List<Object[]> HistorialVuelos(){
		
		return serviceCli.HistorialVuelos(1);
	}
}
