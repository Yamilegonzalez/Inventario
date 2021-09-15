package com.UPT.inventario.Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "item")
public class Item implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iditem;
    @Column(name = "id_item")
    private Long idCate;
    @Column(name = "id_categoria")
    private int NSerie;
    @Column(name = "no_serie")
    private String nombre;
    @Column(name = "nomnbre_item")
    private String desc;
    @Column(name = "descripcion")
    @Temporal(TemporalType.TIMESTAMP)
    private TemporalType createdAt;
    @Column(name = "created_at")
    private TemporalType updatedAt;
    @Column(name = "updated_at")


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
