package pe.blueskyairlines.Service;

import java.util.Collection;

import pe.blueskyairlines.Model.CategoriaAsiento;

public interface CategoriaAsientoService {

	public abstract void Insert (CategoriaAsiento categoriaAsiento);
	public abstract void Update (CategoriaAsiento categoriaAsiento);
	public abstract void Delete (Integer ID);
	public abstract CategoriaAsiento FindByID(Integer ID);
	public abstract Collection<CategoriaAsiento> FindAll();
}
