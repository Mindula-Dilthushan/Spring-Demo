package lk.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/mime")
public class MimeTypeController {

    //We can narrow down a request using request headers (Content Type)

    //Depend on the request Content-Type
    @GetMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public String mime1(){
        return "Content JSON";
    }

    @GetMapping(consumes = {MediaType.TEXT_HTML_VALUE})
    public String mime2(){
        return "Content Text";
    }

    @GetMapping(consumes = {MediaType.APPLICATION_JSON_VALUE},produces= {MediaType.TEXT_HTML_VALUE})
    public String mime3(){
        return "Request Content Type Must be Application/json - Response Content Type must be Application/json";
    }

    @GetMapping(consumes = {MediaType.TEXT_HTML_VALUE},produces= {MediaType.TEXT_HTML_VALUE})
    public String mime4(){
        return "Request Content Type Must be Text/HTML - Response Content Type must be Plain/Text";
    }

    @GetMapping(headers = {"Content-Type=text/html","Accept=text/html"})
    public String mime5(){
        return "Request Content Type Must be Text/HTML - Response Content Type must be Plain/Text";
    }
}
