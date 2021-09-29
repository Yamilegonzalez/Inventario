package com.UPT.inventario.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.UPT.inventario.Facade.SolicitudAFacade;
import com.UPT.inventario.Model.Solicitud_aceptada;
import java.util.ArrayList;

@RestController
@RequestMapping("/API")
public class SolicitudAController {
    @Autowired
    private SolicitudAFacade SolicitudAFacade;

    @GetMapping("/getAllSolicitudesA")
    public List<Solicitud_aceptada> getAllSolicitudesA() {
        List<Solicitud_aceptada> solicitud = new ArrayList<Solicitud_aceptada>();
        solicitud = SolicitudAFacade.getAllSolicitudAceptada();
        return solicitud;
    }

    @PostMapping("/insertSolicitudA")
    public String insertSolicitudA(@RequestParam("nombreArea") String solicitud,
            @RequestParam("createdAt") String createdAt) {
        try {
            int res = SolicitudAFacade.insertSolicitudA(solicitud, createdAt);
            if (res == 1) {
                return "Solicitud: " + solicitud + "," + createdAt + " insertada";
            } else {
                return "Error al insertar area";
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return "Error al insertar solicitud";
        }

    }

    @PostMapping("/insertSolicitudA")
    public String insertAreaObjeto(@RequestBody SolicitudAFacade solicitud) {
        try {
            int res = SolicitudAFacade.insertSolicitudAObjeto(solicitud);
            if (res == 1) {
                return "SolicitudA: " + solicitud.getSolicitudA() + "," + solicitud.getCreatedAt() + " insertada";
            } else {
                return "Error al insertar area";
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return "Error al insertar Solicitud";

        }

    }
<<<<<<< HEAD
=======
    @PostMapping("/insertSolicitudAObjeto")
    public String insertSolicitudAObjeto(@RequestBody Solicitud_aceptada solicitudAcepta) {  
    try{
        int res = solicitudaFacade.insertSolicitudAObjeto(solicitudAcepta);
        if(res==1){
        return "solicitud aceptada insertada";
        }else{
            return "Error al insertar solicitud aceptada";
        }       
    }catch(Exception e){            
        System.out.println("Error: " + e.getMessage());
        return "Error al insertar solicitud aceptada";
    }
    
  }
>>>>>>> 9b2f0b8f85a593fde2b25e2f5abf3a71284cc59a
}
