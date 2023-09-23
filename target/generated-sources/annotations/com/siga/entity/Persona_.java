package com.siga.entity;

import com.siga.entity.Cliente;
import com.siga.entity.Direccion;
import com.siga.entity.Operario;
import com.siga.entity.Rol;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-09-23T04:05:41")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile SingularAttribute<Persona, String> apellidos;
    public static volatile SingularAttribute<Persona, String> estado;
    public static volatile SingularAttribute<Persona, Direccion> idDireccion;
    public static volatile SingularAttribute<Persona, Integer> idpersona;
    public static volatile SingularAttribute<Persona, String> correo;
    public static volatile CollectionAttribute<Persona, Operario> operarioCollection;
    public static volatile SingularAttribute<Persona, String> contrasena;
    public static volatile SingularAttribute<Persona, String> telefono;
    public static volatile SingularAttribute<Persona, Rol> rolIdRol;
    public static volatile SingularAttribute<Persona, String> nombres;
    public static volatile CollectionAttribute<Persona, Cliente> clienteCollection;

}