package com.siga.entity;

import com.siga.entity.Persona;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-09-22T03:50:23")
@StaticMetamodel(Direccion.class)
public class Direccion_ { 

    public static volatile SingularAttribute<Direccion, Integer> iddireccion;
    public static volatile SingularAttribute<Direccion, String> barrio;
    public static volatile CollectionAttribute<Direccion, Persona> personaCollection;
    public static volatile SingularAttribute<Direccion, String> complemento;
    public static volatile SingularAttribute<Direccion, String> numero;
    public static volatile SingularAttribute<Direccion, String> ciudad;
    public static volatile SingularAttribute<Direccion, String> calle;

}