package lk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
