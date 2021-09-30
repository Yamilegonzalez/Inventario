package com.UPT.inventario.Facade;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.UPT.inventario.Model.Usuario;

@Component
public class UsuarioFacade {

    @PersistenceContext
    EntityManager em;
    public List<Usuario> getAllUsuario() {
        List<Usuario> result = new ArrayList<Usuario>();
            String select = "SELECT * FROM usuario";

             Query query = em.createNativeQuery(select, Usuario.class);
        try {
            result =  castList(Usuario.class, query.getResultList());

        } catch (Exception e) {
            System.err.println("Error al obtener getAllUsuario:" + e.getMessage());
        }

        return result;
    }


  public List<Usuario> getUsuariosByName(String name) {
        List<Usuario> result = new ArrayList<Usuario>();
            String select = "SELECT * FROM usuario where primer_nombre='" + name + "'";

             Query query = em.createNativeQuery(select, Usuario.class);
        try {
            result =  castList(Usuario.class, query.getResultList());

        } catch (Exception e) {
            System.err.println("Error al obtener getUsuariosByName:" + e.getMessage());
        }

        return result;
    }


    public static <T> List<T> castList(Class<? extends T> clazz, Collection<?> c) {
        
        List<T> r = new ArrayList<T>(c.size());
        for(Object o: c)
        r.add(clazz.cast(o));
        return r;

    }

    @Transactional
    public Integer insertUsuarioObjeto(Usuario usuario) {
        String insert = "INSERT INTO usuario(id_area, id_rol, primer_nombre, segundo_nombre, apellido_p, apellido_m, matricula, num_telefono, correo, contrasenia, created_at)"+ 
        "VALUES ("+usuario.getIdArea().getIdArea()+","+usuario.getIdRol().getIdRol()+",'"+usuario.getPrimerNombre()+"','"+usuario.getSegundoNombre()+"','"+usuario.getApellidoP()+"','"+usuario.getApellidoM()+"','"+usuario.getMatricula()+"','"+usuario.getNumTelefono()+"','"+usuario.getCorreo()+"','"+usuario.getContrasenia()+"','"+usuario.getCreated_at()+"');";
        Query query = em.createNativeQuery(insert);
        try {
            query.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.err.println("Error en insertUsuario:" + e.getMessage());
            return 0;
        } 
    }
    @Transactional
    public Integer updateUsuarioObjeto(Long idUsuario, Usuario usuario) {
        String insert = "UPDATE usuario SET id_area="+usuario.getIdArea().getIdArea()+", id_rol="+usuario.getIdRol().getIdRol()+",primer_nombre='"+usuario.getPrimerNombre()+"',segundo_nombre='"+usuario.getSegundoNombre()+"',apellido_p='"+usuario.getApellidoP()+"',apellido_m='"+usuario.getApellidoM()+"',matricula='"+usuario.getMatricula()+"',num_telefono='"+usuario.getNumTelefono()+"',correo='"+usuario.getCorreo()+"',contrasenia='"+usuario.getContrasenia()+"',created_at='"+usuario.getCreated_at()+"'"+
        "WHERE id_usuario = "+idUsuario+";";
        Query query = em.createNativeQuery(insert);
        try {
            query.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.err.println("Error en updated Usuario:" + e.getMessage());
            return 0;
        } 
    }
    @Transactional
    public Integer deleteUsuarioObjeto(Long idUsuario) {
        String insert = "DELETE FROM usuario WHERE id_usuario="+idUsuario;
        System.out.println(insert);    
        Query query = em.createNativeQuery(insert);
        try {
            query.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.err.println("Error en delete usuario:" + e.getMessage());
            return 0;
        }
    }

    @PersistenceContext
    EntityManager ems;
    public List<Usuario> selectByIdUsuarioObjeto(Long idUsuario){
        List<Usuario> result = new ArrayList<Usuario>();
        String select = "SELECT * FROM usuario WHERE id_usuario = "+idUsuario+";";
        System.out.println(select);
        Query query = ems.createNativeQuery(select, Usuario.class);
        try{
            result =  castList(Usuario.class, query.getResultList());
        }catch (Exception e) {
            System.err.println("Error al obtener get usuario by id:" + e.getMessage());
        }
        return result;
    }

}