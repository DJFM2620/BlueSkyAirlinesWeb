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
@Table(name = "fabricantes")
public class FabricanteAvion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer FabricanteID;

	@Column
	private String Nombre;
	
	
	@OneToMany(mappedBy = "fabricante")
	private Collection<Avion> itemsAvion = new ArrayList<>();

	public FabricanteAvion() {
		// TODO Auto-generated constructor stub
	}

	public FabricanteAvion(Integer fabricanteID, String nombre, Collection<Avion> itemsAvion) {
		super();
		FabricanteID = fabricanteID;
		Nombre = nombre;
		this.itemsAvion = itemsAvion;
	}

	public Integer getFabricanteID() {
		return FabricanteID;
	}

	public void setFabricanteID(Integer fabricanteID) {
		FabricanteID = fabricanteID;
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

