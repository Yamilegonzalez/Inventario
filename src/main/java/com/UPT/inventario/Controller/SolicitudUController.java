package com.UPT.inventario.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UPT.inventario.Facade.SolicitudUFacade;
import com.UPT.inventario.Model.Solicitud_usuario;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/API")
public class SolicitudUController {

    @Autowired
    private SolicitudUFacade solicitudUFacade;

    @GetMapping("/getAllSolicitudUsuario")
    public List<Solicitud_usuario> getAllSolicitudU() {
        List<Solicitud_usuario> solicitudUsuario = new ArrayList<Solicitud_usuario>();
        solicitudUsuario = solicitudUFacade.getAllSolicitudUsuario();
        return solicitudUsuario;
    }
    
}
