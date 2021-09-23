package com.UPT.inventario.Facade;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.UPT.inventario.Model.Item;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class ItemFacade {
    @PersistenceContext
    EntityManager em;

    public List<Item> getAllItem() {
        List<Item> result = new ArrayList<Item>();
            String select = "SELECT * FROM rol";

             Query query = em.createNativeQuery(select, Item.class);
        try {
            result =  castList(Item.class, query.getResultList());

        } catch (Exception e) {
            System.err.println("Error al obtener getAllItem:" + e.getMessage());
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
