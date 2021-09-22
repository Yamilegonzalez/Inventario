package com.UPT.inventario.Model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estatus_item")
@SuppressWarnings("serial")
public class Estatus_item{
    @Id
    @Basic(optional = false)
    @Column(name="id_estatus")
    private Long idEstatus;

    @Column(name="estado", nullable = false)
    private String estado;

    @Column(name="created_at", nullable = false)
    private Date created_at;

    @Column(name="updated_at", nullable = false)
    private Date updated_at;


    public long getIdEstatus() {
        return this.idEstatus;
    }

    public void setIdEstatus(long idEstatus) {
        this.idEstatus = idEstatus;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return this.updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

}

