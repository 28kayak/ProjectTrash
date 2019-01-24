package kayak.sample.springboot.projectgomi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/result")
public class ResultController {
  /**
   *
   * @param name name of trash
   * @param model view of result: for this method,  result.html
   * @return
   */
  @RequestMapping(name="/result", method= RequestMethod.POST)
  public String nameToMessage(@RequestParam("name") String name, Model model){
    //Search Lucene here....

    //generate result attribute
    model.addAttribute("message", name );
    model.addAttribute("method", "食品包装プラスチックは、水資源の無駄を防ぐため、軽くすすいできれいになるもののみです。それ以外はもえるごみへ！");
    return "result";
  }

}
