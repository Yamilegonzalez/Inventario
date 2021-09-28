package com.UPT.inventario.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/getAllAreas")
    public List<Area> getAllAreas() {
        List<Area> area = new ArrayList<Area>();
        area = AreaFacade.getAllAreas();
        return area;
    }

    @PostMapping("/insertArea")
    public String insertArea(@RequestParam("nombreArea") String nombreArea,
            @RequestParam("createdAt") String createdAt) {
        try {
            int res = AreaFacade.insertArea(nombreArea, createdAt);
            if (res == 1) {
                return "Area: " + nombreArea + "," + createdAt + " insertada";
            } else {
                return "Error al insertar area";
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return "Error al insertar area";
        }

    }

    @PostMapping("/insertAreaObjeto")
    public String insertAreaObjeto(@RequestBody Area area) {
        try {
            int res = AreaFacade.insertAreaObjeto(area);
            if (res == 1) {
                return "Area: " + area.getNombreArea() + "," + area.getCreatedAt() + " insertada";
            } else {
                return "Error al insertar area";
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return "Error al insertar area";
        }

    }

}