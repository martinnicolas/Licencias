/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package licencias;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author martin
 */
@Entity
@Table(name = "licencia", catalog = "licencias", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Licencia.findAll", query = "SELECT l FROM Licencia l"),
    @NamedQuery(name = "Licencia.findByIdLicencia", query = "SELECT l FROM Licencia l WHERE l.idLicencia = :idLicencia"),
    @NamedQuery(name = "Licencia.findByNumero", query = "SELECT l FROM Licencia l WHERE l.numero = :numero"),
    @NamedQuery(name = "Licencia.findByLetra", query = "SELECT l FROM Licencia l WHERE l.letra = :letra"),
    @NamedQuery(name = "Licencia.findByDescripcion", query = "SELECT l FROM Licencia l WHERE l.descripcion = :descripcion")})
public class Licencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_licencia", nullable = false)
    private Integer idLicencia;
    @Column(name = "numero", length = 45)
    private String numero;
    @Column(name = "letra", length = 45)
    private String letra;
    @Column(name = "descripcion", length = 45)
    private String descripcion;

    public Licencia() {
    }

    public Licencia(Integer idLicencia) {
        this.idLicencia = idLicencia;
    }

    public Integer getIdLicencia() {
        return idLicencia;
    }

    public void setIdLicencia(Integer idLicencia) {
        this.idLicencia = idLicencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLicencia != null ? idLicencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Licencia)) {
            return false;
        }
        Licencia other = (Licencia) object;
        if ((this.idLicencia == null && other.idLicencia != null) || (this.idLicencia != null && !this.idLicencia.equals(other.idLicencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "licencias.Licencia[ idLicencia=" + idLicencia + " ]";
    }
    
}
