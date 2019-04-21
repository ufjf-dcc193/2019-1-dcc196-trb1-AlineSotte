package br.ufjf.dcc193.Projeto1DCC193.Modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.springframework.data.annotation.Id;
// import java.util.List;

@Entity
public class Sede {

@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
private Long id;

private String nomeFantasia;

private String estadoFederacao; 

private String dataEntrada;

private String bairro;

private String telefone;

private String endereco;

// private List<Membros> membros;

// private List<Atividades> atividades;

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
public String getDataEntrada() {
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
public void setDataEntrada(String dataEntrada) {
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


}