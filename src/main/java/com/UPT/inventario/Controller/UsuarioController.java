package com.UPT.inventario.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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


 @PostMapping("/getUsersByName")
    public List<Usuario> getUsersByName(@RequestParam("name") String name) {
        List<Usuario> user = new ArrayList<Usuario>();
        user = usuarioFacade.getUsuariosByName(name);
        return user;
    }

 @GetMapping("/getUsersByName2/{name}")
    public List<Usuario> getUsersByName2(@PathVariable String name) {
        List<Usuario> user = new ArrayList<Usuario>();
        user = usuarioFacade.getUsuariosByName(name);
        return user;
    }

    @PostMapping("/insertUsuarioObjeto")
    public String insertUsuarioObjeto(@RequestBody Usuario usuario) {  
    try{
        int res = usuarioFacade.insertUsuarioObjeto(usuario);
        if(res==1){
        return "Usuario insertado";
        }else{
            return "Error al insertar usuario";
        }       
    }catch(Exception e){            
        System.out.println("Error: " + e.getMessage());
        return "Error al insertar usuario";        
    }
    
  }
  @PostMapping("/updateUsuarioObjeto")
    public String updateUsuarioObjeto(@RequestBody Usuario usuario) {  
    try{
        int res = usuarioFacade.updateUsuarioObjeto(usuario.getIdUsuario(), usuario);
        if(res==1){
        return "Usuario actualizado";
        }else{
            return "Error al actualizar usuario";
        }       
    }catch(Exception e){            
        System.out.println("Error: " + e.getMessage());
        return "Error al actualizar usuario";        
    }
    
  }

}
