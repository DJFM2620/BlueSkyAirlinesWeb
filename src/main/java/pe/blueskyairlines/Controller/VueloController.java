package pe.blueskyairlines.Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.blueskyairlines.Model.Vuelo;
import pe.blueskyairlines.Service.CiudadService;
import pe.blueskyairlines.Service.VueloService;

@Controller
public class VueloController {

	@Autowired
	private VueloService serviceVuelo;

	@Autowired
	private CiudadService serviceCiudad;

	@RequestMapping(value = "/Vuelos", method = RequestMethod.GET)
	public String ListarVuelos(Map map) {

		map.put("Vuelos", serviceVuelo.FindAll());
		map.put("Ciudades", serviceCiudad.FindAll());

		return "/Vuelo/Listar";
	}

	@RequestMapping(value = "/Vuelos/Ciudad/{CiudadID}", method = RequestMethod.GET)
	public String ListarVuelosPorCiudad(Map map, @PathVariable("CiudadID") Integer CiudadID) {

		map.put("Vuelos", serviceVuelo.VuelosPorCiudad(CiudadID));
		map.put("Ciudades", serviceCiudad.FindAll());

		return "/Vuelo/Listar";
	}

	@RequestMapping(value = "/Vuelos/Id/{VueloId}", method = RequestMethod.GET)
	public String VuelosPorId(Map map, @PathVariable("VueloId") Integer VueloId) {

		Collection<Vuelo> vuelos = new ArrayList<>();
		vuelos.add(serviceVuelo.FindByID(VueloId));

		map.put("Vuelos", vuelos);
		map.put("Ciudades", serviceCiudad.FindAll());

		return "/Vuelo/Listar";
	}

	@RequestMapping(value = "/Vuelos/DestinosConcurridos")
	public String DestinosConcurridos(Map map) {

		Collection<Integer> Años = new ArrayList<>();
		Años.add(LocalDate.now().getYear());
		Años.add(LocalDate.now().getYear() - 1);
		Años.add(LocalDate.now().getYear() - 2);
		Años.add(LocalDate.now().getYear() - 3);
		Años.add(LocalDate.now().getYear() - 4);
		Años.add(LocalDate.now().getYear() - 5);
		Años.add(LocalDate.now().getYear() - 6);
		Años.add(LocalDate.now().getYear() - 7);
		
		map.put("Destinos",
				serviceVuelo.VuelosPorAñoMes(LocalDate.now().getYear(), LocalDate.now().getMonth().getValue()));

		map.put("Años", Años);
		
		return "/Vuelo/DestinosConcurridos";
	}
	
	@RequestMapping(value = "/Vuelos/DestinosConcurridos/{Año}/{Mes}", method = RequestMethod.GET)
	public String DestinosConcurridosFiltrado(Map map, @PathVariable("Año") Integer Año, @PathVariable("Mes") Integer Mes) {
		
		Collection<Integer> Años = new ArrayList<>();
		Años.add(LocalDate.now().getYear());
		Años.add(LocalDate.now().getYear() - 1);
		Años.add(LocalDate.now().getYear() - 2);
		Años.add(LocalDate.now().getYear() - 3);
		Años.add(LocalDate.now().getYear() - 4);
		Años.add(LocalDate.now().getYear() - 5);
		Años.add(LocalDate.now().getYear() - 6);
		Años.add(LocalDate.now().getYear() - 7);
		
		map.put("Destinos", serviceVuelo.VuelosPorAñoMes(Año, Mes));
		map.put("Años", Años);
		
		return "/Vuelo/DestinosConcurridos";
	}
}
