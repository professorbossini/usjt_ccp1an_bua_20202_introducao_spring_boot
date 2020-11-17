package br.com.bossini.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bossini.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
	

}
