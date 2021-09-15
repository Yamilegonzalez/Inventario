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
@Table(name="categoria_item")
public class Categoria_item implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoria;
    
    @Column(name = "id_categoria")
    private String nombre;
    @Column(name="nombre_categoria")
    private String descip;
    @Column(name="descripcion")
    @Temporal(TemporalType.TIMESTAMP)
    private TemporalType createdAt;
    @Column(name = "created_at")
    private TemporalType updatedAt;
    @Column(name = "updated_at")
    public Long getIdCategoria() {
        return idCategoria;
    }
    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescip() {
        return descip;
    }
    public void setDescip(String descip) {
        this.descip = descip;
    }
    public TemporalType getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(TemporalType createdAt) {
        this.createdAt = createdAt;
    }
    public TemporalType getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(TemporalType updatedAt) {
        this.updatedAt = updatedAt;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
