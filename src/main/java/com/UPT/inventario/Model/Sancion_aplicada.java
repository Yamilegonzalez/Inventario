package com.UPT.inventario.Model;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "sancion_aplicada")
public class Sancion_aplicada {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_sancion_usuario_apli")
    private Long idSanUsuApli;

    @JoinColumn(name = "id_sancion_usuario", referencedColumnName = "id_sancion_usuario")
    private Sancion_aplicada idSanUsua;

    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    private Usuario idUsuario;
    
    @JoinColumn(name = "id_item", referencedColumnName = "id_item")
    private Item idItem;

    @Column(name = "motivo_operador", nullable = false)
    private String motivoOperador;

    @Column(name = "fecha_ingresada", nullable = false)
    private Date fechaIngresada;

    @Column(name = "fecha_limite", nullable = false)
    private Date fechaLimite;

    @Column(name="created_at", nullable = false)
    private Date created_at;

    @Column(name="updated_at", nullable = false)
    private Date updated_at;



    public Long getIdSanUsuApli() {
        return this.idSanUsuApli;
    }

    public void setIdSanUsuApli(Long idSanUsuApli) {
        this.idSanUsuApli = idSanUsuApli;
    }

    public Sancion_aplicada getIdSanUsua() {
        return this.idSanUsua;
    }

    public void setIdSanUsua(Sancion_aplicada idSanUsua) {
        this.idSanUsua = idSanUsua;
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

    public String getMotivoOperador() {
        return this.motivoOperador;
    }

    public void setMotivoOperador(String motivoOperador) {
        this.motivoOperador = motivoOperador;
    }

    public Date getFechaIngresada() {
        return this.fechaIngresada;
    }

    public void setFechaIngresada(Date fechaIngresada) {
        this.fechaIngresada = fechaIngresada;
    }

    public Date getFechaLimite() {
        return this.fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
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
