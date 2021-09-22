package com.UPT.inventario.Facade;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.UPT.inventario.Model.Solicitud_usuario;

@Component
public class SolicitudUFacade {
    @PersistenceContext
    EntityManager em;

    public List<Solicitud_usuario> getAllSolicitudUsuario() {
        List<Solicitud_usuario> result = new ArrayList<Solicitud_usuario>();
            String select = "SELECT * FROM solicitud_usuario";

             Query query = em.createNativeQuery(select, Solicitud_usuario.class);
        try {
            result =  castList(Solicitud_usuario.class, query.getResultList());

        } catch (Exception e) {
            System.err.println("Error al obtener getAllSolicitud_usuario:" + e.getMessage());
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
