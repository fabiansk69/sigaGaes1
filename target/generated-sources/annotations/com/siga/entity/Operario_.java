package com.siga.entity;

import com.siga.entity.Pedido;
import com.siga.entity.Persona;
import com.siga.entity.TicketVenta;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-09-22T03:50:23")
@StaticMetamodel(Operario.class)
public class Operario_ { 

    public static volatile SingularAttribute<Operario, Date> fechaVinculacion;
    public static volatile SingularAttribute<Operario, Integer> idoperario;
    public static volatile CollectionAttribute<Operario, TicketVenta> ticketVentaCollection;
    public static volatile SingularAttribute<Operario, Date> fechaHoraSalida;
    public static volatile SingularAttribute<Operario, Double> salario;
    public static volatile CollectionAttribute<Operario, Pedido> pedidoCollection;
    public static volatile SingularAttribute<Operario, Persona> idPersona;
    public static volatile SingularAttribute<Operario, Date> fechaHoraIngreso;

}