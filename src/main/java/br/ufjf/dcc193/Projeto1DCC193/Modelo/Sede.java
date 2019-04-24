package br.ufjf.dcc193.Projeto1DCC193.Modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sede {

@Id
@GeneratedValue(strategy = GenerationType.TABLE)
private Long id;

private String nomeFantasia;

private String estadoFederacao; 

private Date dataEntrada;

private String bairro;

private String telefone;

private String endereco;

private String site;

/**
 * @return the site
 */
public String getSite() {
    return site;
}

/**
 * @param site the site to set
 */
public void setSite(String site) {
    this.site = site;
}

public Sede(){}

/**
 * @return the bairro
 */
public String getBairro() {
    return bairro;
}

/**
 * @return the dataEntrada
 */
public Date getDataEntrada() {
    return dataEntrada;
}

/**
 * @return the endereco
 */
public String getEndereco() {
    return endereco;
}/**
 * @return the estadoFederacao
 */
public String getEstadoFederacao() {
    return estadoFederacao;
}/**
 * @return the id
 */
public Long getId() {
    return id;
}/**
 * @return the nomeFantasia
 */
public String getNomeFantasia() {
    return nomeFantasia;
}/**
 * @return the telefone
 */
public String getTelefone() {
    return telefone;
}

/**
 * @param bairro the bairro to set
 */
public void setBairro(String bairro) {
    this.bairro = bairro;
}

/**
 * @param dataEntrada the dataEntrada to set
 */
public void setDataEntrada(Date dataEntrada) {
    this.dataEntrada = dataEntrada;
} 

/**
 * @param endereco the endereco to set
 */
public void setEndereco(String endereco) {
    this.endereco = endereco;
}

/**
 * @param estadoFederacao the estadoFederacao to set
 */
public void setEstadoFederacao(String estadoFederacao) {
    this.estadoFederacao = estadoFederacao;
}/**
 * @param id the id to set
 */
public void setId(Long id) {
    this.id = id;
}/**
 * @param nomeFantasia the nomeFantasia to set
 */
public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
}/**
 * @param telefone the telefone to set
 */
public void setTelefone(String telefone) {
    this.telefone = telefone;
}

public Sede (String nome, String estado){
this.nomeFantasia=nome; 
this.estadoFederacao=estado;}

@Override
public String toString() {
    return "Sede:"+" "+this.nomeFantasia+"//"+this.estadoFederacao;
}
 
}