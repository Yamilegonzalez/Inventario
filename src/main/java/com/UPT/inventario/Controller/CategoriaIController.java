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
        @PostMapping("/insertCategoriaI")
        public String insertCategoriaI(@RequestParam("nombreArea") String categoriaI,
                @RequestParam("createdAt") String createdAt) {
            try {
                int res = CategoriaItFacades.insertCategoriaI(CategoriaItFacades, createdAt);
                if (res == 1) {
                    return "CategoriaI: " + categoriaI + "," + createdAt + " insertada";
                } else {
                    return "Error al insertar categoria del item";
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                return "Error al insertar la categotia del item ";
            }
    
        }
    
        @PostMapping("/insertCategotiaIObjeto")
        public String insertCategoriaIObjeto(@RequestBody Categoria_item categoriaI) {
            try {
                int res = CategoriaItFacades.insertCategoriaIObjeto(categoriaI);
                if (res == 1) {
                    return "CategoriaI: " + categoriaI.getNombreCategoria() + "," + categoriaI.getCreatedAt() + " insertada";
                } else {
                    return "Error al insertar categoria del item";
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                return "Error al insertar categoria del item ";
            }
    
        }
    
    
}