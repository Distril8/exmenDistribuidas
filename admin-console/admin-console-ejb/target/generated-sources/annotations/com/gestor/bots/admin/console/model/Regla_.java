package com.gestor.bots.admin.console.model;

import com.gestor.bots.admin.console.enums.EstadoReglaEnum;
import com.gestor.bots.admin.console.model.Bot;
import com.gestor.bots.admin.console.model.EntrenamientoRegla;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-10T20:25:34")
@StaticMetamodel(Regla.class)
public class Regla_ { 

    public static volatile SingularAttribute<Regla, String> codigo;
    public static volatile SingularAttribute<Regla, EstadoReglaEnum> estado;
    public static volatile SingularAttribute<Regla, Bot> bot;
    public static volatile SingularAttribute<Regla, String> categoria;
    public static volatile ListAttribute<Regla, EntrenamientoRegla> entrenamientoReglas;
    public static volatile SingularAttribute<Regla, String> codigoBot;
    public static volatile SingularAttribute<Regla, String> nombre;

}