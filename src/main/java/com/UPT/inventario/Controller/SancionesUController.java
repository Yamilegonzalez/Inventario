package com.UPT.inventario.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public List<Sanciones_usuario> getAllSancionUsuario() {
        List<Sanciones_usuario> sancionUsu = new ArrayList<Sanciones_usuario>();
        sancionUsu = sancionUFacade.getAllSancionesUsuario();
        return sancionUsu;
    }

    @PostMapping("/insertSancionesoObjeto")
    public String insertSancionesObjeto(@RequestBody Sanciones_usuario sancionesUsuario) {
        try {
            int res = sancionUFacade.insertSancionesUObjeto(sancionesUsuario);
            if (res == 1) {
                return "Sancion usuario insertada";
            } else {
                return "Error al asignar sancion usuario";
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return "Error al asignar sancion usuario ";
        }
    }

}