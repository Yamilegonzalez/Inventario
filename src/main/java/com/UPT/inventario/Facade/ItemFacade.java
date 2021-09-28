package com.UPT.inventario.Facade;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

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
            String select = "SELECT * FROM item";

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
    @Transactional
    public Integer insertItem(String item, String createdAt) {
        String insert = "INSERT INTO item(item, created_at) VALUES ('"+item+"','"+createdAt+"');";

        Query query = em.createNativeQuery(insert);
        try {
            query.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.err.println("Error en items:" + e.getMessage());
            return 0;
        } 
    }
    

    @Transactional
    public Integer insertItemObjeto(Item item) {
        String insert = "INSERT INTO area(item, created_at) VALUES ('"+item.getIdItem()+"','"+item.getCreatedAt()+"');";

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
