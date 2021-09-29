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
        String insert = "INSERT INTO sancion_aplicada(id_sancion_usuario, id_usuario, motivo_operador, fecha_ingresada, fecha_limite, created_at)"+ 
        "VALUES ('"+sancionApli.getMotivoOperador()+"','"+sancionApli.getFechaIngresada()+"','"+sancionApli.getFechaLimite()+"','"+sancionApli.getCreated_at()+"');";
            
        Query query = em.createNativeQuery(insert);
        try {
            query.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.err.println("Error en insert sancion aplicada:" + e.getMessage());
            return 0;
        } 
    }

    
}
