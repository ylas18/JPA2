/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bean;

import com.mycompany.interfaces.CuentaFacadeLocal;
import com.mycompany.entity.Cuenta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Laura
 */
@Stateless
public class CuentaFacade extends AbstractFacade<Cuenta> implements CuentaFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_JPA2-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CuentaFacade() {
        super(Cuenta.class);
    }
    
}
