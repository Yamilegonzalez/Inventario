package com.UPT.inventario.Model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;


@Entity
@Table(name = "solicitud_aceptada")
public class Solicitud_aceptada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_solicitud_aceptada")
    private Long idAceptada;
    
    @JoinColumn(name = "id_solicitud", referencedColumnName = "id_solicitud")
    private Long idSolicitud;
    
    @JoinColumn(name = "id_item", referencedColumnName = "id_item")
    private Long idItem;
    
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_ususario")
    private Long idUsuario;

    @Column(name = "descripcion")
    private String descripcion;
    
    @Column(name = "fecha_ingresada")
    private Date Finicial;

    @Column(name = "fecha_retiro")
    private Date Fretiro;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;


    public Long getIdAceptada() {
        return this.idAceptada;
    }

    public void setIdAceptada(Long idAceptada) {
        this.idAceptada = idAceptada;
    }

    // public Solicitud_usuario getIdSolicitud() {
    //     return this.idSolicitud;
    // }

    // public void setIdSolicitud(Solicitud_usuario idSolicitud) {
    //     this.idSolicitud = idSolicitud;
    // }

    // public Item getIdItem() {
    //     return this.idItem;
    // }

    // public void setIdItem(Item idItem) {
    //     this.idItem = idItem;
    // }

    // public Usuario getIdUsuario() {
    //     return this.idUsuario;
    // }

    // public void setIdUsuario(Usuario idUsuario) {
    //     this.idUsuario = idUsuario;
    // }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFinicial() {
        return this.Finicial;
    }

    public void setFinicial(Date Finicial) {
        this.Finicial = Finicial;
    }

    public Date getFretiro() {
        return this.Fretiro;
    }

    public void setFretiro(Date Fretiro) {
        this.Fretiro = Fretiro;
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
