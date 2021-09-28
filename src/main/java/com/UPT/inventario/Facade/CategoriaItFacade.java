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
            result = castList(Categoria_item.class, query.getResultList());

        } catch (Exception e) {
            System.err.println("Error al obtener getAllCategoria_item:" + e.getMessage());
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
    public Integer insertCategoriaI(String categoriaI, String createdAt) {
        String insert = "INSERT INTO area(categoriaI, created_at) VALUES ('" + categoriaI + "','" + createdAt + "');";

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
    public Integer insertCategoriaIObjeto(Categoria_item area) {
        String insert = "INSERT INTO categoriaI(categoriaI, created_at) VALUES ('" + area.getCategoriaI() + "','"
                + area.getCreatedAt() + "');";

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
