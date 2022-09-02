package pe.blueskyairlines.Service;

import java.util.Collection;

import pe.blueskyairlines.Model.Asiento_Avion;

public interface Asiento_AvionService {

	public abstract void Insert (Asiento_Avion asiento_Avion);
	public abstract void Update (Asiento_Avion asiento_Avion);
	public abstract void Delete (Integer ID);
	public abstract Asiento_Avion FindByID(Integer ID);
	public abstract Collection<Asiento_Avion> FindAll();
}
