package br.com.caelum.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "MOVIMENTACAO")
@SequenceGenerator(name = "movimentacao",sequenceName = "ST_T_MOVIMENTACAO",allocationSize = 1)
public class Movimentacao {
	
	@Id
	@GeneratedValue(generator = "movimentacao",strategy = GenerationType.SEQUENCE)
	@Column(name = "id_movimentacao")
	private int id;

	@Column(name = "vl_valor")
	private BigDecimal valor;
	
	@Column(name = "ds_tipo")
	@Enumerated(EnumType.STRING)
	private TipoMovimentacao tipo;
	
	@Column(name = "dt_movimentacao")
	@Temporal(TemporalType.DATE)
	private Calendar dataMovimentacao;
	
	@Column(name = "ds_descricao")
	private String descricao;
	
	@ManyToOne
	private Conta conta;
	
	@ManyToMany
	private List<Categoria> categorias;
	
	public Movimentacao() {
		
	}
	
	
	public Movimentacao(int id, BigDecimal valor, TipoMovimentacao tipo, Calendar dataMovimentacao, String descricao,
			Conta conta) {
		super();
		this.id = id;
		this.valor = valor;
		this.tipo = tipo;
		this.dataMovimentacao = dataMovimentacao;
		this.descricao = descricao;
		this.conta = conta;
	}
	
	public Movimentacao(BigDecimal valor, TipoMovimentacao tipo, Calendar dataMovimentacao, String descricao,
			Conta conta) {
		super();
		this.valor = valor;
		this.tipo = tipo;
		this.dataMovimentacao = dataMovimentacao;
		this.descricao = descricao;
		this.conta = conta;
	}
	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public TipoMovimentacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoMovimentacao tipo) {
		this.tipo = tipo;
	}

	public Calendar getDataMovimentacao() {
		return dataMovimentacao;
	}

	public void setDataMovimentacao(Calendar dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}


	public List<Categoria> getCategorias() {
		return categorias;
	}


	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	} 
	
	
}