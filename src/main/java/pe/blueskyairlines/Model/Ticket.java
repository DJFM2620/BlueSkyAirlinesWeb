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
@Table(name = "tickets")
public class Ticket {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer TicketID;
	@Column
	private Double Impuesto;
	@Column
	private Double Total;
	
	@ManyToOne
	@JoinColumn(name = "AsientoID", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(AsientoID) references asientos(AsientoID)"))
	private Asiento asiento;
	@ManyToOne
	@JoinColumn(name = "ReservaID", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(ReservaID) references reservas(ReservaID)"))
	private Reserva reserva;
	
	
	
	


	public Ticket() {
		// TODO Auto-generated constructor stub
	}


	public Ticket(Integer ticketID, Double total) {
		super();
		TicketID = ticketID;
		Total = total;
	}


	public Integer getTicketID() {
		return TicketID;
	}


	public void setTicketID(Integer ticketID) {
		TicketID = ticketID;
	}


	public Double getTotal() {
		return Total;
	}


	public void setTotal(Double total) {
		Total = total;
	}




}
