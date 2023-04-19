package com.generation.lojagames.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
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
	
	@NotNull
	@PositiveOrZero
	private BigDecimal preco;
	
	@UpdateTimestamp
	private LocalDate lancamento;
	
	@Size(max = 1000, message = "O atributo descrição deve ter no máximo 1000 caracteres!")
	private String foto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return nome;
	}

	public void setName(String name) {
		this.nome = name;
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

}
