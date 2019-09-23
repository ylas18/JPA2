/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.interfaces.InversorFacadeLocal;
import com.mycompany.entity.Cuenta;
import com.mycompany.entity.Inversor;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Laura, Yesid
 * @version 1.0
 */
@Named
@SessionScoped
public class controllerIndex implements Serializable {

    /**
     * Bean con el cual se acceden a los metodos de la interfaz
     */
    @EJB
    private InversorFacadeLocal inversorFacade;

    /**
     * Metodo por medio del cual se almacena el inversor y la cuenta a la bd
     */
    public void guardar() {
        Inversor inversor = new Inversor();
        inversor.setNombre("Yesid");
        Cuenta cuenta = new Cuenta();
        cuenta.setNumeroCuenta("12584-YL");
        inversor.setCuenta(cuenta);
        cuenta.setInversor(inversor);       
        inversorFacade.create(inversor);
    }

}
