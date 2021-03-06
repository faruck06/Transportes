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
@Table(name = "tipo_vehiculo", catalog = "transportes", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoVehiculo.findAll", query = "SELECT t FROM TipoVehiculo t"),
    @NamedQuery(name = "TipoVehiculo.findByIdTipoVehiculo", query = "SELECT t FROM TipoVehiculo t WHERE t.idTipoVehiculo = :idTipoVehiculo"),
    @NamedQuery(name = "TipoVehiculo.findByNombreAll", query = "SELECT t.nombre FROM TipoVehiculo t WHERE upper(t.nombre) LIKE (:nombre)"),
    @NamedQuery(name = "TipoVehiculo.findByNombre", query = "SELECT t FROM TipoVehiculo t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "TipoVehiculo.findByTipo", query = "SELECT t FROM TipoVehiculo t WHERE t.tipo = :tipo")})
public class TipoVehiculo implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_vehiculo")
    private Long idTipoVehiculo;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "tipo")
    private String tipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoVehiculo", fetch = FetchType.LAZY)
    private Collection<Vehiculo> vehiculoCollection;

    public TipoVehiculo() {
    }

    public TipoVehiculo(Long idTipoVehiculo) {
        this.idTipoVehiculo = idTipoVehiculo;
    }

    public TipoVehiculo(Long idTipoVehiculo, String nombre) {
        this.idTipoVehiculo = idTipoVehiculo;
        this.nombre = nombre;
    }

    public Long getIdTipoVehiculo() {
        return idTipoVehiculo;
    }

    public void setIdTipoVehiculo(Long idTipoVehiculo) {
        Long oldIdTipoVehiculo = this.idTipoVehiculo;
        this.idTipoVehiculo = idTipoVehiculo;
        changeSupport.firePropertyChange("idTipoVehiculo", oldIdTipoVehiculo, idTipoVehiculo);
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
    public Collection<Vehiculo> getVehiculoCollection() {
        return vehiculoCollection;
    }

    public void setVehiculoCollection(Collection<Vehiculo> vehiculoCollection) {
        this.vehiculoCollection = vehiculoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoVehiculo != null ? idTipoVehiculo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoVehiculo)) {
            return false;
        }
        TipoVehiculo other = (TipoVehiculo) object;
        if ((this.idTipoVehiculo == null && other.idTipoVehiculo != null) || (this.idTipoVehiculo != null && !this.idTipoVehiculo.equals(other.idTipoVehiculo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "transportes.JPA.TipoVehiculo[ idTipoVehiculo=" + idTipoVehiculo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
