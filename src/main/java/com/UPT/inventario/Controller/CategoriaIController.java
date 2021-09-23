package com.UPT.inventario.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

import com.UPT.inventario.Facade.CategoriaItFacade;
import com.UPT.inventario.Model.Categoria_item;

import java.util.ArrayList;

@RestController
@RequestMapping("/API")
public class CategoriaIController {
    public class EstatusItemController {

        @Autowired
        private CategoriaItFacade CategoriaItFacade;
    
        @GetMapping("/getAllCategotiaIt")
        public List<Categoria_item> getAllCategoriaIt() {
            List<Categoria_item> CategoriaItem = new ArrayList<Categoria_item>();
            CategoriaItem = CategoriaItFacade.getAllCategoriaIt();
            return CategoriaItem;
        }
    }
}