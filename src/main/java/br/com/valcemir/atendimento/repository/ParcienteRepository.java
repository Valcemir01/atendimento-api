package br.com.valcemir.atendimento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.valcemir.atendimento.modelo.Parciente;

@Repository
public interface ParcienteRepository extends JpaRepository<Parciente, Integer> {

}
