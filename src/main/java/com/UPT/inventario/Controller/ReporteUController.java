package com.UPT.inventario.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UPT.inventario.Facade.ReporteUFacade;
import com.UPT.inventario.Model.Reporte_usuario;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/API")
public class ReporteUController {

    @Autowired
    private ReporteUFacade reporteUFacade;

    @GetMapping("/getAllReportsU")
    public List<Reporte_usuario> getAllReportsU() {
        List<Reporte_usuario> reporteUsuario = new ArrayList<Reporte_usuario>();
        reporteUsuario = reporteUFacade.getAllReporteUsuario();
        return reporteUsuario;
    }
    
    @PostMapping("/insertReporteUObjeto")
    public String insertReporteUObjeto(@RequestBody Reporte_usuario reporteUsuario) {  
    try{
        int res = reporteUFacade.insertReporteUObjeto(reporteUsuario);
        if(res==1){
        return "Reporte Usuario insertado";
        }else{
            return "Error al insertar reporte usuario";
        }       
    }catch(Exception e){            
        System.out.println("Error: " + e.getMessage());
        return "Error al insertar reporte usuario";        
    }
    
  }
  @PostMapping("/updatedReporteUObjeto")
    public String updatedReporteUObjeto(@RequestBody Reporte_usuario reporteUsuario) {  
    try{
        int res = reporteUFacade.updatedReporteUObjeto(reporteUsuario.getIdReportUsuario(), reporteUsuario);
        if(res==1){
        return "Reporte Usuario actualizado";
        }else{
            return "Error al actualizar reporte usuario";
        }       
    }catch(Exception e){            
        System.out.println("Error: " + e.getMessage());
        return "Error al actualizar reporte usuario";        
    }
    
  }  
    
}
