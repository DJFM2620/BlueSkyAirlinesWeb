package pe.blueskyairlines.Model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ciudades")
public class Ciudad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer CiudadID;

	@Column
	private String Nombre;
	
	
	@ManyToOne
	@JoinColumn(name = "PaisID", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(PaisID) references paises(PaisID)"))
	private Pais pais;
	
	@OneToMany(mappedBy = "ciudad")
	private Collection<Aeropuerto> itemsAeropuerto = new ArrayList<>();
	
	
	
	public Ciudad() {
		// TODO Auto-generated constructor stub
	}



	public Ciudad(Integer ciudadID, String nombre, Pais pais, Collection<Aeropuerto> itemsAeropuerto) {
		super();
		CiudadID = ciudadID;
		Nombre = nombre;
		this.pais = pais;
		this.itemsAeropuerto = itemsAeropuerto;
	}



	public Integer getCiudadID() {
		return CiudadID;
	}



	public void setCiudadID(Integer ciudadID) {
		CiudadID = ciudadID;
	}



	public String getNombre() {
		return Nombre;
	}



	public void setNombre(String nombre) {
		Nombre = nombre;
	}



	public Pais getPais() {
		return pais;
	}



	public void setPais(Pais pais) {
		this.pais = pais;
	}



	public Collection<Aeropuerto> getItemsAeropuerto() {
		return itemsAeropuerto;
	}



	public void setItemsAeropuerto(Collection<Aeropuerto> itemsAeropuerto) {
		this.itemsAeropuerto = itemsAeropuerto;
	}
	
	



}
