/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportes.JPA;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Developer
 */
@Entity
@Table(name = "novedad", catalog = "transportes", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Novedad.findAll", query = "SELECT n FROM Novedad n"),
    @NamedQuery(name = "Novedad.findByIdNovedad", query = "SELECT n FROM Novedad n WHERE n.idNovedad = :idNovedad"),
    @NamedQuery(name = "Novedad.findByHoraSalida", query = "SELECT n FROM Novedad n WHERE n.horaSalida = :horaSalida"),
    @NamedQuery(name = "Novedad.findByHoraLlegada", query = "SELECT n FROM Novedad n WHERE n.horaLlegada = :horaLlegada"),
    @NamedQuery(name = "Novedad.findByKmInicial", query = "SELECT n FROM Novedad n WHERE n.kmInicial = :kmInicial"),
    @NamedQuery(name = "Novedad.findByKmFinal", query = "SELECT n FROM Novedad n WHERE n.kmFinal = :kmFinal"),
    @NamedQuery(name = "Novedad.findByDiferencia", query = "SELECT n FROM Novedad n WHERE n.diferencia = :diferencia")})
public class Novedad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_novedad")
    private Long idNovedad;
    @Basic(optional = false)
    @Column(name = "hora_salida")
    private int horaSalida;
    @Basic(optional = false)
    @Column(name = "hora_llegada")
    private int horaLlegada;
    @Basic(optional = false)
    @Column(name = "km_inicial")
    private int kmInicial;
    @Basic(optional = false)
    @Column(name = "km_final")
    private int kmFinal;
    @Basic(optional = false)
    @Column(name = "diferencia")
    private int diferencia;
    @JoinColumn(name = "id_novedad_actividad", referencedColumnName = "id_actividad_novedad")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ActividadNovedad idNovedadActividad;

    public Novedad() {
    }

    public Novedad(Long idNovedad) {
        this.idNovedad = idNovedad;
    }

    public Novedad(Long idNovedad, int horaSalida, int horaLlegada, int kmInicial, int kmFinal, int diferencia) {
        this.idNovedad = idNovedad;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.kmInicial = kmInicial;
        this.kmFinal = kmFinal;
        this.diferencia = diferencia;
    }

    public Long getIdNovedad() {
        return idNovedad;
    }

    public void setIdNovedad(Long idNovedad) {
        this.idNovedad = idNovedad;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(int horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public int getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(int kmInicial) {
        this.kmInicial = kmInicial;
    }

    public int getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(int kmFinal) {
        this.kmFinal = kmFinal;
    }

    public int getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(int diferencia) {
        this.diferencia = diferencia;
    }

    public ActividadNovedad getIdNovedadActividad() {
        return idNovedadActividad;
    }

    public void setIdNovedadActividad(ActividadNovedad idNovedadActividad) {
        this.idNovedadActividad = idNovedadActividad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNovedad != null ? idNovedad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Novedad)) {
            return false;
        }
        Novedad other = (Novedad) object;
        if ((this.idNovedad == null && other.idNovedad != null) || (this.idNovedad != null && !this.idNovedad.equals(other.idNovedad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "transportes.JPA.Novedad[ idNovedad=" + idNovedad + " ]";
    }
    
}
