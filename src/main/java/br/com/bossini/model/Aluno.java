package br.com.bossini.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Aluno { //aluno_de_pos
	
	//SELECT * FROM aluno;
	//INSERT INTO aluno (nome, media_notas) VALUES ('Ana', 12);

	@Id
	@GeneratedValue
	private Long id; //id
	
	private String nome; //nome
	
	private Double mediaNotas; //media_notas

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getMediaNotas() {
		return mediaNotas;
	}

	public void setMediaNotas(Double mediaNotas) {
		this.mediaNotas = mediaNotas;
	}
	
}
