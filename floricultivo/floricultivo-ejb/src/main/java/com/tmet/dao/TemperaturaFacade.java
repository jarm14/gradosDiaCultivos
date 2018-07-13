/*
 * Derechos reservados a TMET
 */
package com.tmet.dao;

import com.tmet.model.Temperatura;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author TMET
 */
@Stateless
public class TemperaturaFacade extends AbstractFacade<Temperatura> {

    @PersistenceContext(unitName = "com.tmet_floricultivo-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TemperaturaFacade() {
        super(Temperatura.class);
    }
    
}
