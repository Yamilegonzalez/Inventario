package com.UPT.inventario.Model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rol")
@SuppressWarnings("serial")
public class Rol{
    @Id
    @Basic(optional = false)
    @Column(name="id_rol")
    private long idRol;

    @Column(name="nombre_rol", nullable = false)
    private String nombreRol;

    @Column(name="created_at", nullable = false)
    private Date created_at;

    @Column(name="updated_at", nullable = false)
    private Date updated_at;

    public void setIdRol(long idRol){
        this.idRol = idRol;
    }
    public long getIdRol(){
        return this.idRol;
    }
    public void setNombreRol(String nombreRol){
        this.nombreRol = nombreRol;
    }
    public String getNombreRol(){
        return this.nombreRol;
    }
    public void getCreated_at(Date created_at){
        this.created_at = created_at;
    }
    public Date getUpdated_at(){
        return this.updated_at;
    }

}
