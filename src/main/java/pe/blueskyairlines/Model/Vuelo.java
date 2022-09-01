package pe.blueskyairlines.Model;

import java.time.LocalDate;
import java.time.LocalTime;
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
@Table(name = "Vuelo")
public class Vuelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer vueloid;

	@Column
	@DateTimeFormat(pattern = "yyyy-MM-dd", iso = ISO.DATE)
	private LocalDate fechaida;

	@Column
	@DateTimeFormat(pattern = "HH:mm", iso = ISO.TIME)
	private LocalTime horaida;

	@Column
	@DateTimeFormat(pattern = "HH:mm", iso = ISO.TIME)
	private LocalTime horallegada;

	@ManyToOne
	@JoinColumn(name = "estadoid", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (estadoid) references estado(estadoid)"))
	private Estado estado;

	@ManyToOne
	@JoinColumn(name = "avionid", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (avionid) references avion(avionid)"))
	private Avion avion;

	@ManyToOne
	@JoinColumn(name = "aeropuertoid", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (aeropuertoid) references aeropuerto(aeropuertoid)"))
	private Aeropuerto aeropuerto;

	@OneToMany(mappedBy = "vuelo")
	private Collection<Reserva> itemsreserva = new ArrayList<>();

	public Vuelo() {
	}

	public Vuelo(Integer vueloid, LocalDate fechaida, LocalTime horaida, LocalTime horallegada, Estado estado,
			Avion avion, Aeropuerto aeropuerto, Collection<Reserva> itemsreserva) {
		super();
		this.vueloid = vueloid;
		this.fechaida = fechaida;
		this.horaida = horaida;
		this.horallegada = horallegada;
		this.estado = estado;
		this.avion = avion;
		this.aeropuerto = aeropuerto;
		this.itemsreserva = itemsreserva;
	}

	public Integer getVueloid() {
		return vueloid;
	}

	public void setVueloid(Integer vueloid) {
		this.vueloid = vueloid;
	}

	public LocalDate getFechaida() {
		return fechaida;
	}

	public void setFechaida(LocalDate fechaida) {
		this.fechaida = fechaida;
	}

	public LocalTime getHoraida() {
		return horaida;
	}

	public void setHoraida(LocalTime horaida) {
		this.horaida = horaida;
	}

	public LocalTime getHorallegada() {
		return horallegada;
	}

	public void setHorallegada(LocalTime horallegada) {
		this.horallegada = horallegada;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public Aeropuerto getAeropuerto() {
		return aeropuerto;
	}

	public void setAeropuerto(Aeropuerto aeropuerto) {
		this.aeropuerto = aeropuerto;
	}

	public void setItemsreserva(Collection<Reserva> itemsreserva) {
		this.itemsreserva = itemsreserva;
	}
}