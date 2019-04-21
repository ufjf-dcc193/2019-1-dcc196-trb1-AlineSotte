package br.ufjf.dcc193.Projeto1DCC193.Modelo;

import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import org.springframework.data.annotation.Id;


@Entity
public class Membros {

@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
private Long id;  

private String funcao;

@Email
private String email; 

@Temporal(TemporalType.DATE)
private Calendar dataEntrada;

@Temporal(TemporalType.DATE)
private Calendar dataSaida;

private Sede sede;

/**
 * @return the dataEntrada
 */
public Calendar getDataEntrada() {
    return dataEntrada;
}/**
 * @return the dataSaida
 */
public Calendar getDataSaida() {
    return dataSaida;
}/**
 * @return the email
 */
public String getEmail() {
    return email;
}/**
 * @return the funcao
 */
public String getFuncao() {
    return funcao;
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
 * @param dataEntrada the dataEntrada to set
 */
public void setDataEntrada(Calendar dataEntrada) {
    this.dataEntrada = dataEntrada;
}/**
 * @param dataSaida the dataSaida to set
 */
public void setDataSaida(Calendar dataSaida) {
    this.dataSaida = dataSaida;
}/**
 * @param email the email to set
 */
public void setEmail(String email) {
    this.email = email;
}/**
 * @param funcao the funcao to set
 */
public void setFuncao(String funcao) {
    this.funcao = funcao;
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