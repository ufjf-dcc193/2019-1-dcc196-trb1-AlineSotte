package br.ufjf.dcc193.Projeto1DCC193.Repositorio;

import br.ufjf.dcc193.Projeto1DCC193.Modelo.Atividades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtividadeRepository extends JpaRepository<Atividades,Long>{} 