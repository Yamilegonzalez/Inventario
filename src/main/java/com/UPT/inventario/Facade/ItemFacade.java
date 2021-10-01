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
    public Integer insertItemObjeto(Item item) {
        String insert = "INSERT INTO item(id_categoria, no_serie, nombre_item, descripcion, created_at)"+ 
        "VALUES ("+item.getIdCategoria().getIdCategoria()+",'"+item.getNumSerie()+"','"+item.getNombreItem()+"','"+item.getDescripcion()+"','"+item.getCreatedAt()+"');";

        System.out.println(insert);
        Query query = em.createNativeQuery(insert);
        try {
            query.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.err.println("Error en insert item:" + e.getMessage());
            return 0;
        } 
    }

    @Transactional
    public Integer updateItemObjeto(Long idItem, Item item) {
        String insert = "UPDATE item SET id_categoria="+item.getIdCategoria().getIdCategoria()+", no_serie='"+item.getNumSerie()+"',nombre_item='"+item.getNombreItem()+"',descripcion='"+item.getDescripcion()+"',created_at='"+item.getCreatedAt()+"' "+
        "WHERE id_item = "+idItem+";";
        System.out.println(insert);
        Query query = em.createNativeQuery(insert);
        try {
            query.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.err.println("Error en update item:" + e.getMessage());
            return 0;
        } 
    }

    @Transactional
    public Integer deleteItemObjeto(long idItem) {
        String insert = "DELETE FROM item WHERE id_item=" + idItem;
        System.out.println(insert);
        var query = em.createNativeQuery(insert);
        try {
            ((Query) query).executeUpdate();
            return 1;
        } catch (Exception e) {
            System.err.println("Error en delete item usuario" + e.getMessage());
            return 0;
        }
    }
    
}
