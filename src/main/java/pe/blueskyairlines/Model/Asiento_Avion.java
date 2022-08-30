package pe.blueskyairlines.Model;

import java.util.Objects;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Asiento_Avion")
@AssociationOverrides({
		@AssociationOverride(name = "asiento_Avion_ID.asiento", joinColumns = @JoinColumn(name = "asientoid", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (asientoid) references asiento (asientoid)"))),
		@AssociationOverride(name = "asiento_Avion_ID.avion", joinColumns = @JoinColumn(name = "avionid", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (avionid) references avion (avionid)"))),
		@AssociationOverride(name = "asiento_Avion_ID.categoria", joinColumns = @JoinColumn(name = "categoriaid", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (categoriaid) references categoriaasiento (categoriaid)"))), })
public class Asiento_Avion {

	@EmbeddedId
	private Asiento_Avion_ID asiento_Avion_ID = new Asiento_Avion_ID();

	public Asiento_Avion() {
	}

	public Asiento_Avion(Asiento_Avion_ID asiento_Avion_ID) {
		super();
		this.asiento_Avion_ID = asiento_Avion_ID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(asiento_Avion_ID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Asiento_Avion other = (Asiento_Avion) obj;
		return Objects.equals(asiento_Avion_ID, other.asiento_Avion_ID);
	}

	public Asiento_Avion_ID getAsiento_Avion_ID() {
		return asiento_Avion_ID;
	}

	public void setAsiento_Avion_ID(Asiento_Avion_ID asiento_Avion_ID) {
		this.asiento_Avion_ID = asiento_Avion_ID;
	}

	public Asiento getAsiento() {
		return asiento_Avion_ID.getAsiento();
	}

	public void setArticulo(Asiento asiento) {
		asiento_Avion_ID.setAsiento(asiento);
	}

	public Avion getAvion() {
		return asiento_Avion_ID.getAvion();
	}

	public void setAvion(Avion avion) {
		asiento_Avion_ID.setAvion(avion);
	}

	public CategoriaAsiento getCategoria() {
		return asiento_Avion_ID.getCategoria();
	}

	public void setCategoria(CategoriaAsiento categoria) {
		asiento_Avion_ID.setCategoria(categoria);
	}
}