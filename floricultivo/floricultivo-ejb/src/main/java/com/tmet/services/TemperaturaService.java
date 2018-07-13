/*
 * Derechos reservados a TMET
 */
package com.tmet.services;

import com.tmet.dao.TemperaturaFacade;
import com.tmet.model.Temperatura;
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
public class TemperaturaService {

    @EJB
    private TemperaturaFacade temperaturaFacade;

    public List<Temperatura> obtenerTodos() {
        return this.temperaturaFacade.findAll();
    }

    public Temperatura obtenerPorCodigo(Integer codigo) {
        return this.temperaturaFacade.find(codigo);
    }

    public void crear(Temperatura temperatura) {
        this.temperaturaFacade.create(temperatura);
    }

    public void modificar(Temperatura temperatura) {
        this.temperaturaFacade.edit(temperatura);
    }

    public void eliminar(Integer codigo) {
        Temperatura temperatura = this.temperaturaFacade.find(codigo);
        this.temperaturaFacade.remove(temperatura);
    }
}
