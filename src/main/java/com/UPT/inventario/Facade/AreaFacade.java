package com.UPT.inventario.Facade;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.UPT.inventario.Model.Area;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class AreaFacade {
    @PersistenceContext
    EntityManager em;

    public List<Area> getAllAreas() {
        List<Area> result = new ArrayList<Area>();
        String select = "SELECT * FROM area";

        Query query = em.createNativeQuery(select, Area.class);
        try {
            result = castList(Area.class, query.getResultList());

        } catch (Exception e) {
            System.err.println("Error al obtener getAllArea:" + e.getMessage());
        }

        return result;
    }

    public static <T> List<T> castList(Class<? extends T> clazz, Collection<?> c) {
        List<T> r = new ArrayList<T>(c.size());
        for (Object o : c)
            r.add(clazz.cast(o));
        return r;
    }

    @Transactional
    public Integer insertArea(String nombreArea, String createdAt) {
        String insert = "INSERT INTO area(nombre_area, created_at) VALUES ('" + nombreArea + "','" + createdAt + "');";

        Query query = em.createNativeQuery(insert);
        try {
            query.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.err.println("Error en insertproductos:" + e.getMessage());
            return 0;
        }
    }

    @Transactional
    public Integer insertAreaObjeto(Area area) {
        String insert = "INSERT INTO area(nombre_area, created_at)"+ 
        "VALUES ('"+area.getNombreArea()+"','"+area.getCreatedAt()+"');";
        System.out.println(insert);
        Query query = em.createNativeQuery(insert);
        try {
            query.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.err.println("Error en insertproductos:" + e.getMessage());
            return 0;
        }
    }
}
