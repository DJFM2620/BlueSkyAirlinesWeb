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
@Table(name = "Reserva")
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer reservaid;

	@Column
	@DateTimeFormat(pattern = "yyyy-MM-dd", iso = ISO.DATE)
	private LocalDate fecha;

	@ManyToOne
	@JoinColumn(name = "clienteid", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (clienteid) references cliente(clienteid)"))
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "vueloid", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (vueloid) references vuelo(vueloid)"))
	private Vuelo vuelo;

	@ManyToOne
	@JoinColumn(name = "aeropuertoid", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (aeropuertoid) references aeropuerto(aeropuertoid)"))
	private Aeropuerto aeropuerto_reserva;

	@OneToMany(mappedBy = "reserva")
	private Collection<Ticket> itemstickets = new ArrayList<>();

	public Reserva() {
	}

	public Reserva(Integer reservaid, LocalDate fecha, Cliente cliente, Vuelo vuelo, Aeropuerto aeropuerto_reserva,
			Collection<Ticket> itemstickets) {
		super();
		this.reservaid = reservaid;
		this.fecha = fecha;
		this.cliente = cliente;
		this.vuelo = vuelo;
		this.aeropuerto_reserva = aeropuerto_reserva;
		this.itemstickets = itemstickets;
	}

	public Integer getReservaid() {
		return reservaid;
	}

	public void setReservaid(Integer reservaid) {
		this.reservaid = reservaid;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
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

	public void setItemstickets(Collection<Ticket> itemstickets) {
		this.itemstickets = itemstickets;
	}
}