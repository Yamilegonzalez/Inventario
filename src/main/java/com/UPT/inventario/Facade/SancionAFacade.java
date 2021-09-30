package com.UPT.inventario.Facade;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.UPT.inventario.Model.Sancion_aplicada;
import com.UPT.inventario.Model.Sanciones_usuario;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class SancionAFacade {
    @PersistenceContext
    EntityManager em;
    public List<Sancion_aplicada> getAllSancionAplicada(){
        List<Sancion_aplicada> result = new ArrayList<Sancion_aplicada>();
        String select = "SELECT * FROM sancion_aplicada";
        Query query = em.createNativeQuery(select, Sancion_aplicada.class);

        try{
            result =  castList(Sancion_aplicada.class, query.getResultList());
        }catch (Exception e) {
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

    public List<Sanciones_usuario> getAllSancionUsuarrio() {
        return null;
    }
    @Transactional
    public Integer insertSancionAplicadaObjeto(Sancion_aplicada sancionApli) {
        String insert = "INSERT INTO sancion_aplicada(id_sancion_usuario, id_usuario, id_item, motivo_operador, fecha_ingresada, fecha_limite, created_at)"+ 
        "VALUES ("+sancionApli.getIdSancionUsuario().getIdSancionUsu()+","+sancionApli.getIdUsuario().getIdUsuario()+","+sancionApli.getIdItem().getIdItem()+",'"+sancionApli.getMotivoOperador()+"','"+sancionApli.getFechaIngresada()+"','"+sancionApli.getFechaLimite()+"','"+sancionApli.getCreated_at()+"');";
        System.out.println(insert);    
        Query query = em.createNativeQuery(insert);
        try {
            query.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.err.println("Error en insert sancion aplicada:" + e.getMessage());
            return 0;
        }
    }
    
    @Transactional
    public Integer updateSancionAplicadaObjeto(Long idSanUsuApli, Sancion_aplicada sancionApli) {
        String insert = "UPDATE sancion_aplicada SET id_sancion_usuario="+sancionApli.getIdSancionUsuario().getIdSancionUsu()+", id_usuario="+sancionApli.getIdUsuario().getIdUsuario()+", id_item="+sancionApli.getIdItem().getIdItem()+",motivo_operador='"+sancionApli.getMotivoOperador()+"', fecha_ingresada='"+sancionApli.getFechaIngresada()+"', fecha_limite='"+sancionApli.getFechaLimite()+"', created_at='"+sancionApli.getCreated_at()+"'"+
        " WHERE id_sancion_usuario_apli = "+idSanUsuApli+";";
        System.out.println(insert);    
        Query query = em.createNativeQuery(insert);
        try {
            query.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.err.println("Error en update sancion aplicada:" + e.getMessage());
            return 0;
        }
    }
    @Transactional
    public Integer deleteSancionAplicadaObjeto(Long idSanUsuApli) {
        String insert = "DELETE FROM sancion_aplicada WHERE id_sancion_usuario_apli="+idSanUsuApli;
        System.out.println(insert);    
        Query query = em.createNativeQuery(insert);
        try {
            query.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.err.println("Error en delete sancion aplicada:" + e.getMessage());
            return 0;
        }
    }  

    @PersistenceContext
    EntityManager ems;
    public List<Sancion_aplicada> selectByIdSancionAplicada(Long idSanUsuApli){
        List<Sancion_aplicada> result = new ArrayList<Sancion_aplicada>();
        String select = "SELECT * FROM sancion_aplicada WHERE id_sancion_usuario_apli = "+idSanUsuApli+";";
        System.out.println(select);
        Query query = ems.createNativeQuery(select, Sancion_aplicada.class);
        try{
            result =  castList(Sancion_aplicada.class, query.getResultList());
        }catch (Exception e) {
            System.err.println("Error al obtener get sancion aplicada by id:" + e.getMessage());
        }
        return result;
    }
    
}
