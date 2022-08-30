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
@Table(name = "Aeropuerto")
public class Aeropuerto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer aeropuertoid;

	@Column(length = 50)
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "ciudadid", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(ciudadid) references ciudad(ciudadid)"))
	private Ciudad ciudad;
	
	@OneToMany(mappedBy = "aeropuerto")
	private Collection<Vuelo> itemsvuelo = new ArrayList<>();
	
	@OneToMany(mappedBy = "aeropuerto_reserva")
	private Collection<Reserva> itemsreserva = new ArrayList<>();
	
	public Aeropuerto() {
	}

	public Aeropuerto(Integer aeropuertoid, String nombre, Ciudad ciudad, Collection<Vuelo> itemsvuelo,
			Collection<Reserva> itemsreserva) {
		super();
		this.aeropuertoid = aeropuertoid;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.itemsvuelo = itemsvuelo;
		this.itemsreserva = itemsreserva;
	}

	public Integer getAeropuertoid() {
		return aeropuertoid;
	}

	public void setAeropuertoid(Integer aeropuertoid) {
		this.aeropuertoid = aeropuertoid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	
	public void setItemsvuelo(Collection<Vuelo> itemsvuelo) {
		this.itemsvuelo = itemsvuelo;
	}

	public void setItemsreserva(Collection<Reserva> itemsreserva) {
		this.itemsreserva = itemsreserva;
	}
}