package com.UPT.inventario.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.UPT.inventario.Facade.RolFacade;
import com.UPT.inventario.Model.Rol;
import java.util.List;
import java.util.ArrayList;


@RestController
@RequestMapping("/API")
public class RolController {

    @Autowired
    private RolFacade rolFacade;

    @GetMapping("/getAllRols")
    public List<Rol> getAllRols() {
        List<Rol> rol = new ArrayList<Rol>();
        rol = rolFacade.getAllRol();
        return rol;
    }

    @PostMapping("/insertRolObjeto")
    public String insertRolObjeto(@RequestBody Rol rol) {  
    try{
        int res = rolFacade.insertRolObjeto(rol);
        if(res==1){
        return "rol insertado";
        }else{
            return "Error al insertar rol";
        }       
    }catch(Exception e){            
        System.out.println("Error: " + e.getMessage());
        return "Error al insertar rol";        
    }
    
  }
    
}
