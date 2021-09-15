package com.UPT.inventario.Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "sanciones_usuario")
public class Sanciones_usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSancion;
    @Column(name = "id_sancion_usuario")
    private Long idu;
    @Column(name = "id_usuario")
    private Long iditem;
    @Column(name = "id_item")
    private String motivo;
    @Column(name = "motivo_sistema")
    private Date Finicial;
    @Column(name = "fecha_ingresada")
    private Date Fretiro;
    @Column(name = "fecha_registro")
    private Date FLimite;
    @Column(name = "fecha_limite")
    @Temporal(TemporalType.TIMESTAMP)
    private TemporalType createdAt;
    @Column(name = "created_at")
    private TemporalType updatedAt;
    @Column(name = "updated_at")

    @OneToMany(mappedBy = "id_sancion_usuario")
    private Sancion_aplicada sancionAplicada;

    private static final long serialVersionUID = 1L;

    public Long getIdSancion() {
        return idSancion;
    }

    public void setIdSancion(Long idSancion) {
        this.idSancion = idSancion;
    }

    public Long getIdu() {
        return idu;
    }

    public void setIdu(Long idu) {
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

    public void setCreateAt(TemporalType createdAt) {
        this.createdAt = createdAt;
    }

    public TemporalType getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdateAt(TemporalType updatedAt) {
        this.updatedAt = updatedAt;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
