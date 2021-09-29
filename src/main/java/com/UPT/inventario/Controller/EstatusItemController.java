package com.UPT.inventario.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.UPT.inventario.Facade.EstatusItemFacade;
import com.UPT.inventario.Model.Estatus_item;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/API")
public class EstatusItemController {

    @Autowired
    private EstatusItemFacade estatusItemFacade;

    @GetMapping("/getAllEstatusItem")
    public List<Estatus_item> getAllEstatusItem() {
        List<Estatus_item> estatusItem = new ArrayList<Estatus_item>();
        estatusItem = estatusItemFacade.getAllEstatusItem();
        return estatusItem;
    }

    @PostMapping("/insertEstatusIObjeto")
    public String insertEstatusIObjeto(@RequestBody Estatus_item estatusItem) {  
    try{
        int res = estatusItemFacade.insertEstatusIObjeto(estatusItem);
        if(res==1){
        return "Estatus item insertado";
        }else{
            return "Error al insertar estatus item";
        }       
    }catch(Exception e){            
        System.out.println("Error: " + e.getMessage());
        return "Error al insertar estatus item";        
    }
    
  }
  @PostMapping("/updatedEstatusIObjeto")
    public String updatedEstatusIObjeto(@RequestBody Estatus_item estatusItem) {  
    try{
        int res = estatusItemFacade.updatedEstatusIObjeto(estatusItem.getIdEstatus(), estatusItem);
        if(res==1){
        return "Estatus item actualizado";
        }else{
            return "Error al actualizar estatus item";
        }       
    }catch(Exception e){            
        System.out.println("Error: " + e.getMessage());
        return "Error al actualizar estatus item";        
    }
    
  }
  @PostMapping("/deleteEstatusIObjeto")
    public String deleteEstatusIObjeto(@RequestParam("idEstatus") Long idEstatus) {  
    try{
        int res = estatusItemFacade.deleteEstatusIObjeto(idEstatus);
        if(res==1){
        return "estatus item eliminado";
        }else{
            return "Error al borrar estatus item";
        }       
    }catch(Exception e){            
        System.out.println("Error: " + e.getMessage());
        return "Error al borrar estatus item";        
    }

  }
    
}
