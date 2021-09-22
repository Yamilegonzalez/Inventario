package com.UPT.inventario.Facade;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
    
}
