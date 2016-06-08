/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportes.JPA;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Developer
 */
@Entity
@Table(name = "ruta_externa", catalog = "transportes", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RutaExterna.findAll", query = "SELECT r FROM RutaExterna r"),
    @NamedQuery(name = "RutaExterna.findByIdRutaExterna", query = "SELECT r FROM RutaExterna r WHERE r.idRutaExterna = :idRutaExterna"),
    @NamedQuery(name = "RutaExterna.findByIngreso", query = "SELECT r FROM RutaExterna r WHERE r.ingreso = :ingreso"),
    @NamedQuery(name = "RutaExterna.findBySalida", query = "SELECT r FROM RutaExterna r WHERE r.salida = :salida"),
    @NamedQuery(name = "RutaExterna.findByHoraLlegada", query = "SELECT r FROM RutaExterna r WHERE r.horaLlegada = :horaLlegada"),
    @NamedQuery(name = "RutaExterna.findByOcupacion", query = "SELECT r FROM RutaExterna r WHERE r.ocupacion = :ocupacion")})
public class RutaExterna implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ruta_externa")
    private Long idRutaExterna;
    @Basic(optional = false)
    @Column(name = "ingreso")
    private String ingreso;
    @Basic(optional = false)
    @Column(name = "salida")
    private String salida;
    @Basic(optional = false)
    @Column(name = "hora_llegada")
    @Temporal(TemporalType.TIME)
    private Date horaLlegada;
    @Basic(optional = false)
    @Column(name = "ocupacion")
    private short ocupacion;
    @JoinColumn(name = "id_ruta", referencedColumnName = "id_ruta")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Ruta idRuta;

    public RutaExterna() {
    }

    public RutaExterna(Long idRutaExterna) {
        this.idRutaExterna = idRutaExterna;
    }

    public RutaExterna(Long idRutaExterna, String ingreso, String salida, Date horaLlegada, short ocupacion) {
        this.idRutaExterna = idRutaExterna;
        this.ingreso = ingreso;
        this.salida = salida;
        this.horaLlegada = horaLlegada;
        this.ocupacion = ocupacion;
    }

    public Long getIdRutaExterna() {
        return idRutaExterna;
    }

    public void setIdRutaExterna(Long idRutaExterna) {
        this.idRutaExterna = idRutaExterna;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public Date getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Date horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public short getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(short ocupacion) {
        this.ocupacion = ocupacion;
    }

    public Ruta getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(Ruta idRuta) {
        this.idRuta = idRuta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRutaExterna != null ? idRutaExterna.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RutaExterna)) {
            return false;
        }
        RutaExterna other = (RutaExterna) object;
        if ((this.idRutaExterna == null && other.idRutaExterna != null) || (this.idRutaExterna != null && !this.idRutaExterna.equals(other.idRutaExterna))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "transportes.JPA.RutaExterna[ idRutaExterna=" + idRutaExterna + " ]";
    }
    
}
