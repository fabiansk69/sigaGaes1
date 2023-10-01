package com.siga.entity;

import com.siga.entity.Operario;
import com.siga.entity.Pedido;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-10-01T06:45:09")
@StaticMetamodel(TicketVenta.class)
public class TicketVenta_ { 

    public static volatile SingularAttribute<TicketVenta, String> promocion;
    public static volatile SingularAttribute<TicketVenta, Pedido> numPedido;
    public static volatile SingularAttribute<TicketVenta, Double> precio;
    public static volatile SingularAttribute<TicketVenta, Integer> codTicketVenta;
    public static volatile SingularAttribute<TicketVenta, Operario> idOperarioId;
    public static volatile SingularAttribute<TicketVenta, Date> fechaHora;

}