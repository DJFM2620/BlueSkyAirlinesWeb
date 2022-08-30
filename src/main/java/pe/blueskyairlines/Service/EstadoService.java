package pe.blueskyairlines.Service;

import java.util.Collection;

import pe.blueskyairlines.Model.Estado;

public interface EstadoService {

	public abstract void Insert (Estado estado);
	public abstract void Update (Estado estado);
	public abstract void Delete (Integer ID);
	public abstract Estado FindByID(Integer ID);
	public abstract Collection<Estado> FindAll();
}
