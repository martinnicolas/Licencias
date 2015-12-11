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
@Table(name = "agente_licencia", catalog = "licencias", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AgenteLicencia.findAll", query = "SELECT a FROM AgenteLicencia a"),
    @NamedQuery(name = "AgenteLicencia.findByIdAgenteLicencia", query = "SELECT a FROM AgenteLicencia a WHERE a.idAgenteLicencia = :idAgenteLicencia"),
    @NamedQuery(name = "AgenteLicencia.findByIdAgente", query = "SELECT a FROM AgenteLicencia a WHERE a.idAgente = :idAgente"),
    @NamedQuery(name = "AgenteLicencia.findByIdLicencia", query = "SELECT a FROM AgenteLicencia a WHERE a.idLicencia = :idLicencia"),
    @NamedQuery(name = "AgenteLicencia.findByFechaDesde", query = "SELECT a FROM AgenteLicencia a WHERE a.fechaDesde = :fechaDesde"),
    @NamedQuery(name = "AgenteLicencia.findByFechaHasta", query = "SELECT a FROM AgenteLicencia a WHERE a.fechaHasta = :fechaHasta")})
public class AgenteLicencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_agente_licencia", nullable = false)
    private Integer idAgenteLicencia;
    @Column(name = "id_agente")
    private Integer idAgente;
    @Column(name = "id_licencia")
    private Integer idLicencia;
    @Column(name = "fecha_desde")
    @Temporal(TemporalType.DATE)
    private Date fechaDesde;
    @Column(name = "fecha_hasta")
    @Temporal(TemporalType.DATE)
    private Date fechaHasta;

    public AgenteLicencia() {
    }

    public AgenteLicencia(Integer idAgenteLicencia) {
        this.idAgenteLicencia = idAgenteLicencia;
    }

    public Integer getIdAgenteLicencia() {
        return idAgenteLicencia;
    }

    public void setIdAgenteLicencia(Integer idAgenteLicencia) {
        this.idAgenteLicencia = idAgenteLicencia;
    }

    public Integer getIdAgente() {
        return idAgente;
    }

    public void setIdAgente(Integer idAgente) {
        this.idAgente = idAgente;
    }

    public Integer getIdLicencia() {
        return idLicencia;
    }

    public void setIdLicencia(Integer idLicencia) {
        this.idLicencia = idLicencia;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAgenteLicencia != null ? idAgenteLicencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgenteLicencia)) {
            return false;
        }
        AgenteLicencia other = (AgenteLicencia) object;
        if ((this.idAgenteLicencia == null && other.idAgenteLicencia != null) || (this.idAgenteLicencia != null && !this.idAgenteLicencia.equals(other.idAgenteLicencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "licencias.AgenteLicencia[ idAgenteLicencia=" + idAgenteLicencia + " ]";
    }
    
}
