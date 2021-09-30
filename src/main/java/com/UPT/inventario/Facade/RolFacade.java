package com.UPT.inventario.Facade;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.UPT.inventario.Model.Rol;

@Component
public class RolFacade {

    @PersistenceContext
    EntityManager em;
    public List<Rol> getAllRol() {
        List<Rol> result = new ArrayList<Rol>();
            String select = "SELECT * FROM rol";

             Query query = em.createNativeQuery(select, Rol.class);
        try {
            result =  castList(Rol.class, query.getResultList());

        } catch (Exception e) {
            System.err.println("Error al obtener getAllRol:" + e.getMessage());
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
    public Integer insertRolObjeto(Rol rol) {
        String insert = "INSERT INTO rol(nombre_rol, created_at) VALUES ('"+rol.getNombreRol()+"','"+rol.getCreated_at()+"');";
        Query query = em.createNativeQuery(insert);
        try {
            query.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.err.println("Error en insert rol:" + e.getMessage());
            return 0;
        } 
    }
    @Transactional
    public Integer updatedRolObjeto(Long idRol, Rol rol) {
        String insert = "UPDATE rol SET nombre_rol='"+rol.getNombreRol()+"', created_at='"+rol.getCreated_at()+"'"+
        "WHERE id_rol = "+idRol+";";
        Query query = em.createNativeQuery(insert);
        try {
            query.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.err.println("Error en updated rol:" + e.getMessage());
            return 0;
        } 
    }
    @Transactional
    public Integer deleteRolObjeto(Long idRol) {
        String insert = "DELETE FROM rol WHERE id_rol="+idRol;
        System.out.println(insert);    
        Query query = em.createNativeQuery(insert);
        try {
            query.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.err.println("Error en delete rol:" + e.getMessage());
            return 0;
        }
    }
    @PersistenceContext
    EntityManager ems;
    public List<Rol> selectByIdRol(Long idRol) {
        List<Rol> result = new ArrayList<Rol>();
        String select = "SELECT id_rol, nombre_rol, created_at, updated_at "+
        "FROM rol WHERE id_rol = "+idRol+";";
        
        Query query = ems.createNativeQuery(select, Rol.class);
        System.out.println(select);

        try {
            result =  castList(Rol.class, query.getResultList());

        } catch (Exception e) {
            System.err.println("Error al obtener get rol by id:" + e.getMessage());
        }

        return result;
    }
    
}
