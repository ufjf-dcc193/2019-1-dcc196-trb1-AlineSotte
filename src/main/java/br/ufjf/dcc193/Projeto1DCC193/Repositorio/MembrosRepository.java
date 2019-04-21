package br.ufjf.dcc193.Projeto1DCC193.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.ufjf.dcc193.Projeto1DCC193.Modelo.Membros;

@Repository
public interface MembrosRepository extends JpaRepository<Membros,Long>{} 