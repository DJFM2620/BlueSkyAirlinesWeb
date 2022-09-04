package pe.blueskyairlines.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PruebasController {
	
	@RequestMapping(value = "/principalprueba",method = RequestMethod.GET)
	public String login() { 
	
		return "prueba";
	}
	

}
