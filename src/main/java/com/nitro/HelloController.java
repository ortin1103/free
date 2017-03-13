package com.nitro;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    @Autowired
    HeloWorld heloWorld;

    @RequestMapping
    public String getHome(){
        return "dfsf";
    }


}
