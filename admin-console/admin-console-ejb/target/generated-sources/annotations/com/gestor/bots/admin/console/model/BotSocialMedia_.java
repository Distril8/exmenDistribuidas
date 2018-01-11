package com.gestor.bots.admin.console.model;

import com.gestor.bots.admin.console.model.Bot;
import com.gestor.bots.admin.console.model.BotSocialMediaPK;
import com.gestor.bots.admin.console.model.SocialMedia;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-10T20:25:34")
@StaticMetamodel(BotSocialMedia.class)
public class BotSocialMedia_ { 

    public static volatile SingularAttribute<BotSocialMedia, Bot> bot;
    public static volatile SingularAttribute<BotSocialMedia, String> usuario;
    public static volatile SingularAttribute<BotSocialMedia, BotSocialMediaPK> pk;
    public static volatile SingularAttribute<BotSocialMedia, SocialMedia> socialMedia;
    public static volatile SingularAttribute<BotSocialMedia, String> nombre;
    public static volatile SingularAttribute<BotSocialMedia, String> url;

}