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
@Table(name = "Pais")
public class Pais {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer paisid;

	@Column(length = 15)
	private String nombre;

	@OneToMany(mappedBy = "pais")
	private Collection<Cliente> itemscliente = new ArrayList<>();

	@OneToMany(mappedBy = "pais")
	private Collection<Ciudad> itemsciudad = new ArrayList<>();

	public Pais() {
	}

	public Pais(Integer paisid, String nombre, Collection<Cliente> itemscliente, Collection<Ciudad> itemsciudad) {
		super();
		this.paisid = paisid;
		this.nombre = nombre;
		this.itemscliente = itemscliente;
		this.itemsciudad = itemsciudad;
	}

	public Integer getPaisid() {
		return paisid;
	}

	public void setPaisid(Integer paisid) {
		this.paisid = paisid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setItemscliente(Collection<Cliente> itemscliente) {
		this.itemscliente = itemscliente;
	}

	public void setItemsciudad(Collection<Ciudad> itemsciudad) {
		this.itemsciudad = itemsciudad;
	}
}