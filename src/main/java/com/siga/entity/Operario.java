/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.siga.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "operario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Operario.findAll", query = "SELECT o FROM Operario o"),
    @NamedQuery(name = "Operario.findByIdoperario", query = "SELECT o FROM Operario o WHERE o.idoperario = :idoperario"),
    @NamedQuery(name = "Operario.findBySalario", query = "SELECT o FROM Operario o WHERE o.salario = :salario"),
    @NamedQuery(name = "Operario.findByFechaHoraIngreso", query = "SELECT o FROM Operario o WHERE o.fechaHoraIngreso = :fechaHoraIngreso"),
    @NamedQuery(name = "Operario.findByFechaHoraSalida", query = "SELECT o FROM Operario o WHERE o.fechaHoraSalida = :fechaHoraSalida"),
    @NamedQuery(name = "Operario.findByFechaVinculacion", query = "SELECT o FROM Operario o WHERE o.fechaVinculacion = :fechaVinculacion")})
public class Operario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idoperario")
    private Integer idoperario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "salario")
    private double salario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_hora_ingreso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraIngreso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_hora_salida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraSalida;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_vinculacion")
    @Temporal(TemporalType.DATE)
    private Date fechaVinculacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idOperario")
    private Collection<Pedido> pedidoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idOperarioId")
    private Collection<TicketVenta> ticketVentaCollection;
    @JoinColumn(name = "id_persona", referencedColumnName = "idpersona")
    @ManyToOne(optional = false)
    private Persona idPersona;

    public Operario() {
    }

    public Operario(Integer idoperario) {
        this.idoperario = idoperario;
    }

    public Operario(Integer idoperario, double salario, Date fechaHoraIngreso, Date fechaHoraSalida, Date fechaVinculacion) {
        this.idoperario = idoperario;
        this.salario = salario;
        this.fechaHoraIngreso = fechaHoraIngreso;
        this.fechaHoraSalida = fechaHoraSalida;
        this.fechaVinculacion = fechaVinculacion;
    }

    public Integer getIdoperario() {
        return idoperario;
    }

    public void setIdoperario(Integer idoperario) {
        this.idoperario = idoperario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getFechaHoraIngreso() {
        return fechaHoraIngreso;
    }

    public void setFechaHoraIngreso(Date fechaHoraIngreso) {
        this.fechaHoraIngreso = fechaHoraIngreso;
    }

    public Date getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public void setFechaHoraSalida(Date fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }

    public Date getFechaVinculacion() {
        return fechaVinculacion;
    }

    public void setFechaVinculacion(Date fechaVinculacion) {
        this.fechaVinculacion = fechaVinculacion;
    }

    @XmlTransient
    public Collection<Pedido> getPedidoCollection() {
        return pedidoCollection;
    }

    public void setPedidoCollection(Collection<Pedido> pedidoCollection) {
        this.pedidoCollection = pedidoCollection;
    }

    @XmlTransient
    public Collection<TicketVenta> getTicketVentaCollection() {
        return ticketVentaCollection;
    }

    public void setTicketVentaCollection(Collection<TicketVenta> ticketVentaCollection) {
        this.ticketVentaCollection = ticketVentaCollection;
    }

    public Persona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idoperario != null ? idoperario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Operario)) {
            return false;
        }
        Operario other = (Operario) object;
        if ((this.idoperario == null && other.idoperario != null) || (this.idoperario != null && !this.idoperario.equals(other.idoperario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.siga.Operario[ idoperario=" + idoperario + " ]";
    }
    
}
