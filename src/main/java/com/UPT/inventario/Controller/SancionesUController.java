package com.UPT.inventario.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

import com.UPT.inventario.Facade.SancionesUFacade;
import com.UPT.inventario.Model.Sanciones_usuario;

import java.util.ArrayList;

@RestController
@RequestMapping("/API")
public class SancionesUController {
    @Autowired
    private SancionesUFacade sancionUFacade;

    @GetMapping("/getAllSancionUsuario")
    public List<Sanciones_usuario> getAllSancionUsuario(){
        List<Sanciones_usuario> sancionUsu = new ArrayList<Sanciones_usuario>();
        sancionUsu = sancionUFacade.getAllSancionesUsuario();
        return sancionUsu;
    }
}
