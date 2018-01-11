/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestor.bots.admin.console.web;

import com.gestor.bots.admin.console.model.Bot;
import com.gestor.bots.admin.console.servicio.BotService;
import com.gestor.bots.admin.console.web.common.BaseBean;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.commons.beanutils.BeanUtils;

/**
 *
 * @author Hendrix
 */
@Named
@ViewScoped
public class BotBean extends BaseBean implements Serializable {

    @Inject
    private BotService botService;

    private List<Bot> botList;

    private Bot bot;
    private Bot botSel;

    @PostConstruct
    public void init() {
        this.botList = this.botService.obtenerTodos();
    }

    @Override
    public void nuevo() {
        super.nuevo();
        this.bot = new Bot();
    }

    @Override
    public void modificar() {
        super.modificar();
        this.bot = new Bot();
        try {
            BeanUtils.copyProperties(this.bot, this.botSel);
        } catch (Exception ex) {

        }
    }

    @Override
    public void consultar() {
        super.consultar();
        this.bot = this.botSel;
    }

    public void guardar() {
        try {
            if (super.isEnModificar()) {
                this.botService.modificar(bot);
                FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Modificacion", "Se modifico el bot: " + this.bot.getNombre());
                FacesContext.getCurrentInstance().addMessage(null, msg);
            } else {
                this.botService.crear(bot);
                FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Creacion", "Se creo el bot: " + this.bot.getNombre());
                FacesContext.getCurrentInstance().addMessage(null, msg);
            }
        } catch (Exception e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error ", "Ocurrio un error");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }

    public List<Bot> getBotList() {
        return botList;
    }

    public Bot getBot() {
        return bot;
    }

    public void setBot(Bot bot) {
        this.bot = bot;
    }

    public Bot getBotSel() {
        return botSel;
    }

    public void setBotSel(Bot botSel) {
        this.botSel = botSel;
    }

    


}
