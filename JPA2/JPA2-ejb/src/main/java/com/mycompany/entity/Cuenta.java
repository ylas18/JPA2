/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *Clase donde se encuentra el mapeo de la tabla Cuenta de la base de datos usuario
 * @author Laura, Yesid
 */
@Entity
@Table
public class Cuenta implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    /**
     * Mapeo de la columna INVERSOR_ID donde se almacena el id de la cuenta del inversor, el cual es el mismo id 
     * del inversor para su facil identificacion
     */
    @Id
    @Column(name = "INVERSOR_ID")
    private Integer inversorId;
    
    /**
     * Mapeo de la columna numero_cuenta donde se almacena el numero de la cuenta del inversor 
     */
    @Size(max = 150)
    @Column(name = "numero_cuenta")
    private String numeroCuenta;
        
    /**
     * Inveror y declaracion de relacion uno a uno con la tabla Cuanta
     */
    @OneToOne
    private Inversor inversor;

    public Cuenta() {
    }

    /**
     * Constructor de la clase cuenta donde se inicializan los Campos 
     * @param inversorId
     * @param numeroCuenta
     * @param inversor 
     */
    public Cuenta(Integer inversorId, String numeroCuenta, Inversor inversor) {
        this.inversorId = inversorId;
        this.numeroCuenta = numeroCuenta;
        this.inversor = inversor;
    }


    public Cuenta(Integer inversorId) {
        this.inversorId = inversorId;
    }

    /**
     * get del campo InversorId con el cual se puede obtener el id de la cuanta del inversor 
     * @return inversorId
     */
    public Integer getInversorId() {
        return inversorId;
    }

    /**
     * Set con el cual se puede editar el id del inversor en la cuenta 
     * @param inversorId 
     */
    public void setInversorId(Integer inversorId) {
        this.inversorId = inversorId;
    }

    /**
     * get con el cual se puede obtener el Numero de la cuanta del inversor 
     * @return numeroCuenta
     */    
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Set con el cual se puede editar el Numero de la cuenta del inversor
     * @param numeroCuenta 
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * Get con el cual se obtiene el objeto Inversor 
     * @return Inversor 
     */
    public Inversor getInversor() {
        return inversor;
    }

    /**
     * Set con el cual se pueden editar los datos del inversor de la tabla inversor 
     * @param inversor 
     */
    public void setInversor(Inversor inversor) {
        this.inversor = inversor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inversorId != null ? inversorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuenta)) {
            return false;
        }
        Cuenta other = (Cuenta) object;
        if ((this.inversorId == null && other.inversorId != null) || (this.inversorId != null && !this.inversorId.equals(other.inversorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entity.Cuenta[ inversorId=" + inversorId + " ]";
    }
    
}
