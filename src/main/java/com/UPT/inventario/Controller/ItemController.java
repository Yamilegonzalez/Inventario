package com.UPT.inventario.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.UPT.inventario.Facade.ItemFacade;
import com.UPT.inventario.Model.Item;
import java.util.ArrayList;

@RestController
@RequestMapping("/API")
public class ItemController {
    @Autowired
    private ItemFacade ItemFacade;

    @GetMapping("/getAllItem")
    public List<Item> getAllItem() {
        List<Item> item = new ArrayList<Item>();
        item = ItemFacade.getAllItem();
        return item;
    }

    @PostMapping("/insertItemObjeto")
    public String insertItemObjeto(@RequestBody Item item) {  
    try{
        int res = ItemFacade.insertItemObjeto(item);
        if(res==1){
        return "item insertado";
        }else{
            return "Error al insertar item";
        }       
    }catch(Exception e){            
        System.out.println("Error: " + e.getMessage());
        return "Error al insertar item";        
    }
    
  }

  @PostMapping("/updateItemObjeto")
  public String updateItemObjeto(@RequestBody Item item) {  
  try{
      int res = ItemFacade.updateItemObjeto(item.getIdItem(), item);
      if(res==1){
      return "item actualizado";
      }else{
          return "Error al actualizar item";
      }       
  }catch(Exception e){            
      System.out.println("Error: " + e.getMessage());
      return "Error al actualizar item";        
  }
  
}
@PostMapping("/deleteItemObjeto")
    public String deleteItemObjeto(@RequestParam("idItem") Long idItem) {
        try {
            int res = ItemFacade.deleteItemObjeto(idItem);
            if (res == 1) {
                return "item eliminado";
            } else {
                return "Error al eliminar item";
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return "Error al eliminar item";
        }

    }
    
}
