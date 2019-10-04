package br.edu.infnet.cepapp.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cep {
	
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String logradouro_nome;	
	private String bairro_distrito;	
	private String localidade_uf;	
	private String cep;	
	
	public Cep() {
	}

	public Cep(Integer id, String logradouro_nome, String bairro_distrito, String localidade_uf, String cep) {
		super();
		this.id = id;
		this.logradouro_nome = logradouro_nome;
		this.bairro_distrito = bairro_distrito;
		this.localidade_uf = localidade_uf;
		this.cep = cep;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogradouro_nome() {
		return logradouro_nome;
	}

	public void setLogradouro_nome(String logradouro_nome) {
		this.logradouro_nome = logradouro_nome;
	}

	public String getBairro_distrito() {
		return bairro_distrito;
	}

	public void setBairro_distrito(String bairro_distrito) {
		this.bairro_distrito = bairro_distrito;
	}

	public String getLocalidade_uf() {
		return localidade_uf;
	}

	public void setLocalidade_uf(String localidade_uf) {
		this.localidade_uf = localidade_uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}	
	
}
