/*
 * Derechos reservados a TMET
 */
package com.tmet.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author TMET
 */
@Entity
@Table(name = "TEMPERATURA")
public class Temperatura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_TEMPERATURA", nullable = false)
    private Integer codTemperatura;

    @Column(name = "HORA")
    @Temporal(TemporalType.TIME)
    private Date hora;

    @Column(name = "TEMPERATURA")
    private BigDecimal temperatura;

    @JoinColumn(name = "COD_DIA", referencedColumnName = "COD_DIA")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Dia codDia;

    public Temperatura() {
    }

    public Temperatura(Integer codTemperatura) {
        this.codTemperatura = codTemperatura;
    }

    public Integer getCodTemperatura() {
        return codTemperatura;
    }

    public void setCodTemperatura(Integer codTemperatura) {
        this.codTemperatura = codTemperatura;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public BigDecimal getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(BigDecimal temperatura) {
        this.temperatura = temperatura;
    }

    public Dia getCodDia() {
        return codDia;
    }

    public void setCodDia(Dia codDia) {
        this.codDia = codDia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codTemperatura != null ? codTemperatura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Temperatura)) {
            return false;
        }
        Temperatura other = (Temperatura) object;
        if ((this.codTemperatura == null && other.codTemperatura != null) || (this.codTemperatura != null && !this.codTemperatura.equals(other.codTemperatura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmet.model.Temperatura[ codTemperatura=" + codTemperatura + " ]";
    }

}
