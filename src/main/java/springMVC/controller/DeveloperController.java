package springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;
import springMVC.model.Developer;

@Controller
public class DeveloperController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String index(){
        return "/index";
    }

    @RequestMapping(value = "/addDeveloper", method = RequestMethod.GET)
    public ModelAndView developer(){
        return new ModelAndView("developer", "command", new Developer());
    }

    @RequestMapping(value = "/addDeveloper", method=RequestMethod.POST)
    public String addStudent(@ModelAttribute("mvc-dispathcer") Developer developer, ModelMap model){
        model.addAttribute("id", developer.getId());
        model.addAttribute("name", developer.getName());
        model.addAttribute("specialty", developer.getSpecialty());
        model.addAttribute("experiance", developer.getExperience());

        return "result";
    }

}
