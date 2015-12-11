/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package licencias;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author martin
 */
@Entity
@Table(name = "agente", catalog = "licencias", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Agente.findAll", query = "SELECT a FROM Agente a"),
    @NamedQuery(name = "Agente.findByIdAgente", query = "SELECT a FROM Agente a WHERE a.idAgente = :idAgente"),
    @NamedQuery(name = "Agente.findByDni", query = "SELECT a FROM Agente a WHERE a.dni = :dni"),
    @NamedQuery(name = "Agente.findByApellido", query = "SELECT a FROM Agente a WHERE a.apellido = :apellido"),
    @NamedQuery(name = "Agente.findByNombre", query = "SELECT a FROM Agente a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Agente.findByFechaIngreso", query = "SELECT a FROM Agente a WHERE a.fechaIngreso = :fechaIngreso")})
public class Agente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_agente", nullable = false)
    private Integer idAgente;
    @Column(name = "dni")
    private Integer dni;
    @Column(name = "apellido", length = 45)
    private String apellido;
    @Column(name = "nombre", length = 45)
    private String nombre;
    @Column(name = "fecha_ingreso")
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;

    public Agente() {
    }

    public Agente(Integer idAgente) {
        this.idAgente = idAgente;
    }

    public Integer getIdAgente() {
        return idAgente;
    }

    public void setIdAgente(Integer idAgente) {
        this.idAgente = idAgente;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAgente != null ? idAgente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agente)) {
            return false;
        }
        Agente other = (Agente) object;
        if ((this.idAgente == null && other.idAgente != null) || (this.idAgente != null && !this.idAgente.equals(other.idAgente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "licencias.Agente[ idAgente=" + idAgente + " ]";
    }
    
}
