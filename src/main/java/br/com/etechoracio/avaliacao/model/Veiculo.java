package br.com.etechoracio.avaliacao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.etechoracio.avaliacao.MarcaEnum.MarcaEnum;
import br.com.etechoracio.common.model.BaseORM;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name="Veiculos")
public class Veiculo extends BaseORM {
	
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Long id;
	
	@Column(name="PLACA")
	private String placa;
	
	@Column(name="MODELO")
	private String modelo;
	
	@Enumerated(EnumType.STRING)
	@Column(name="MARCA")
	private MarcaEnum marca;
	
	@Column(name="COR")
	private String cor;
	
	@Column(name="PRECO")
	private float preco;

}
