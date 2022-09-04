package pe.blueskyairlines.Service;

import java.util.Collection;

import org.springframework.data.repository.query.Param;

import pe.blueskyairlines.Model.Cliente;

public interface ClienteService {

	public abstract void Insert (Cliente cliente);
	public abstract void Update (Cliente cliente);
	public abstract void Delete (Integer ID);
	public abstract Cliente FindByID(Integer ID);
	public abstract Collection<Cliente> FindAll();
	public abstract Integer CuentadeVuelos(@Param("clienteID")Integer ID);
}
