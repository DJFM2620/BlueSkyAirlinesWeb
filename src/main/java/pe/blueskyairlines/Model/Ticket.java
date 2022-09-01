package pe.blueskyairlines.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Ticket")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ticketid;

	@Column
	private Double impuesto;

	@Column
	private Double total;

	@ManyToOne
	@JoinColumn(name = "asientoid", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(asientoid) references asiento(asientoid)"))
	private Asiento asiento;

	@ManyToOne
	@JoinColumn(name = "reservaid", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(reservaid) references reserva(reservaid)"))
	private Reserva reserva;

	public Ticket() {
	}

	public Ticket(Integer ticketid, Double impuesto, Double total, Asiento asiento, Reserva reserva) {
		super();
		this.ticketid = ticketid;
		this.impuesto = impuesto;
		this.total = total;
		this.asiento = asiento;
		this.reserva = reserva;
	}

	public Integer getTicketid() {
		return ticketid;
	}

	public void setTicketid(Integer ticketid) {
		this.ticketid = ticketid;
	}

	public Double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(Double impuesto) {
		this.impuesto = impuesto;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Asiento getAsiento() {
		return asiento;
	}

	public void setAsiento(Asiento asiento) {
		this.asiento = asiento;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}
}