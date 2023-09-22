package com.siga.entity;

import com.siga.entity.Cliente;
import com.siga.entity.Operario;
import com.siga.entity.Producto;
import com.siga.entity.TicketVenta;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-09-22T03:50:23")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, Integer> noPedido;
    public static volatile SingularAttribute<Pedido, Cliente> idCliente;
    public static volatile CollectionAttribute<Pedido, TicketVenta> ticketVentaCollection;
    public static volatile SingularAttribute<Pedido, Date> fechaHora;
    public static volatile SingularAttribute<Pedido, Integer> codproducto;
    public static volatile SingularAttribute<Pedido, String> estadoPedido;
    public static volatile SingularAttribute<Pedido, Integer> cantidad;
    public static volatile CollectionAttribute<Pedido, Producto> productoCollection;
    public static volatile SingularAttribute<Pedido, Operario> idOperario;

}