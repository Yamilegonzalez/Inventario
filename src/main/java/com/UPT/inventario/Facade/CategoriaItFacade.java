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
    static EntityManager em;

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
    public static Integer insertCategoriaIObjeto(Categoria_item categoriaItem) {
        String insert = "INSERT INTO categoria_item(nombre_categoria,descripcion, created_at)" + "VALUES ('"
                + categoriaItem.getNombreCategoria() + "','" + categoriaItem.getDescripcion() + "','"
                + categoriaItem.getCreatedAt() + "');";

        Query query = em.createNativeQuery(insert);
        try {
            query.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.err.println("Error en insert categoria item:" + e.getMessage());
            return 0;
        }
    }

    @Transactional
    public static Integer updateCategoriaIObjeto(String string, Categoria_item categoria_item) {
        String insert = "UPDATE categoria_item SET id_categoria_item=" + categoria_item.getIdCategoria()
                + ",nombre_categoria='" + categoria_item.getNombreCategoria() + "',descripcion='"
                + categoria_item.getDescripcion() + categoria_item.getCreatedAt() + "'" + "WHERE id_categoria = "
                + string + ";";
        Query query = em.createNativeQuery(insert);
        try {
            query.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.err.println("Error en updated categoria:" + e.getMessage());
            return 0;
        }
    }

    @Transactional
    public static Integer deleteCategoriaIObjeto(Long categoria_item) {
        String insert = "DELETE FROM categoria_item WHERE id_categoria=" + categoria_item;
        System.out.println(insert);
        Query query = em.createNativeQuery(insert);
        try {
            query.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.err.println("Error en delete categoria item:" + e.getMessage());
            return 0;
        }
    }

}
