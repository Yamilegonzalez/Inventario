package com.UPT.inventario.Model;
<<<<<<< HEAD

=======
>>>>>>> b5985feb11043d6e432c9f75ae359c8c98c4f4b0
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
<<<<<<< HEAD
=======
import javax.persistence.JoinColumn;
>>>>>>> b5985feb11043d6e432c9f75ae359c8c98c4f4b0

@Entity
@Table(name = "sancion_aplicada")
public class Sancion_aplicada {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_sancion_usuario_apli")
    private Long idSanUsuApli;

    @Column(name = "id_sancion_usuario", nullable = false)
    private long idSanUsua;

    @Column(name = "id_usuario", nullable = false)
    private long idUsuario;
    
    @Column(name = "id_item", nullable = false)
    private long idItem;

    @Column(name = "motivo_operador", nullable = false)
    private String motivoOperador;

    @Column(name = "fecha_ingresada", nullable = false)
    private String fechaIngresada;

    @Column(name = "fecha_limite", nullable = false)
    private String fechaLimite;

    @Column(name="created_at", nullable = false)
    private String created_at;

    @Column(name="updated_at", nullable = false)
    private String updated_at;

    public long getIdSanUsuApli() {
        return this.idSanUsuApli;
    }

    public void setIdSanUsuApli(long idSanUsuApli) {
        this.idSanUsuApli = idSanUsuApli;
    }

    public long getIdSanUsua() {
        return this.idSanUsua;
    }

    public void setIdSanUsua(long idSanUsua) {
        this.idSanUsua = idSanUsua;
    }

    public long getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public long getIdItem() {
        return this.idItem;
    }

    public void setIdItem(long idItem) {
        this.idItem = idItem;
    }

    public String getMotivoOperador() {
        return this.motivoOperador;
    }

    public void setMotivoOperador(String motivoOperador) {
        this.motivoOperador = motivoOperador;
    }

    public String getFechaIngresada() {
        return this.fechaIngresada;
    }

    public void setFechaIngresada(String fechaIngresada) {
        this.fechaIngresada = fechaIngresada;
    }

    public String getFechaLimite() {
        return this.fechaLimite;
    }

    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite;
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
