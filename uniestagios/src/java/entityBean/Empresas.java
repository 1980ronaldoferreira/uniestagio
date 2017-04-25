/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityBean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author alefsilva
 */
@Entity
@Table(name = "empresas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empresas.findAll", query = "SELECT e FROM Empresas e")
    , @NamedQuery(name = "Empresas.findById", query = "SELECT e FROM Empresas e WHERE e.id = :id")
    , @NamedQuery(name = "Empresas.findByCnpj", query = "SELECT e FROM Empresas e WHERE e.cnpj = :cnpj")
    , @NamedQuery(name = "Empresas.findByRazaoSocial", query = "SELECT e FROM Empresas e WHERE e.razaoSocial = :razaoSocial")
    , @NamedQuery(name = "Empresas.findByNomeFantasia", query = "SELECT e FROM Empresas e WHERE e.nomeFantasia = :nomeFantasia")
    , @NamedQuery(name = "Empresas.findByTelefone", query = "SELECT e FROM Empresas e WHERE e.telefone = :telefone")
    , @NamedQuery(name = "Empresas.findByEmail", query = "SELECT e FROM Empresas e WHERE e.email = :email")
    , @NamedQuery(name = "Empresas.findByRamoAtividades", query = "SELECT e FROM Empresas e WHERE e.ramoAtividades = :ramoAtividades")})
public class Empresas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "cnpj")
    private String cnpj;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "razao_social")
    private String razaoSocial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "nome_fantasia")
    private String nomeFantasia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "telefone")
    private String telefone;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="E-mail inválido")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "ramo_atividades")
    private String ramoAtividades;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresaId")
    private List<Vagas> vagasList;
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Users userId;

    public Empresas() {
    }

    public Empresas(Integer id) {
        this.id = id;
    }

    public Empresas(Integer id, String cnpj, String razaoSocial, String nomeFantasia, String telefone, String email, String ramoAtividades) {
        this.id = id;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.telefone = telefone;
        this.email = email;
        this.ramoAtividades = ramoAtividades;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRamoAtividades() {
        return ramoAtividades;
    }

    public void setRamoAtividades(String ramoAtividades) {
        this.ramoAtividades = ramoAtividades;
    }

    @XmlTransient
    public List<Vagas> getVagasList() {
        return vagasList;
    }

    public void setVagasList(List<Vagas> vagasList) {
        this.vagasList = vagasList;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
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
        if (!(object instanceof Empresas)) {
            return false;
        }
        Empresas other = (Empresas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityBean.Empresas[ id=" + id + " ]";
    }
    
}
