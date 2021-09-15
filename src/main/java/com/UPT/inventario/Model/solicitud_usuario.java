package com.UPT.inventario.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;


@Entity
@Table(name = "solicitud_usuario")
public class solicitud_usuario {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_solicitud")
    private Long idSolicitud;

    @Column(name="id_estatus", nullable = false)
    private long idEstatus;

    @Column(name="folio_solicitud", nullable = false)
    private String folioSolicitud;

    @Column(name="id_usuario", nullable = false)
    private long idUsuario;

    @Column(name="id_item", nullable = false)
    private long idItem;

    @Column(name="fecha_inicio", nullable = false)
    private String fechaInicio;

    @Column(name="fecha_final", nullable = false)
    private String fechaFinal;

    @Column(name="motivo", nullable = false)
    private String motivo;

    @Column(name="created_at", nullable = false)
    private String created_at;

    @Column(name="updated_at", nullable = false)
    private String updated_at;


    public long getIdSolicitud() {
        return this.idSolicitud;
    }

    public void setIdSolicitud(long idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public long getIdEstatus() {
        return this.idEstatus;
    }

    public void setIdEstatus(long idEstatus) {
        this.idEstatus = idEstatus;
    }

    public String getFolioSolicitud() {
        return this.folioSolicitud;
    }

    public void setFolioSolicitud(String folioSolicitud) {
        this.folioSolicitud = folioSolicitud;
    }

    public long getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public long getIdItem() {
        return this.idItem;
    }

    public void setIdItem(long idItem) {
        this.idItem = idItem;
    }

    public String getFechaInicio() {
        return this.fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return this.fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getMotivo() {
        return this.motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return this.updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
    
}
