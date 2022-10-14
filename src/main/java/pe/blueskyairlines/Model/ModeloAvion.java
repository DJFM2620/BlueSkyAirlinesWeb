package pe.blueskyairlines.Model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ModeloAvion")
public class ModeloAvion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer modeloid;

	@Column(length = 15)
	private String nombre;

	@OneToMany(mappedBy = "modelo")
	private Collection<Avion> itemsavion = new ArrayList<>();

	public ModeloAvion() {
	}

	public ModeloAvion(Integer modeloid, String nombre, Collection<Avion> itemsavion) {
		super();
		this.modeloid = modeloid;
		this.nombre = nombre;
		this.itemsavion = itemsavion;
	}

	public Integer getModeloid() {
		return modeloid;
	}

	public void setModeloid(Integer modeloid) {
		this.modeloid = modeloid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setItemsavion(Collection<Avion> itemsavion) {
		this.itemsavion = itemsavion;
	}
}