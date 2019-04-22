package br.ufjf.dcc193.Projeto1DCC193.Modelo;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Atividades {

@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
private Long id;  

private String tituloDescritivo;

private String descricaoTextual; 

private Date dataInicio;

private Date dataFim;

private double horaJuridica;

private double horaAssistencial;

private double horaFinanceira;

private double horaExecutiva;

@ManyToOne
private Sede sede;

public Atividades(){}

/**
 * @return the dataFim
 */
public Date getDataFim() {
    return dataFim;
}/**
 * @return the dataInicio
 */
public Date getDataInicio() {
    return dataInicio;
}/**
 * @return the descricaoTextual
 */
public String getDescricaoTextual() {
    return descricaoTextual;
}/**
 * @return the horaAssistencial
 */
public double getHoraAssistencial() {
    return horaAssistencial;
}/**
 * @return the horaExecutiva
 */
public double getHoraExecutiva() {
    return horaExecutiva;
}/**
 * @return the horaFinanceira
 */
public double getHoraFinanceira() {
    return horaFinanceira;
}/**
 * @return the horaJuridica
 */
public double getHoraJuridica() {
    return horaJuridica;
}/**
 * @return the id
 */
public Long getId() {
    return id;
}/**
 * @return the sede
 */
public Sede getSede() {
    return sede;
}
/**
 * @return the tituloDescritivo
 */
public String getTituloDescritivo() {
    return tituloDescritivo;
}

/**
 * @param dataFim the dataFim to set
 */
public void setDataFim(Date dataFim) {
    this.dataFim = dataFim;
}/**
 * @param dataInicio the dataInicio to set
 */
public void setDataInicio(Date dataInicio) {
    this.dataInicio = dataInicio;
}/**
 * @param descricaoTextual the descricaoTextual to set
 */
public void setDescricaoTextual(String descricaoTextual) {
    this.descricaoTextual = descricaoTextual;
}/**
 * @param horaAssistencial the horaAssistencial to set
 */
public void setHoraAssistencial(double horaAssistencial) {
    this.horaAssistencial = horaAssistencial;
}/**
 * @param horaExecutiva the horaExecutiva to set
 */
public void setHoraExecutiva(double horaExecutiva) {
    this.horaExecutiva = horaExecutiva;
}/**
 * @param horaFinanceira the horaFinanceira to set
 */
public void setHoraFinanceira(double horaFinanceira) {
    this.horaFinanceira = horaFinanceira;
}/**
 * @param horaJuridica the horaJuridica to set
 */
public void setHoraJuridica(double horaJuridica) {
    this.horaJuridica = horaJuridica;
}/**
 * @param id the id to set
 */
public void setId(Long id) {
    this.id = id;
}/**
 * @param sede the sede to set
 */
public void setSede(Sede sede) {
    this.sede = sede;
}

}