/*
 * Derechos reservados a TMET
 */
package com.tmet.services;

import com.tmet.dao.DiaFacade;
import com.tmet.model.Dia;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author TMET
 */
@Stateless
@LocalBean
public class DiaService {
    
    @EJB
    private DiaFacade diaFacade;
    
    public List<Dia> obtenerTodos() {
        return this.diaFacade.findAll();
    }
    
    public Dia obtenerPorCodigo(Integer codigo) {
        return this.diaFacade.find(codigo);
    }
    
    public void crear(Dia dia) {
        this.diaFacade.create(dia);
    }
    
    public void modificar(Dia dia) {
        this.diaFacade.edit(dia);
    }
    
    public void eliminar(Integer codigo) {
        Dia dia = this.diaFacade.find(codigo);
        this.diaFacade.remove(dia);
    }
    
}
