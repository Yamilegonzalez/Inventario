package com.UPT.inventario.Facade;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.UPT.inventario.Model.Reporte_usuario;

@Component
public class ReporteUFacade {
    @PersistenceContext
    EntityManager em;

    public List<Reporte_usuario> getAllReporteUsuario() {
        
        List<Reporte_usuario> result = new ArrayList<Reporte_usuario>();    
        String select = "SELECT * FROM reporte_usuario";
        Query query = em.createNativeQuery(select, Reporte_usuario.class);
        try {
            result =  castList(Reporte_usuario.class, query.getResultList());

        } catch (Exception e) {
            System.err.println("Error al obtener getAllReporte_usuario:" + e.getMessage());
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
