package kayak.sample.springboot.projectgomi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/search")
public class SearchController {
  @RequestMapping(method = RequestMethod.GET)
  public String searcher(Model model){
    model.addAttribute("");
    return "search";

  }
}
