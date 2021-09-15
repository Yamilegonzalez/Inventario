package com.UPT.inventario.Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "sanciones_usuario")
public class Sanciones_usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sancion_usuario", nullable = false)
    private Long idSancion;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_ususario")
    @Column(name = "id_usuario", nullable = false)
    private Usuario idu;
    @JoinColumn(name = "id_item", referencedColumnName = "id_item")
    @Column(name = "id_item", nullable = false)
    private Long iditem;
    @Column(name = "motivo_sistema")
    private String motivo;
    @Column(name = "fecha_ingresada")
    private Date Finicial;
    @Column(name = "fecha_registro")
    private Date Fretiro;
    @Column(name = "fecha_limite")
    private Date FLimite;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private TemporalType createdAt;
    @Column(name = "updated_at")
    private TemporalType updatedAt;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    public Long getIdSancion() {
        return idSancion;
    }
    public void setIdSancion(Long idSancion) {
        this.idSancion = idSancion;
    }
    public Usuario getIdu() {
        return idu;
    }
    public void setIdu(Usuario idu) {
        this.idu = idu;
    }
    public Long getIditem() {
        return iditem;
    }
    public void setIditem(Long iditem) {
        this.iditem = iditem;
    }
    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
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
    public Date getFLimite() {
        return FLimite;
    }
    public void setFLimite(Date fLimite) {
        FLimite = fLimite;
    }
    public TemporalType getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(TemporalType createdAt) {
        this.createdAt = createdAt;
    }
    public TemporalType getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(TemporalType updatedAt) {
        this.updatedAt = updatedAt;
    }
   
}
