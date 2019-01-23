package kayak.sample.springboot.projectgomi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/result")
public class ResultController {
  @RequestMapping(name="/result", method= RequestMethod.POST)
  public String nameToMessage(@RequestParam("name") String name, Model model){
    //Search Lucene here....

    //generate result attribute
    model.addAttribute("message", "Hello " + name + "!");
    return "result";
  }

}
