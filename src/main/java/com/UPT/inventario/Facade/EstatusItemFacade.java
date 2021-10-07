package com.UPT.inventario.Facade;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.UPT.inventario.Model.Estatus_item;

@Component
public class EstatusItemFacade {
    
    @PersistenceContext
    EntityManager em;
    
    public List<Estatus_item> getAllEstatusItem() {
        List<Estatus_item> result = new ArrayList<Estatus_item>();
            String select = "SELECT * FROM estatus_item";

             Query query = em.createNativeQuery(select, Estatus_item.class);
        try {
            result =  castList(Estatus_item.class, query.getResultList());

        } catch (Exception e) {
            System.err.println("Error al obtener getAllEstatus_item:" + e.getMessage());
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
    public Integer insertEstatusIObjeto(Estatus_item estatusItem) {
        String insert = "INSERT INTO estatus_item(estado, created_at)"+ 
        "VALUES ('"+estatusItem.getEstado()+"','"+estatusItem.getCreated_at()+"');";
        Query query = em.createNativeQuery(insert);
        try {
            query.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.err.println("Error en insert estatus item:" + e.getMessage());
            return 0;
        } 
    }
    @Transactional
    public Integer updatedEstatusIObjeto(Long idEstatus, Estatus_item estatusItem) {
        String insert = "UPDATE estatus_item SET estado='"+estatusItem.getEstado()+"', created_at='"+estatusItem.getCreated_at()+"'"+
        "WHERE id_estatus = "+idEstatus+";";
        Query query = em.createNativeQuery(insert);
        try {
            query.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.err.println("Error en updated estatus item:" + e.getMessage());
            return 0;
        } 
    }
    @Transactional
    public Integer deleteEstatusIObjeto(Long idEstatus) {
        String insert = "DELETE FROM estatus_item WHERE id_estatus="+idEstatus;
        System.out.println(insert);    
        Query query = em.createNativeQuery(insert);
        try {
            query.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.err.println("Error en delete estatus item:" + e.getMessage());
            return 0;
        }
    }

    @PersistenceContext
    EntityManager ems;
    public List<Estatus_item> selectByIdEstatusIObjeto(Long idEstatus){
        List<Estatus_item> result = new ArrayList<Estatus_item>();
        String select = "SELECT * FROM estatus_item WHERE id_estatus = "+idEstatus+";";
        System.out.println(select);
        Query query = ems.createNativeQuery(select, Estatus_item.class);
        try{
            result =  castList(Estatus_item.class, query.getResultList());
        }catch (Exception e) {
            System.err.println("Error al obtener get estatus item by id:" + e.getMessage());
        }
        return result;
    }
    
}
