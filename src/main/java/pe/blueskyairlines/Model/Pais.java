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
@Table(name = "paises")
public class Pais {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer PaisID;

	@Column
	private String Nombre;

	@OneToMany(mappedBy = "pais")
	private Collection<Cliente> itemsCliente = new ArrayList<>();
	
	@OneToMany(mappedBy = "pais")
	private Collection<Ciudad> itemsciudad = new ArrayList<>();

	public Pais() {
		// TODO Auto-generated constructor stub
	}

	public Pais(Integer paisID, String nombre) {
		super();
		PaisID = paisID;
		Nombre = nombre;
	}

	public Integer getPaisID() {
		return PaisID;
	}

	public void setPaisID(Integer paisID) {
		PaisID = paisID;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}











}
