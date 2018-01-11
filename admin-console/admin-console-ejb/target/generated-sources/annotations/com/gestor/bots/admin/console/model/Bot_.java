package com.gestor.bots.admin.console.model;

import com.gestor.bots.admin.console.enums.EstadoBotEnum;
import com.gestor.bots.admin.console.enums.TipoBotEnum;
import com.gestor.bots.admin.console.model.Cliente;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-10T20:25:34")
@StaticMetamodel(Bot.class)
public class Bot_ { 

    public static volatile SingularAttribute<Bot, String> descripcion;
    public static volatile SingularAttribute<Bot, String> ruc;
    public static volatile SingularAttribute<Bot, Cliente> cliente;
    public static volatile SingularAttribute<Bot, String> codigo;
    public static volatile SingularAttribute<Bot, TipoBotEnum> tipo;
    public static volatile SingularAttribute<Bot, EstadoBotEnum> estado;
    public static volatile SingularAttribute<Bot, String> avatar;
    public static volatile SingularAttribute<Bot, String> nombre;

}