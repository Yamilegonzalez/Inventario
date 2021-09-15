package com.UPT.inventario.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reporte_usuario")
public class Reporte_usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_reporte_usuario")
    private Long idReportUsuario;

    @Column(name = "id_usuario", nullable = false)
    private long idUsuario;

    @Column(name = "id_item", nullable = false)
    private long idItem;

    @Column(name = "id_solicitud", nullable = false)
    private long idSolicitud;

    @Column(name = "motivo", nullable = false)
    private String motivo;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "url_img", nullable = false)
    private String url_img;

    @Column(name="created_at", nullable = false)
    private String created_at;

    @Column(name="updated_at", nullable = false)
    private String updated_at;

  
    public long getIdReportUsuario() {
        return this.idReportUsuario;
    }

    public void setIdReportUsuario(long idReportUsuario) {
        this.idReportUsuario = idReportUsuario;
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

    public long getIdSolicitud() {
        return this.idSolicitud;
    }

    public void setIdSolicitud(long idSolicitud) {
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
