package com.UPT.inventario.Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "solicitud_aceptadas")
public class SolicitudModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ida;
    @Column(name = "id_solicitud_aceptada")
    private Long ids;
    @Column(name = "id_solicitud")
    private Long iditem;
    @Column(name = "id_item")
    private Long idu;
    @Column(name = "id_usuario")
    private String descrip;
    @Column(name = "descripcion")
    private Date Finicial;
    @Column(name = "fecha_ingresada")
    private Date Fretiro;
    @Column(name = "fecha_retiro")
    @Temporal(TemporalType.TIMESTAMP)
    private TemporalType createdAt;
    @Column(name = "created_at")
    private TemporalType updatedAt;
    @Column(name = "updated_at")

    private static final long serialVersionUID = 1L;

    public Long getIda() {
        return ida;
    }

    public void setIda(Long ida) {
        this.ida = ida;
    }

    public Long getIds() {
        return ids;
    }

    public void setIds(Long ids) {
        this.ids = ids;
    }

    public Long getIditem() {
        return iditem;
    }

    public void setIditem(Long iditem) {
        this.iditem = iditem;
    }

    public Long getIdu() {
        return idu;
    }

    public void setIdu(Long idu) {
        this.idu = idu;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
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

    public TemporalType getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(TemporalType createAt) {
        this.createdAt = createAt;
    }

    public TemporalType getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(TemporalType updateAt) {
        this.updatedAt = updateAt;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }
}
