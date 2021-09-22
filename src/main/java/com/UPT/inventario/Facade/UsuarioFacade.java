package com.UPT.inventario.Facade;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.UPT.inventario.Model.Usuario;

@Component
public class UsuarioFacade {

    @PersistenceContext
    EntityManager em;

    public List<Usuario> getAllUsuario() {
        List<Usuario> result = new ArrayList<Usuario>();
            String select = "SELECT * FROM usuario";

             Query query = em.createNativeQuery(select, Usuario.class);
        try {
            result =  castList(Usuario.class, query.getResultList());

        } catch (Exception e) {
            System.err.println("Error al obtener getAllUsuario:" + e.getMessage());
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