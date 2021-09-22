package com.UPT.inventario.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
    
}
