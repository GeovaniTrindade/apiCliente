package br.com.cotiinformatica.dtos;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ClientePostRequestDto {
	private String nome;
	private String email;
	private String telefone;
	private UUID planoId;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public UUID getPlanoId() {
		return planoId;
	}

	public void setPlanoId(UUID planoId) {
		this.planoId = planoId;
	}
}
