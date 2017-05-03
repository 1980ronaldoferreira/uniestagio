/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityBean;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alefsilva
 */
@Entity
@Table(name = "vagas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vagas.findAll", query = "SELECT v FROM Vagas v")
    , @NamedQuery(name = "Vagas.findById", query = "SELECT v FROM Vagas v WHERE v.id = :id")
    , @NamedQuery(name = "Vagas.findByArea", query = "SELECT v FROM Vagas v WHERE v.area = :area")
    , @NamedQuery(name = "Vagas.findByTitulo", query = "SELECT v FROM Vagas v WHERE v.titulo = :titulo")
    , @NamedQuery(name = "Vagas.findByJornada", query = "SELECT v FROM Vagas v WHERE v.jornada = :jornada")
    , @NamedQuery(name = "Vagas.findByContrato", query = "SELECT v FROM Vagas v WHERE v.contrato = :contrato")
    , @NamedQuery(name = "Vagas.findBySalario", query = "SELECT v FROM Vagas v WHERE v.salario = :salario")
    , @NamedQuery(name = "Vagas.findByEstado", query = "SELECT v FROM Vagas v WHERE v.estado = :estado")
    , @NamedQuery(name = "Vagas.findByCidade", query = "SELECT v FROM Vagas v WHERE v.cidade = :cidade")
    , @NamedQuery(name = "Vagas.findByObs", query = "SELECT v FROM Vagas v WHERE v.obs = :obs")
    , @NamedQuery(name = "Vagas.findByActivities", query = "SELECT v FROM Vagas v WHERE v.activities = :activities")})
public class Vagas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "area")
    private String area;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "titulo")
    private String titulo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "jornada")
    private String jornada;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "contrato")
    private String contrato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "salario")
    private String salario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "cidade")
    private String cidade;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "obs")
    private String obs;
    @Size(max = 255)
    @Column(name = "activities")
    private String activities;
    @JoinColumn(name = "empresa_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Empresas empresaId;

    public Vagas() {
    }

    public Vagas(Integer id) {
        this.id = id;
    }

    public Vagas(Integer id, String area, String titulo, String jornada, String contrato, String salario, String estado, String cidade, String obs) {
        this.id = id;
        this.area = area;
        this.titulo = titulo;
        this.jornada = jornada;
        this.contrato = contrato;
        this.salario = salario;
        this.estado = estado;
        this.cidade = cidade;
        this.obs = obs;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getActivities() {
        return activities;
    }

    public void setActivities(String activities) {
        this.activities = activities;
    }

    public Empresas getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(Empresas empresaId) {
        this.empresaId = empresaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vagas)) {
            return false;
        }
        Vagas other = (Vagas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityBean.Vagas[ id=" + id + " ]";
    }
    
}
