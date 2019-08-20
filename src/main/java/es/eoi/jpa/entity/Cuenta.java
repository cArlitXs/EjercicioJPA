package es.eoi.jpa.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cuentas")
public class Cuenta {
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "saldo")
	private Double saldo;
	
	@ManyToOne
	@JoinColumn(name="idBanco", referencedColumnName = "id")	
	private Banco banco;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="dniCliente", referencedColumnName = "dni")
	private Cliente cliente;

	public Cuenta(Integer id, Double saldo, Banco banco, Cliente cliente) {
		super();
		this.id = id;
		this.saldo = saldo;
		this.banco = banco;
		this.cliente = cliente;
	}
	
	public Cuenta() {}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cuenta [id=");
		builder.append(id);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", banco=");
		builder.append(banco);
		builder.append(", cliente=");
		builder.append(cliente);
		builder.append("]");
		return builder.toString();
	}
	
}
