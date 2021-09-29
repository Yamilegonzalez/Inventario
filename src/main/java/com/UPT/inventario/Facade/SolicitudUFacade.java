package com.UPT.inventario.Facade;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

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

    @Transactional
    public Integer insertSolicitudUObjeto(Solicitud_usuario solicitudUsuario) {
        String insert = "INSERT INTO solicitud_usuario(id_estatus, folio_solicitud, id_usuario, id_item, fecha_inicio, fecha_final, motivo, created_at)"+ 
        "VALUES ("+solicitudUsuario.getIdEstatus().getIdEstatus()+",'"+solicitudUsuario.getFolioSolicitud()+"',"+solicitudUsuario.getIdUsuario().getIdUsuario()+","+solicitudUsuario.getIdItem().getIdItem()+",'"+solicitudUsuario.getFechaInicio()+"','"+solicitudUsuario.getFechaFinal()+"','"+solicitudUsuario.getMotivo()+"','"+solicitudUsuario.getCreated_at()+"');";
        System.out.println(insert);
        Query query = em.createNativeQuery(insert);
        try {
            query.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.err.println("Error en insert solocitudObjeto:" + e.getMessage());
            return 0;
        } 
    }
    @Transactional
    public Integer updatedSolicitudUObjeto(Long idSolicitud,Solicitud_usuario solicitudUsuario) {
        String insert = "UPDATE solicitud_usuario SET id_estatus="+solicitudUsuario.getIdEstatus().getIdEstatus()+", folio_solicitud='"+solicitudUsuario.getFolioSolicitud()+"',id_usuario="+solicitudUsuario.getIdUsuario().getIdUsuario()+",id_item="+solicitudUsuario.getIdItem().getIdItem()+",fecha_inicio='"+solicitudUsuario.getFechaInicio()+"',fecha_final='"+solicitudUsuario.getFechaFinal()+"',motivo='"+solicitudUsuario.getMotivo()+"',created_at='"+solicitudUsuario.getCreated_at()+"' "+
        "WHERE id_solicitud = "+idSolicitud+";";
        System.out.println(insert);
        Query query = em.createNativeQuery(insert);
        try {
            query.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.err.println("Error en actualizar solocitudU Objeto:" + e.getMessage());
            return 0;
        } 
    }
    @Transactional
    public Integer deleteSolicitudUObjeto(Long idSolicitud) {
        String insert = "DELETE FROM solicitud_usuario WHERE id_solicitud="+idSolicitud;
        System.out.println(insert);    
        Query query = em.createNativeQuery(insert);
        try {
            query.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.err.println("Error en delete solicitud usuario:" + e.getMessage());
            return 0;
        }
    }
}
