package pe.blueskyairlines.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PrincipalController {

	@RequestMapping(value = "/Inicio", method = RequestMethod.GET)
	public String MenuPrincipal() {
		
		return "MenuPrincipal";
	}
}
