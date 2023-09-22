/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.siga.entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "ticket_venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TicketVenta.findAll", query = "SELECT t FROM TicketVenta t"),
    @NamedQuery(name = "TicketVenta.findByCodTicketVenta", query = "SELECT t FROM TicketVenta t WHERE t.codTicketVenta = :codTicketVenta"),
    @NamedQuery(name = "TicketVenta.findByPrecio", query = "SELECT t FROM TicketVenta t WHERE t.precio = :precio"),
    @NamedQuery(name = "TicketVenta.findByFechaHora", query = "SELECT t FROM TicketVenta t WHERE t.fechaHora = :fechaHora"),
    @NamedQuery(name = "TicketVenta.findByPromocion", query = "SELECT t FROM TicketVenta t WHERE t.promocion = :promocion")})
public class TicketVenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_ticket_venta")
    private Integer codTicketVenta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private double precio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_hora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHora;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "promocion")
    private String promocion;
    @JoinColumn(name = "id_operario_id", referencedColumnName = "idoperario")
    @ManyToOne(optional = false)
    private Operario idOperarioId;
    @JoinColumn(name = "num_pedido", referencedColumnName = "no_pedido")
    @ManyToOne(optional = false)
    private Pedido numPedido;

    public TicketVenta() {
    }

    public TicketVenta(Integer codTicketVenta) {
        this.codTicketVenta = codTicketVenta;
    }

    public TicketVenta(Integer codTicketVenta, double precio, Date fechaHora, String promocion) {
        this.codTicketVenta = codTicketVenta;
        this.precio = precio;
        this.fechaHora = fechaHora;
        this.promocion = promocion;
    }

    public Integer getCodTicketVenta() {
        return codTicketVenta;
    }

    public void setCodTicketVenta(Integer codTicketVenta) {
        this.codTicketVenta = codTicketVenta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getPromocion() {
        return promocion;
    }

    public void setPromocion(String promocion) {
        this.promocion = promocion;
    }

    public Operario getIdOperarioId() {
        return idOperarioId;
    }

    public void setIdOperarioId(Operario idOperarioId) {
        this.idOperarioId = idOperarioId;
    }

    public Pedido getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(Pedido numPedido) {
        this.numPedido = numPedido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codTicketVenta != null ? codTicketVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TicketVenta)) {
            return false;
        }
        TicketVenta other = (TicketVenta) object;
        if ((this.codTicketVenta == null && other.codTicketVenta != null) || (this.codTicketVenta != null && !this.codTicketVenta.equals(other.codTicketVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.siga.TicketVenta[ codTicketVenta=" + codTicketVenta + " ]";
    }
    
}
