package com.UPT.inventario.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estatus_item")
public class estatus_item{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
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

