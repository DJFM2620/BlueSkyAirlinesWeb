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
@Table(name = "Estado")
public class Estado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer estadoid;
	
	@Column(length = 10)
	private String nombre;
	
	@OneToMany(mappedBy = "estado")
	private Collection<Vuelo> itemsVuelo = new ArrayList<>();
	
	public Estado() {
	}

	public Estado(Integer estadoid, String nombre, Collection<Vuelo> itemsVuelo) {
		super();
		this.estadoid = estadoid;
		this.nombre = nombre;
		this.itemsVuelo = itemsVuelo;
	}

	public Integer getEstadoid() {
		return estadoid;
	}

	public void setEstadoid(Integer estadoid) {
		this.estadoid = estadoid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setItemsVuelo(Collection<Vuelo> itemsVuelo) {
		this.itemsVuelo = itemsVuelo;
	}
}