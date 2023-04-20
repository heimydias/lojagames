package com.generation.lojagames.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produto") /* entity - criar tabela e table - dar nome*/
public class Produto {
	
	@Id /* definir chave primaria*/
	@GeneratedValue(strategy = GenerationType.IDENTITY) /* define a chave*/
	private Long id;
	
	@NotNull(message = "O Atributo nome é obrigatório!")
	private String nome;
	
	@NotBlank(message = "O Atributo nome é obrigatório!")
	@Size(max = 1000, message = "O atributo descrição deve ter no máximo 1000 caracteres!")
	private String descricao;
	
	@NotNull(message = "Preço é obrigatório!")
	@Positive
	private BigDecimal preco;
	
	private LocalDate lancamento;
	
	@Size(max = 1000, message = "O atributo descrição deve ter no máximo 1000 caracteres!")
	private String foto;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public LocalDate getLancamento() {
		return lancamento;
	}

	public void setLancamento(LocalDate lancamento) {
		this.lancamento = lancamento;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
