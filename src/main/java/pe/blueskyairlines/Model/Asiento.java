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
@Table(name = "Asiento")
public class Asiento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer asientoid;

	@Column(length = 4)
	private String numeroasiento;

	@OneToMany(mappedBy = "asiento")
	private Collection<Ticket> itemstickets = new ArrayList<>();

	public Asiento() {
	}

	public Asiento(Integer asientoid, String numeroasiento, Collection<Ticket> itemstickets) {
		super();
		this.asientoid = asientoid;
		this.numeroasiento = numeroasiento;
		this.itemstickets = itemstickets;
	}

	public Integer getAsientoid() {
		return asientoid;
	}

	public void setAsientoid(Integer asientoid) {
		this.asientoid = asientoid;
	}

	public String getNumeroasiento() {
		return numeroasiento;
	}

	public void setNumeroasiento(String numeroasiento) {
		this.numeroasiento = numeroasiento;
	}

	public Collection<Ticket> getItemstickets() {
		return itemstickets;
	}

	public void setItemstickets(Collection<Ticket> itemstickets) {
		this.itemstickets = itemstickets;
	}
}