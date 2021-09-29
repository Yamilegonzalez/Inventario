package com.UPT.inventario.Facade;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.UPT.inventario.Model.Categoria_item;
@Component
public class CategoriaItFacade {
    
    @PersistenceContext
    EntityManager em;
    
    public List<Categoria_item> getAllCategoriaItem() {
        List<Categoria_item> result = new ArrayList<Categoria_item>();
            String select = "SELECT * FROM categoria_item";

             Query query = em.createNativeQuery(select, Categoria_item.class);
        try {
            result =  castList(Categoria_item.class, query.getResultList());

        } catch (Exception e) {
            System.err.println("Error al obtener getAllCategoria_item:" + e.getMessage());
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
    public Integer insertCategoriaIObjeto(Categoria_item categoriaItem) {
        String insert = "INSERT INTO categoria_item(nombre_categoria,descripcion, created_at)"+ 
        "VALUES ('"+ categoriaItem.getNombreCategoria()+"','"+categoriaItem.getDescripcion()+"','"+categoriaItem.getCreatedAt()+"');";
       
        Query query = em.createNativeQuery(insert);
        try {
            query.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.err.println("Error en insert categoria item:" + e.getMessage());
            return 0;
        } 
    }

}
