package pe.blueskyairlines.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import pe.blueskyairlines.Model.Reserva;

import pe.blueskyairlines.Service.ReservaService;

@Controller
public class ReservaController {
	
	@Autowired
	private ReservaService reservaService;
	
	
	@RequestMapping( value = "/Reservas", method = RequestMethod.GET)
	public String ReservasGET(Map map) {
		
	map.put("bReserva", reservaService.FindAll());

	 return "/Reserva/listar";
	}
	
	@RequestMapping( value = "/RegistrarReserva", method = RequestMethod.GET)
	public String RegistrarReserva_GET(Model model) {

	 model.addAttribute("Reserva", new Reserva());
	return "/Reserva/registrar";
	}

	@RequestMapping( value = "/RegistrarReserva", method = RequestMethod.POST)
	public String RegistrarReserva_POST(Reserva reserva) {

		reservaService.Insert(reserva);
		return "redirect:/listado_reserva";
	}

	@RequestMapping( value = "/EditarReserva/{reservaid}", method = RequestMethod.GET)
	public String EditarReserva_GET(Model model, @PathVariable("reservaid") Integer reservaid) {

	 model.addAttribute("Reserva", reservaService.FindByID(reservaid));

	 return "/Reserva/Editar";
	}

	@RequestMapping( value = "/EditarReserva/{reservaid}", method = RequestMethod.POST)
	public String EditarReserva_POST(Reserva reserva) {

		reservaService.Update(reserva);

	 return "redirect:/listado_reserva";
	}

	@RequestMapping( value = "/EliminarReserva/{reservaid}", method = RequestMethod.GET)
	public String EliminarReserva_GET(Model model, @PathVariable("reservaid") Integer reservaid) {
		
		
	model.addAttribute("Reserva", reservaService.FindByID(reservaid));

	 return "/Reserva/Eliminar";
	}

	@RequestMapping( value = "/EliminarReserva/{reservaid}", method = RequestMethod.POST)
	public String EliminarReserva_POST(Reserva reserva) {

		reservaService.Delete(reserva.getReservaid());

	 return "redirect:/listado_reserva";
	}

}
