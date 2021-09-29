package com.UPT.inventario.Model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sanciones_usuario")
@SuppressWarnings("serial")
public class Sanciones_usuario{
    @Id
    @Basic(optional = false)
    @Column(name = "id_sancion_usuario")
    private Long idSancionUsu;
    
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false)
    private Usuario idUsuario;
    
    @JoinColumn(name = "id_item", referencedColumnName = "id_item")
    @ManyToOne(optional = false)
    private Item idItem;
    
    @Column(name = "motivo_sistema")
    private String motivoSistema;
    
    @Column(name = "fecha_ingresada")
    private Date fechaIngresada;
    
    @Column(name = "fecha_registro")
    private Date fechaRegistro;
    
    @Column(name = "fecha_limite")
    private Date fechaLimite;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    public Long getIdSancionUsu() {
        return this.idSancionUsu;
    }

    public void setIdSancionUsu(Long idSancionUsu) {
        this.idSancionUsu = idSancionUsu;
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

    public String getMotivoSistema() {
        return this.motivoSistema;
    }

    public void setMotivoSistema(String motivoSistema) {
        this.motivoSistema = motivoSistema;
    }

    public Date getFechaIngresada() {
        return this.fechaIngresada;
    }

    public void setFechaIngresada(Date fechaIngresada) {
        this.fechaIngresada = fechaIngresada;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaLimite() {
        return this.fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
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
