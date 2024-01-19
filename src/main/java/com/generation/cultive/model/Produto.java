package com.generation.cultive.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name= "tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message= "O atributo nome é obrigatório!")
	@Size(max = 100, message = "O atributo nome deve conter no mínimo 5 e no máximo 100 caracteres ")
	private String nome;
	
	@NotNull(message= "O atributo quantidade é obrigatório!")
	private Integer quantidade;
	

	@NotNull(message= "O atributo peso é obrigatório! Atenção: a medida deve estar em kg")
	private BigDecimal peso;
	

	@NotNull(message= "O atributo preço é obrigatório!")
	private BigDecimal preco;
	
	
	private String foto;
	
	private String brinde ;
	
	private String classificacao; 
	
	@UpdateTimestamp 
	private LocalDateTime data;
	
	@ManyToOne	
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	@ManyToOne	
	@JsonIgnoreProperties("produto")
	private Usuario usuario;
	
	
	
	

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

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getBrinde() {
		return brinde;
	}

	public void setBrinde(String brinde) {
		this.brinde = brinde;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	
	
	
	}
}
