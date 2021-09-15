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
@Table(name = "solicitud_aceptada")
public class Solicitud_aceptada implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_solicitud_aceptada")
    private Long ida;
    @JoinColumn(name = "id_solicitud", referencedColumnName = "id_solicitud")
    @Column(name = "id_solicitud")
    private Long ids;
    @JoinColumn(name = "id_item", referencedColumnName = "id_item")
    @Column(name = "id_item")
    private Long iditem;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_ususario")
    @Column(name = "id_usuario")
    private Long idu;
    @Column(name = "descripcion")
    private String descrip;
    
    @Column(name = "fecha_ingresada")
    private Date Finicial;
    @Column(name = "fecha_retiro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date Fretiro;
    @Column(name = "created_at")
    private TemporalType createdAt;
    @Column(name = "updated_at")
    private TemporalType updatedAt;
    


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
