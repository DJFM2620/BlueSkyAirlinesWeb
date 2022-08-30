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
@Table(name = "aeropuertos")
public class Aeropuerto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer AeropuertoID;

	@Column
	private String Nombre;
	
	@ManyToOne
	@JoinColumn(name = "CiudadID", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(CiudadID) references ciudades(CiudadID)"))
	private Ciudad ciudad;
	
	
	@OneToMany(mappedBy = "aeropuerto")
	private Collection<Vuelo> itemsvuelo = new ArrayList<>();
	
	@OneToMany(mappedBy = "aeropuerto_reserva")
	private Collection<Reserva> itemsreserva = new ArrayList<>();
	
	public Aeropuerto() {
		// TODO Auto-generated constructor stub
	}

	public Aeropuerto(Integer aeropuertoID, String nombre, Ciudad ciudad, Collection<Vuelo> itemsvuelo,
			Collection<Reserva> itemsreserva) {
		super();
		AeropuertoID = aeropuertoID;
		Nombre = nombre;
		this.ciudad = ciudad;
		this.itemsvuelo = itemsvuelo;
		this.itemsreserva = itemsreserva;
	}

	public Integer getAeropuertoID() {
		return AeropuertoID;
	}

	public void setAeropuertoID(Integer aeropuertoID) {
		AeropuertoID = aeropuertoID;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public Collection<Vuelo> getItemsvuelo() {
		return itemsvuelo;
	}

	public void setItemsvuelo(Collection<Vuelo> itemsvuelo) {
		this.itemsvuelo = itemsvuelo;
	}

	public Collection<Reserva> getItemsreserva() {
		return itemsreserva;
	}

	public void setItemsreserva(Collection<Reserva> itemsreserva) {
		this.itemsreserva = itemsreserva;
	}

	
	

}