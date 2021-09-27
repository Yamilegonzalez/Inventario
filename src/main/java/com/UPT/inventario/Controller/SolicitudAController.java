package com.UPT.inventario.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.UPT.inventario.Facade.SolicitudAFacade;
import com.UPT.inventario.Model.Solicitud_aceptada;
import java.util.ArrayList;

@RestController
@RequestMapping("/API")
public class SolicitudAController {
    @Autowired
    private SolicitudAFacade solicitudaFacade;

    @GetMapping("/getAllsolicitudA")
    public List<Solicitud_aceptada> getAllsolicitudA() {
        List<Solicitud_aceptada> solicitudA = new ArrayList<Solicitud_aceptada>();
        solicitudA = solicitudaFacade.getAllSolicitudAceptada();
        return solicitudA;
    }
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
}
