package try_git.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/hello")
	public ModelAndView sayHello(){
		return new ModelAndView("hello");
	}
}
