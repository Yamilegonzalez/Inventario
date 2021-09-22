package com.UPT.inventario.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    
}
