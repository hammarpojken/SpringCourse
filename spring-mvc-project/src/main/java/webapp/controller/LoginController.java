package webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	@RequestMapping(value= "/login", method = RequestMethod.GET)
	public String getLogin() {
		return "login";
	}
	@RequestMapping(value= "/login", method = RequestMethod.POST)
	public String handleLoginReq(
			@RequestParam String name,
			@RequestParam String password,
			ModelMap model) {
		
		model.put("name", name);
		model.put("password", password);
		return "welcome";
	}
}
