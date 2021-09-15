package com.UPT.inventario.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "",  allowedHeaders="")
@RequestMapping("/API")
public class TestApi {
 
    @GetMapping("/test")
    public String getNextLote(){
        return "Al fine programmer";
    }

}
