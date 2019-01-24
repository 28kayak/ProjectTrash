package kayak.sample.springboot.projectgomi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//@RestController
@Controller
@RequestMapping("/index")
public class HelloWorldController {

  @RequestMapping(method=RequestMethod.GET)
  public String helloWorld(Model model){
    model.addAttribute("message", "What is your trash!");


    return "index";
  }
}

