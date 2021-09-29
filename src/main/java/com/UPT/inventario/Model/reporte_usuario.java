package com.UPT.inventario.Model;

import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reporte_usuario")
@SuppressWarnings("serial")
public class Reporte_usuario{
    @Id
    @Basic(optional = false)
    @Column(name = "id_reporte_usuario")
    private Long idReportUsuario;

    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false)
    private Usuario idUsuario;

    @JoinColumn(name = "id_item", referencedColumnName = "id_item")
    @ManyToOne(optional = false)
    private Item idItem;

    @JoinColumn(name = "id_solicitud", referencedColumnName = "id_solicitud")
    @ManyToOne(optional = false)
    private Solicitud_usuario idSolicitud;

    @Column(name = "motivo", nullable = false)
    private String motivo;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "url_img", nullable = false)
    private String url_img;

    @Column(name="created_at", nullable = false)
    private Date created_at;

    @Column(name="updated_at", nullable = false)
    private Date updated_at;



    public Long getIdReportUsuario() {
        return this.idReportUsuario;
    }

    public void setIdReportUsuario(Long idReportUsuario) {
        this.idReportUsuario = idReportUsuario;
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

    public Solicitud_usuario getidSolicitud() {
        return this.idSolicitud;
    }

    public void setidSolicitud(Solicitud_usuario idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public String getMotivo() {
        return this.motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrl_img() {
        return this.url_img;
    }

    public void setUrl_img(String url_img) {
        this.url_img = url_img;
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
