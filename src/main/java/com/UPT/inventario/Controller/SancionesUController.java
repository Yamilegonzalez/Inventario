package com.UPT.inventario.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @PostMapping("/insertSancionesUObjeto")
    public String insertSnacionesUObjeto(@RequestBody Sanciones_usuario sancionesUsuario) {
        try {
            int res = sancionUFacade.insertSancionesUObjeto(sancionesUsuario);
            if (res == 1) {
                return "SancionesU: " + sancionesUsuario.getIdUsuario() + "," + sancionesUsuario.getCreatedAt()
                        + " insertada";
            } else {
                return "Error al insertar sancion";
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return "Error al insertar sancion";
        }

    }

    @PostMapping("/updateSancionesUObjeto")
    public String updateSnacionesUObjeto(@RequestBody Sanciones_usuario sancionesUsuario) {
        try {
            int res = sancionUFacade.updateSancionesUObjeto(sancionesUsuario.getIdSancionUsu(), sancionesUsuario);
            if (res == 1) {
                return "Sancion actualizada";
            } else {
                return "Error al actualizar la sancion";
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return "Error al insertar sancion";
        }
    }

    @PostMapping("/deleteSancionesuObjeto")
    public String deleteSancionesUObjeto(@RequestParam("sancionesUsuario") Long sancionesUsuario) {
        try {
            int res = sancionUFacade.deleteSancionesUObjeto(sancionesUsuario);
            if (res == 1) {
                return "Sancion eliminada";
            } else {
                return "Error al eliminar sancion";
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return "Error al eliminar sancion";
        }

    }

}