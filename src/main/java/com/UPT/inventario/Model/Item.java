package com.UPT.inventario.Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "item")
public class Item implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "id_item", referencedColumnName = "id_item")
    @Column(name = "id_item", nullable = false)
    private Long iditem;
    @JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria")
    @Column(name = "id_categoria", nullable = false)
    private Long idCate;
    @Column(name = "no_serie")
    private int NSerie;
    @Column(name = "nomnbre_item")
    private String nombre;
    @Column(name = "descripcion")
    private String desc;
    
    @Temporal(TemporalType.TIMESTAMP)
 
    @Column(name = "created_at")
    private TemporalType createdAt;
    @Column(name = "updated_at")
    private TemporalType updatedAt;


    public Long getIditem() {
        return iditem;
    }

    public void setIditem(Long iditem) {
        this.iditem = iditem;
    }

    public Long getIdCate() {
        return idCate;
    }

    public void setIdCate(Long idCate) {
        this.idCate = idCate;
    }

    public int getNSerie() {
        return NSerie;
    }

    public void setNSerie(int nSerie) {
        NSerie = nSerie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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

}
