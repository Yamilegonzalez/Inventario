package com.UPT.inventario.Facade;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.UPT.inventario.Model.Area;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class AreaFacade {
    @PersistenceContext
    EntityManager em;

    public List<Area> getAllRol() {
        List<Area> result = new ArrayList<Area>();
            String select = "SELECT * FROM rol";

             Query query = em.createNativeQuery(select, Area.class);
        try {
            result =  castList(Area.class, query.getResultList());

        } catch (Exception e) {
            System.err.println("Error al obtener getAllArea:" + e.getMessage());
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
