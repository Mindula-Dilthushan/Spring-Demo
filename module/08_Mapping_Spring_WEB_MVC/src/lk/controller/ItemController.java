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
}
