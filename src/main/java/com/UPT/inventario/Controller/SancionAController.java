package com.UPT.inventario.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    
    @PostMapping("/insertSancionAObjeto")
    public String insertSancionAObjeto(@RequestBody Sancion_aplicada sancionAplicada) {  
    try{
        int res = sancionAFacade.insertSancionAplicadaObjeto(sancionAplicada);
        if(res==1){
        return "Insert sancionAplicada insertada";
        }else{
            return "Error al insertar Sancion Aplicada";
        }       
    }catch(Exception e){            
        System.out.println("Error: " + e.getMessage());
        return "Error al insertar sancion aplicada";        
    }

  }

  @PostMapping("/updateSancionAplicadaObjeto")
    public String updateSancionAplicadaObjeto(@RequestBody Sancion_aplicada sancionAplicada) {  
    try{
        int res = sancionAFacade.updateSancionAplicadaObjeto(sancionAplicada.getIdSanUsuApli(), sancionAplicada);
        if(res==1){
        return "update sancionAplicada actualizada";
        }else{
            return "Error al actualizar Sancion Aplicada";
        }       
    }catch(Exception e){            
        System.out.println("Error: " + e.getMessage());
        return "Error al actualizar sancion aplicada";        
    }

  }
  @PostMapping("/deleteSancionAplicadaObjeto")
    public String deleteSancionAplicadaObjeto(@RequestParam("idSanUsuApli") Long idSanUsuApli) {  
    try{
        int res = sancionAFacade.deleteSancionAplicadaObjeto(idSanUsuApli);
        if(res==1){
        return "sancionAplicada borrada";
        }else{
            return "Error al borrar Sancion Aplicada";
        }       
    }catch(Exception e){            
        System.out.println("Error: " + e.getMessage());
        return "Error al borrar sancion aplicada";        
    }

  }
    @PostMapping("/selectByIdSancionAplicadaObjeto")
    public List<Sancion_aplicada> selectByIdSancionAplicadaObjeto(@RequestParam("idSanUsuApli") Long idSanUsuApli) {  
    List<Sancion_aplicada> sancionApli = new ArrayList<Sancion_aplicada>();
        sancionApli = sancionAFacade.selectByIdSancionAplicada(idSanUsuApli);
        return sancionApli;

    }


 }
