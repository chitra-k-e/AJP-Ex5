package formexample.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/*@Controller
public class Control {
    @RequestMapping("/login")   
     public String registerform(@ModelAttribute("frm") Forms frm)
    {
        return "register";
    }
    @RequestMapping("/registersuccess")
    public String success(@ModelAttribute("frm") Forms frm)
    {
        return "registersuccess";
    }
}*/


@Controller
public class Control {
    @RequestMapping("/")
    public String ho()
    {
        return "index";
    }
    @RequestMapping("/login")
    public String registerform(@ModelAttribute("frm")Forms frm)
    {
        return "register";
    }
    @RequestMapping("/sucess")
    public String sucess(@ModelAttribute("frm")Forms frm)
    {
        return "registersuccess";
    }
}