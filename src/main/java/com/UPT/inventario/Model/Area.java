package com.UPT.inventario.Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "area")
public class Area implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_area", nullable = false)
    private Long idArea;

    @Column(name = "nombre")
    private String nombre;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private TemporalType createdAt;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    private TemporalType updatedAt;


    public Long getIdArea() {
        return this.idArea;
    }

    public void setIdArea(Long idArea) {
        this.idArea = idArea;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TemporalType getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(TemporalType createdAt) {
        this.createdAt = createdAt;
    }

    public TemporalType getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(TemporalType updatedAt) {
        this.updatedAt = updatedAt;
    }
   

    
}
