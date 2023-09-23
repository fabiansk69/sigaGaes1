package com.siga.entity;

import com.siga.entity.Pedido;
import com.siga.entity.Persona;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-09-23T04:05:41")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Persona> idpersona;
    public static volatile CollectionAttribute<Cliente, Pedido> pedidoCollection;
    public static volatile SingularAttribute<Cliente, Integer> idcliente;

}