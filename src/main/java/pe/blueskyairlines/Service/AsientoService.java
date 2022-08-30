package pe.blueskyairlines.Service;

import java.util.Collection;

import pe.blueskyairlines.Model.Asiento;

public interface AsientoService {

	public abstract void Insert (Asiento asiento);
	public abstract void Update (Asiento asiento);
	public abstract void Delete (Integer ID);
	public abstract Asiento FindByID(Integer ID);
	public abstract Collection<Asiento> FindAll();
}
