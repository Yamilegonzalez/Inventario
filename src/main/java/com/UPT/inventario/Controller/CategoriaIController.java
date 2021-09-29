package com.UPT.inventario.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import com.UPT.inventario.Facade.CategoriaItFacade;
import com.UPT.inventario.Model.Categoria_item;

import java.util.ArrayList;

@RestController
@RequestMapping("/API")
public class CategoriaIController {
    
        @Autowired
        private CategoriaItFacade CategoriaItFacades;
    
        @GetMapping("/getAllCategotiaIt")
        public List<Categoria_item> getAllCategoriaIt() {
            List<Categoria_item> CategoriaItem = new ArrayList<Categoria_item>();
            CategoriaItem = CategoriaItFacades.getAllCategoriaItem();
            return CategoriaItem;
        }

        @PostMapping("/insertCategoriaIObjeto")
        public String insertCategoriaIObjeto(@RequestBody Categoria_item categoriaItem) {  
        try{
            int res = CategoriaItFacades.insertCategoriaIObjeto(categoriaItem);
            if(res==1){
            return "categoria item insertada";
            }else{
                return "Error al insertar  item categoria";
            }       
        }catch(Exception e){            
            System.out.println("Error: " + e.getMessage());
            return "Error al insertar item categoria";        
        }
        
      }
    
}