/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinema.cine;

import com.cinema.cine.entities.AsientoSala;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author JL
 */
@Stateless
public class AsientoSalaFacade extends AbstractFacade<AsientoSala> {

    @PersistenceContext(unitName = "my_persistence_unit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AsientoSalaFacade() {
        super(AsientoSala.class);
    }
    
}
