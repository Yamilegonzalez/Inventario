package com.UPT.inventario.Facade;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.UPT.inventario.Model.Sanciones_usuario;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class SancionesUFacade {
    @PersistenceContext
    EntityManager em;

    public List<Sanciones_usuario> getAllSancionesUsuario() {
        
        List<Sanciones_usuario> result = new ArrayList<Sanciones_usuario>();    
        String select = "SELECT * FROM reporte_usuario";
        Query query = em.createNativeQuery(select, Sanciones_usuario.class);
        try {
            result =  castList(Sanciones_usuario.class, query.getResultList());

        } catch (Exception e) {
            System.err.println("Error al obtener getAllSanciones_usuario:" + e.getMessage());
        }

        return result;
    }
    public static <T> List<T> castList(Class<? extends T> clazz, Collection<?> c) {
        List<T> r = new ArrayList<T>(c.size());
        for(Object o: c)
        r.add(clazz.cast(o));
        return r;
    }
    public List<Sanciones_usuario> getAllsolicitudA() {
        return null;
    }
}
