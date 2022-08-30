package pe.blueskyairlines.Model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.ManyToOne;

public class Asiento_Avion_ID implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManyToOne
	private Asiento asiento;

	@ManyToOne
	private Avion avion;

	@ManyToOne
	private CategoriaAsiento categoria;

	public Asiento_Avion_ID() {
	}

	public Asiento_Avion_ID(Asiento asiento, Avion avion, CategoriaAsiento categoria) {
		super();
		this.asiento = asiento;
		this.avion = avion;
		this.categoria = categoria;
	}

	public Asiento getAsiento() {
		return asiento;
	}

	public void setAsiento(Asiento asiento) {
		this.asiento = asiento;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public CategoriaAsiento getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaAsiento categoria) {
		this.categoria = categoria;
	}

	@Override
	public int hashCode() {
		return Objects.hash(asiento, avion, categoria);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Asiento_Avion_ID other = (Asiento_Avion_ID) obj;
		return Objects.equals(asiento, other.asiento) && Objects.equals(avion, other.avion)
				&& Objects.equals(categoria, other.categoria);
	}
}
