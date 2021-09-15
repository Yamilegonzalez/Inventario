package com.UPT.inventario.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="rol")
public class Rol{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_rol")
    private long idRol;

    @Column(name="nombre_rol", nullable = false)
    private String nombreRol;

    @Column(name="created_at", nullable = false)
    private String created_at;

    @Column(name="updated_at", nullable = false)
    private String updated_at;

    public void setIdRol(long idRol){
        this.idRol = idRol;
    }
    public long getIdRol(){
        return this.idRol;
    }
    public void setNombreRol(String nombreRol){
        this.nombreRol = nombreRol;
    }
    public String getNombreRol(){
        return this.nombreRol;
    }
    public void getCreated_at(String created_at){
        this.created_at = created_at;
    }
    public String getUpdated_at(String updated_at){
        return this.updated_at;
    }

}
