package lk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/item")
public class ItemController {

    @GetMapping(path = "item1")
    public String saveItem1() {
        return "Save Item 1";
    }

    @GetMapping(path = "item2")
    public String saveItem2() {
        return "Save Item 2";
    }

    //wild card
    //Matches 0 or more characters within a path segment
    //c/ddanjnadjsans/123
    @GetMapping(path = "/c/*/123")
    public String getItem3() {
        return "Save Item Three Get";
    }

    //Matches 0 or more path segments until the end of the path
    //c/dfffff/ddddddd/dfffff/555
    @GetMapping(path = "/c/**/555")
    public String getItem4() {
        return "Save Item Four Get";
    }
}
