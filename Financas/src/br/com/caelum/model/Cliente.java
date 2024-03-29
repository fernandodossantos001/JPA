package br.com.caelum.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "t_a_cliente")
@SequenceGenerator(name = "cliente", sequenceName = "T_SQ_CLIENTE", allocationSize = 1)
public class Cliente {
	@Id
	@GeneratedValue(generator = "cliente", strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	@Column(name = "nm_nome")
	private String nome;
	
	@Column(name = "ds_profissao")
	private String profissao;
	
	@Column(name = "endereco")
	private String endereco;
	
	@JoinColumn(unique = true)
	@OneToOne
	private Conta conta;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
}
