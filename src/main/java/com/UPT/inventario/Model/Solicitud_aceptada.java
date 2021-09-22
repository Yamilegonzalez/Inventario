package com.UPT.inventario.Model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "solicitud_aceptada")
@SuppressWarnings("serial")
public class Solicitud_aceptada {
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_solicitud_aceptada")
    private Long idAceptada;
    
    @JoinColumn(name = "id_solicitud", referencedColumnName = "id_solicitud")
    @ManyToOne(optional = false)
    private Long idSolicitud;
    
    @JoinColumn(name = "id_item", referencedColumnName = "id_item")
    @ManyToOne(optional = false)
    private Long idItem;
    
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_ususario")
    @ManyToOne(optional = false)
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
        return idAceptada;
    }

    public void setIdAceptada(Long idAceptada) {
        this.idAceptada = idAceptada;
    }

    public Long getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(Long idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public Long getIdItem() {
        return idItem;
    }

    public void setIdItem(Long idItem) {
        this.idItem = idItem;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFinicial() {
        return Finicial;
    }

    public void setFinicial(Date finicial) {
        Finicial = finicial;
    }

    public Date getFretiro() {
        return Fretiro;
    }

    public void setFretiro(Date fretiro) {
        Fretiro = fretiro;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}