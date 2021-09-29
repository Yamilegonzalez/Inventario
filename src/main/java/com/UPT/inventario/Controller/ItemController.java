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

<<<<<<< HEAD
    @PostMapping("/insertItem")
    public String insertitem(@RequestParam("Item") String item, @RequestParam("createdAt") String createdAt) {
        try {
            int res = ItemFacade.insertItem(item, createdAt);
            if (res == 1) {
                return "Item: " + item + "," + createdAt + " insertada";
            } else {
                return "Error al insertar item";
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return "Error al insertar item";
        }

    }

    @PostMapping("/insertItemObjeto")
    public String insertItemObjeto(@RequestBody Item item) {
        try {
            int res = ItemFacade.insertItemObjeto(item);
            if (res == 1) {
                return "Item: " + item.getIdItem() + "," + item.getCreatedAt() + " insertada";
            } else {
                return "Error al insertar item";
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return "Error al insertar item";
        }

    }

=======
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
    
>>>>>>> 9b2f0b8f85a593fde2b25e2f5abf3a71284cc59a
}
