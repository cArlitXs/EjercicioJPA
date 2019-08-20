package es.eoi.jpa.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "clientes")
public class Cliente {

	@Id
	@Column(name = "dni")
	private String dni;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "direccion")
	private String direccion;

	@OneToMany(mappedBy = "cliente",cascade = CascadeType.ALL)
	private List<Cuenta> cuentas;

	public Cliente(String dni, String nombre, String direccion) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public Cliente() {}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [dni=");
		builder.append(dni);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", cuentas=");
		builder.append(cuentas);
		builder.append("]");
		return builder.toString();
	}
	
}
