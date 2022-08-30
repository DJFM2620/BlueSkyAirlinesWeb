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
@Table(name = "modelos")
public class ModeloAvion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ModeloID;

	@Column
	private String Nombre;

	

	@OneToMany(mappedBy = "modelo")
	private Collection<Avion> itemsAvion = new ArrayList<>();

	public ModeloAvion() {
		// TODO Auto-generated constructor stub
	}

	public ModeloAvion(Integer modeloID, String nombre, Collection<Avion> itemsAvion) {
		super();
		ModeloID = modeloID;
		Nombre = nombre;
		this.itemsAvion = itemsAvion;
	}

	public Integer getModeloID() {
		return ModeloID;
	}

	public void setModeloID(Integer modeloID) {
		ModeloID = modeloID;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Collection<Avion> getItemsAvion() {
		return itemsAvion;
	}

	public void setItemsAvion(Collection<Avion> itemsAvion) {
		this.itemsAvion = itemsAvion;
	}


	

}
