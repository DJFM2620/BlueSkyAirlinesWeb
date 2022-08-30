package pe.blueskyairlines.Service;

import java.util.Collection;

import pe.blueskyairlines.Model.Avion;

public interface AvionService {

	public abstract void Insert (Avion avion);
	public abstract void Update (Avion avion);
	public abstract void Delete (Integer ID);
	public abstract Avion FindByID(Integer ID);
	public abstract Collection<Avion> FindAll();
}
