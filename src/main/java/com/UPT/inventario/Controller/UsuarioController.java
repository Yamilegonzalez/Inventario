package com.UPT.inventario.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UPT.inventario.Facade.UsuarioFacade;
import com.UPT.inventario.Model.Usuario;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/API")
public class UsuarioController {

    @Autowired
    private UsuarioFacade usuarioFacade;

    @GetMapping("/testUsuarioController")
    public String getNextLote() {
        return "Al fine controller";
    }

    @GetMapping("/getAllUsers")
    public List<Usuario> getAllUsers() {
        List<Usuario> user = new ArrayList<Usuario>();
        user = usuarioFacade.getAllUsuario();
        return user;
    }

}
