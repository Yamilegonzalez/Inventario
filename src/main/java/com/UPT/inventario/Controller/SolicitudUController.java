package com.UPT.inventario.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    
    @PostMapping("/insertSolicitudUObjeto")
    public String insertSolicitudUObjeto(@RequestBody Solicitud_usuario solicitudUsuario) {  
    try{
        int res = solicitudUFacade.insertSolicitudUObjeto(solicitudUsuario);
        if(res==1){
        return "Solicitud usuario insertada";
        }else{
            return "Error al insertar solicitud usuario";
        }       
    }catch(Exception e){            
        System.out.println("Error: " + e.getMessage());
        return "Error al insertar solicitud usuario";        
    }
    
  }
  @PostMapping("/updatedSolicitudUObjeto")
    public String updatedSolicitudUObjeto(@RequestBody Solicitud_usuario solicitudUsuario) {  
    try{
        int res = solicitudUFacade.updatedSolicitudUObjeto(solicitudUsuario.getIdSolicitud(), solicitudUsuario);
        if(res==1){
        return "Solicitud usuario actualizada";
        }else{
            return "Error al actualizar solicitud usuario";
        }       
    }catch(Exception e){            
        System.out.println("Error: " + e.getMessage());
        return "Error al actualizar solicitud usuario";        
    }
    
  }
    
    
}
