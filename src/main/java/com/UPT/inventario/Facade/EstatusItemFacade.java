package com.UPT.inventario.Facade;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.UPT.inventario.Model.Estatus_item;

@Component
public class EstatusItemFacade {
    
    @PersistenceContext
    EntityManager em;
    
    public List<Estatus_item> getAllEstatusItem() {
        List<Estatus_item> result = new ArrayList<Estatus_item>();
            String select = "SELECT * FROM estatus_item";

             Query query = em.createNativeQuery(select, Estatus_item.class);
        try {
            result =  castList(Estatus_item.class, query.getResultList());

        } catch (Exception e) {
            System.err.println("Error al obtener getAllEstatus_item:" + e.getMessage());
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
