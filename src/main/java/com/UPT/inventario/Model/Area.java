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
@Table(name = "areas")
public class Area implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "id_area")
    private String nombre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TemporalType getCreatedAt() {
        return createdAt;
    }

    public void setCreateAt(TemporalType createdAt) {
        this.createdAt = createdAt;
    }

    public TemporalType getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdateAt(TemporalType updatedAt) {
        this.updatedAt = updatedAt;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Column(name = "created_at")
    private TemporalType createdAt;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    private TemporalType updatedAt;
    @Temporal(TemporalType.TIMESTAMP)
    private static final long serialVersionUID = 1L;
}
