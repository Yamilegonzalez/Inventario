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
    @Column(name = "id_sancion_usuario_apli")
    private Long idSancionUsuApli;

    @JoinColumn(name = "id_sancion_usuario", referencedColumnName = "id_sancion_usuario")
    private Sanciones_usuario idSancionUsuario;
    
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    private Usuario idUsuario;
    
    @JoinColumn(name = "id_item", referencedColumnName = "id_item")
    private Item idItem;
    
    @Column(name = "motivo_sistema")
    private String motivoSistema;
    
    @Column(name = "fecha_ingresada")
    private Date Finicial;
    
    @Column(name = "fecha_registro")
    private Date Fretiro;
    
    @Column(name = "fecha_limite")
    private Date FLimite;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private TemporalType createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    private TemporalType updatedAt;


    public Long getIdSancionUsuApli() {
        return this.idSancionUsuApli;
    }

    public void setIdSancionUsuApli(Long idSancionUsuApli) {
        this.idSancionUsuApli = idSancionUsuApli;
    }

    public Sanciones_usuario getIdSancionUsuario() {
        return this.idSancionUsuario;
    }

    public void setIdSancionUsuario(Sanciones_usuario idSancionUsuario) {
        this.idSancionUsuario = idSancionUsuario;
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

    public Date getFLimite() {
        return this.FLimite;
    }

    public void setFLimite(Date FLimite) {
        this.FLimite = FLimite;
    }

    public TemporalType getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(TemporalType createdAt) {
        this.createdAt = createdAt;
    }

    public TemporalType getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(TemporalType updatedAt) {
        this.updatedAt = updatedAt;
    }

        
}
