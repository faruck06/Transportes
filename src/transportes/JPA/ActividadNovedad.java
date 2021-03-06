/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportes.JPA;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Developer
 */
@Entity
@Table(name = "actividad_novedad", catalog = "transportes", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ActividadNovedad.findAll", query = "SELECT a FROM ActividadNovedad a"),
    @NamedQuery(name = "ActividadNovedad.findByIdActividadNovedad", query = "SELECT a FROM ActividadNovedad a WHERE a.idActividadNovedad = :idActividadNovedad"),
    @NamedQuery(name = "ActividadNovedad.findByNombre", query = "SELECT a FROM ActividadNovedad a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "ActividadNovedad.findByTipo", query = "SELECT a FROM ActividadNovedad a WHERE a.tipo = :tipo")})
public class ActividadNovedad implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_actividad_novedad")
    private Long idActividadNovedad;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "tipo")
    private String tipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNovedadActividad", fetch = FetchType.LAZY)
    private Collection<Novedad> novedadCollection;

    public ActividadNovedad() {
    }

    public ActividadNovedad(Long idActividadNovedad) {
        this.idActividadNovedad = idActividadNovedad;
    }

    public ActividadNovedad(Long idActividadNovedad, String nombre) {
        this.idActividadNovedad = idActividadNovedad;
        this.nombre = nombre;
    }

    public Long getIdActividadNovedad() {
        return idActividadNovedad;
    }

    public void setIdActividadNovedad(Long idActividadNovedad) {
        Long oldIdActividadNovedad = this.idActividadNovedad;
        this.idActividadNovedad = idActividadNovedad;
        changeSupport.firePropertyChange("idActividadNovedad", oldIdActividadNovedad, idActividadNovedad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        String oldTipo = this.tipo;
        this.tipo = tipo;
        changeSupport.firePropertyChange("tipo", oldTipo, tipo);
    }

    @XmlTransient
    public Collection<Novedad> getNovedadCollection() {
        return novedadCollection;
    }

    public void setNovedadCollection(Collection<Novedad> novedadCollection) {
        this.novedadCollection = novedadCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idActividadNovedad != null ? idActividadNovedad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActividadNovedad)) {
            return false;
        }
        ActividadNovedad other = (ActividadNovedad) object;
        if ((this.idActividadNovedad == null && other.idActividadNovedad != null) || (this.idActividadNovedad != null && !this.idActividadNovedad.equals(other.idActividadNovedad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "transportes.JPA.ActividadNovedad[ idActividadNovedad=" + idActividadNovedad + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
