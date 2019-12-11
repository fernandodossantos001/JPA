package br.com.caelum.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "categoria")
@SequenceGenerator(name = "categoria", sequenceName = "T_SQ_CATEGORIA",allocationSize = 1)
public class Categoria {
	
	@Id
	@GeneratedValue(generator = "categoria", strategy = GenerationType.SEQUENCE)
	private Integer id;
	@Column(name = "nm_nome")
	private String nome;
	
	
	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	public Categoria( String nome) {
		this.nome = nome;
	}
	
	public Categoria() {
		
	}
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
}
