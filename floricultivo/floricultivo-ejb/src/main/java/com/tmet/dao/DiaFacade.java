/*
 * Derechos reservados a TMET
 */
package com.tmet.dao;

import com.tmet.model.Dia;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author TMET
 */
@Stateless
public class DiaFacade extends AbstractFacade<Dia> {

    @PersistenceContext(unitName = "com.tmet_floricultivo-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DiaFacade() {
        super(Dia.class);
    }
    
}
