package br.ufjf.dcc193.Projeto1DCC193.Modelo;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;



@Entity
public class Membros {

@Id
@GeneratedValue(strategy = GenerationType.TABLE)
private Long id;  

private String nome;

private String funcao;

@Email
private String email; 

private Date dataEntrada;

private Date dataSaida;

@ManyToOne
private Sede sede;

/**
 * @return the dataEntrada
 */
public Date getDataEntrada() {
    return dataEntrada;
}/**
 * @return the dataSaida
 */
public Date getDataSaida() {
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
public void setDataEntrada(Date dataEntrada) {
    this.dataEntrada = dataEntrada;
}/**
 * @param dataSaida the dataSaida to set
 */
public void setDataSaida(Date dataSaida) {
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

/**
 * @return the nome
 */
public String getNome() {
    return nome;
}

/**
 * @param nome the nome to set
 */
public void setNome(String nome) {
    this.nome = nome;
}

}