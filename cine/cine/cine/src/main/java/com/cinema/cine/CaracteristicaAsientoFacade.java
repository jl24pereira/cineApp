/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinema.cine;

import com.cinema.cine.entities.CaracteristicaAsiento;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author JL
 */
@Stateless
public class CaracteristicaAsientoFacade extends AbstractFacade<CaracteristicaAsiento> {

    @PersistenceContext(unitName = "my_persistence_unit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CaracteristicaAsientoFacade() {
        super(CaracteristicaAsiento.class);
    }
    
}
