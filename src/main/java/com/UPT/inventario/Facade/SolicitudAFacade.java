package com.UPT.inventario.Facade;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.UPT.inventario.Model.Solicitud_aceptada;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Component
public class SolicitudAFacade {
    @PersistenceContext
    EntityManager em;

    public List<Solicitud_aceptada> getAllSolicitudAceptada() {
        
        List<Solicitud_aceptada> result = new ArrayList<Solicitud_aceptada>();    
        String select = "SELECT * FROM solicitud_aceptada";
        Query query = em.createNativeQuery(select, Solicitud_aceptada.class);
        try {
            result =  castList(Solicitud_aceptada.class, query.getResultList());

        } catch (Exception e) {
            System.err.println("Error al obtener getAllSolicitud_aceptada:" + e.getMessage());
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
