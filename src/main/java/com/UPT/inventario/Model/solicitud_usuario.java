package com.UPT.inventario.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD
=======
import javax.persistence.JoinColumn;
>>>>>>> b5985feb11043d6e432c9f75ae359c8c98c4f4b0
import javax.persistence.Table;
import javax.persistence.JoinColumn;


@Entity
@Table(name = "solicitud_usuario")
public class solicitud_usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_solicitud")
    private Long idSolicitud;

    @JoinColumn(name = "id_estatus", referencedColumnName = "id_estatus")
    private Estatus_item idEstatus;

    @Column(name="folio_solicitud", nullable = false)
    private String folioSolicitud;

    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    private Usuario idUsuario;
    
    @JoinColumn(name = "id_item", referencedColumnName = "id_item")
    private Item idItem;

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



    public Long getIdSolicitud() {
        return this.idSolicitud;
    }

    public void setIdSolicitud(Long idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public Estatus_item getIdEstatus() {
        return this.idEstatus;
    }

    public void setIdEstatus(Estatus_item idEstatus) {
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
