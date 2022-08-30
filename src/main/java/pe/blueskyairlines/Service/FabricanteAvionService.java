package pe.blueskyairlines.Service;

import java.util.Collection;

import pe.blueskyairlines.Model.FabricanteAvion;

public interface FabricanteAvionService {

	public abstract void Insert (FabricanteAvion fabricanteAvion);
	public abstract void Update (FabricanteAvion fabricanteAvion);
	public abstract void Delete (Integer ID);
	public abstract FabricanteAvion FindByID(Integer ID);
	public abstract Collection<FabricanteAvion> FindAll();
}
