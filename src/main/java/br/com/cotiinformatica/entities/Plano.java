package br.com.cotiinformatica.entities;

import java.util.UUID;

public class Plano {

	private UUID id;
	private String nome;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Plano [id=" + id + ", nome=" + nome + "]";
	}

}
