package com.UPT.inventario.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_sancion_usuario_apli")
    private Long idUsuario;

    @Column(name = "id_area", nullable = false)
    private long idArea;

    @Column(name = "id_rol", nullable = false)
    private long idRol;

    @Column(name = "primer_nombre", nullable = false)
    private String primerNombre;

    @Column(name = "segundo_nombre", nullable = false)
    private String segundoNombre;

    @Column(name = "apellido_p", nullable = false)
    private String apellidoP;

    @Column(name = "apellido_m", nullable = false)
    private String apellidoM;

    @Column(name = "matricula", nullable = false)
    private String matricula;

    @Column(name = "numero_telefono", nullable = false)
    private String numTelefono;

    @Column(name = "correo", nullable = false)
    private String correo;

    @Column(name = "contrasenia", nullable = false)
    private String contrasenia;

    @Column(name="created_at", nullable = false)
    private String created_at;

    @Column(name="updated_at", nullable = false)
    private String updated_at;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_rol", referencedColumnName = "id_rol")
    private Rol rol;

    @OneToMany(mappedBy = "id_usuario")
    private Sancion_aplicada sancionAplecada;

    @OneToOne(mappedBy = "id_usuario")
    private Reporte_usuario reporteUsuario;

    @OneToMany(mappedBy="id_usuario")
    private Solicitud_usuario solicitudUsuario;

    public long getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public long getIdArea() {
        return this.idArea;
    }

    public void setIdArea(long idArea) {
        this.idArea = idArea;
    }

    public long getIdRol() {
        return this.idRol;
    }

    public void setIdRol(long idRol) {
        this.idRol = idRol;
    }

    public String getPrimerNombre() {
        return this.primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return this.segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getApellidoP() {
        return this.apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return this.apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNumTelefono() {
        return this.numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return this.contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
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
