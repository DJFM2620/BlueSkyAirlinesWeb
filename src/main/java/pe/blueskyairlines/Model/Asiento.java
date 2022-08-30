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
@Table(name = "asientos")
public class Asiento {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer AsientoID;

	@Column
	private Integer Numero;

	@OneToMany(mappedBy = "asiento")
	private Collection<Ticket> itemstickets = new ArrayList<>();

	public Asiento() {
		// TODO Auto-generated constructor stub
	}

	public Asiento(Integer asientoID, Integer numero, Collection<Ticket> itemstickets) {
		super();
		AsientoID = asientoID;
		Numero = numero;
		this.itemstickets = itemstickets;
	}

	public Integer getAsientoID() {
		return AsientoID;
	}

	public void setAsientoID(Integer asientoID) {
		AsientoID = asientoID;
	}

	public Integer getNumero() {
		return Numero;
	}

	public void setNumero(Integer numero) {
		Numero = numero;
	}

	public Collection<Ticket> getItemstickets() {
		return itemstickets;
	}

	public void setItemstickets(Collection<Ticket> itemstickets) {
		this.itemstickets = itemstickets;
	}


}

