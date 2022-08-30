package pe.blueskyairlines.Service;

import java.util.Collection;

import pe.blueskyairlines.Model.Pais;

public interface PaisService {

	public abstract void Insert (Pais pais);
	public abstract void Update (Pais Pais);
	public abstract void Delete (Integer ID);
	public abstract Pais FindByID(Integer ID);
	public abstract Collection<Pais> FindAll();
}