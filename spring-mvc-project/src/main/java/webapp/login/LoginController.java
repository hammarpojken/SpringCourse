package webapp.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import webapp.login.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService ls;
	
	@RequestMapping(value= "/login", method = RequestMethod.GET)
	public String getLogin() {
		return "login";
	}
	@RequestMapping(value= "/login", method = RequestMethod.POST)
	public String handleLoginReq(
			@RequestParam String name,
			@RequestParam String password,
			ModelMap model) {
		if(ls.validateUser(name, password)) {
			model.put("name", name);
			model.put("password", password);
			return "welcome";
			
			
		}
		model.put("errorMessage", "invalid username or password");
		return "login";
	}
}
