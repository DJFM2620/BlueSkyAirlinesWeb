package pe.blueskyairlines.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.blueskyairlines.Model.Cliente;
import pe.blueskyairlines.Model.Ticket;
import pe.blueskyairlines.Service.ClienteService;
import pe.blueskyairlines.Service.TicketService;

@Controller
public class TicketController {
	

	@Autowired
	private TicketService ticketService;
	
	
	@RequestMapping( value = "/Tickets", method = RequestMethod.GET)
	public String TicketGET(Map map) {
		
	map.put("bTicket", ticketService.FindAll());

	 return "/Ticket/listar";
	}
	
	@RequestMapping( value = "/RegistrarTicket", method = RequestMethod.GET)
	public String RegistrarTicket_GET(Model model) {

	 model.addAttribute("Ticket", new Ticket());
	return "/Ticket/registrar";
	}

	@RequestMapping( value = "/RegistrarTicket", method = RequestMethod.POST)
	public String RegistrarTicket_POST(Ticket ticket) {

		ticketService.Insert(ticket);
	return "redirect:/listado_ticket";
	}

	@RequestMapping( value = "/EditarTicket/{ticketid}", method = RequestMethod.GET)
	public String EditarTicket_GET(Model model, @PathVariable("ticketid") Integer ticketid) {

	 model.addAttribute("Ticket", ticketService.FindByID(ticketid));

	 return "/Ticket/Editar";
	}

	@RequestMapping( value = "/EditarTicket/{ticketid}", method = RequestMethod.POST)
	public String EditarTicket_POST(Ticket ticket) {

		ticketService.Update(ticket);

	 return "redirect:/listado_ticket";
	}

	@RequestMapping( value = "/EliminarTicket/{ticketid}", method = RequestMethod.GET)
	public String EliminarTicket_GET(Model model, @PathVariable("ticketid") Integer ticketid) {
		
		
	model.addAttribute("Ticket", ticketService.FindByID(ticketid));

	 return "/Ticket/Eliminar";
	}

	@RequestMapping( value = "/EliminarTicket/{ticketid}", method = RequestMethod.POST)
	public String EliminarTicket_POST(Ticket ticket) {

		ticketService.Delete(ticket.getTicketid());

	 return "redirect:/listado_ticket";
	}

}
