package ar.edu.unq.desapp.grupoG.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller

public class LocaleController {

	@RequestMapping(value = "/locale", method = RequestMethod.GET)
	   public String getLocalePage() {
	       return "messajes_es.properties";
	   }
	
}
