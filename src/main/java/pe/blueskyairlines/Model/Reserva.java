package pe.blueskyairlines.Model;

import java.time.LocalDate;
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

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "reservas")
public class Reserva {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ReservaID;

	@Column
	@DateTimeFormat(pattern = "yyyy-MM-dd", iso = ISO.DATE)
	private LocalDate Fecha;
	
	@ManyToOne
	@JoinColumn(name = "clienteid", nullable = false,foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (clienteid) references clientes(clienteid)"))
	private Cliente cliente; 
	@ManyToOne
	@JoinColumn(name = "VueloID", nullable = false,foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (VueloID) references vuelos(VueloID)"))
	private Vuelo vuelo; 
	@ManyToOne
	@JoinColumn(name = "AeropuertoID", nullable = false,foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (AeropuertoID) references aeropuertos(AeropuertoID)"))
	private Aeropuerto aeropuerto_reserva; 
	
	@OneToMany(mappedBy = "reserva")
	private Collection<Ticket> itemstickets = new ArrayList<>();
	
	
	public Reserva() {
		// TODO Auto-generated constructor stub
	}


	public Reserva(Integer reservaID, LocalDate fecha, Cliente cliente, Vuelo vuelo, Aeropuerto aeropuerto_reserva,
			Collection<Ticket> itemstickets) {
		super();
		ReservaID = reservaID;
		Fecha = fecha;
		this.cliente = cliente;
		this.vuelo = vuelo;
		this.aeropuerto_reserva = aeropuerto_reserva;
		this.itemstickets = itemstickets;
	}


	public Integer getReservaID() {
		return ReservaID;
	}


	public void setReservaID(Integer reservaID) {
		ReservaID = reservaID;
	}


	public LocalDate getFecha() {
		return Fecha;
	}


	public void setFecha(LocalDate fecha) {
		Fecha = fecha;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Vuelo getVuelo() {
		return vuelo;
	}


	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}


	public Aeropuerto getAeropuerto_reserva() {
		return aeropuerto_reserva;
	}


	public void setAeropuerto_reserva(Aeropuerto aeropuerto_reserva) {
		this.aeropuerto_reserva = aeropuerto_reserva;
	}


	public Collection<Ticket> getItemstickets() {
		return itemstickets;
	}


	public void setItemstickets(Collection<Ticket> itemstickets) {
		this.itemstickets = itemstickets;
	}


	

	

}
