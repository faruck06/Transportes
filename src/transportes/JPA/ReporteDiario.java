/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportes.JPA;

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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Developer
 */
@Entity
@Table(name = "reporte_diario", catalog = "transportes", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReporteDiario.findAll", query = "SELECT r FROM ReporteDiario r"),
    @NamedQuery(name = "ReporteDiario.findByIdReporteDiario", query = "SELECT r FROM ReporteDiario r WHERE r.idReporteDiario = :idReporteDiario")})
public class ReporteDiario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_reporte_diario")
    private Long idReporteDiario;
    @JoinColumn(name = "placa", referencedColumnName = "placa")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Vehiculo placa;
    @JoinColumn(name = "id_actividad_principal", referencedColumnName = "id_actividad_principal")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ActividadPrincipal idActividadPrincipal;
    @JoinColumn(name = "id_proyecto", referencedColumnName = "id_proyecto")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Proyecto idProyecto;
    @JoinColumn(name = "id_usuario_proyecto", referencedColumnName = "id_usuario_proyecto")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private UsuarioProyecto idUsuarioProyecto;
    @JoinColumn(name = "id_empleado", referencedColumnName = "cedula")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Empleado idEmpleado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idReporteDiario", fetch = FetchType.LAZY)
    private Collection<RutaHorario> rutaHorarioCollection;

    public ReporteDiario() {
    }

    public ReporteDiario(Long idReporteDiario) {
        this.idReporteDiario = idReporteDiario;
    }

    public Long getIdReporteDiario() {
        return idReporteDiario;
    }

    public void setIdReporteDiario(Long idReporteDiario) {
        this.idReporteDiario = idReporteDiario;
    }

    public Vehiculo getPlaca() {
        return placa;
    }

    public void setPlaca(Vehiculo placa) {
        this.placa = placa;
    }

    public ActividadPrincipal getIdActividadPrincipal() {
        return idActividadPrincipal;
    }

    public void setIdActividadPrincipal(ActividadPrincipal idActividadPrincipal) {
        this.idActividadPrincipal = idActividadPrincipal;
    }

    public Proyecto getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Proyecto idProyecto) {
        this.idProyecto = idProyecto;
    }

    public UsuarioProyecto getIdUsuarioProyecto() {
        return idUsuarioProyecto;
    }

    public void setIdUsuarioProyecto(UsuarioProyecto idUsuarioProyecto) {
        this.idUsuarioProyecto = idUsuarioProyecto;
    }

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @XmlTransient
    public Collection<RutaHorario> getRutaHorarioCollection() {
        return rutaHorarioCollection;
    }

    public void setRutaHorarioCollection(Collection<RutaHorario> rutaHorarioCollection) {
        this.rutaHorarioCollection = rutaHorarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReporteDiario != null ? idReporteDiario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReporteDiario)) {
            return false;
        }
        ReporteDiario other = (ReporteDiario) object;
        if ((this.idReporteDiario == null && other.idReporteDiario != null) || (this.idReporteDiario != null && !this.idReporteDiario.equals(other.idReporteDiario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "transportes.JPA.ReporteDiario[ idReporteDiario=" + idReporteDiario + " ]";
    }
    
}
