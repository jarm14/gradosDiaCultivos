/*
 * Derechos reservados a TMET
 */
package com.tmet.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author TMET
 */
@Entity
@Table(name = "DIA")
public class Dia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_DIA", nullable = false)
    private Integer codDia;

    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Column(name = "HORA_AMANECER")
    @Temporal(TemporalType.TIME)
    private Date horaAmanecer;

    @Column(name = "HORA_MAX_TEMPERATURA")
    @Temporal(TemporalType.TIME)
    private Date horaMaxTemperatura;

    @Column(name = "HORA_OCASO")
    @Temporal(TemporalType.TIME)
    private Date horaOcaso;

    @Column(name = "HORA_SIG_DIA")
    @Temporal(TemporalType.TIME)
    private Date horaSigDia;

    @Column(name = "TEMPERATURA_AMANECER")
    private BigDecimal temperaturaAmanecer;

    @Column(name = "TEMPERATURA_MAXIMA")
    private BigDecimal temperaturaMaxima;

    @Column(name = "TEMPERATURA_OCASO")
    private BigDecimal temperaturaOcaso;

    @Column(name = "TEMPERATURA_SIG_DIA")
    private BigDecimal temperaturaSigDia;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codDia", fetch = FetchType.LAZY)
    private List<Temperatura> temperaturaList;

    public Dia() {
    }

    public Dia(Integer codDia) {
        this.codDia = codDia;
    }

    public Integer getCodDia() {
        return codDia;
    }

    public void setCodDia(Integer codDia) {
        this.codDia = codDia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHoraAmanecer() {
        return horaAmanecer;
    }

    public void setHoraAmanecer(Date horaAmanecer) {
        this.horaAmanecer = horaAmanecer;
    }

    public Date getHoraMaxTemperatura() {
        return horaMaxTemperatura;
    }

    public void setHoraMaxTemperatura(Date horaMaxTemperatura) {
        this.horaMaxTemperatura = horaMaxTemperatura;
    }

    public Date getHoraOcaso() {
        return horaOcaso;
    }

    public void setHoraOcaso(Date horaOcaso) {
        this.horaOcaso = horaOcaso;
    }

    public Date getHoraSigDia() {
        return horaSigDia;
    }

    public void setHoraSigDia(Date horaSigDia) {
        this.horaSigDia = horaSigDia;
    }

    public BigDecimal getTemperaturaAmanecer() {
        return temperaturaAmanecer;
    }

    public void setTemperaturaAmanecer(BigDecimal temperaturaAmanecer) {
        this.temperaturaAmanecer = temperaturaAmanecer;
    }

    public BigDecimal getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(BigDecimal temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public BigDecimal getTemperaturaOcaso() {
        return temperaturaOcaso;
    }

    public void setTemperaturaOcaso(BigDecimal temperaturaOcaso) {
        this.temperaturaOcaso = temperaturaOcaso;
    }

    public BigDecimal getTemperaturaSigDia() {
        return temperaturaSigDia;
    }

    public void setTemperaturaSigDia(BigDecimal temperaturaSigDia) {
        this.temperaturaSigDia = temperaturaSigDia;
    }

    public List<Temperatura> getTemperaturaList() {
        return temperaturaList;
    }

    public void setTemperaturaList(List<Temperatura> temperaturaList) {
        this.temperaturaList = temperaturaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codDia != null ? codDia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dia)) {
            return false;
        }
        Dia other = (Dia) object;
        if ((this.codDia == null && other.codDia != null) || (this.codDia != null && !this.codDia.equals(other.codDia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmet.model.Dia[ codDia=" + codDia + " ]";
    }

}
