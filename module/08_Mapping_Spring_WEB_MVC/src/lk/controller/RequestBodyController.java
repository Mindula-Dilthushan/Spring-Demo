package lk.controller;

import lk.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/v1/body")
public class RequestBodyController {

//    @GetMapping
//    public String body0(HttpServletRequest request){
//        String id = request.getParameter("id");
//        String name = request.getParameter("name");
//        return id+" "+name;
//    }

    //Query String id,name == yes
    //x-www-form-urlencoded == no (Work Only Post)
    @GetMapping
    public String body1(String id,String name){
        return id+" "+name;
    }

    //Query String id,name == yes
    //x-www-form-urlencoded (id,name,address,salary)== yes
    @PostMapping
    public String body2(String id,String name,String address,String salary){
        return id+" "+name+" "+address+" "+salary;
    }

    //Model Attribute
    //Can get x-www-form-urlencoded type data and Query String data
    //Not Supporting for application/json type

    //Query String id,name == yes
    //x-www-form-urlencoded (id,name,address,salary)== yes
    @PostMapping
    public String body3(@ModelAttribute CustomerDTO customerDTO){
        return customerDTO.toString();
    }

}
