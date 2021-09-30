package com.UPT.inventario.Facade;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

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
    @Transactional
    public Integer insertReporteUObjeto(Reporte_usuario reporteUsuario) {
        String insert = "INSERT INTO reporte_usuario(id_usuario, id_item, id_solicitud, motivo, descripcion, url_img, created_at)"+ 
        "VALUES ("+reporteUsuario.getIdUsuario().getIdUsuario()+","+reporteUsuario.getIdItem().getIdItem()+","+reporteUsuario.getidSolicitud().getIdSolicitud()+",'"+reporteUsuario.getMotivo()+"','"+reporteUsuario.getDescripcion()+"','"+reporteUsuario.getUrl_img()+"','"+reporteUsuario.getCreated_at()+"');";
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
    @Transactional
    public Integer updatedReporteUObjeto(Long idReporteUsuario ,Reporte_usuario reporteUsuario) {
        String insert = "UPDATE reporte_usuario SET id_usuario="+reporteUsuario.getIdUsuario().getIdUsuario()+", id_item="+reporteUsuario.getIdItem().getIdItem()+",id_solicitud="+reporteUsuario.getidSolicitud().getIdSolicitud()+",motivo='"+reporteUsuario.getMotivo()+"',descripcion='"+reporteUsuario.getDescripcion()+"',url_img='"+reporteUsuario.getUrl_img()+"',created_at='"+reporteUsuario.getCreated_at()+"'"+
        "WHERE id_reporte_usuario = "+idReporteUsuario+";";
        System.out.println(insert);
        Query query = em.createNativeQuery(insert);
        try {
            query.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.err.println("Error en updated productos:" + e.getMessage());
            return 0;
        } 
    }
    @Transactional
    public Integer deleteReporteUObjeto(Long idReporteUsuario) {
        String insert = "DELETE FROM reporte_usuario WHERE id_reporte_usuario="+idReporteUsuario;
        System.out.println(insert);    
        Query query = em.createNativeQuery(insert);
        try {
            query.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.err.println("Error en delete reporte usuario:" + e.getMessage());
            return 0;
        }
    }
    @PersistenceContext
    EntityManager ems;
    public List<Reporte_usuario> selectByIdReporteUObjeto(Long idReporteUsuario){
        List<Reporte_usuario> result = new ArrayList<Reporte_usuario>();
        String select = "SELECT * FROM reporte_usuario WHERE id_reporte_usuario = "+idReporteUsuario+";";
        System.out.println(select);
        Query query = ems.createNativeQuery(select, Reporte_usuario.class);
        try{
            result =  castList(Reporte_usuario.class, query.getResultList());
        }catch (Exception e) {
            System.err.println("Error al obtener get reporte_usuario by id:" + e.getMessage());
        }
        return result;
    }
}
