package lk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/params")
public class ParamsController {

    //Usage of parameters for request narrow downing
    @GetMapping(params = {"id","name"})
    public String params1(@RequestParam String id,@RequestParam String name){
        System.out.println("ID and Name");
        return id+" "+name;
    }

    @GetMapping(params = {"address","salary"})
    public String params2(@RequestParam("address") String address1,@RequestParam("salary") Double salary1){
        System.out.println("Address and Salary");
        return address1+" "+salary1;
    }

    @GetMapping(params ={"id", "name","address","salary"})
    public String params3(String id, String name, String address, Double salary){
        System.out.println("ID / NAME / ADDRESS / SALARY");
        return id+" "+name+" "+address+" "+salary;
    }
}
