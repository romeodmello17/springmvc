package firstmvc.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.util.log.UserDataHelper.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public ModelAndView hello() {
		System.out.println("This is Hello url");
		ModelAndView mv = new ModelAndView();
		// setting the data
		mv.addObject("name", "Rahul");
		mv.addObject("rollno", 26);

		List<String> stocks = new ArrayList<String>();
		stocks.add("LCMF");
		stocks.add("MCMF");
		stocks.add("SCMF");
		mv.addObject("s", stocks);
		// setting the view name
		mv.setViewName("hello");
		return mv;
	}

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is Home URL");
		model.addAttribute("name", "Rahul");
		model.addAttribute("rollno", 17);
		List<String> stocks = new ArrayList<String>();
		stocks.add("Large Cap MF");
		stocks.add("Mid Cap MF");
		stocks.add("Small Cap MF");
		stocks.add("Crypto");

		model.addAttribute("s", stocks);

		return "home";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help url");
		// creating modelandview object
		ModelAndView mv = new ModelAndView();
		// setting the data
		mv.addObject("name", "Rahul");
		mv.addObject("rollno", 26);

		List<String> stocks = new ArrayList<String>();
		stocks.add("LCMF");
		stocks.add("MCMF");
		stocks.add("SCMF");
		mv.addObject("s", stocks);
		// setting the view name
		mv.setViewName("help");
		return mv;
	}
}
