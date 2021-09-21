package com.UPT.inventario.Model;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "item")
@SuppressWarnings("serial")
public class Item {
    @Id
    @Basic(optional = false)
    @Column(name = "id_item")
    private Long idItem;

    @JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria")
    @ManyToOne(optional = false)
    private Categoria_item idCategoria;

    @Column(name = "no_serie")
    private int NSerie;

    @Column(name = "nombre_item")
    private String nombreItem;

    @Column(name = "descripcion")
    private String descripcion;
    
    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    public Long getIdItem() {
        return this.idItem;
    }

    public void setIdItem(Long idItem) {
        this.idItem = idItem;
    }

    // public Categoria_item getIdCategoria() {
    //     return this.idCategoria;
    // }

    // public void setIdCategoria(Categoria_item idCategoria) {
    //     this.idCategoria = idCategoria;
    // }

    public int getNSerie() {
        return this.NSerie;
    }

    public void setNSerie(int NSerie) {
        this.NSerie = NSerie;
    }

    public String getNombreItem() {
        return this.nombreItem;
    }

    public void setNombreItem(String nombreItem) {
        this.nombreItem = nombreItem;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
            
}
