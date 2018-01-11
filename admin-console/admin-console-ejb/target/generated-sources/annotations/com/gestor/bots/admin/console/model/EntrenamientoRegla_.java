package com.gestor.bots.admin.console.model;

import com.gestor.bots.admin.console.model.EntrenamientoReglaPK;
import com.gestor.bots.admin.console.model.Regla;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-10T20:25:34")
@StaticMetamodel(EntrenamientoRegla.class)
public class EntrenamientoRegla_ { 

    public static volatile SingularAttribute<EntrenamientoRegla, String> estado;
    public static volatile SingularAttribute<EntrenamientoRegla, Date> fechaInicio;
    public static volatile SingularAttribute<EntrenamientoRegla, EntrenamientoReglaPK> pk;
    public static volatile SingularAttribute<EntrenamientoRegla, Regla> regla;
    public static volatile SingularAttribute<EntrenamientoRegla, Date> fechaFin;
    public static volatile SingularAttribute<EntrenamientoRegla, Integer> lineasEntrenamiento;

}