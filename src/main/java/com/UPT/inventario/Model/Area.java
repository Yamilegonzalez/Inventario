package com.UPT.inventario.Model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name = "area")
public class Area{
    @Id
    @Basic(optional = false)
    @Column(name = "id_area", nullable = false)
    private Long idArea;

    @Column(name = "nombre_area")
    private String nombreArea;

    @Column(name = "created_at")
    private Date created_at;
    
    @Column(name = "update_at")
    private Date updated_at;



    public Long getIdArea() {
        return this.idArea;
    }

    public void setIdArea(Long idArea) {
        this.idArea = idArea;
    }

    public String getNombreArea() {
        return this.nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
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
