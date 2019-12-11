package br.com.caelum.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Conta")
@SequenceGenerator(name = "conta",sequenceName = "SQ_T_CONTA",allocationSize = 1)
public class Conta implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2607603157573874678L;
	
	@Id
	@GeneratedValue(generator = "conta", strategy = GenerationType.SEQUENCE)
	private int id;
	private String titular;
	private String numero;
	private String banco;
	private String agencia;
	
	@OneToMany
	private List<Movimentacao> movimentacoes;

	public Conta(int id, String titular, String numero, String banco, String agencia,List<Movimentacao> movimentacoes) {
		super();
		this.id            = id;
		this.titular       = titular;
		this.numero        = numero;
		this.banco         = banco;
		this.agencia       = agencia;
		this.movimentacoes = movimentacoes;
	}
	
	public Conta() {
		
	}
	
	public Conta(String titular, String numero, String banco, String agencia,List<Movimentacao> movimentacoes) {
		this.titular       = titular;
		this.numero        = numero;
		this.banco         = banco;
		this.agencia       = agencia;
		this.movimentacoes = movimentacoes;
	}
	public Conta(String titular, String numero, String banco, String agencia) {
		this.titular       = titular;
		this.numero        = numero;
		this.banco         = banco;
		this.agencia       = agencia;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public List<Movimentacao> getMovimentacoes() {
		return movimentacoes;
	}

	public void setMovimentacoes(List<Movimentacao> movimentacoes) {
		this.movimentacoes = movimentacoes;
	}
	
	
	
}
