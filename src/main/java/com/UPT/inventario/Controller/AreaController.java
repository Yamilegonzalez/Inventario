package com.UPT.inventario.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

import com.UPT.inventario.Facade.AreaFacade;
import com.UPT.inventario.Model.Area;

import java.util.ArrayList;


@RestController
@RequestMapping("/API")
public class AreaController {
    @Autowired
    private AreaFacade AreaFacade;

    @GetMapping("/getAllRols")
    public List<Area> getAllAreas() {
        List<Area> area = new ArrayList<Area>();
        area = AreaFacade.getAllAreas();
        return area;
    }
    
}
