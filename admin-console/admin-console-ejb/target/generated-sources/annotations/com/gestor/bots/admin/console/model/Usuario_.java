package com.gestor.bots.admin.console.model;

import com.gestor.bots.admin.console.enums.EstadoUsuarioEnum;
import com.gestor.bots.admin.console.enums.TipoUsuarioEnum;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-10T20:25:34")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> clave;
    public static volatile SingularAttribute<Usuario, EstadoUsuarioEnum> estado;
    public static volatile SingularAttribute<Usuario, TipoUsuarioEnum> tipo;
    public static volatile SingularAttribute<Usuario, String> mail;
    public static volatile SingularAttribute<Usuario, Date> fechaCreacion;
    public static volatile SingularAttribute<Usuario, String> nombre;

}