package com.UPT.inventario.Facade;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

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
            result = castList(Solicitud_aceptada.class, query.getResultList());

        } catch (Exception e) {
            System.err.println("Error al obtener getAllSolicitud_aceptada:" + e.getMessage());
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
    public Integer insertSolicitudA(String solicitud, String createdAt) {
        String insert = "INSERT INTO solicitudA(Solicitud_aceptada, created_at) VALUES ('" + solicitud + "','"
                + createdAt + "');";

        Query query = em.createNativeQuery(insert);
        try {
            query.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.err.println("Error en insertsolicitudes:" + e.getMessage());
            return 0;
        }
    }

    @Transactional
    public Integer insertSolicitudAObjeto(Solicitud_aceptada solicitudAceptada) {
        String insert = "INSERT INTO solicitud_aceptada(id_solicitud, id_item, id_usuario, descripcion, fecha_ingresada, fecha_retiro, created_at)"+
        " VALUES("+solicitudAceptada.getIdSolicitud().getIdSolicitud()+","+solicitudAceptada.getIdItem().getIdItem()+","+solicitudAceptada.getIdUsuario().getIdUsuario()+",'"+solicitudAceptada.getDescripcion()+"','"+solicitudAceptada.getFechaIngresada()+"','"+solicitudAceptada.getFechaRetiro()+"','"+solicitudAceptada.getCreatedAt()+"');";
        System.out.println(insert);

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
