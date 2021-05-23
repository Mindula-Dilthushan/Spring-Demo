package lk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/item")
public class SpringController2 {
    @GetMapping
    public ModelAndView test2(){
        return new ModelAndView("/item");
    }
}
