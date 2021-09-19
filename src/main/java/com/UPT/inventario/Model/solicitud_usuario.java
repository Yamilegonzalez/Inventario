package com.UPT.inventario.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;


@Entity
@Table(name = "solicitud_usuario")
public class solicitud_usuario{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_solicitud")
    private Long idSolicitud;

    @JoinColumn(name = "id_estatus", referencedColumnName = "id_estatus")
    private estatus_item idEstatus;

    @Column(name="folio_solicitud", nullable = false)
    private String folioSolicitud;

    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    private Usuario idUsuario;
    
    @JoinColumn(name = "id_item", referencedColumnName = "id_item")
    private Item idItem;

    @Column(name="fecha_inicio", nullable = false)
    private Date fechaInicio;

    @Column(name="fecha_final", nullable = false)
    private Date fechaFinal;

    @Column(name="motivo", nullable = false)
    private String motivo;

    @Column(name="created_at", nullable = false)
    private Date created_at;

    @Column(name="updated_at", nullable = false)
    private Date updated_at;


    public Long getIdSolicitud() {
        return this.idSolicitud;
    }

    public void setIdSolicitud(Long idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public estatus_item getIdEstatus() {
        return this.idEstatus;
    }

    public void setIdEstatus(estatus_item idEstatus) {
        this.idEstatus = idEstatus;
    }

    public String getFolioSolicitud() {
        return this.folioSolicitud;
    }

    public void setFolioSolicitud(String folioSolicitud) {
        this.folioSolicitud = folioSolicitud;
    }

    public Usuario getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Item getIdItem() {
        return this.idItem;
    }

    public void setIdItem(Item idItem) {
        this.idItem = idItem;
    }

    public Date getFechaInicio() {
        return this.fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return this.fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getMotivo() {
        return this.motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
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
