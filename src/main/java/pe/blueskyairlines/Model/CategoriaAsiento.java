package pe.blueskyairlines.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CategoriaAsiento")
public class CategoriaAsiento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer categoriaid;

	@Column(length = 15)
	private String nombre;

	public CategoriaAsiento() {
	}

	public CategoriaAsiento(Integer categoriaid, String nombre) {
		super();
		this.categoriaid = categoriaid;
		this.nombre = nombre;
	}

	public Integer getCategoriaid() {
		return categoriaid;
	}

	public void setCategoriaid(Integer categoriaid) {
		this.categoriaid = categoriaid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}