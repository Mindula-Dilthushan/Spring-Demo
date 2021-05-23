package lk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//@RestController
@Controller
@RequestMapping("/spring")
public class SpringController {

    //Mapping Method or Handler Method
        //@GetMapping
        //public String test(){
        //   return "Hello Spring";
        //}
    @GetMapping
    public ModelAndView test1(){
        return new ModelAndView("/customer");
    }

}
