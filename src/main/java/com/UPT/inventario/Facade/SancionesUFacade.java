package com.UPT.inventario.Facade;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

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
        String select = "SELECT * FROM sanciones_usuario";
        Query query = em.createNativeQuery(select, Sanciones_usuario.class);
        try {
            result = castList(Sanciones_usuario.class, query.getResultList());

        } catch (Exception e) {
            System.err.println("Error al obtener getAllSanciones_usuario:" + e.getMessage());
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
    public Integer insertSancionesUObjeto(Sanciones_usuario sancionesUsuario) {
        String insert = "INSERT INTO sanciones_usuario(id_usuario, id_item, motivo_sistema, fecha_ingresada, fecha_registro, fecha_limite, created_at)"
                + "VALUES(" + sancionesUsuario.getIdUsuario().getIdUsuario() + ","
                + sancionesUsuario.getIdItem().getIdItem() + ",'" + sancionesUsuario.getMotivoSistema() + "','"
                + sancionesUsuario.getFechaIngresada() + "','" + sancionesUsuario.getFechaRegistro() + "','"
                + sancionesUsuario.getFechaLimite() + "','" + sancionesUsuario.getCreatedAt() + "');";
        System.out.println(insert);
        Query query = em.createNativeQuery(insert);
        try {
            query.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.err.println("Error en insert sanciones usuario:" + e.getMessage());
            return 0;
        }
    }

    @Transactional
    public Integer updateSancionesUObjeto(long idSancionesU, Sanciones_usuario usuario) {
        String insert = "UPDATE usuario SET id_usuario=" + usuario.getIdUsuario().getIdUsuario() + ". id_item="
                + usuario.getIdItem().getIdItem() + "'motivo_sistema='" + usuario.getMotivoSistema()
                + "',fecha_ingresada='" + usuario.getFechaIngresada() + "'fecha_registro='" + usuario.getFechaRegistro()
                + "',fecha_limite='" + usuario.getFechaLimite() + "'created_at'" + usuario.getCreatedAt() + "'"
                + "WHERE id_sancion_usuario=" + idSancionesU + ";";
        Query query = em.createNativeQuery(insert);
        try {
            query.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.err.println("Error en update Sanciones:" + e.getMessage());
            return 0;
        }
    }

    @Transactional
    public Integer deleteSancionesUObjeto(long idSancionesU) {
        String insert = "DELETE FROM usuario WHERE id_sancion_usuario" + idSancionesU;
        System.out.println(insert);
        var query = em.createNativeQuery(insert);
        try {
            ((Query) query).executeUpdate();
            return 1;
        } catch (Exception e) {
            System.err.println("Error en delete Sanciones usuario" + e.getMessage());
            return 0;
        }
    }
}
