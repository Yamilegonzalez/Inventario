package com.UPT.inventario.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UPT.inventario.Facade.SancionAFacade;
import com.UPT.inventario.Model.Sancion_aplicada;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/API")
public class SancionAController {
    
    @Autowired
    private SancionAFacade sancionAFacade;

    @GetMapping("/getAllSancionAplicada")
    public List<Sancion_aplicada> getAllSancionAplicada(){
        List<Sancion_aplicada> sancionApli = new ArrayList<Sancion_aplicada>();
        sancionApli = sancionAFacade.getAllSancionAplicada();
        return sancionApli;
    }
    
    
}
