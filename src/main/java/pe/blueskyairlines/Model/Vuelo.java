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
@Table(name = "vuelos")
public class Vuelo {

	


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer VueloID;

	@Column
	@DateTimeFormat(pattern = "yyyy-MM-dd", iso = ISO.DATE)
	private LocalDate FechaIda;

	@Column
	@DateTimeFormat(pattern = "HH:mm", iso = ISO.TIME)
	private LocalTime HoraIda;

	@Column
	@DateTimeFormat(pattern = "HH:mm", iso = ISO.TIME)
	private LocalTime HoraLlegada;
	
	@ManyToOne
	@JoinColumn(name = "estadoid", nullable = false,
						  foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (estadoid) references estados(estadoid)"))
	private Estado estado;
	
	@ManyToOne
	@JoinColumn(name = "AvionID", nullable = false,
						  foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (AvionID) references aviones(AvionID)"))
	private Avion avion;
	
	@ManyToOne
	@JoinColumn(name = "AeropuertoID", nullable = false,
						  foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (AeropuertoID) references aeropuertos(AeropuertoID)"))
	private Aeropuerto aeropuerto;
	
	@OneToMany(mappedBy = "vuelo")
	private Collection<Reserva> itemsreserva = new ArrayList<>();
	
	
	

	public Vuelo() {
		// TODO Auto-generated constructor stub
	}




	public Vuelo(Integer vueloID, LocalDate fechaIda, LocalTime horaIda, LocalTime horaLlegada, Estado estado,
			Avion avion, Aeropuerto aeropuerto, Collection<Reserva> itemsreserva) {
		super();
		VueloID = vueloID;
		FechaIda = fechaIda;
		HoraIda = horaIda;
		HoraLlegada = horaLlegada;
		this.estado = estado;
		this.avion = avion;
		this.aeropuerto = aeropuerto;
		this.itemsreserva = itemsreserva;
	}




	public Integer getVueloID() {
		return VueloID;
	}




	public void setVueloID(Integer vueloID) {
		VueloID = vueloID;
	}




	public LocalDate getFechaIda() {
		return FechaIda;
	}




	public void setFechaIda(LocalDate fechaIda) {
		FechaIda = fechaIda;
	}




	public LocalTime getHoraIda() {
		return HoraIda;
	}




	public void setHoraIda(LocalTime horaIda) {
		HoraIda = horaIda;
	}




	public LocalTime getHoraLlegada() {
		return HoraLlegada;
	}




	public void setHoraLlegada(LocalTime horaLlegada) {
		HoraLlegada = horaLlegada;
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




	public Collection<Reserva> getItemsreserva() {
		return itemsreserva;
	}




	public void setItemsreserva(Collection<Reserva> itemsreserva) {
		this.itemsreserva = itemsreserva;
	}
	
	
	





}

