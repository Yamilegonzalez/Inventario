package com.UPT.inventario.Model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "sanciones_usuario")
public class Sanciones_usuario{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sancion_usuario")
    private Long idSancionUsu;
    
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    private Long idUsuario;
    
    @JoinColumn(name = "id_item", referencedColumnName = "id_item")
    private Long idItem;
    
    @Column(name = "motivo_sistema")
    private String motivoSistema;
    
    @Column(name = "fecha_ingresada")
    private Date Finicial;
    
    @Column(name = "fecha_registro")
    private Date Fretiro;
    
    @Column(name = "fecha_limite")
    private Date FLimite;

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

    // public Usuario getIdUsuario() {
    //     return this.idUsuario;
    // }

    // public void setIdUsuario(Usuario idUsuario) {
    //     this.idUsuario = idUsuario;
    // }

    // public Item getIdItem() {
    //     return this.idItem;
    // }

    // public void setIdItem(Item idItem) {
    //     this.idItem = idItem;
    // }

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
