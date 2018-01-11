/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestor.bots.admin.console.web;


import com.gestor.bots.admin.console.model.Cliente;
import com.gestor.bots.admin.console.servicio.ClienteService;
import com.gestor.bots.admin.console.web.common.BaseBean;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Hendrix
 */
@Named
@ViewScoped
public class ClienteAdminBean  extends BaseBean implements Serializable{
    
    private String clienteBusqueda;
    private boolean enBusquedaPorTipo;
    private List<Cliente> clientes;
    private Cliente cliente;
    private Cliente clienteSel;
    
    @Inject
    private ClienteService clienteService;
    
    @PostConstruct
    public void init() {
        this.enBusquedaPorTipo = true;
        this.clientes = this.clienteService.obtenerTodos();
    }
    
    public void cambiarFiltro() {
        this.enBusquedaPorTipo = !this.enBusquedaPorTipo;
        System.out.println("Valor para enbusqueda: "+this.enBusquedaPorTipo);
    }
    
    public void buscar() {
       
            //this.clientes = this.clienteService.buscarPorTipo(this.clienteBusqueda);
       this.clientes = this.clienteService.obtenerTodos();
        
    }
    public String getClienteBusqueda() {
        return clienteBusqueda;
    }

    public void setClienteBusqueda(String clienteBusqueda) {
        this.clienteBusqueda = clienteBusqueda;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getClienteSel() {
        return clienteSel;
    }

    public void setClienteSel(Cliente clienteSel) {
        this.clienteSel = clienteSel;
    }


  
    
}
