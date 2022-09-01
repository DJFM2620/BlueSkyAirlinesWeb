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
@Table(name = "FabricanteAvion")
public class FabricanteAvion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer fabricanteid;

	@Column(length = 10)
	private String nombre;
	
	@OneToMany(mappedBy = "fabricante")
	private Collection<Avion> itemsavion = new ArrayList<>();

	public FabricanteAvion() {
	}

	public FabricanteAvion(Integer fabricanteid, String nombre, Collection<Avion> itemsavion) {
		super();
		this.fabricanteid = fabricanteid;
		this.nombre = nombre;
		this.itemsavion = itemsavion;
	}

	public Integer getFabricanteid() {
		return fabricanteid;
	}

	public void setFabricanteid(Integer fabricanteid) {
		this.fabricanteid = fabricanteid;
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