package es.eoi.jpa.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "bancos")
public class Banco {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "ciudad")
	private String ciudad;	

	@OneToMany(mappedBy = "banco")
	private List<Cuenta> cuentas;

	public Banco(String nombre, String ciudad) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
	}
	
	public Banco() {}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Banco [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", ciudad=");
		builder.append(ciudad);
		builder.append(", cuentas=");
		builder.append(cuentas);
		builder.append("]");
		return builder.toString();
	}
	
}
