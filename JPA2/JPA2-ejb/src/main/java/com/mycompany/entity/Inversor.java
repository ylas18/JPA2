/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Laura
 */
@Entity
@Table
public class Inversor implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * Mapeo de la columna id del tabla Inversor donde se almacena el Id de
     * nuevo inversor declaracion de llave primaria definicion de la columna a
     * la que hace referencia en la bd
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    /**
     * Mapeo de la columna nombre donde se almacena el nombre del inversor
     * Anotacion que no puede ser nulo Anotacion de tamaño Columna a la que hace
     * referencia
     */
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;

    /**
     * Objeto Cuenta donde se encuentran almacenados los datos de la cuenta del
     * Inversor Anotacion de relacion uno a uno
     */
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "inversor")
    @JoinColumn(name = "INVERSOR_ID")
    private Cuenta cuenta;

    public Inversor() {
    }

    public Inversor(Integer id) {
        this.id = id;
    }

    /**
     * Contructor de la clase Inversor donde se inicializan las variables
     *
     * @param id
     * @param nombre
     */
    public Inversor(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    /**
     * Get cone le cual se obtiene el id del inversor previamente almacenado
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * Set con el cual se puede editar el id deñl inversor previamente
     * almacenado
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Get con el cual se puede obtener el Nombre del inversor previante
     * almacenado
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set con el cual se puede editar el Nombre del inversor previamente
     * almacenado
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Get con el cual se pueden obtener los datos de la cuanta de un inversor
     *
     * @return
     */
    public Cuenta getCuenta() {
        return cuenta;
    }

    /**
     * Set con el cual se pueden editar los datos de la cuenta de un inversor
     *
     * @param cuenta
     */
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inversor)) {
            return false;
        }
        Inversor other = (Inversor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entity.Inversor[ id=" + id + " ]";
    }

}
