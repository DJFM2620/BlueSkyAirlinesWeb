package pe.blueskyairlines.Service;

import java.util.Collection;

import pe.blueskyairlines.Model.Ciudad;

public interface CiudadService {

	public abstract void Insert (Ciudad ciudad);
	public abstract void Update (Ciudad ciudad);
	public abstract void Delete (Integer ID);
	public abstract Ciudad FindByID(Integer ID);
	public abstract Collection<Ciudad> FindAll();
}
