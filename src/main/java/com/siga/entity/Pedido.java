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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "pedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p"),
    @NamedQuery(name = "Pedido.findByNoPedido", query = "SELECT p FROM Pedido p WHERE p.noPedido = :noPedido"),
    @NamedQuery(name = "Pedido.findByCodproducto", query = "SELECT p FROM Pedido p WHERE p.codproducto = :codproducto"),
    @NamedQuery(name = "Pedido.findByFechaHora", query = "SELECT p FROM Pedido p WHERE p.fechaHora = :fechaHora"),
    @NamedQuery(name = "Pedido.findByEstadoPedido", query = "SELECT p FROM Pedido p WHERE p.estadoPedido = :estadoPedido"),
    @NamedQuery(name = "Pedido.findByCantidad", query = "SELECT p FROM Pedido p WHERE p.cantidad = :cantidad")})
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "no_pedido")
    private Integer noPedido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codproducto")
    private int codproducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_hora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHora;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "estado_pedido")
    private String estadoPedido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @JoinColumn(name = "id_cliente", referencedColumnName = "idcliente")
    @ManyToOne(optional = false)
    private Cliente idCliente;
    @JoinColumn(name = "id_operario", referencedColumnName = "idoperario")
    @ManyToOne(optional = false)
    private Operario idOperario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numPedido")
    private Collection<TicketVenta> ticketVentaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "noPedidos")
    private Collection<Producto> productoCollection;

    public Pedido() {
    }

    public Pedido(Integer noPedido) {
        this.noPedido = noPedido;
    }

    public Pedido(Integer noPedido, int codproducto, Date fechaHora, String estadoPedido, int cantidad) {
        this.noPedido = noPedido;
        this.codproducto = codproducto;
        this.fechaHora = fechaHora;
        this.estadoPedido = estadoPedido;
        this.cantidad = cantidad;
    }

    public Integer getNoPedido() {
        return noPedido;
    }

    public void setNoPedido(Integer noPedido) {
        this.noPedido = noPedido;
    }

    public int getCodproducto() {
        return codproducto;
    }

    public void setCodproducto(int codproducto) {
        this.codproducto = codproducto;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Operario getIdOperario() {
        return idOperario;
    }

    public void setIdOperario(Operario idOperario) {
        this.idOperario = idOperario;
    }

    @XmlTransient
    public Collection<TicketVenta> getTicketVentaCollection() {
        return ticketVentaCollection;
    }

    public void setTicketVentaCollection(Collection<TicketVenta> ticketVentaCollection) {
        this.ticketVentaCollection = ticketVentaCollection;
    }

    @XmlTransient
    public Collection<Producto> getProductoCollection() {
        return productoCollection;
    }

    public void setProductoCollection(Collection<Producto> productoCollection) {
        this.productoCollection = productoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noPedido != null ? noPedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.noPedido == null && other.noPedido != null) || (this.noPedido != null && !this.noPedido.equals(other.noPedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.siga.Pedido[ noPedido=" + noPedido + " ]";
    }
    
}
